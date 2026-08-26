package android.support.v4.view;

/* JADX INFO: loaded from: classes.dex */
class bx implements Runnable {
    final /* synthetic */ ViewPager a;

    bx(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.setScrollState(0);
        this.a.c();
    }
}
