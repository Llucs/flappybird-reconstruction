package com.google.ads.a;

import com.google.ads.bt;

/* JADX INFO: loaded from: classes.dex */
class o implements Runnable {
    final /* synthetic */ n a;

    o(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((a) ((bt) this.a.j.a.a()).e.a()).loadUrl(this.a.l);
    }
}
