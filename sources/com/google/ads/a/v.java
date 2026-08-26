package com.google.ads.a;

import android.webkit.WebView;
import com.google.ads.bt;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
class v implements Runnable {
    final /* synthetic */ n a;
    private final w b;
    private final WebView c;
    private final LinkedList d;
    private final int e;
    private final boolean f;
    private final String g;
    private final com.google.ads.g h;

    public v(n nVar, w wVar, WebView webView, LinkedList linkedList, int i, boolean z, String str, com.google.ads.g gVar) {
        this.a = nVar;
        this.b = wVar;
        this.c = webView;
        this.d = linkedList;
        this.e = i;
        this.f = z;
        this.g = str;
        this.h = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.c != null) {
            this.c.stopLoading();
            this.c.destroy();
        }
        this.b.a(this.d);
        this.b.a(this.e);
        this.b.a(this.f);
        this.b.a(this.g);
        if (this.h != null) {
            ((ac) ((bt) this.a.j.a.a()).g.a()).b(this.h);
            this.b.k().setAdSize(this.h);
        }
        this.b.z();
    }
}
