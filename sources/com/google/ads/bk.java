package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class bk {
    final com.google.ads.a.ac a;
    private final bh b;
    private boolean c;
    private boolean d;
    private bj e;
    private final bd f;
    private com.google.ads.b.b g;
    private boolean h;
    private boolean i;
    private View j;
    private final String k;
    private final d l;
    private final HashMap m;

    public bk(bd bdVar, com.google.ads.a.ac acVar, bh bhVar, String str, d dVar, HashMap map) {
        com.google.ads.util.e.a(TextUtils.isEmpty(str));
        this.f = bdVar;
        this.a = acVar;
        this.b = bhVar;
        this.k = str;
        this.l = dVar;
        this.m = map;
        this.c = false;
        this.d = false;
        this.e = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.j = null;
    }

    public synchronized void a() {
        com.google.ads.util.e.a(this.h, "destroy() called but startLoadAdTask has not been called.");
        ((Handler) br.a().c.a()).post(new bl(this));
    }

    public synchronized void a(Activity activity) {
        com.google.ads.util.e.b(this.h, "startLoadAdTask has already been called.");
        this.h = true;
        ((Handler) br.a().c.a()).post(new bm(this, activity, this.k, this.l, this.m));
    }

    synchronized void a(com.google.ads.b.b bVar) {
        this.g = bVar;
    }

    synchronized void a(boolean z, bj bjVar) {
        this.d = z;
        this.c = true;
        this.e = bjVar;
        notify();
    }

    public synchronized boolean b() {
        return this.c;
    }

    public synchronized boolean c() {
        com.google.ads.util.e.a(this.c, "isLoadAdTaskSuccessful() called when isLoadAdTaskDone() is false.");
        return this.d;
    }

    public synchronized bj d() {
        return this.e == null ? bj.TIMEOUT : this.e;
    }

    public synchronized View e() {
        com.google.ads.util.e.a(this.c, "getAdView() called when isLoadAdTaskDone() is false.");
        return this.j;
    }

    public synchronized String f() {
        return this.g != null ? this.g.getClass().getName() : "\"adapter was not created.\"";
    }

    synchronized void g() {
        this.i = true;
    }

    synchronized boolean h() {
        return this.i;
    }
}
