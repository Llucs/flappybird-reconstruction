package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class bt extends com.google.ads.util.aa {
    public final com.google.ads.util.ad a;
    public final com.google.ads.util.ad b;
    public final com.google.ads.util.af c;
    public final com.google.ads.util.ad d;
    public final com.google.ads.util.ad e;
    public final com.google.ads.util.ad f;
    public final com.google.ads.util.ad g;
    public final com.google.ads.util.ad h;
    public final com.google.ads.util.ad i;
    public final com.google.ads.util.ad j;
    public final com.google.ads.util.ad k;
    public final com.google.ads.util.ae l = new com.google.ads.util.ae(this, "currentAd", null);
    public final com.google.ads.util.ae m = new com.google.ads.util.ae(this, "nextAd", null);
    public final com.google.ads.util.ae o = new com.google.ads.util.ae(this, "adListener");
    public final com.google.ads.util.ae p = new com.google.ads.util.ae(this, "appEventListener");
    public final com.google.ads.util.ae q = new com.google.ads.util.ae(this, "swipeableEventListener");
    public final com.google.ads.util.ae r = new com.google.ads.util.ae(this, "spamSignals", null);
    public final com.google.ads.util.ae s = new com.google.ads.util.ae(this, "spamSignalsUtil", null);
    public final com.google.ads.util.ae t = new com.google.ads.util.ae(this, "usesManualImpressions", false);
    public final com.google.ads.util.ae n = new com.google.ads.util.ae(this, "adSizes", null);

    public bt(br brVar, a aVar, AdView adView, i iVar, String str, Activity activity, Context context, ViewGroup viewGroup, com.google.ads.a.ac acVar, com.google.ads.a.w wVar) {
        com.google.ads.a.a aVar2 = null;
        this.d = new com.google.ads.util.ad(this, "appState", brVar);
        this.a = new com.google.ads.util.ad(this, "ad", aVar);
        this.j = new com.google.ads.util.ad(this, "adView", adView);
        this.g = new com.google.ads.util.ad(this, "adType", acVar);
        this.h = new com.google.ads.util.ad(this, "adUnitId", str);
        this.c = new com.google.ads.util.af(this, "activity", activity);
        this.k = new com.google.ads.util.ad(this, "interstitialAd", iVar);
        this.i = new com.google.ads.util.ad(this, "bannerContainer", viewGroup);
        this.f = new com.google.ads.util.ad(this, "applicationContext", context);
        this.b = new com.google.ads.util.ad(this, "adManager", wVar);
        if (acVar != null && acVar.b()) {
            aVar2 = new com.google.ads.a.a(this);
        }
        this.e = new com.google.ads.util.ad(this, "activationOverlay", aVar2);
    }

    public boolean a() {
        return !b();
    }

    public boolean b() {
        return ((com.google.ads.a.ac) this.g.a()).a();
    }
}
