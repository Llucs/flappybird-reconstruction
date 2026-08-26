package com.google.ads;

import android.webkit.WebView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class by implements bu {
    @Override // com.google.ads.bu
    public void a(com.google.ads.a.w wVar, HashMap map, WebView webView) {
        if (webView instanceof com.google.ads.a.e) {
            ((com.google.ads.a.e) webView).f();
        } else {
            com.google.ads.util.g.b("Trying to close WebView that isn't an AdWebView");
        }
    }
}
