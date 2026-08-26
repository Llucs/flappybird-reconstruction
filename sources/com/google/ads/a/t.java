package com.google.ads.a;

import android.webkit.WebView;
import com.google.ads.bt;

/* JADX INFO: loaded from: classes.dex */
class t implements Runnable {
    final /* synthetic */ n a;
    private final String b;
    private final String c;
    private final WebView d;

    public t(n nVar, WebView webView, String str, String str2) {
        this.a = nVar;
        this.d = webView;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.j.c.a(Boolean.valueOf(this.a.p));
        ((w) ((bt) this.a.j.a.a()).b.a()).k().a(this.a.p);
        if (((bt) this.a.j.a.a()).e.a() != null) {
            ((a) ((bt) this.a.j.a.a()).e.a()).setOverlayEnabled(!this.a.p);
        }
        if (this.c != null) {
            this.d.loadDataWithBaseURL(this.b, this.c, "text/html", "utf-8", null);
        } else {
            this.d.loadUrl(this.b);
        }
    }
}
