package com.google.ads.util;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.ads.br;
import com.google.ads.bs;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class y extends com.google.ads.a.ad {
    public y(com.google.ads.a.w wVar, Map map, boolean z, boolean z2) {
        super(wVar, map, z, z2);
    }

    private static WebResourceResponse a(String str, Context context) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        try {
            AdUtil.a(httpURLConnection, context.getApplicationContext());
            httpURLConnection.connect();
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(AdUtil.a(new InputStreamReader(httpURLConnection.getInputStream())).getBytes("UTF-8")));
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            if ("mraid.js".equalsIgnoreCase(new File(str).getName())) {
                com.google.ads.a.n nVarJ = this.a.j();
                if (nVarJ != null) {
                    nVarJ.c(true);
                } else {
                    this.a.a(true);
                }
                bs bsVar = (bs) ((br) this.a.h().d.a()).b.a();
                if (this.a.h().b()) {
                    String str2 = (String) bsVar.g.a();
                    g.a("shouldInterceptRequest(" + str2 + ")");
                    return a(str2, webView.getContext());
                }
                if (this.b) {
                    String str3 = (String) bsVar.f.a();
                    g.a("shouldInterceptRequest(" + str3 + ")");
                    return a(str3, webView.getContext());
                }
                String str4 = (String) bsVar.e.a();
                g.a("shouldInterceptRequest(" + str4 + ")");
                return a(str4, webView.getContext());
            }
        } catch (IOException e) {
            g.d("IOException fetching MRAID JS.", e);
        } catch (Throwable th) {
            g.d("An unknown error occurred fetching MRAID JS.", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
