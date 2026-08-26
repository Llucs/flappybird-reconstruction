package com.google.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class p implements Runnable {
    private WeakReference a;

    public p(com.google.ads.a.w wVar) {
        this.a = new WeakReference(wVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.google.ads.a.w wVar = (com.google.ads.a.w) this.a.get();
        if (wVar == null) {
            com.google.ads.util.g.a("The ad must be gone, so cancelling the refresh timer.");
        } else {
            wVar.x();
        }
    }
}
