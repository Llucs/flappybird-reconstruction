package android.support.v4.view;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
class ce extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    private ce(ViewPager viewPager) {
        this.a = viewPager;
    }

    /* synthetic */ ce(ViewPager viewPager, bv bvVar) {
        this(viewPager);
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.a.b();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.a.b();
    }
}
