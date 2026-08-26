package android.support.v4.widget;

/* JADX INFO: loaded from: classes.dex */
class a implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar a;

    a(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.b = false;
        this.a.a = -1L;
        this.a.setVisibility(8);
    }
}
