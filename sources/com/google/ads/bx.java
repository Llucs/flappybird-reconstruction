package com.google.ads;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class bx implements bu {
    @Override // com.google.ads.bu
    public void a(com.google.ads.a.w wVar, HashMap map, WebView webView) {
        ak akVar;
        Uri uri;
        String host;
        String str = (String) map.get("u");
        if (str == null) {
            com.google.ads.util.g.e("Could not get URL from click gmsg.");
            return;
        }
        com.google.ads.a.ab abVarM = wVar.m();
        if (abVarM != null && (host = (uri = Uri.parse(str)).getHost()) != null && host.toLowerCase(Locale.US).endsWith(".admob.com")) {
            String str2 = null;
            String path = uri.getPath();
            if (path != null) {
                String[] strArrSplit = path.split("/");
                if (strArrSplit.length >= 4) {
                    str2 = strArrSplit[2] + "/" + strArrSplit[3];
                }
            }
            abVarM.a(str2);
        }
        bt btVarH = wVar.h();
        Context context = (Context) btVarH.f.a();
        Uri uri2 = Uri.parse(str);
        try {
            akVar = (ak) btVarH.s.a();
        } catch (al e) {
            com.google.ads.util.g.e("Unable to append parameter to URL: " + str);
        }
        Uri uriA = (akVar == null || !akVar.a(uri2)) ? uri2 : akVar.a(uri2, context);
        new Thread(new o(uriA.toString(), context)).start();
    }
}
