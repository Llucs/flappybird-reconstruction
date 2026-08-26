package com.google.ads;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class bm implements Runnable {
    private final bk a;
    private final String b;
    private final d c;
    private final HashMap d;
    private final boolean e;
    private final WeakReference f;

    public bm(bk bkVar, Activity activity, String str, d dVar, HashMap map) {
        this.a = bkVar;
        this.b = str;
        this.f = new WeakReference(activity);
        this.c = dVar;
        this.d = new HashMap(map);
        this.e = a(this.d);
    }

    private void a(com.google.ads.b.b bVar) throws com.google.ads.b.h, bn {
        com.google.ads.b.g gVar;
        Activity activity = (Activity) this.f.get();
        if (activity == null) {
            throw new bn("Activity became null while trying to instantiate adapter.");
        }
        this.a.a(bVar);
        Class clsC = bVar.c();
        if (clsC != null) {
            com.google.ads.b.g gVar2 = (com.google.ads.b.g) clsC.newInstance();
            gVar2.a(this.d);
            gVar = gVar2;
        } else {
            gVar = null;
        }
        Class clsB = bVar.b();
        com.google.ads.b.j jVar = clsB != null ? (com.google.ads.b.j) this.c.a(clsB) : null;
        com.google.ads.b.a aVar = new com.google.ads.b.a(this.c, activity, this.e);
        if (this.a.a.a()) {
            if (!(bVar instanceof com.google.ads.b.e)) {
                throw new bn("Adapter " + this.b + " doesn't support the MediationInterstitialAdapter interface.");
            }
            ((com.google.ads.b.e) bVar).a(new bp(this.a), activity, gVar, aVar, jVar);
        } else {
            if (!(bVar instanceof com.google.ads.b.c)) {
                throw new bn("Adapter " + this.b + " doesn't support the MediationBannerAdapter interface");
            }
            ((com.google.ads.b.c) bVar).a(new bo(this.a), activity, gVar, this.a.a.c(), aVar, jVar);
        }
        this.a.g();
    }

    private void a(String str, Throwable th, bj bjVar) {
        com.google.ads.util.g.b(str, th);
        this.a.a(false, bjVar);
    }

    private static boolean a(Map map) {
        String str = (String) map.remove("gwhirl_share_location");
        if ("1".equals(str)) {
            return true;
        }
        if (str != null && !"0".equals(str)) {
            com.google.ads.util.g.b("Received an illegal value, '" + str + "', for the special share location parameter from mediation server (expected '0' or '1'). Will not share the location.");
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.google.ads.util.g.a("Trying to instantiate: " + this.b);
            a((com.google.ads.b.b) bi.a(this.b, com.google.ads.b.b.class));
        } catch (ClassNotFoundException e) {
            a("Cannot find adapter class '" + this.b + "'. Did you link the ad network's mediation adapter? Skipping ad network.", e, bj.NOT_FOUND);
        } catch (Throwable th) {
            a("Error while creating adapter and loading ad from ad network. Skipping ad network.", th, bj.EXCEPTION);
        }
    }
}
