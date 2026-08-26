package com.google.ads.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.al;
import com.google.ads.bt;
import com.google.ads.util.AdUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ad extends WebViewClient {
    private static final h c = (h) h.a.b();
    protected w a;
    private final Map d;
    private final boolean e;
    private boolean f;
    private boolean g;
    protected boolean b = false;
    private boolean h = false;
    private boolean i = false;

    public ad(w wVar, Map map, boolean z, boolean z2) {
        this.a = wVar;
        this.d = map;
        this.e = z;
        this.g = z2;
    }

    public static ad a(w wVar, Map map, boolean z, boolean z2) {
        return AdUtil.a >= 11 ? new com.google.ads.util.y(wVar, map, z, z2) : new ad(wVar, map, z, z2);
    }

    public void a(boolean z) {
        this.b = z;
    }

    public boolean a() {
        return this.f;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void c(boolean z) {
        this.h = z;
    }

    public void d(boolean z) {
        this.i = z;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.f = false;
        if (this.h) {
            n nVarJ = this.a.j();
            if (nVarJ != null) {
                nVarJ.b();
            } else {
                com.google.ads.util.g.a("adLoader was null while trying to setFinishedLoadingHtml().");
            }
            this.h = false;
        }
        if (this.i) {
            c.a(webView);
            this.i = false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f = true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f = false;
        n nVarJ = this.a.j();
        if (nVarJ != null) {
            nVarJ.a(com.google.ads.e.NETWORK_ERROR);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        Context context;
        com.google.ads.ak akVar;
        try {
            com.google.ads.util.g.a("shouldOverrideUrlLoading(\"" + str + "\")");
            uri = Uri.parse(str);
        } catch (Throwable th) {
            com.google.ads.util.g.d("An unknown error occurred in shouldOverrideUrlLoading.", th);
        }
        if (c.a(uri)) {
            c.a(this.a, this.d, uri, webView);
            return true;
        }
        if (this.g) {
            if (AdUtil.a(uri)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            HashMap map = new HashMap();
            map.put("u", str);
            AdActivity.a(this.a, new x("intent", map));
            return true;
        }
        if (!this.e) {
            com.google.ads.util.g.e("URL is not a GMSG and can't handle URL: " + str);
            return true;
        }
        try {
            bt btVarH = this.a.h();
            context = (Context) btVarH.f.a();
            akVar = (com.google.ads.ak) btVarH.s.a();
        } catch (al e) {
            com.google.ads.util.g.e("Unable to append parameter to URL: " + str);
        }
        Uri uriA = (akVar == null || !akVar.a(uri)) ? uri : akVar.a(uri, context);
        HashMap map2 = new HashMap();
        map2.put("u", uriA.toString());
        AdActivity.a(this.a, new x("intent", map2));
        return true;
    }
}
