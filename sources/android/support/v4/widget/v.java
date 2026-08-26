package android.support.v4.widget;

import android.support.v4.widget.SlidingPaneLayout;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class v extends af {
    final /* synthetic */ SlidingPaneLayout a;

    private v(SlidingPaneLayout slidingPaneLayout) {
        this.a = slidingPaneLayout;
    }

    @Override // android.support.v4.widget.af
    public int a(View view) {
        return this.a.j;
    }

    @Override // android.support.v4.widget.af
    public int a(View view, int i, int i2) {
        SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) this.a.g.getLayoutParams();
        int paddingLeft = layoutParams.leftMargin + this.a.getPaddingLeft();
        return Math.min(Math.max(i, paddingLeft), this.a.j + paddingLeft);
    }

    @Override // android.support.v4.widget.af
    public void a(int i) {
        if (this.a.p.a() == 0) {
            if (this.a.h != 0.0f) {
                this.a.b(this.a.g);
                this.a.q = true;
            } else {
                this.a.d(this.a.g);
                this.a.c(this.a.g);
                this.a.q = false;
            }
        }
    }

    @Override // android.support.v4.widget.af
    public void a(View view, float f, float f2) {
        SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        int paddingLeft = layoutParams.leftMargin + this.a.getPaddingLeft();
        if (f > 0.0f || (f == 0.0f && this.a.h > 0.5f)) {
            paddingLeft += this.a.j;
        }
        this.a.p.a(paddingLeft, view.getTop());
        this.a.invalidate();
    }

    @Override // android.support.v4.widget.af
    public void a(View view, int i, int i2, int i3, int i4) {
        this.a.a(i);
        this.a.invalidate();
    }

    @Override // android.support.v4.widget.af
    public boolean a(View view, int i) {
        if (this.a.k) {
            return false;
        }
        return ((SlidingPaneLayout.LayoutParams) view.getLayoutParams()).b;
    }

    @Override // android.support.v4.widget.af
    public void b(int i, int i2) {
        this.a.p.a(this.a.g, i2);
    }

    @Override // android.support.v4.widget.af
    public void b(View view, int i) {
        this.a.a();
    }
}
