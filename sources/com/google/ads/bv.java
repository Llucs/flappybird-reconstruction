package com.google.ads;

import android.webkit.WebView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class bv implements bu {
    @Override // com.google.ads.bu
    public void a(com.google.ads.a.w wVar, HashMap map, WebView webView) {
        String str = (String) map.get("name");
        if (str == null) {
            com.google.ads.util.g.b("Error: App event with no name parameter.");
        } else {
            wVar.a(str, (String) map.get("info"));
        }
    }
}
