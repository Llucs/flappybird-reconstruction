package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bd {
    private final com.google.ads.a.w a;
    private bk b;
    private final Object c;
    private Thread d;
    private final Object e;
    private boolean f;
    private final Object g;

    protected bd() {
        this.b = null;
        this.c = new Object();
        this.d = null;
        this.e = new Object();
        this.f = false;
        this.g = new Object();
        this.a = null;
    }

    public bd(com.google.ads.a.w wVar) {
        this.b = null;
        this.c = new Object();
        this.d = null;
        this.e = new Object();
        this.f = false;
        this.g = new Object();
        com.google.ads.util.e.a(wVar);
        this.a = wVar;
    }

    public static boolean a(ba baVar, com.google.ads.a.w wVar) {
        if (baVar.j() == null) {
            return true;
        }
        if (wVar.h().b()) {
            if (baVar.j().a()) {
                return true;
            }
            com.google.ads.util.g.e("InterstitialAd received a mediation response corresponding to a non-interstitial ad. Make sure you specify 'interstitial' as the ad-type in the mediation UI.");
            return false;
        }
        g gVarC = ((com.google.ads.a.ac) wVar.h().g.a()).c();
        if (baVar.j().a()) {
            com.google.ads.util.g.e("AdView received a mediation response corresponding to an interstitial ad. Make sure you specify the banner ad size corresponding to the AdSize you used in your AdView  (" + gVarC + ") in the ad-type field in the mediation UI.");
            return false;
        }
        g gVarC2 = baVar.j().c();
        if (gVarC2 == gVarC) {
            return true;
        }
        com.google.ads.util.g.e("Mediation server returned ad size: '" + gVarC2 + "', while the AdView was created with ad size: '" + gVarC + "'. Using the ad-size passed to the AdView on creation.");
        return false;
    }

    private boolean a(String str, Activity activity, d dVar, bh bhVar, HashMap map, long j) {
        bk bkVar = new bk(this, (com.google.ads.a.ac) this.a.h().g.a(), bhVar, str, dVar, map);
        synchronized (bkVar) {
            bkVar.a(activity);
            while (!bkVar.b() && j > 0) {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    bkVar.wait(j);
                    j -= SystemClock.elapsedRealtime() - jElapsedRealtime;
                } catch (InterruptedException e) {
                    com.google.ads.util.g.a("Interrupted while waiting for ad network to load ad using adapter class: " + str);
                }
            }
            this.a.m().a(bkVar.d());
            if (bkVar.b() && bkVar.c()) {
                ((Handler) br.a().c.a()).post(new bg(this, bkVar, this.a.h().b() ? null : bkVar.e(), bhVar));
                return true;
            }
            if (!bkVar.b()) {
                com.google.ads.util.g.a("Timeout occurred in adapter class: " + bkVar.f());
            }
            bkVar.a();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ba baVar, d dVar) {
        synchronized (this.e) {
            com.google.ads.util.e.a(Thread.currentThread(), this.d);
        }
        List<k> listF = baVar.f();
        long jB = baVar.a() ? baVar.b() : 10000L;
        for (k kVar : listF) {
            com.google.ads.util.g.a("Looking to fetch ads from network: " + kVar.b());
            List<String> listC = kVar.c();
            HashMap mapE = kVar.e();
            List listD = kVar.d();
            String strA = kVar.a();
            String strB = kVar.b();
            String strC = baVar.c();
            if (listD == null) {
                listD = baVar.g();
            }
            bh bhVar = new bh(strA, strB, strC, listD, baVar.h(), baVar.i());
            for (String str : listC) {
                Activity activity = (Activity) this.a.h().c.a();
                if (activity == null) {
                    com.google.ads.util.g.a("Activity is null while mediating.  Terminating mediation thread.");
                    return;
                }
                this.a.m().c();
                if (a(str, activity, dVar, bhVar, mapE, jB)) {
                    return;
                }
                if (b()) {
                    com.google.ads.util.g.a("GWController.destroy() called. Terminating mediation thread.");
                    return;
                }
            }
        }
        ((Handler) br.a().c.a()).post(new bf(this, baVar));
    }

    private boolean b() {
        boolean z;
        synchronized (this.g) {
            z = this.f;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(bk bkVar) {
        boolean z;
        synchronized (this.g) {
            if (b()) {
                bkVar.a();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void a(ba baVar, d dVar) {
        synchronized (this.e) {
            if (a()) {
                com.google.ads.util.g.c("Mediation thread is not done executing previous mediation  request. Ignoring new mediation request");
                return;
            }
            if (baVar.d()) {
                this.a.a(baVar.e());
                if (!this.a.r()) {
                    this.a.f();
                }
            } else if (this.a.r()) {
                this.a.e();
            }
            a(baVar, this.a);
            this.d = new Thread(new be(this, baVar, dVar));
            this.d.start();
        }
    }

    public void a(bk bkVar) {
        synchronized (this.c) {
            if (this.b != bkVar) {
                if (this.b != null) {
                    this.b.a();
                }
                this.b = bkVar;
            }
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.e) {
            z = this.d != null;
        }
        return z;
    }
}
