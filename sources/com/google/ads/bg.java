package com.google.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class bg implements Runnable {
    final /* synthetic */ bk a;
    final /* synthetic */ View b;
    final /* synthetic */ bh c;
    final /* synthetic */ bd d;

    bg(bd bdVar, bk bkVar, View view, bh bhVar) {
        this.d = bdVar;
        this.a = bkVar;
        this.b = view;
        this.c = bhVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.d.b(this.a)) {
            com.google.ads.util.g.a("Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called. Destroying the new ambassador and terminating mediation.");
        } else {
            this.d.a.a(this.b, this.a, this.c, false);
        }
    }
}
