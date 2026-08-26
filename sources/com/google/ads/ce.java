package com.google.ads;

import android.webkit.WebView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ce implements bu {
    @Override // com.google.ads.bu
    public void a(com.google.ads.a.w wVar, HashMap map, WebView webView) {
        com.google.ads.util.g.c("Received log message: <\"string\": \"" + ((String) map.get("string")) + "\", \"afmaNotifyDt\": \"" + ((String) map.get("afma_notify_dt")) + "\">");
    }
}
