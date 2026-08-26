package com.google.ads.a;

import com.google.ads.AdView;

/* JADX INFO: loaded from: classes.dex */
class b implements Runnable {
    final /* synthetic */ a a;
    final /* synthetic */ a b;

    b(a aVar, a aVar2) {
        this.b = aVar;
        this.a = aVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((AdView) this.b.a.j.a()).removeView(this.a);
    }
}
