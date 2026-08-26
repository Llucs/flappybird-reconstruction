package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ca implements bu {
    @Override // com.google.ads.bu
    public void a(com.google.ads.a.w wVar, HashMap map, WebView webView) {
        String str = (String) map.get("u");
        if (TextUtils.isEmpty(str)) {
            com.google.ads.util.g.e("Could not get URL from track gmsg.");
        } else {
            new Thread(new o(str, (Context) wVar.h().f.a())).start();
        }
    }
}
