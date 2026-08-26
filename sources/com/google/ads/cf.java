package com.google.ads;

import android.webkit.WebView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class cf implements bu {
    private b a;

    public cf() {
        this(new b());
    }

    public cf(b bVar) {
        this.a = bVar;
    }

    @Override // com.google.ads.bu
    public void a(com.google.ads.a.w wVar, HashMap map, WebView webView) {
        String str = (String) map.get("a");
        if (str == null) {
            com.google.ads.util.g.a("Could not get the action parameter for open GMSG.");
            return;
        }
        if (str.equals("webapp")) {
            this.a.a(wVar, new com.google.ads.a.x("webapp", map));
        } else if (str.equals("expand")) {
            this.a.a(wVar, new com.google.ads.a.x("expand", map));
        } else {
            this.a.a(wVar, new com.google.ads.a.x("intent", map));
        }
    }
}
