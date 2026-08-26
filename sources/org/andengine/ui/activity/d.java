package org.andengine.ui.activity;

/* JADX INFO: loaded from: classes.dex */
class d implements Runnable {
    final /* synthetic */ BaseGameActivity a;

    d(BaseGameActivity baseGameActivity) {
        this.a = baseGameActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.s();
    }
}
