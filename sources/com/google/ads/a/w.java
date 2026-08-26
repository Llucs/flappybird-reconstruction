package com.google.ads.a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.ads.AdActivity;
import com.google.ads.AdView;
import com.google.ads.at;
import com.google.ads.az;
import com.google.ads.ba;
import com.google.ads.bc;
import com.google.ads.bd;
import com.google.ads.bh;
import com.google.ads.bi;
import com.google.ads.bk;
import com.google.ads.bq;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import com.google.ads.doubleclick.SwipeableDfpAdView;
import com.google.ads.util.AdUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class w {
    private static final Object a = new Object();
    private final bt b;
    private e f;
    private ad g;
    private long i;
    private boolean j;
    private SharedPreferences o;
    private com.google.ads.p q;
    private boolean r;
    private LinkedList s;
    private LinkedList t;
    private LinkedList u;
    private Boolean w;
    private bc x;
    private bd y;
    private bh z;
    private boolean h = false;
    private int v = -1;
    private String A = null;
    private String B = null;
    private ab e = new ab();
    private n c = null;
    private com.google.ads.d d = null;
    private boolean k = false;
    private long p = 60000;
    private boolean l = false;
    private boolean n = false;
    private boolean m = true;

    public w(com.google.ads.a aVar, Activity activity, com.google.ads.g gVar, String str, ViewGroup viewGroup, boolean z) {
        this.r = z;
        ac acVarA = gVar == null ? ac.a : ac.a(gVar, activity.getApplicationContext());
        if (aVar instanceof SwipeableDfpAdView) {
            acVarA.a(true);
        }
        if (activity == null) {
            this.b = new bt(br.a(), aVar, aVar instanceof AdView ? (AdView) aVar : null, aVar instanceof com.google.ads.i ? (com.google.ads.i) aVar : null, str, null, null, viewGroup, acVarA, this);
            return;
        }
        synchronized (a) {
            this.o = activity.getApplicationContext().getSharedPreferences("GoogleAdMobAdsPrefs", 0);
            if (z) {
                long j = this.o.getLong("Timeout" + str, -1L);
                if (j < 0) {
                    this.i = 5000L;
                } else {
                    this.i = j;
                }
            } else {
                this.i = 60000L;
            }
        }
        this.b = new bt(br.a(), aVar, aVar instanceof AdView ? (AdView) aVar : null, aVar instanceof com.google.ads.i ? (com.google.ads.i) aVar : null, str, activity, activity.getApplicationContext(), viewGroup, acVarA, this);
        this.q = new com.google.ads.p(this);
        this.s = new LinkedList();
        this.t = new LinkedList();
        this.u = new LinkedList();
        a();
        AdUtil.h((Context) this.b.f.a());
        this.x = new bc();
        this.y = new bd(this);
        this.w = null;
        this.z = null;
    }

    private void a(bh bhVar, Boolean bool) {
        List listD = bhVar.d();
        if (listD == null) {
            listD = new ArrayList();
            listD.add("http://e.admob.com/imp?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@&adt=@gw_adt@&aec=@gw_aec@");
        }
        a(listD, bhVar.a(), bhVar.b(), bhVar.c(), bool, this.e.d(), this.e.e());
    }

    private void a(List list, String str) {
        List arrayList;
        if (list == null) {
            arrayList = new ArrayList();
            arrayList.add("http://e.admob.com/nofill?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&adt=@gw_adt@&aec=@gw_aec@");
        } else {
            arrayList = list;
        }
        a(arrayList, null, null, str, null, this.e.d(), this.e.e());
    }

    private void a(List list, String str, String str2, String str3, Boolean bool, String str4, String str5) {
        String strA = AdUtil.a((Context) this.b.f.a());
        az azVarA = az.a();
        String string = azVarA.b().toString();
        String string2 = azVarA.c().toString();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            new Thread(new com.google.ads.o(bi.a((String) it.next(), (String) this.b.h.a(), bool, strA, str, str2, str3, string, string2, str4, str5), (Context) this.b.f.a())).start();
        }
        this.e.b();
    }

    public LinkedList A() {
        return this.t;
    }

    public synchronized void a() {
        com.google.ads.g gVarC = ((ac) this.b.g.a()).c();
        this.f = AdUtil.a >= 14 ? new com.google.ads.util.c(this.b, gVarC) : new e(this.b, gVarC);
        this.f.setVisibility(8);
        this.g = ad.a(this, h.d, true, this.b.b());
        this.f.setWebViewClient(this.g);
        if (AdUtil.a < ((Integer) ((bs) ((br) this.b.d.a()).b.a()).b.a()).intValue() && !((ac) this.b.g.a()).a()) {
            com.google.ads.util.g.a("Disabling hardware acceleration for a banner.");
            this.f.g();
        }
    }

    public synchronized void a(float f) {
        long j = this.p;
        this.p = (long) (1000.0f * f);
        if (r() && this.p != j) {
            e();
            f();
        }
    }

    public synchronized void a(int i) {
        this.v = i;
    }

    public void a(int i, int i2, int i3, int i4) {
        int iC;
        int i5;
        a aVar = (a) this.b.e.a();
        int iA = AdUtil.a((Context) this.b.f.a(), i3 < 0 ? ((ac) this.b.g.a()).c().a() : i3);
        Context context = (Context) this.b.f.a();
        if (i4 < 0) {
            i4 = ((ac) this.b.g.a()).c().b();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, AdUtil.a(context, i4));
        if (i3 < 0) {
            iC = 0;
            i5 = 0;
        } else {
            iC = i2;
            i5 = i;
        }
        int iD = i5 < 0 ? ((a) this.b.e.a()).d() : i5;
        if (iC < 0) {
            iC = ((a) this.b.e.a()).c();
        }
        ((a) this.b.e.a()).setXPosition(iD);
        ((a) this.b.e.a()).setYPosition(iC);
        layoutParams.setMargins(AdUtil.a((Context) this.b.f.a(), iD), AdUtil.a((Context) this.b.f.a(), iC), 0, 0);
        aVar.setLayoutParams(layoutParams);
    }

    public void a(long j) {
        synchronized (a) {
            SharedPreferences.Editor editorEdit = this.o.edit();
            editorEdit.putLong("Timeout" + this.b.h, j);
            editorEdit.commit();
            if (this.r) {
                this.i = j;
            }
        }
    }

    public void a(View view) {
        ((ViewGroup) this.b.i.a()).setVisibility(0);
        ((ViewGroup) this.b.i.a()).removeAllViews();
        ((ViewGroup) this.b.i.a()).addView(view);
        if (((ac) this.b.g.a()).b()) {
            ((w) this.b.b.a()).a((bq) this.b.l.a(), false, -1, -1, -1, -1);
            if (((a) this.b.e.a()).a()) {
                ((ViewGroup) this.b.i.a()).addView((View) this.b.e.a(), AdUtil.a((Context) this.b.f.a(), ((ac) this.b.g.a()).c().a()), AdUtil.a((Context) this.b.f.a(), ((ac) this.b.g.a()).c().b()));
            }
        }
    }

    public synchronized void a(View view, bk bkVar, bh bhVar, boolean z) {
        com.google.ads.util.g.a("AdManager.onReceiveGWhirlAd() called.");
        this.k = true;
        this.z = bhVar;
        if (this.b.a()) {
            a(view);
            a(bhVar, Boolean.valueOf(z));
        }
        this.y.a(bkVar);
        com.google.ads.c cVar = (com.google.ads.c) this.b.o.a();
        if (cVar != null) {
            cVar.a((com.google.ads.a) this.b.a.a());
        }
    }

    public synchronized void a(ba baVar) {
        this.c = null;
        this.y.a(baVar, this.d);
    }

    public void a(bq bqVar, boolean z, int i, int i2, int i3, int i4) {
        ((a) this.b.e.a()).setOverlayActivated(!z);
        a(i, i2, i3, i4);
        if (this.b.q.a() != null) {
            if (z) {
                ((com.google.ads.j) this.b.q.a()).a((com.google.ads.a) this.b.a.a());
            } else {
                ((com.google.ads.j) this.b.q.a()).b((com.google.ads.a) this.b.a.a());
            }
        }
    }

    public synchronized void a(com.google.ads.d dVar) {
        com.google.ads.util.g.d("v6.4.1 RC00");
        if (this.h) {
            com.google.ads.util.g.e("loadAd called after ad was destroyed.");
        } else if (p()) {
            com.google.ads.util.g.e("loadAd called while the ad is already loading, so aborting.");
        } else if (AdActivity.b()) {
            com.google.ads.util.g.e("loadAd called while an interstitial or landing page is displayed, so aborting");
        } else if (AdUtil.c((Context) this.b.f.a()) && AdUtil.b((Context) this.b.f.a())) {
            if (at.a((Context) this.b.f.a(), this.o.getLong("GoogleAdMobDoritosLife", 60000L))) {
                at.a((Activity) this.b.c.a());
            }
            this.k = false;
            this.s.clear();
            this.t.clear();
            this.d = dVar;
            if (this.x.a()) {
                this.y.a(this.x.b(), dVar);
            } else {
                bq bqVar = new bq(this.b);
                this.b.m.a(bqVar);
                this.c = (n) bqVar.b.a();
                this.c.a(dVar);
            }
        }
    }

    public synchronized void a(com.google.ads.e eVar) {
        this.c = null;
        if (eVar == com.google.ads.e.NETWORK_ERROR) {
            a(60.0f);
            if (!r()) {
                g();
            }
        }
        if (this.b.b()) {
            if (eVar == com.google.ads.e.NO_FILL) {
                this.e.B();
            } else if (eVar == com.google.ads.e.NETWORK_ERROR) {
                this.e.z();
            }
        }
        com.google.ads.util.g.c("onFailedToReceiveAd(" + eVar + ")");
        com.google.ads.c cVar = (com.google.ads.c) this.b.o.a();
        if (cVar != null) {
            cVar.a((com.google.ads.a) this.b.a.a(), eVar);
        }
    }

    public void a(String str) {
        this.B = str;
        Uri uriBuild = new Uri.Builder().encodedQuery(str).build();
        StringBuilder sb = new StringBuilder();
        HashMap mapB = AdUtil.b(uriBuild);
        for (String str2 : mapB.keySet()) {
            sb.append(str2).append(" = ").append((String) mapB.get(str2)).append("\n");
        }
        this.A = sb.toString().trim();
        if (TextUtils.isEmpty(this.A)) {
            this.A = null;
        }
    }

    public synchronized void a(String str, String str2) {
        com.google.ads.h hVar = (com.google.ads.h) this.b.p.a();
        if (hVar != null) {
            hVar.a((com.google.ads.a) this.b.a.a(), str, str2);
        }
    }

    protected synchronized void a(LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.google.ads.util.g.a("Adding a click tracking URL: " + ((String) it.next()));
        }
        this.u = linkedList;
    }

    public synchronized void a(boolean z) {
        this.j = z;
    }

    public String b() {
        return this.A;
    }

    public synchronized void b(long j) {
        if (j > 0) {
            this.o.edit().putLong("GoogleAdMobDoritosLife", j).commit();
        }
    }

    public synchronized void b(ba baVar) {
        com.google.ads.util.g.a("AdManager.onGWhirlNoFill() called.");
        a(baVar.i(), baVar.c());
        com.google.ads.c cVar = (com.google.ads.c) this.b.o.a();
        if (cVar != null) {
            cVar.a((com.google.ads.a) this.b.a.a(), com.google.ads.e.NO_FILL);
        }
    }

    protected synchronized void b(String str) {
        com.google.ads.util.g.a("Adding a tracking URL: " + str);
        this.s.add(str);
    }

    public void b(boolean z) {
        this.w = Boolean.valueOf(z);
    }

    public String c() {
        return this.B;
    }

    protected synchronized void c(String str) {
        com.google.ads.util.g.a("Adding a manual tracking URL: " + str);
        A().add(str);
    }

    public synchronized void d() {
        this.m = false;
        com.google.ads.util.g.a("Refreshing is no longer allowed on this AdView.");
    }

    public synchronized void e() {
        if (this.l) {
            com.google.ads.util.g.a("Disabling refreshing.");
            ((Handler) br.a().c.a()).removeCallbacks(this.q);
            this.l = false;
        } else {
            com.google.ads.util.g.a("Refreshing is already disabled.");
        }
    }

    public synchronized void f() {
        this.n = false;
        if (!this.b.a()) {
            com.google.ads.util.g.a("Tried to enable refreshing on something other than an AdView.");
        } else if (!this.m) {
            com.google.ads.util.g.a("Refreshing disabled on this AdView");
        } else if (this.l) {
            com.google.ads.util.g.a("Refreshing is already enabled.");
        } else {
            com.google.ads.util.g.a("Enabling refreshing every " + this.p + " milliseconds.");
            ((Handler) br.a().c.a()).postDelayed(this.q, this.p);
            this.l = true;
        }
    }

    public void g() {
        f();
        this.n = true;
    }

    public bt h() {
        return this.b;
    }

    public synchronized bc i() {
        return this.x;
    }

    public synchronized n j() {
        return this.c;
    }

    public synchronized e k() {
        return this.f;
    }

    public synchronized ad l() {
        return this.g;
    }

    public ab m() {
        return this.e;
    }

    public synchronized int n() {
        return this.v;
    }

    public long o() {
        return this.i;
    }

    public synchronized boolean p() {
        return this.c != null;
    }

    public synchronized boolean q() {
        return this.j;
    }

    public synchronized boolean r() {
        return this.l;
    }

    public synchronized void s() {
        this.e.C();
        com.google.ads.util.g.c("onDismissScreen()");
        com.google.ads.c cVar = (com.google.ads.c) this.b.o.a();
        if (cVar != null) {
            cVar.c((com.google.ads.a) this.b.a.a());
        }
    }

    public synchronized void t() {
        com.google.ads.util.g.c("onPresentScreen()");
        com.google.ads.c cVar = (com.google.ads.c) this.b.o.a();
        if (cVar != null) {
            cVar.b((com.google.ads.a) this.b.a.a());
        }
    }

    public synchronized void u() {
        com.google.ads.util.g.c("onLeaveApplication()");
        com.google.ads.c cVar = (com.google.ads.c) this.b.o.a();
        if (cVar != null) {
            cVar.d((com.google.ads.a) this.b.a.a());
        }
    }

    public void v() {
        this.e.f();
        y();
    }

    public synchronized void w() {
        Activity activity = (Activity) this.b.c.a();
        if (activity == null) {
            com.google.ads.util.g.e("activity was null while trying to ping tracking URLs.");
        } else {
            Iterator it = this.s.iterator();
            while (it.hasNext()) {
                new Thread(new com.google.ads.o((String) it.next(), activity.getApplicationContext())).start();
            }
        }
    }

    public synchronized void x() {
        if (!this.h) {
            if (this.d == null) {
                com.google.ads.util.g.a("Tried to refresh before calling loadAd().");
            } else if (this.b.a()) {
                if (((AdView) this.b.j.a()).isShown() && AdUtil.d()) {
                    com.google.ads.util.g.c("Refreshing ad.");
                    a(this.d);
                } else {
                    com.google.ads.util.g.a("Not refreshing because the ad is not visible.");
                }
                if (this.n) {
                    e();
                } else {
                    ((Handler) br.a().c.a()).postDelayed(this.q, this.p);
                }
            } else {
                com.google.ads.util.g.a("Tried to refresh an ad that wasn't an AdView.");
            }
        }
    }

    protected synchronized void y() {
        Activity activity = (Activity) this.b.c.a();
        if (activity == null) {
            com.google.ads.util.g.e("activity was null while trying to ping click tracking URLs.");
        } else {
            Iterator it = this.u.iterator();
            while (it.hasNext()) {
                new Thread(new com.google.ads.o((String) it.next(), activity.getApplicationContext())).start();
            }
        }
    }

    protected synchronized void z() {
        this.c = null;
        this.k = true;
        this.f.setVisibility(0);
        if (this.b.a()) {
            a(this.f);
        }
        this.e.g();
        if (this.b.a()) {
            w();
        }
        com.google.ads.util.g.c("onReceiveAd()");
        com.google.ads.c cVar = (com.google.ads.c) this.b.o.a();
        if (cVar != null) {
            cVar.a((com.google.ads.a) this.b.a.a());
        }
        this.b.l.a(this.b.m.a());
        this.b.m.a(null);
    }
}
