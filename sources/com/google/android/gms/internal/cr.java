package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class cr implements com.google.android.gms.common.b {
    public static final String[] e = {"service_esmobile", "service_googleme"};
    final Handler a;
    private final Context f;
    private IInterface g;
    private ArrayList j;
    private cv m;
    private final String[] n;
    final ArrayList b = new ArrayList();
    private boolean i = false;
    private boolean k = false;
    private final ArrayList l = new ArrayList();
    boolean c = false;
    boolean d = false;
    private final Object o = new Object();
    private ArrayList h = new ArrayList();

    protected cr(Context context, com.google.android.gms.common.c cVar, com.google.android.gms.common.d dVar, String... strArr) {
        this.f = (Context) Cdo.a(context);
        this.h.add(Cdo.a(cVar));
        this.j = new ArrayList();
        this.j.add(Cdo.a(dVar));
        this.a = new cs(this, context.getMainLooper());
        a(strArr);
        this.n = strArr;
    }

    public void a() {
        this.c = true;
        synchronized (this.o) {
            this.d = true;
        }
        int iA = com.google.android.gms.common.f.a(this.f);
        if (iA != 0) {
            this.a.sendMessage(this.a.obtainMessage(3, Integer.valueOf(iA)));
            return;
        }
        if (this.m != null) {
            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
            this.g = null;
            cx.a(this.f).b(c(), this.m);
        }
        this.m = new cv(this);
        if (cx.a(this.f).a(c(), this.m)) {
            return;
        }
        Log.e("GmsClient", "unable to connect to service: " + c());
        this.a.sendMessage(this.a.obtainMessage(3, 9));
    }

    protected void a(int i, IBinder iBinder, Bundle bundle) {
        this.a.sendMessage(this.a.obtainMessage(1, new cw(this, i, iBinder, bundle)));
    }

    protected void a(com.google.android.gms.common.a aVar) {
        this.a.removeMessages(4);
        synchronized (this.j) {
            this.k = true;
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!this.c) {
                    return;
                }
                if (this.j.contains(arrayList.get(i))) {
                    ((com.google.android.gms.common.d) arrayList.get(i)).a(aVar);
                }
            }
            this.k = false;
        }
    }

    public final void a(ct ctVar) {
        synchronized (this.l) {
            this.l.add(ctVar);
        }
        this.a.sendMessage(this.a.obtainMessage(2, ctVar));
    }

    protected abstract void a(df dfVar, cu cuVar);

    protected void a(String... strArr) {
    }

    protected abstract IInterface b(IBinder iBinder);

    public void b() {
        this.c = false;
        synchronized (this.o) {
            this.d = false;
        }
        synchronized (this.l) {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                ((ct) this.l.get(i)).d();
            }
            this.l.clear();
        }
        this.g = null;
        if (this.m != null) {
            cx.a(this.f).b(c(), this.m);
            this.m = null;
        }
    }

    protected abstract String c();

    protected final void c(IBinder iBinder) {
        try {
            a(dg.a(iBinder), new cu(this));
        } catch (RemoteException e2) {
            Log.w("GmsClient", "service died");
        }
    }

    protected abstract String d();

    protected Bundle e() {
        return null;
    }

    protected void f() {
        synchronized (this.h) {
            Cdo.a(!this.i);
            this.a.removeMessages(4);
            this.i = true;
            Cdo.a(this.b.size() == 0);
            Bundle bundleE = e();
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            for (int i = 0; i < size && this.c && h(); i++) {
                this.b.size();
                if (!this.b.contains(arrayList.get(i))) {
                    ((com.google.android.gms.common.c) arrayList.get(i)).a(bundleE);
                }
            }
            this.b.clear();
            this.i = false;
        }
    }

    public boolean h() {
        return this.g != null;
    }

    public boolean i() {
        boolean z;
        synchronized (this.o) {
            z = this.d;
        }
        return z;
    }

    public final Context j() {
        return this.f;
    }

    public final String[] k() {
        return this.n;
    }

    protected final void l() {
        this.a.removeMessages(4);
        synchronized (this.h) {
            this.i = true;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            for (int i = 0; i < size && this.c; i++) {
                if (this.h.contains(arrayList.get(i))) {
                    ((com.google.android.gms.common.c) arrayList.get(i)).a();
                }
            }
            this.i = false;
        }
    }

    protected final void m() {
        if (!h()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected final IInterface n() {
        m();
        return this.g;
    }
}
