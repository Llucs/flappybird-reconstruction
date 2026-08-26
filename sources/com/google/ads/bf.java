package com.google.ads;

/* JADX INFO: loaded from: classes.dex */
class bf implements Runnable {
    final /* synthetic */ ba a;
    final /* synthetic */ bd b;

    bf(bd bdVar, ba baVar) {
        this.b = bdVar;
        this.a = baVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.a.b(this.a);
    }
}
