package android.support.v4.widget;

/* JADX INFO: loaded from: classes.dex */
class b implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar a;

    b(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.c = false;
        if (this.a.d) {
            return;
        }
        this.a.a = System.currentTimeMillis();
        this.a.setVisibility(0);
    }
}
