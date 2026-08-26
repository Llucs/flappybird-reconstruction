package android.support.v4.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private android.support.v4.widget.h Q;
    private android.support.v4.widget.h R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private cc W;
    private cc Z;
    private cb aa;
    private cd ab;
    private Method ac;
    private int ad;
    private ArrayList ae;
    private final Runnable ag;
    private int ah;
    private int b;
    private final ArrayList e;
    private final bz f;
    private final Rect g;
    private ae h;
    private int i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private ce n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s;
    private float t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;
    private static final int[] a = {R.attr.layout_gravity};
    private static final Comparator c = new bv();
    private static final Interpolator d = new bw();
    private static final cg af = new cg();

    public class LayoutParams extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
        int f;

        public LayoutParams() {
            super(-1, -1);
            this.c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
            this.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = android.support.v4.a.a.a(new cf());
        int a;
        Parcelable b;
        ClassLoader c;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new ArrayList();
        this.f = new bz();
        this.g = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.z = 1;
        this.J = -1;
        this.S = true;
        this.T = false;
        this.ag = new bx(this);
        this.ah = 0;
        a();
    }

    private int a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.N || Math.abs(i2) <= this.L) {
            i = (int) ((i >= this.i ? 0.4f : 0.6f) + i + f);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.e.size() > 0) {
            return Math.max(((bz) this.e.get(0)).b, Math.min(i, ((bz) this.e.get(this.e.size() - 1)).b));
        }
        return i;
    }

    private Rect a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private void a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.e.isEmpty()) {
            bz bzVarB = b(this.i);
            int iMin = (int) ((bzVarB != null ? Math.min(bzVarB.e, this.t) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                a(false);
                scrollTo(iMin, getScrollY());
                return;
            }
            return;
        }
        int paddingLeft = (int) ((((i - getPaddingLeft()) - getPaddingRight()) + i3) * (getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)));
        scrollTo(paddingLeft, getScrollY());
        if (this.m.isFinished()) {
            return;
        }
        this.m.startScroll(paddingLeft, 0, (int) (b(this.i).e * i), 0, this.m.getDuration() - this.m.timePassed());
    }

    private void a(int i, boolean z, int i2, boolean z2) {
        int iMax;
        bz bzVarB = b(i);
        if (bzVarB != null) {
            iMax = (int) (Math.max(this.s, Math.min(bzVarB.e, this.t)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z) {
            a(iMax, 0, i2);
            if (z2 && this.W != null) {
                this.W.a(i);
            }
            if (!z2 || this.Z == null) {
                return;
            }
            this.Z.a(i);
            return;
        }
        if (z2 && this.W != null) {
            this.W.a(i);
        }
        if (z2 && this.Z != null) {
            this.Z.a(i);
        }
        a(false);
        scrollTo(iMax, 0);
        d(iMax);
    }

    private void a(bz bzVar, int i, bz bzVar2) {
        bz bzVar3;
        bz bzVar4;
        int iA = this.h.a();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.o / clientWidth : 0.0f;
        if (bzVar2 != null) {
            int i2 = bzVar2.b;
            if (i2 < bzVar.b) {
                float fB = bzVar2.e + bzVar2.d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bzVar.b && i4 < this.e.size()) {
                    Object obj = this.e.get(i4);
                    while (true) {
                        bzVar4 = (bz) obj;
                        if (i3 <= bzVar4.b || i4 >= this.e.size() - 1) {
                            break;
                        }
                        i4++;
                        obj = this.e.get(i4);
                    }
                    while (i3 < bzVar4.b) {
                        fB += this.h.b(i3) + f;
                        i3++;
                    }
                    bzVar4.e = fB;
                    fB += bzVar4.d + f;
                    i3++;
                }
            } else if (i2 > bzVar.b) {
                int size = this.e.size() - 1;
                float fB2 = bzVar2.e;
                int i5 = i2 - 1;
                while (i5 >= bzVar.b && size >= 0) {
                    Object obj2 = this.e.get(size);
                    while (true) {
                        bzVar3 = (bz) obj2;
                        if (i5 >= bzVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.e.get(size);
                    }
                    while (i5 > bzVar3.b) {
                        fB2 -= this.h.b(i5) + f;
                        i5--;
                    }
                    fB2 -= bzVar3.d + f;
                    bzVar3.e = fB2;
                    i5--;
                }
            }
        }
        int size2 = this.e.size();
        float f2 = bzVar.e;
        int i6 = bzVar.b - 1;
        this.s = bzVar.b == 0 ? bzVar.e : -3.4028235E38f;
        this.t = bzVar.b == iA + (-1) ? (bzVar.e + bzVar.d) - 1.0f : Float.MAX_VALUE;
        for (int i7 = i - 1; i7 >= 0; i7--) {
            bz bzVar5 = (bz) this.e.get(i7);
            float fB3 = f2;
            while (i6 > bzVar5.b) {
                fB3 -= this.h.b(i6) + f;
                i6--;
            }
            f2 = fB3 - (bzVar5.d + f);
            bzVar5.e = f2;
            if (bzVar5.b == 0) {
                this.s = f2;
            }
            i6--;
        }
        float f3 = bzVar.e + bzVar.d + f;
        int i8 = bzVar.b + 1;
        for (int i9 = i + 1; i9 < size2; i9++) {
            bz bzVar6 = (bz) this.e.get(i9);
            float fB4 = f3;
            while (i8 < bzVar6.b) {
                fB4 = this.h.b(i8) + f + fB4;
                i8++;
            }
            if (bzVar6.b == iA - 1) {
                this.t = (bzVar6.d + fB4) - 1.0f;
            }
            bzVar6.e = fB4;
            f3 = fB4 + bzVar6.d + f;
            i8++;
        }
        this.T = false;
    }

    private void a(MotionEvent motionEvent) {
        int iB = z.b(motionEvent);
        if (z.b(motionEvent, iB) == this.J) {
            int i = iB == 0 ? 1 : 0;
            this.F = z.c(motionEvent, i);
            this.J = z.b(motionEvent, i);
            if (this.K != null) {
                this.K.clear();
            }
        }
    }

    private void a(boolean z) {
        boolean z2 = this.ah == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.m.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.m.getCurrX();
            int currY = this.m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.y = false;
        boolean z3 = z2;
        for (int i = 0; i < this.e.size(); i++) {
            bz bzVar = (bz) this.e.get(i);
            if (bzVar.c) {
                bzVar.c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                at.a(this, this.ag);
            } else {
                this.ag.run();
            }
        }
    }

    private boolean a(float f, float f2) {
        return (f < ((float) this.D) && f2 > 0.0f) || (f > ((float) (getWidth() - this.D)) && f2 < 0.0f);
    }

    private void b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            at.a(getChildAt(i), z ? 2 : 0, null);
        }
    }

    private boolean b(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        float f3 = this.F - f;
        this.F = f;
        float scrollX = getScrollX() + f3;
        int clientWidth = getClientWidth();
        float f4 = clientWidth * this.s;
        float f5 = clientWidth * this.t;
        bz bzVar = (bz) this.e.get(0);
        bz bzVar2 = (bz) this.e.get(this.e.size() - 1);
        if (bzVar.b != 0) {
            f4 = bzVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bzVar2.b != this.h.a() - 1) {
            f2 = bzVar2.e * clientWidth;
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                zA = this.Q.a(Math.abs(f4 - scrollX) / clientWidth);
            }
        } else if (scrollX > f2) {
            zA = z2 ? this.R.a(Math.abs(scrollX - f2) / clientWidth) : false;
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.F += f4 - ((int) f4);
        scrollTo((int) f4, getScrollY());
        d((int) f4);
        return zA;
    }

    private void c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean d(int i) {
        if (this.e.size() == 0) {
            this.U = false;
            a(0, 0.0f, 0);
            if (this.U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        bz bzVarI = i();
        int clientWidth = getClientWidth();
        int i2 = this.o + clientWidth;
        int i3 = bzVarI.b;
        float f = ((i / clientWidth) - bzVarI.e) / (bzVarI.d + (this.o / clientWidth));
        this.U = false;
        a(i3, f, (int) (i2 * f));
        if (this.U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void g() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= getChildCount()) {
                return;
            }
            if (!((LayoutParams) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i = i2 + 1;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h() {
        if (this.ad != 0) {
            if (this.ae == null) {
                this.ae = new ArrayList();
            } else {
                this.ae.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ae.add(getChildAt(i));
            }
            Collections.sort(this.ae, af);
        }
    }

    private bz i() {
        int i;
        bz bzVar;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.o / clientWidth : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        bz bzVar2 = null;
        while (i3 < this.e.size()) {
            bz bzVar3 = (bz) this.e.get(i3);
            if (z || bzVar3.b == i2 + 1) {
                i = i3;
                bzVar = bzVar3;
            } else {
                bz bzVar4 = this.f;
                bzVar4.e = f2 + f3 + f;
                bzVar4.b = i2 + 1;
                bzVar4.d = this.h.b(bzVar4.b);
                i = i3 - 1;
                bzVar = bzVar4;
            }
            float f4 = bzVar.e;
            float f5 = bzVar.d + f4 + f;
            if (!z && scrollX < f4) {
                return bzVar2;
            }
            if (scrollX < f5 || i == this.e.size() - 1) {
                return bzVar;
            }
            f3 = f4;
            i2 = bzVar.b;
            z = false;
            f2 = bzVar.d;
            bzVar2 = bzVar;
            i3 = i + 1;
        }
        return bzVar2;
    }

    private void j() {
        this.A = false;
        this.B = false;
        if (this.K != null) {
            this.K.recycle();
            this.K = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        if (this.ah == i) {
            return;
        }
        this.ah = i;
        if (this.ab != null) {
            b(i != 0);
        }
        if (this.W != null) {
            this.W.b(i);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.x != z) {
            this.x = z;
        }
    }

    float a(float f) {
        return (float) Math.sin((float) (((double) (f - 0.5f)) * 0.4712389167638204d));
    }

    bz a(int i, int i2) {
        bz bzVar = new bz();
        bzVar.b = i;
        bzVar.a = this.h.a((ViewGroup) this, i);
        bzVar.d = this.h.b(i);
        if (i2 < 0 || i2 >= this.e.size()) {
            this.e.add(bzVar);
        } else {
            this.e.add(i2, bzVar);
        }
        return bzVar;
    }

    bz a(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.e.size()) {
                return null;
            }
            bz bzVar = (bz) this.e.get(i2);
            if (this.h.a(view, bzVar.a)) {
                return bzVar;
            }
            i = i2 + 1;
        }
    }

    cc a(cc ccVar) {
        cc ccVar2 = this.Z;
        this.Z = ccVar;
        return ccVar2;
    }

    void a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.m = new Scroller(context, d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.E = bj.a(viewConfiguration);
        this.L = (int) (400.0f * f);
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new android.support.v4.widget.h(context);
        this.R = new android.support.v4.widget.h(context);
        this.N = (int) (25.0f * f);
        this.O = (int) (2.0f * f);
        this.C = (int) (16.0f * f);
        at.a(this, new ca(this));
        if (at.c(this) == 0) {
            at.b(this, 1);
        }
    }

    void a(int i) {
        bz bzVar;
        int i2;
        String hexString;
        int i3;
        bz bzVar2;
        bz bzVarA;
        if (this.i != i) {
            int i4 = this.i < i ? 66 : 17;
            bz bzVarB = b(this.i);
            this.i = i;
            bzVar = bzVarB;
            i2 = i4;
        } else {
            bzVar = null;
            i2 = 2;
        }
        if (this.h == null) {
            h();
            return;
        }
        if (this.y) {
            h();
            return;
        }
        if (getWindowToken() != null) {
            this.h.a((ViewGroup) this);
            int i5 = this.z;
            int iMax = Math.max(0, this.i - i5);
            int iA = this.h.a();
            int iMin = Math.min(iA - 1, i5 + this.i);
            if (iA != this.b) {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (Resources.NotFoundException e) {
                    hexString = Integer.toHexString(getId());
                }
                throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.b + ", found: " + iA + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.h.getClass());
            }
            int i6 = 0;
            while (true) {
                i3 = i6;
                if (i3 >= this.e.size()) {
                    break;
                }
                bzVar2 = (bz) this.e.get(i3);
                if (bzVar2.b >= this.i) {
                    if (bzVar2.b != this.i) {
                        break;
                    }
                } else {
                    i6 = i3 + 1;
                }
            }
            bzVar2 = null;
            bz bzVarA2 = (bzVar2 != null || iA <= 0) ? bzVar2 : a(this.i, i3);
            if (bzVarA2 != null) {
                int i7 = i3 - 1;
                bz bzVar3 = i7 >= 0 ? (bz) this.e.get(i7) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - bzVarA2.d) + (getPaddingLeft() / clientWidth);
                float f = 0.0f;
                int i8 = i3;
                int i9 = i7;
                for (int i10 = this.i - 1; i10 >= 0; i10--) {
                    if (f >= paddingLeft && i10 < iMax) {
                        if (bzVar3 == null) {
                            break;
                        }
                        if (i10 == bzVar3.b && !bzVar3.c) {
                            this.e.remove(i9);
                            this.h.a((ViewGroup) this, i10, bzVar3.a);
                            i9--;
                            i8--;
                            bzVar3 = i9 >= 0 ? (bz) this.e.get(i9) : null;
                        }
                    } else if (bzVar3 == null || i10 != bzVar3.b) {
                        f += a(i10, i9 + 1).d;
                        i8++;
                        bzVar3 = i9 >= 0 ? (bz) this.e.get(i9) : null;
                    } else {
                        f += bzVar3.d;
                        i9--;
                        bzVar3 = i9 >= 0 ? (bz) this.e.get(i9) : null;
                    }
                }
                float f2 = bzVarA2.d;
                int i11 = i8 + 1;
                if (f2 < 2.0f) {
                    bz bzVar4 = i11 < this.e.size() ? (bz) this.e.get(i11) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    bz bzVar5 = bzVar4;
                    int i12 = i11;
                    int i13 = this.i + 1;
                    while (i13 < iA) {
                        if (f2 >= paddingRight && i13 > iMin) {
                            if (bzVar5 == null) {
                                break;
                            }
                            if (i13 == bzVar5.b && !bzVar5.c) {
                                this.e.remove(i12);
                                this.h.a((ViewGroup) this, i13, bzVar5.a);
                                bzVar5 = i12 < this.e.size() ? (bz) this.e.get(i12) : null;
                            }
                        } else if (bzVar5 == null || i13 != bzVar5.b) {
                            bz bzVarA3 = a(i13, i12);
                            i12++;
                            f2 += bzVarA3.d;
                            bzVar5 = i12 < this.e.size() ? (bz) this.e.get(i12) : null;
                        } else {
                            f2 += bzVar5.d;
                            i12++;
                            bzVar5 = i12 < this.e.size() ? (bz) this.e.get(i12) : null;
                        }
                        i13++;
                        bzVar5 = bzVar5;
                        f2 = f2;
                    }
                }
                a(bzVarA2, i8, bzVar);
            }
            this.h.b((ViewGroup) this, this.i, bzVarA2 != null ? bzVarA2.a : null);
            this.h.b((ViewGroup) this);
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f = i14;
                if (!layoutParams.a && layoutParams.c == 0.0f && (bzVarA = a(childAt)) != null) {
                    layoutParams.c = bzVarA.d;
                    layoutParams.e = bzVarA.b;
                }
            }
            h();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                bz bzVarB2 = viewFindFocus != null ? b(viewFindFocus) : null;
                if (bzVarB2 == null || bzVarB2.b != this.i) {
                    for (int i15 = 0; i15 < getChildCount(); i15++) {
                        View childAt2 = getChildAt(i15);
                        bz bzVarA4 = a(childAt2);
                        if (bzVarA4 != null && bzVarA4.b == this.i && childAt2.requestFocus(i2)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    protected void a(int i, float f, int i2) {
        int measuredWidth;
        int i3;
        int i4;
        if (this.V > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a) {
                    switch (layoutParams.b & 7) {
                        case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                            measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            int i6 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i6;
                            break;
                        case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                        case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                        default:
                            measuredWidth = paddingLeft;
                            int i7 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i7;
                            break;
                        case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                            int width2 = childAt.getWidth() + paddingLeft;
                            int i8 = paddingLeft;
                            i4 = paddingRight;
                            i3 = width2;
                            measuredWidth = i8;
                            break;
                        case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                            measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                            int measuredWidth2 = paddingRight + childAt.getMeasuredWidth();
                            i3 = paddingLeft;
                            i4 = measuredWidth2;
                            break;
                    }
                    int left = (measuredWidth + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                } else {
                    int i9 = paddingRight;
                    i3 = paddingLeft;
                    i4 = i9;
                }
                i5++;
                int i10 = i4;
                paddingLeft = i3;
                paddingRight = i10;
            }
        }
        if (this.W != null) {
            this.W.a(i, f, i2);
        }
        if (this.Z != null) {
            this.Z.a(i, f, i2);
        }
        if (this.ab != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((LayoutParams) childAt2.getLayoutParams()).a) {
                    this.ab.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.U = true;
    }

    void a(int i, int i2, int i3) {
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            a(false);
            c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float fA = (i6 * a(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth))) + i6;
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(1000.0f * Math.abs(fA / iAbs2)) * 4;
        } else {
            iAbs = (int) (((Math.abs(i4) / ((clientWidth * this.h.b(this.i)) + this.o)) + 1.0f) * 100.0f);
        }
        this.m.startScroll(scrollX, scrollY, i4, i5, Math.min(iAbs, 600));
        at.b(this);
    }

    public void a(int i, boolean z) {
        this.y = false;
        a(i, z, false);
    }

    void a(int i, boolean z, boolean z2) {
        a(i, z, z2, 0);
    }

    void a(int i, boolean z, boolean z2, int i2) {
        if (this.h == null || this.h.a() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.i == i && this.e.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.h.a()) {
            i = this.h.a() - 1;
        }
        int i3 = this.z;
        if (i > this.i + i3 || i < this.i - i3) {
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                ((bz) this.e.get(i4)).c = true;
            }
        }
        boolean z3 = this.i != i;
        if (!this.S) {
            a(i);
            a(i, z, i2, z3);
            return;
        }
        this.i = i;
        if (z3 && this.W != null) {
            this.W.a(i);
        }
        if (z3 && this.Z != null) {
            this.Z.a(i);
        }
        requestLayout();
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                break;
            case 22:
                break;
            case 61:
                if (Build.VERSION.SDK_INT >= 11) {
                    if (!s.a(keyEvent)) {
                        if (s.a(keyEvent, 1)) {
                        }
                    }
                }
                break;
        }
        return false;
    }

    protected boolean a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom() && a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && at.a(view, -i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        bz bzVarA;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (bzVarA = a(childAt)) != null && bzVarA.b == this.i) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        bz bzVarA;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (bzVarA = a(childAt)) != null && bzVarA.b == this.i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) layoutParamsGenerateLayoutParams;
        layoutParams2.a |= view instanceof by;
        if (!this.w) {
            super.addView(view, i, layoutParamsGenerateLayoutParams);
        } else {
            if (layoutParams2 != null && layoutParams2.a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.d = true;
            addViewInLayout(view, i, layoutParamsGenerateLayoutParams);
        }
    }

    bz b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.e.size()) {
                return null;
            }
            bz bzVar = (bz) this.e.get(i3);
            if (bzVar.b == i) {
                return bzVar;
            }
            i2 = i3 + 1;
        }
    }

    bz b(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return null;
    }

    void b() {
        int i;
        boolean z;
        int iMax;
        boolean z2;
        int iA = this.h.a();
        this.b = iA;
        boolean z3 = this.e.size() < (this.z * 2) + 1 && this.e.size() < iA;
        boolean z4 = false;
        int i2 = this.i;
        boolean z5 = z3;
        int i3 = 0;
        while (i3 < this.e.size()) {
            bz bzVar = (bz) this.e.get(i3);
            int iA2 = this.h.a(bzVar.a);
            if (iA2 == -1) {
                i = i3;
                z = z4;
                iMax = i2;
                z2 = z5;
            } else if (iA2 == -2) {
                this.e.remove(i3);
                int i4 = i3 - 1;
                if (!z4) {
                    this.h.a((ViewGroup) this);
                    z4 = true;
                }
                this.h.a((ViewGroup) this, bzVar.b, bzVar.a);
                if (this.i == bzVar.b) {
                    i = i4;
                    z = z4;
                    iMax = Math.max(0, Math.min(this.i, iA - 1));
                    z2 = true;
                } else {
                    i = i4;
                    z = z4;
                    iMax = i2;
                    z2 = true;
                }
            } else if (bzVar.b != iA2) {
                if (bzVar.b == this.i) {
                    i2 = iA2;
                }
                bzVar.b = iA2;
                i = i3;
                z = z4;
                iMax = i2;
                z2 = true;
            } else {
                i = i3;
                z = z4;
                iMax = i2;
                z2 = z5;
            }
            z5 = z2;
            i2 = iMax;
            z4 = z;
            i3 = i + 1;
        }
        if (z4) {
            this.h.b((ViewGroup) this);
        }
        Collections.sort(this.e, c);
        if (z5) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.a) {
                    layoutParams.c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    void c() {
        a(this.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(int r10) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.c(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.s));
        }
        if (i > 0) {
            return scrollX < ((int) (((float) clientWidth) * this.t));
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.m.isFinished() || !this.m.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.m.getCurrX();
        int currY = this.m.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!d(currX)) {
                this.m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        at.b(this);
    }

    boolean d() {
        if (this.i <= 0) {
            return false;
        }
        a(this.i - 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        bz bzVarA;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (bzVarA = a(childAt)) != null && bzVarA.b == this.i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean zA = false;
        int iA = at.a(this);
        if (iA == 0 || (iA == 1 && this.h != null && this.h.a() > 1)) {
            if (!this.Q.a()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.s * width);
                this.Q.a(height, width);
                zA = false | this.Q.a(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.R.a()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.t + 1.0f)) * width2);
                this.R.a(height2, width2);
                zA |= this.R.a(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.Q.b();
            this.R.b();
        }
        if (zA) {
            at.b(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    boolean e() {
        if (this.h == null || this.i >= this.h.a() - 1) {
            return false;
        }
        a(this.i + 1, true);
        return true;
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
        return generateDefaultLayoutParams();
    }

    public ae getAdapter() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ad == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.ae.get(i2)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.i;
    }

    public int getOffscreenPageLimit() {
        return this.z;
    }

    public int getPageMargin() {
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.ag);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.o <= 0 || this.p == null || this.e.size() <= 0 || this.h == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = this.o / width;
        bz bzVar = (bz) this.e.get(0);
        float f3 = bzVar.e;
        int size = this.e.size();
        int i = bzVar.b;
        int i2 = ((bz) this.e.get(size - 1)).b;
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            while (i4 > bzVar.b && i3 < size) {
                i3++;
                bzVar = (bz) this.e.get(i3);
            }
            if (i4 == bzVar.b) {
                f = (bzVar.e + bzVar.d) * width;
                f3 = bzVar.e + bzVar.d + f2;
            } else {
                float fB = this.h.b(i4);
                f = (f3 + fB) * width;
                f3 += fB + f2;
            }
            if (this.o + f > scrollX) {
                this.p.setBounds((int) f, this.q, (int) (this.o + f + 0.5f), this.r);
                this.p.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.A = false;
            this.B = false;
            this.J = -1;
            if (this.K == null) {
                return false;
            }
            this.K.recycle();
            this.K = null;
            return false;
        }
        if (action != 0) {
            if (this.A) {
                return true;
            }
            if (this.B) {
                return false;
            }
        }
        switch (action) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                float x = motionEvent.getX();
                this.H = x;
                this.F = x;
                float y = motionEvent.getY();
                this.I = y;
                this.G = y;
                this.J = z.b(motionEvent, 0);
                this.B = false;
                this.m.computeScrollOffset();
                if (this.ah == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.O) {
                    this.m.abortAnimation();
                    this.y = false;
                    c();
                    this.A = true;
                    c(true);
                    setScrollState(1);
                } else {
                    a(false);
                    this.A = false;
                }
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                int i = this.J;
                if (i != -1) {
                    int iA = z.a(motionEvent, i);
                    float fC = z.c(motionEvent, iA);
                    float f = fC - this.F;
                    float fAbs = Math.abs(f);
                    float fD = z.d(motionEvent, iA);
                    float fAbs2 = Math.abs(fD - this.I);
                    if (f != 0.0f && !a(this.F, f) && a(this, false, (int) f, (int) fC, (int) fD)) {
                        this.F = fC;
                        this.G = fD;
                        this.B = true;
                        return false;
                    }
                    if (fAbs > this.E && 0.5f * fAbs > fAbs2) {
                        this.A = true;
                        c(true);
                        setScrollState(1);
                        this.F = f > 0.0f ? this.H + this.E : this.H - this.E;
                        this.G = fD;
                        setScrollingCacheEnabled(true);
                    } else if (fAbs2 > this.E) {
                        this.B = true;
                    }
                    if (this.A && b(fC)) {
                        at.b(this);
                    }
                }
                break;
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                a(motionEvent);
                break;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010a A[PHI: r1
      0x010a: PHI (r1v18 int) = (r1v17 int), (r1v20 int) binds: [B:28:0x0088, B:30:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        bz bzVarA;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (bzVarA = a(childAt)) != null && bzVarA.b == this.i && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.h != null) {
            this.h.a(savedState.b, savedState.c);
            a(savedState.a, false, true);
        } else {
            this.j = savedState.a;
            this.k = savedState.b;
            this.l = savedState.c;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.i;
        if (this.h != null) {
            savedState.b = this.h.b();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            a(i, i3, this.o, this.o);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zC = false;
        if (this.P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.h == null || this.h.a() == 0) {
            return false;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                this.m.abortAnimation();
                this.y = false;
                c();
                float x = motionEvent.getX();
                this.H = x;
                this.F = x;
                float y = motionEvent.getY();
                this.I = y;
                this.G = y;
                this.J = z.b(motionEvent, 0);
                break;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                if (this.A) {
                    VelocityTracker velocityTracker = this.K;
                    velocityTracker.computeCurrentVelocity(1000, this.M);
                    int iA = (int) ao.a(velocityTracker, this.J);
                    this.y = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    bz bzVarI = i();
                    a(a(bzVarI.b, ((scrollX / clientWidth) - bzVarI.e) / bzVarI.d, iA, (int) (z.c(motionEvent, z.a(motionEvent, this.J)) - this.H)), true, true, iA);
                    this.J = -1;
                    j();
                    zC = this.R.c() | this.Q.c();
                }
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                if (!this.A) {
                    int iA2 = z.a(motionEvent, this.J);
                    float fC = z.c(motionEvent, iA2);
                    float fAbs = Math.abs(fC - this.F);
                    float fD = z.d(motionEvent, iA2);
                    float fAbs2 = Math.abs(fD - this.G);
                    if (fAbs > this.E && fAbs > fAbs2) {
                        this.A = true;
                        c(true);
                        this.F = fC - this.H > 0.0f ? this.H + this.E : this.H - this.E;
                        this.G = fD;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.A) {
                    zC = false | b(z.c(motionEvent, z.a(motionEvent, this.J)));
                }
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                if (this.A) {
                    a(this.i, true, 0, false);
                    this.J = -1;
                    j();
                    zC = this.R.c() | this.Q.c();
                }
                break;
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                int iB = z.b(motionEvent);
                this.F = z.c(motionEvent, iB);
                this.J = z.b(motionEvent, iB);
                break;
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                a(motionEvent);
                this.F = z.c(motionEvent, z.a(motionEvent, this.J));
                break;
        }
        if (zC) {
            at.b(this);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(ae aeVar) {
        if (this.h != null) {
            this.h.b(this.n);
            this.h.a((ViewGroup) this);
            for (int i = 0; i < this.e.size(); i++) {
                bz bzVar = (bz) this.e.get(i);
                this.h.a((ViewGroup) this, bzVar.b, bzVar.a);
            }
            this.h.b((ViewGroup) this);
            this.e.clear();
            g();
            this.i = 0;
            scrollTo(0, 0);
        }
        ae aeVar2 = this.h;
        this.h = aeVar;
        this.b = 0;
        if (this.h != null) {
            if (this.n == null) {
                this.n = new ce(this, null);
            }
            this.h.a((DataSetObserver) this.n);
            this.y = false;
            boolean z = this.S;
            this.S = true;
            this.b = this.h.a();
            if (this.j >= 0) {
                this.h.a(this.k, this.l);
                a(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (z) {
                requestLayout();
            } else {
                c();
            }
        }
        if (this.aa == null || aeVar2 == aeVar) {
            return;
        }
        this.aa.a(aeVar2, aeVar);
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.ac == null) {
                try {
                    this.ac = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.ac.invoke(this, Boolean.valueOf(z));
            } catch (Exception e2) {
                Log.e("ViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.y = false;
        a(i, !this.S, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.z) {
            this.z = i;
            c();
        }
    }

    void setOnAdapterChangeListener(cb cbVar) {
        this.aa = cbVar;
    }

    public void setOnPageChangeListener(cc ccVar) {
        this.W = ccVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.o;
        this.o = i;
        int width = getWidth();
        a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }
}
