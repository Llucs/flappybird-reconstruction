package com.google.ads.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(com.google.android.gms.e.MapAttrs_uiZoomGestures)
public class p {
    public static void a(View view) {
        view.setLayerType(1, null);
    }

    public static void a(Window window) {
        window.setFlags(16777216, 16777216);
    }

    public static void a(WebSettings webSettings, bt btVar) {
        Context context = (Context) btVar.f.a();
        bs bsVar = (bs) ((br) btVar.d.a()).b.a();
        webSettings.setAppCacheEnabled(true);
        webSettings.setAppCacheMaxSize(((Long) bsVar.i.a()).longValue());
        webSettings.setAppCachePath(new File(context.getCacheDir(), "admob").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDatabasePath(context.getDatabasePath("admob").getAbsolutePath());
        webSettings.setDomStorageEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
    }

    public static void b(View view) {
        view.setLayerType(0, null);
    }
}
