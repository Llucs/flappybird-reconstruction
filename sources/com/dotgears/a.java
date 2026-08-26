package com.dotgears;

/* JADX INFO: loaded from: classes.dex */
class a implements Runnable {
    final /* synthetic */ GameActivity a;

    a(GameActivity gameActivity) {
        this.a = gameActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.a.setVisibility(4);
    }
}
