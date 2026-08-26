package com.google.ads.util;

import com.google.ads.bt;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.google.ads.a.e {
    public c(bt btVar, com.google.ads.g gVar) {
        super(btVar, gVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.a.e.a() != null ? !((com.google.ads.a.a) this.a.e.a()).b() : super.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.a.e.a() != null ? !((com.google.ads.a.a) this.a.e.a()).b() : super.canScrollVertically(i);
    }
}
