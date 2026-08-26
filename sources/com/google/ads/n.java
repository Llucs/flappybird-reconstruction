package com.google.ads;

import android.app.Activity;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.google.ads.util.AdUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class n implements bu {
    private static final com.google.ads.a.h a = (com.google.ads.a.h) com.google.ads.a.h.a.b();

    protected int a(HashMap map, String str, int i, DisplayMetrics displayMetrics) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            return (int) TypedValue.applyDimension(1, Integer.parseInt(str2), displayMetrics);
        } catch (NumberFormatException e) {
            com.google.ads.util.g.a("Could not parse \"" + str + "\" in a video gmsg: " + str2);
            return i;
        }
    }

    @Override // com.google.ads.bu
    public void a(com.google.ads.a.w wVar, HashMap map, WebView webView) {
        String str = (String) map.get("action");
        if (str == null) {
            com.google.ads.util.g.a("No \"action\" parameter in a video gmsg.");
            return;
        }
        if (!(webView instanceof com.google.ads.a.e)) {
            com.google.ads.util.g.a("Could not get adWebView for a video gmsg.");
            return;
        }
        com.google.ads.a.e eVar = (com.google.ads.a.e) webView;
        AdActivity adActivityI = eVar.i();
        if (adActivityI == null) {
            com.google.ads.util.g.a("Could not get adActivity for a video gmsg.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            DisplayMetrics displayMetricsA = AdUtil.a((Activity) adActivityI);
            int iA = a(map, "x", 0, displayMetricsA);
            int iA2 = a(map, "y", 0, displayMetricsA);
            int iA3 = a(map, "w", -1, displayMetricsA);
            int iA4 = a(map, "h", -1, displayMetricsA);
            if (zEquals && adActivityI.a() == null) {
                adActivityI.b(iA, iA2, iA3, iA4);
                return;
            } else {
                adActivityI.a(iA, iA2, iA3, iA4);
                return;
            }
        }
        com.google.ads.a.c cVarA = adActivityI.a();
        if (cVarA == null) {
            a.a(eVar, "onVideoEvent", "{'event': 'error', 'what': 'no_video_view'}");
            return;
        }
        if (str.equals("click")) {
            DisplayMetrics displayMetricsA2 = AdUtil.a((Activity) adActivityI);
            int iA5 = a(map, "x", 0, displayMetricsA2);
            int iA6 = a(map, "y", 0, displayMetricsA2);
            long jUptimeMillis = SystemClock.uptimeMillis();
            cVarA.a(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iA5, iA6, 0));
            return;
        }
        if (str.equals("controls")) {
            String str2 = (String) map.get("enabled");
            if (str2 == null) {
                com.google.ads.util.g.a("No \"enabled\" parameter in a controls video gmsg.");
                return;
            } else if (str2.equals("true")) {
                cVarA.setMediaControllerEnabled(true);
                return;
            } else {
                cVarA.setMediaControllerEnabled(false);
                return;
            }
        }
        if (str.equals("currentTime")) {
            String str3 = (String) map.get("time");
            if (str3 == null) {
                com.google.ads.util.g.a("No \"time\" parameter in a currentTime video gmsg.");
                return;
            }
            try {
                cVarA.a((int) (Float.parseFloat(str3) * 1000.0f));
                return;
            } catch (NumberFormatException e) {
                com.google.ads.util.g.a("Could not parse \"time\" parameter: " + str3);
                return;
            }
        }
        if (str.equals("hide")) {
            cVarA.setVisibility(4);
            return;
        }
        if (str.equals("load")) {
            cVarA.b();
            return;
        }
        if (str.equals("pause")) {
            cVarA.c();
            return;
        }
        if (str.equals("play")) {
            cVarA.d();
            return;
        }
        if (str.equals("show")) {
            cVarA.setVisibility(0);
        } else if (str.equals("src")) {
            cVarA.setSrc((String) map.get("src"));
        } else {
            com.google.ads.util.g.a("Unknown video action: " + str);
        }
    }
}
