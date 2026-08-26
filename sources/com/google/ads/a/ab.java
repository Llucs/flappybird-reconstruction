package com.google.ads.a;

import android.os.SystemClock;
import com.google.ads.bj;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class ab {
    private static long f = 0;
    private static long g = 0;
    private static long h = 0;
    private static long i = 0;
    private static long j = -1;
    private long b;
    private long c;
    private long d;
    private String m;
    private long n;
    private boolean k = false;
    private boolean l = false;
    private final LinkedList a = new LinkedList();
    private final LinkedList e = new LinkedList();
    private final LinkedList o = new LinkedList();
    private final LinkedList p = new LinkedList();

    public ab() {
        a();
    }

    public static long E() {
        if (j != -1) {
            return SystemClock.elapsedRealtime() - j;
        }
        j = SystemClock.elapsedRealtime();
        return 0L;
    }

    protected boolean A() {
        return this.l;
    }

    protected void B() {
        com.google.ads.util.g.d("Interstitial no fill.");
        this.l = true;
    }

    public void C() {
        com.google.ads.util.g.d("Landing page dismissed.");
        this.e.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    protected String D() {
        return this.m;
    }

    protected synchronized void a() {
        this.a.clear();
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e.clear();
        this.n = -1L;
        this.o.clear();
        this.p.clear();
        this.k = false;
        this.l = false;
    }

    public synchronized void a(bj bjVar) {
        this.o.add(Long.valueOf(SystemClock.elapsedRealtime() - this.n));
        this.p.add(bjVar);
    }

    public void a(String str) {
        com.google.ads.util.g.d("Prior impression ticket = " + str);
        this.m = str;
    }

    public synchronized void b() {
        this.o.clear();
        this.p.clear();
    }

    public synchronized void c() {
        this.n = SystemClock.elapsedRealtime();
    }

    public synchronized String d() {
        StringBuilder sb;
        sb = new StringBuilder();
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(jLongValue);
        }
        return sb.toString();
    }

    public synchronized String e() {
        StringBuilder sb;
        sb = new StringBuilder();
        for (bj bjVar : this.p) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(bjVar.ordinal());
        }
        return sb.toString();
    }

    protected void f() {
        com.google.ads.util.g.d("Ad clicked.");
        this.a.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    protected void g() {
        com.google.ads.util.g.d("Ad request loaded.");
        this.b = SystemClock.elapsedRealtime();
    }

    protected synchronized void h() {
        com.google.ads.util.g.d("Ad request before rendering.");
        this.c = SystemClock.elapsedRealtime();
    }

    protected void i() {
        com.google.ads.util.g.d("Ad request started.");
        this.d = SystemClock.elapsedRealtime();
        f++;
    }

    protected long j() {
        if (this.a.size() != this.e.size()) {
            return -1L;
        }
        return this.a.size();
    }

    protected String k() {
        if (this.a.isEmpty() || this.a.size() != this.e.size()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.a.size()) {
                return sb.toString();
            }
            if (i3 != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(((Long) this.e.get(i3)).longValue() - ((Long) this.a.get(i3)).longValue()));
            i2 = i3 + 1;
        }
    }

    protected String l() {
        if (this.a.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.a.size()) {
                return sb.toString();
            }
            if (i3 != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(((Long) this.a.get(i3)).longValue() - this.b));
            i2 = i3 + 1;
        }
    }

    protected long m() {
        return this.b - this.d;
    }

    protected synchronized long n() {
        return this.c - this.d;
    }

    protected long o() {
        return f;
    }

    protected synchronized long p() {
        return g;
    }

    protected synchronized void q() {
        com.google.ads.util.g.d("Ad request network error");
        g++;
    }

    protected synchronized void r() {
        g = 0L;
    }

    protected synchronized long s() {
        return h;
    }

    protected synchronized void t() {
        h++;
    }

    protected synchronized void u() {
        h = 0L;
    }

    protected synchronized long v() {
        return i;
    }

    protected synchronized void w() {
        i++;
    }

    protected synchronized void x() {
        i = 0L;
    }

    protected boolean y() {
        return this.k;
    }

    protected void z() {
        com.google.ads.util.g.d("Interstitial network error.");
        this.k = true;
    }
}
