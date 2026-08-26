package com.google.ads;

import android.webkit.WebView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class bz implements bu {
    @Override // com.google.ads.bu
    public void a(com.google.ads.a.w wVar, HashMap map, WebView webView) {
        if (webView instanceof com.google.ads.a.e) {
            ((com.google.ads.a.e) webView).setCustomClose("1".equals(map.get("custom_close")));
        } else {
            com.google.ads.util.g.b("Trying to set a custom close icon on a WebView that isn't an AdWebView");
        }
    }
}
