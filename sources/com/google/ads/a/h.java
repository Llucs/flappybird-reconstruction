package com.google.ads.a;

import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.bu;
import com.google.ads.util.AdUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private static final h e = new h();
    public static final com.google.ads.util.o a = new j();
    public static final Map b = Collections.unmodifiableMap(new k());
    public static final Map c = Collections.unmodifiableMap(new l());
    public static final Map d = Collections.unmodifiableMap(new i());

    public String a(Uri uri, HashMap map) {
        if (!c(uri)) {
            if (b(uri)) {
                return uri.getPath();
            }
            com.google.ads.util.g.e("Message was neither a GMSG nor an AMSG.");
            return null;
        }
        String host = uri.getHost();
        if (host == null) {
            com.google.ads.util.g.e("An error occurred while parsing the AMSG parameters.");
            return null;
        }
        if (host.equals("launch")) {
            map.put("a", "intent");
            map.put("u", map.get("url"));
            map.remove("url");
            return "/open";
        }
        if (host.equals("closecanvas")) {
            return "/close";
        }
        if (host.equals("log")) {
            return "/log";
        }
        com.google.ads.util.g.e("An error occurred while parsing the AMSG: " + uri.toString());
        return null;
    }

    public void a(WebView webView) {
        a(webView, "onshow", "{'version': 'afma-sdk-a-v6.4.1'}");
    }

    public void a(WebView webView, String str) {
        com.google.ads.util.g.a("Sending JS to a WebView: " + str);
        webView.loadUrl("javascript:" + str);
    }

    public void a(WebView webView, String str, String str2) {
        if (str2 != null) {
            a(webView, "AFMA_ReceiveMessage('" + str + "', " + str2 + ");");
        } else {
            a(webView, "AFMA_ReceiveMessage('" + str + "');");
        }
    }

    public void a(WebView webView, Map map) {
        a(webView, "openableURLs", new JSONObject(map).toString());
    }

    public void a(w wVar, Map map, Uri uri, WebView webView) {
        HashMap mapB = AdUtil.b(uri);
        if (mapB == null) {
            com.google.ads.util.g.e("An error occurred while parsing the message parameters.");
            return;
        }
        String strA = a(uri, mapB);
        if (strA == null) {
            com.google.ads.util.g.e("An error occurred while parsing the message.");
            return;
        }
        bu buVar = (bu) map.get(strA);
        if (buVar == null) {
            com.google.ads.util.g.e("No AdResponse found, <message: " + strA + ">");
        } else {
            buVar.a(wVar, mapB, webView);
        }
    }

    public boolean a(Uri uri) {
        if (uri == null || !uri.isHierarchical()) {
            return false;
        }
        return b(uri) || c(uri);
    }

    public void b(WebView webView) {
        a(webView, "onhide", null);
    }

    public boolean b(Uri uri) {
        String authority;
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("gmsg") && (authority = uri.getAuthority()) != null && authority.equals("mobileads.google.com");
    }

    public boolean c(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("admob");
    }
}
