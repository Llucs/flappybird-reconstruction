package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
final class cy {
    final /* synthetic */ cx a;
    private final String b;
    private final cz c = new cz(this);
    private final HashSet d = new HashSet();
    private int e = 0;
    private boolean f;
    private IBinder g;
    private ComponentName h;

    public cy(cx cxVar, String str) {
        this.a = cxVar;
        this.b = str;
    }

    public cz a() {
        return this.c;
    }

    public void a(cv cvVar) {
        this.d.add(cvVar);
    }

    public void a(boolean z) {
        this.f = z;
    }

    public String b() {
        return this.b;
    }

    public void b(cv cvVar) {
        this.d.remove(cvVar);
    }

    public boolean c() {
        return this.f;
    }

    public boolean c(cv cvVar) {
        return this.d.contains(cvVar);
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.d.isEmpty();
    }

    public IBinder f() {
        return this.g;
    }

    public ComponentName g() {
        return this.h;
    }
}
