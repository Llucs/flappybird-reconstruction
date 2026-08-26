package com.google.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.WebView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class bw implements bu {
    private static final com.google.ads.a.h a = (com.google.ads.a.h) com.google.ads.a.h.a.b();

    @Override // com.google.ads.bu
    public void a(com.google.ads.a.w wVar, HashMap map, WebView webView) {
        String str = (String) map.get("urls");
        if (str == null) {
            com.google.ads.util.g.e("Could not get the urls param from canOpenURLs gmsg.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = webView.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            map2.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length >= 2 ? strArrSplit2[1] : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0])), 65536) != null));
        }
        a.a(webView, map2);
    }
}
