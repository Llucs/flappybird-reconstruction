package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.at;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {
    static final y a;
    private int b;
    private int c;
    private Drawable d;
    private final int e;
    private boolean f;
    private View g;
    private float h;
    private float i;
    private int j;
    private boolean k;
    private int l;
    private float m;
    private float n;
    private w o;
    private final ac p;
    private boolean q;
    private boolean r;
    private final Rect s;
    private final ArrayList t;

    public class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] e = {R.attr.layout_weight};
        public float a;
        boolean b;
        boolean c;
        Paint d;

        public LayoutParams() {
            super(-1, -1);
            this.a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
            this.a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0.0f;
        }
    }

    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new x();
        boolean a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() != 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            a = new ab();
        } else if (i >= 16) {
            a = new aa();
        } else {
            a = new z();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = -858993460;
        this.r = true;
        this.s = new Rect();
        this.t = new ArrayList();
        float f = context.getResources().getDisplayMetrics().density;
        this.e = (int) ((32.0f * f) + 0.5f);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        at.a(this, new t(this));
        at.b(this, 1);
        this.p = ac.a(this, 0.5f, new v(this));
        this.p.a(1);
        this.p.a(f * 400.0f);
    }

    private void a(float f) {
        LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
        boolean z = layoutParams.c && layoutParams.leftMargin <= 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.g) {
                int i2 = (int) ((1.0f - this.i) * this.l);
                this.i = f;
                childAt.offsetLeftAndRight(i2 - ((int) ((1.0f - f) * this.l)));
                if (z) {
                    a(childAt, 1.0f - this.i, this.c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
        this.h = (i - (getPaddingLeft() + layoutParams.leftMargin)) / this.j;
        if (this.l != 0) {
            a(this.h);
        }
        if (layoutParams.c) {
            a(this.g, this.h, this.b);
        }
        a(this.g);
    }

    private void a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f <= 0.0f || i == 0) {
            if (at.d(view) != 0) {
                if (layoutParams.d != null) {
                    layoutParams.d.setColorFilter(null);
                }
                u uVar = new u(this, view);
                this.t.add(uVar);
                at.a(this, uVar);
                return;
            }
            return;
        }
        int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (16777215 & i);
        if (layoutParams.d == null) {
            layoutParams.d = new Paint();
        }
        layoutParams.d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
        if (at.d(view) != 2) {
            at.a(view, 2, layoutParams.d);
        }
        g(view);
    }

    private boolean a(View view, int i) {
        if (!this.r && !a(0.0f, i)) {
            return false;
        }
        this.q = false;
        return true;
    }

    private boolean b(View view, int i) {
        if (!this.r && !a(1.0f, i)) {
            return false;
        }
        this.q = true;
        return true;
    }

    private static boolean f(View view) {
        Drawable background;
        if (at.g(view)) {
            return true;
        }
        return Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(View view) {
        a.a(this, view);
    }

    void a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    void a(View view) {
        if (this.o != null) {
            this.o.a(view, this.h);
        }
    }

    boolean a(float f, int i) {
        if (!this.f) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
        if (!this.p.a(this.g, (int) (layoutParams.leftMargin + getPaddingLeft() + (this.j * f)), this.g.getTop())) {
            return false;
        }
        a();
        at.b(this);
        return true;
    }

    void b(View view) {
        if (this.o != null) {
            this.o.a(view);
        }
        sendAccessibilityEvent(32);
    }

    public boolean b() {
        return b(this.g, 0);
    }

    void c(View view) {
        if (this.o != null) {
            this.o.b(view);
        }
        sendAccessibilityEvent(32);
    }

    public boolean c() {
        return a(this.g, 0);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.p.a(true)) {
            if (this.f) {
                at.b(this);
            } else {
                this.p.f();
            }
        }
    }

    void d(View view) {
        int bottom;
        int top;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view == null || !f(view)) {
            bottom = 0;
            top = 0;
            right = 0;
            left = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt == view) {
                return;
            }
            childAt.setVisibility((Math.max(paddingLeft, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(width, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
        }
    }

    public boolean d() {
        return !this.f || this.h == 1.0f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || this.d == null) {
            return;
        }
        int intrinsicWidth = this.d.getIntrinsicWidth();
        int left = childAt.getLeft();
        this.d.setBounds(left - intrinsicWidth, childAt.getTop(), left, childAt.getBottom());
        this.d.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean zDrawChild;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save(2);
        if (this.f && !layoutParams.b && this.g != null) {
            canvas.getClipBounds(this.s);
            this.s.right = Math.min(this.s.right, this.g.getLeft());
            canvas.clipRect(this.s);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            zDrawChild = super.drawChild(canvas, view, j);
        } else if (!layoutParams.c || this.h <= 0.0f) {
            if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
            zDrawChild = super.drawChild(canvas, view, j);
        } else {
            if (!view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(true);
            }
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                canvas.drawBitmap(drawingCache, view.getLeft(), view.getTop(), layoutParams.d);
                zDrawChild = false;
            } else {
                Log.e("SlidingPaneLayout", "drawChild: child view " + view + " returned null drawing cache");
                zDrawChild = super.drawChild(canvas, view, j);
            }
        }
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public boolean e() {
        return this.f;
    }

    boolean e(View view) {
        if (view == null) {
            return false;
        }
        return this.f && ((LayoutParams) view.getLayoutParams()).c && this.h > 0.0f;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.c;
    }

    public int getParallaxDistance() {
        return this.l;
    }

    public int getSliderFadeColor() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r = true;
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            ((u) this.t.get(i)).run();
        }
        this.t.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int iA = android.support.v4.view.z.a(motionEvent);
        if (!this.f && iA == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.q = !this.p.b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f || (this.k && iA != 0)) {
            this.p.e();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (iA == 3 || iA == 1) {
            this.p.e();
            return false;
        }
        switch (iA) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                this.k = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.m = x;
                this.n = y;
                z = this.p.b(this.g, (int) x, (int) y) && e(this.g);
                break;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
            default:
                z = false;
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float fAbs = Math.abs(x2 - this.m);
                float fAbs2 = Math.abs(y2 - this.n);
                if (fAbs > this.p.d() && fAbs2 > fAbs) {
                    this.p.e();
                    this.k = true;
                    return false;
                }
                z = false;
                break;
                break;
        }
        return this.p.a(motionEvent) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.r) {
            this.h = (this.f && this.q) ? 1.0f : 0.0f;
        }
        int i8 = 0;
        int i9 = paddingLeft;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                i6 = i9;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.b) {
                    int iMin = (Math.min(paddingLeft, (i7 - paddingRight) - this.e) - i9) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.j = iMin;
                    layoutParams.c = ((layoutParams.leftMargin + i9) + iMin) + (measuredWidth / 2) > i7 - paddingRight;
                    i6 = layoutParams.leftMargin + ((int) (iMin * this.h)) + i9;
                    i5 = 0;
                } else if (!this.f || this.l == 0) {
                    i5 = 0;
                    i6 = paddingLeft;
                } else {
                    i5 = (int) ((1.0f - this.h) * this.l);
                    i6 = paddingLeft;
                }
                int i10 = i6 - i5;
                childAt.layout(i10, paddingTop, i10 + measuredWidth, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft += childAt.getWidth();
            }
            i8++;
            i9 = i6;
        }
        if (this.r) {
            if (this.f) {
                if (this.l != 0) {
                    a(this.h);
                }
                if (((LayoutParams) this.g.getLayoutParams()).c) {
                    a(this.g, this.h, this.b);
                }
            } else {
                for (int i11 = 0; i11 < childCount; i11++) {
                    a(getChildAt(i11), 0.0f, this.b);
                }
            }
            d(this.g);
        }
        this.r = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9 A[PHI: r2
      0x00c9: PHI (r2v12 float) = (r2v11 float), (r2v14 float) binds: [B:35:0x00bb, B:37:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r16, int r17) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.a) {
            b();
        } else {
            c();
        }
        this.q = savedState.a;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = e() ? d() : this.q;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.r = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f) {
            return super.onTouchEvent(motionEvent);
        }
        this.p.b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.m = x;
                this.n = y;
                return true;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                if (!e(this.g)) {
                    return true;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f = x2 - this.m;
                float f2 = y2 - this.n;
                int iD = this.p.d();
                if ((f * f) + (f2 * f2) >= iD * iD || !this.p.b(this.g, (int) x2, (int) y2)) {
                    return true;
                }
                a(this.g, 0);
                return true;
            default:
                return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f) {
            return;
        }
        this.q = view == this.g;
    }

    public void setCoveredFadeColor(int i) {
        this.c = i;
    }

    public void setPanelSlideListener(w wVar) {
        this.o = wVar;
    }

    public void setParallaxDistance(int i) {
        this.l = i;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable) {
        this.d = drawable;
    }

    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setSliderFadeColor(int i) {
        this.b = i;
    }
}
