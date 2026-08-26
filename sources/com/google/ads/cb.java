package com.google.ads;

import android.webkit.WebView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class cb implements bu {
    @Override // com.google.ads.bu
    public void a(com.google.ads.a.w wVar, HashMap map, WebView webView) {
        com.google.ads.util.g.e("Invalid " + ((String) map.get("type")) + " request error: " + ((String) map.get("errors")));
        com.google.ads.a.n nVarJ = wVar.j();
        if (nVarJ != null) {
            nVarJ.a(e.INVALID_REQUEST);
        }
    }
}
