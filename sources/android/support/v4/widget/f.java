package android.support.v4.widget;

import android.support.v4.widget.DrawerLayout;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class f extends af {
    final /* synthetic */ DrawerLayout a;
    private final int b;
    private ac c;
    private final Runnable d = new g(this);

    public f(DrawerLayout drawerLayout, int i) {
        this.a = drawerLayout;
        this.b = i;
    }

    private void b() {
        View viewA = this.a.a(this.b == 3 ? 5 : 3);
        if (viewA != null) {
            this.a.i(viewA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        View view;
        int i;
        int iB = this.c.b();
        boolean z = this.b == 3;
        if (z) {
            View viewA = this.a.a(3);
            int i2 = (viewA != null ? -viewA.getWidth() : 0) + iB;
            view = viewA;
            i = i2;
        } else {
            View viewA2 = this.a.a(5);
            int width = this.a.getWidth() - iB;
            view = viewA2;
            i = width;
        }
        if (view != null) {
            if (((!z || view.getLeft() >= i) && (z || view.getLeft() <= i)) || this.a.a(view) != 0) {
                return;
            }
            DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams) view.getLayoutParams();
            this.c.a(view, i, view.getTop());
            layoutParams.c = true;
            this.a.invalidate();
            b();
            this.a.c();
        }
    }

    @Override // android.support.v4.widget.af
    public int a(View view) {
        return view.getWidth();
    }

    @Override // android.support.v4.widget.af
    public int a(View view, int i, int i2) {
        if (this.a.a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.a.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    public void a() {
        this.a.removeCallbacks(this.d);
    }

    @Override // android.support.v4.widget.af
    public void a(int i) {
        this.a.a(this.b, i, this.c.c());
    }

    @Override // android.support.v4.widget.af
    public void a(int i, int i2) {
        this.a.postDelayed(this.d, 160L);
    }

    public void a(ac acVar) {
        this.c = acVar;
    }

    @Override // android.support.v4.widget.af
    public void a(View view, float f, float f2) {
        int width;
        float fD = this.a.d(view);
        int width2 = view.getWidth();
        if (this.a.a(view, 3)) {
            width = (f > 0.0f || (f == 0.0f && fD > 0.5f)) ? 0 : -width2;
        } else {
            width = this.a.getWidth();
            if (f < 0.0f || (f == 0.0f && fD > 0.5f)) {
                width -= width2;
            }
        }
        this.c.a(width, view.getTop());
        this.a.invalidate();
    }

    @Override // android.support.v4.widget.af
    public void a(View view, int i, int i2, int i3, int i4) {
        int width = view.getWidth();
        float width2 = this.a.a(view, 3) ? (width + i) / width : (this.a.getWidth() - i) / width;
        this.a.b(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        this.a.invalidate();
    }

    @Override // android.support.v4.widget.af
    public boolean a(View view, int i) {
        return this.a.g(view) && this.a.a(view, this.b) && this.a.a(view) == 0;
    }

    @Override // android.support.v4.widget.af
    public int b(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // android.support.v4.widget.af
    public void b(int i, int i2) {
        View viewA = (i & 1) == 1 ? this.a.a(3) : this.a.a(5);
        if (viewA == null || this.a.a(viewA) != 0) {
            return;
        }
        this.c.a(viewA, i2);
    }

    @Override // android.support.v4.widget.af
    public void b(View view, int i) {
        ((DrawerLayout.LayoutParams) view.getLayoutParams()).c = false;
        b();
    }

    @Override // android.support.v4.widget.af
    public boolean b(int i) {
        return false;
    }
}
