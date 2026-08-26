package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.at;
import android.support.v4.view.bo;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    private static final int[] a = {R.attr.layout_gravity};
    private int b;
    private int c;
    private float d;
    private Paint e;
    private final ac f;
    private final ac g;
    private final f h;
    private final f i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private d q;
    private float r;
    private float s;
    private Drawable t;
    private Drawable u;

    public class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int a;
        float b;
        boolean c;
        boolean d;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.a);
            this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.a = 0;
            this.a = layoutParams.a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0;
        }
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new e();
        int a;
        int b;
        int c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = -1728053248;
        this.e = new Paint();
        this.l = true;
        float f = getResources().getDisplayMetrics().density;
        this.b = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        this.h = new f(this, 3);
        this.i = new f(this, 5);
        this.f = ac.a(this, 1.0f, this.h);
        this.f.a(1);
        this.f.a(f2);
        this.h.a(this.f);
        this.g = ac.a(this, 1.0f, this.i);
        this.g.a(2);
        this.g.a(f2);
        this.i.a(this.g);
        setFocusableInTouchMode(true);
        at.a(this, new c(this));
        bo.a(this, false);
    }

    static String b(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    private boolean e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    private boolean f() {
        return g() != null;
    }

    private View g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (g(childAt) && j(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    private static boolean k(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public int a(View view) {
        int iE = e(view);
        if (iE == 3) {
            return this.m;
        }
        if (iE == 5) {
            return this.n;
        }
        return 0;
    }

    View a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((LayoutParams) childAt.getLayoutParams()).d) {
                return childAt;
            }
        }
        return null;
    }

    View a(int i) {
        int iA = android.support.v4.view.n.a(i, at.e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((e(childAt) & 7) == iA) {
                return childAt;
            }
        }
        return null;
    }

    public void a(int i, int i2) {
        int iA = android.support.v4.view.n.a(i2, at.e(this));
        if (iA == 3) {
            this.m = i;
        } else if (iA == 5) {
            this.n = i;
        }
        if (i != 0) {
            (iA == 3 ? this.f : this.g).e();
        }
        switch (i) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                View viewA = a(iA);
                if (viewA != null) {
                    i(viewA);
                }
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                View viewA2 = a(iA);
                if (viewA2 != null) {
                    h(viewA2);
                }
                break;
        }
    }

    void a(int i, int i2, View view) {
        int i3 = 1;
        int iA = this.f.a();
        int iA2 = this.g.a();
        if (iA != 1 && iA2 != 1) {
            i3 = (iA == 2 || iA2 == 2) ? 2 : 0;
        }
        if (view != null && i2 == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.b == 0.0f) {
                b(view);
            } else if (layoutParams.b == 1.0f) {
                c(view);
            }
        }
        if (i3 != this.j) {
            this.j = i3;
            if (this.q != null) {
                this.q.a(i3);
            }
        }
    }

    void a(View view, float f) {
        if (this.q != null) {
            this.q.a(view, f);
        }
    }

    void a(boolean z) {
        int childCount = getChildCount();
        boolean zA = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (g(childAt) && (!z || layoutParams.c)) {
                zA = a(childAt, 3) ? zA | this.f.a(childAt, -childAt.getWidth(), childAt.getTop()) : zA | this.g.a(childAt, getWidth(), childAt.getTop());
                layoutParams.c = false;
            }
        }
        this.h.a();
        this.i.a();
        if (zA) {
            invalidate();
        }
    }

    boolean a(View view, int i) {
        return (e(view) & i) == i;
    }

    public void b() {
        a(false);
    }

    void b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.d) {
            layoutParams.d = false;
            if (this.q != null) {
                this.q.b(view);
            }
            sendAccessibilityEvent(32);
        }
    }

    void b(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.b) {
            return;
        }
        layoutParams.b = f;
        a(view, f);
    }

    void c() {
        if (this.p) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.p = true;
    }

    void c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.d) {
            return;
        }
        layoutParams.d = true;
        if (this.q != null) {
            this.q.a(view);
        }
        view.sendAccessibilityEvent(32);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).b);
        }
        this.d = fMax;
        if (this.f.a(true) || this.g.a(true)) {
            at.b(this);
        }
    }

    float d(View view) {
        return ((LayoutParams) view.getLayoutParams()).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    int e(View view) {
        return android.support.v4.view.n.a(((LayoutParams) view.getLayoutParams()).a, at.e(this));
    }

    boolean f(View view) {
        return ((LayoutParams) view.getLayoutParams()).a == 0;
    }

    boolean g(View view) {
        return (android.support.v4.view.n.a(((LayoutParams) view.getLayoutParams()).a, at.e(view)) & 7) != 0;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void h(View view) {
        if (!g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        if (this.l) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.b = 1.0f;
            layoutParams.d = true;
        } else if (a(view, 3)) {
            this.f.a(view, 0, view.getTop());
        } else {
            this.g.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public void i(View view) {
        if (!g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        if (this.l) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.b = 0.0f;
            layoutParams.d = false;
        } else if (a(view, 3)) {
            this.f.a(view, -view.getWidth(), view.getTop());
        } else {
            this.g.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    public boolean j(View view) {
        if (g(view)) {
            return ((LayoutParams) view.getLayoutParams()).b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r1 = 1
            r2 = 0
            int r0 = android.support.v4.view.z.a(r8)
            android.support.v4.widget.ac r3 = r7.f
            boolean r3 = r3.a(r8)
            android.support.v4.widget.ac r4 = r7.g
            boolean r4 = r4.a(r8)
            r3 = r3 | r4
            switch(r0) {
                case 0: goto L27;
                case 1: goto L63;
                case 2: goto L4e;
                case 3: goto L63;
                default: goto L16;
            }
        L16:
            r0 = r2
        L17:
            if (r3 != 0) goto L25
            if (r0 != 0) goto L25
            boolean r0 = r7.e()
            if (r0 != 0) goto L25
            boolean r0 = r7.p
            if (r0 == 0) goto L26
        L25:
            r2 = r1
        L26:
            return r2
        L27:
            float r0 = r8.getX()
            float r4 = r8.getY()
            r7.r = r0
            r7.s = r4
            float r5 = r7.d
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L6b
            android.support.v4.widget.ac r5 = r7.f
            int r0 = (int) r0
            int r4 = (int) r4
            android.view.View r0 = r5.d(r0, r4)
            boolean r0 = r7.f(r0)
            if (r0 == 0) goto L6b
            r0 = r1
        L49:
            r7.o = r2
            r7.p = r2
            goto L17
        L4e:
            android.support.v4.widget.ac r0 = r7.f
            r4 = 3
            boolean r0 = r0.d(r4)
            if (r0 == 0) goto L16
            android.support.v4.widget.f r0 = r7.h
            r0.a()
            android.support.v4.widget.f r0 = r7.i
            r0.a()
            r0 = r2
            goto L17
        L63:
            r7.a(r1)
            r7.o = r2
            r7.p = r2
            goto L16
        L6b:
            r0 = r2
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !f()) {
            return super.onKeyDown(i, keyEvent);
        }
        android.support.v4.view.s.b(keyEvent);
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewG = g();
        if (viewG != null && a(viewG) == 0) {
            b();
        }
        return viewG != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        this.k = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (f(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        i5 = ((int) (measuredWidth * layoutParams.b)) + (-measuredWidth);
                        f = (measuredWidth + i5) / measuredWidth;
                    } else {
                        i5 = i6 - ((int) (measuredWidth * layoutParams.b));
                        f = (i6 - i5) / measuredWidth;
                    }
                    boolean z2 = f != layoutParams.b;
                    switch (layoutParams.a & 112) {
                        case 16:
                            int i8 = i4 - i2;
                            int i9 = (i8 - measuredHeight) / 2;
                            if (i9 < layoutParams.topMargin) {
                                i9 = layoutParams.topMargin;
                            } else if (i9 + measuredHeight > i8 - layoutParams.bottomMargin) {
                                i9 = (i8 - layoutParams.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i5, i9, measuredWidth + i5, measuredHeight + i9);
                            break;
                        case 80:
                            int i10 = i4 - i2;
                            childAt.layout(i5, (i10 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i10 - layoutParams.bottomMargin);
                            break;
                        default:
                            childAt.layout(i5, layoutParams.topMargin, measuredWidth + i5, measuredHeight + layoutParams.topMargin);
                            break;
                    }
                    if (z2) {
                        b(childAt, f);
                    }
                    int i11 = layoutParams.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
        }
        this.k = false;
        this.l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[PHI: r2
      0x0046: PHI (r2v14 int) = (r2v2 int), (r2v0 int) binds: [B:17:0x0044, B:4:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewA;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.a != 0 && (viewA = a(savedState.a)) != null) {
            h(viewA);
        }
        a(savedState.b, 3);
        a(savedState.c, 5);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            if (g(childAt)) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.d) {
                    savedState.a = layoutParams.a;
                    break;
                }
            }
            i++;
        }
        savedState.b = this.m;
        savedState.c = this.n;
        return savedState;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewA;
        this.f.b(motionEvent);
        this.g.b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.r = x;
                this.s = y;
                this.o = false;
                this.p = false;
                return true;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                View viewD = this.f.d((int) x2, (int) y2);
                if (viewD == null || !f(viewD)) {
                    z = true;
                    a(z);
                    this.o = false;
                } else {
                    float f = x2 - this.r;
                    float f2 = y2 - this.s;
                    int iD = this.f.d();
                    z = (f * f) + (f2 * f2) >= ((float) (iD * iD)) || (viewA = a()) == null || a(viewA) == 2;
                    a(z);
                    this.o = false;
                }
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
            default:
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                a(true);
                this.o = false;
                this.p = false;
                return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.o = z;
        if (z) {
            a(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.k) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerListener(d dVar) {
        this.q = dVar;
    }

    public void setDrawerLockMode(int i) {
        a(i, 3);
        a(i, 5);
    }

    public void setScrimColor(int i) {
        this.c = i;
        invalidate();
    }
}
