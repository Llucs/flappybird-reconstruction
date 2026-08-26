package com.dotgears;

/* JADX INFO: loaded from: classes.dex */
class b implements Runnable {
    final /* synthetic */ GameActivity a;

    b(GameActivity gameActivity) {
        this.a = gameActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.a.setVisibility(0);
    }
}
