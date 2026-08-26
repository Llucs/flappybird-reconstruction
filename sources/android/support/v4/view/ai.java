package android.support.v4.view;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
class ai extends DataSetObserver implements cb, cc {
    final /* synthetic */ PagerTitleStrip a;
    private int b;

    private ai(PagerTitleStrip pagerTitleStrip) {
        this.a = pagerTitleStrip;
    }

    @Override // android.support.v4.view.cc
    public void a(int i) {
        if (this.b == 0) {
            this.a.a(this.a.a.getCurrentItem(), this.a.a.getAdapter());
            this.a.a(this.a.a.getCurrentItem(), this.a.g >= 0.0f ? this.a.g : 0.0f, true);
        }
    }

    @Override // android.support.v4.view.cc
    public void a(int i, float f, int i2) {
        if (f > 0.5f) {
            i++;
        }
        this.a.a(i, f, false);
    }

    @Override // android.support.v4.view.cb
    public void a(ae aeVar, ae aeVar2) {
        this.a.a(aeVar, aeVar2);
    }

    @Override // android.support.v4.view.cc
    public void b(int i) {
        this.b = i;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.a.a(this.a.a.getCurrentItem(), this.a.a.getAdapter());
        this.a.a(this.a.a.getCurrentItem(), this.a.g >= 0.0f ? this.a.g : 0.0f, true);
    }
}
