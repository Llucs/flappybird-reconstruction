package com.google.tagmanager;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private final r a;
    private d b;
    private o c;
    private b d;
    private volatile String e;
    private volatile com.google.analytics.a.a.q f;
    private volatile long g;
    private volatile int h;

    private boolean b(long j) {
        if (this.g == 0) {
            this.h--;
            return true;
        }
        if (j - this.g < 5000) {
            return false;
        }
        if (this.h < 30) {
            this.h = Math.min(30, ((int) Math.floor(r2 / 900000)) + this.h);
        }
        if (this.h <= 0) {
            return false;
        }
        this.h--;
        return true;
    }

    private synchronized o c() {
        return this.c;
    }

    private boolean d() {
        return this.a.a() == w.DEFAULT_CONTAINER;
    }

    public synchronized void a() {
        if (c() == null) {
            i.b("refresh called for closed container");
        } else {
            try {
                if (d()) {
                    i.b("Container is in DEFAULT_CONTAINER mode. Refresh request is ignored.");
                } else {
                    long jA = this.d.a();
                    if (b(jA)) {
                        i.d("Container refresh requested");
                        a(0L);
                        this.g = jA;
                    } else {
                        i.d("Container refresh was called too often. Ignored.");
                    }
                }
            } catch (Exception e) {
                i.a("Calling refresh() throws an exception: " + e.getMessage());
            }
        }
    }

    synchronized void a(long j) {
        if (this.b != null && !d()) {
            this.b.a(j, this.f == null ? null : this.f.C());
        }
    }

    synchronized void a(String str) {
        this.e = str;
        if (this.b != null) {
            this.b.a(str);
        }
    }

    String b() {
        return this.e;
    }
}
