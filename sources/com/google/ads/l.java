package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class l implements bu {
    @Override // com.google.ads.bu
    public void a(com.google.ads.a.w wVar, HashMap map, WebView webView) {
        if (!(webView instanceof com.google.ads.a.a)) {
            com.google.ads.util.g.b("Trying to activate an overlay when this is not an overlay.");
            return;
        }
        try {
            int i = !TextUtils.isEmpty((CharSequence) map.get("w")) ? Integer.parseInt((String) map.get("w")) : -1;
            int i2 = !TextUtils.isEmpty((CharSequence) map.get("h")) ? Integer.parseInt((String) map.get("h")) : -1;
            int i3 = !TextUtils.isEmpty((CharSequence) map.get("x")) ? Integer.parseInt((String) map.get("x")) : -1;
            int i4 = TextUtils.isEmpty((CharSequence) map.get("y")) ? -1 : Integer.parseInt((String) map.get("y"));
            if (map.get("a") != null && ((String) map.get("a")).equals("1")) {
                wVar.a(null, true, i3, i4, i, i2);
            } else if (map.get("a") == null || !((String) map.get("a")).equals("0")) {
                wVar.a(i3, i4, i, i2);
            } else {
                wVar.a(null, false, i3, i4, i, i2);
            }
        } catch (NumberFormatException e) {
            com.google.ads.util.g.d("Invalid number format in activation overlay response.", e);
        }
    }
}
