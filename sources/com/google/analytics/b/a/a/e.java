package com.google.analytics.b.a.a;

import com.google.tagmanager.a.am;
import com.google.tagmanager.a.w;
import com.google.tagmanager.a.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends w implements j {
    private int a;
    private long i;
    private boolean j;
    private boolean m;
    private h b = h.STRING;
    private Object c = "";
    private List d = Collections.emptyList();
    private List e = Collections.emptyList();
    private List f = Collections.emptyList();
    private Object g = "";
    private Object h = "";
    private List k = Collections.emptyList();
    private List l = Collections.emptyList();

    private e() {
        t();
    }

    private void t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e u() {
        return new e();
    }

    private void v() {
        if ((this.a & 4) != 4) {
            this.d = new ArrayList(this.d);
            this.a |= 4;
        }
    }

    private void w() {
        if ((this.a & 8) != 8) {
            this.e = new ArrayList(this.e);
            this.a |= 8;
        }
    }

    private void x() {
        if ((this.a & 16) != 16) {
            this.f = new ArrayList(this.f);
            this.a |= 16;
        }
    }

    private void y() {
        if ((this.a & 512) != 512) {
            this.k = new ArrayList(this.k);
            this.a |= 512;
        }
    }

    private void z() {
        if ((this.a & 1024) != 1024) {
            this.l = new ArrayList(this.l);
            this.a |= 1024;
        }
    }

    public c a(int i) {
        return (c) this.d.get(i);
    }

    @Override // com.google.tagmanager.a.w
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return u().a(d());
    }

    public e a(long j) {
        this.a |= 128;
        this.i = j;
        return this;
    }

    @Override // com.google.tagmanager.a.v
    public e a(c cVar) {
        if (cVar != c.a()) {
            if (cVar.d()) {
                a(cVar.e());
            }
            if (cVar.f()) {
                this.a |= 2;
                this.c = cVar.g;
            }
            if (!cVar.h.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = cVar.h;
                    this.a &= -5;
                } else {
                    v();
                    this.d.addAll(cVar.h);
                }
            }
            if (!cVar.i.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = cVar.i;
                    this.a &= -9;
                } else {
                    w();
                    this.e.addAll(cVar.i);
                }
            }
            if (!cVar.j.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = cVar.j;
                    this.a &= -17;
                } else {
                    x();
                    this.f.addAll(cVar.j);
                }
            }
            if (cVar.r()) {
                this.a |= 32;
                this.g = cVar.k;
            }
            if (cVar.t()) {
                this.a |= 64;
                this.h = cVar.l;
            }
            if (cVar.v()) {
                a(cVar.w());
            }
            if (cVar.x()) {
                a(cVar.y());
            }
            if (!cVar.o.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = cVar.o;
                    this.a &= -513;
                } else {
                    y();
                    this.k.addAll(cVar.o);
                }
            }
            if (!cVar.p.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = cVar.p;
                    this.a &= -1025;
                } else {
                    z();
                    this.l.addAll(cVar.p);
                }
            }
            if (cVar.D()) {
                b(cVar.E());
            }
            a((x) cVar);
            a(r().a(cVar.d));
        }
        return this;
    }

    public e a(h hVar) {
        if (hVar == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = hVar;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[SYNTHETIC] */
    @Override // com.google.tagmanager.a.b, com.google.tagmanager.a.an
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.analytics.b.a.a.e c(com.google.tagmanager.a.k r5, com.google.tagmanager.a.o r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r2 = 0
            com.google.tagmanager.a.aq r0 = com.google.analytics.b.a.a.c.a     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            java.lang.Object r0 = r0.b(r5, r6)     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            com.google.analytics.b.a.a.c r0 = (com.google.analytics.b.a.a.c) r0     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            if (r0 == 0) goto Le
            r4.a(r0)
        Le:
            return r4
        Lf:
            r0 = move-exception
            r1 = r0
            com.google.tagmanager.a.am r0 = r1.a()     // Catch: java.lang.Throwable -> L22
            com.google.analytics.b.a.a.c r0 = (com.google.analytics.b.a.a.c) r0     // Catch: java.lang.Throwable -> L22
            throw r1     // Catch: java.lang.Throwable -> L18
        L18:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L1c:
            if (r1 == 0) goto L21
            r4.a(r1)
        L21:
            throw r0
        L22:
            r0 = move-exception
            r1 = r2
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.b.a.a.e.c(com.google.tagmanager.a.k, com.google.tagmanager.a.o):com.google.analytics.b.a.a.e");
    }

    public e a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = str;
        return this;
    }

    public e a(boolean z) {
        this.a |= 256;
        this.j = z;
        return this;
    }

    @Override // com.google.tagmanager.a.v, com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c p() {
        return c.a();
    }

    public c b(int i) {
        return (c) this.e.get(i);
    }

    public e b(c cVar) {
        if (cVar == null) {
            throw new NullPointerException();
        }
        v();
        this.d.add(cVar);
        return this;
    }

    public e b(boolean z) {
        this.a |= 2048;
        this.m = z;
        return this;
    }

    @Override // com.google.tagmanager.a.an
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c h() {
        c cVarD = d();
        if (cVarD.j()) {
            return cVarD;
        }
        throw a((am) cVarD);
    }

    public c c(int i) {
        return (c) this.f.get(i);
    }

    public e c(c cVar) {
        if (cVar == null) {
            throw new NullPointerException();
        }
        w();
        this.e.add(cVar);
        return this;
    }

    public c d() {
        c cVar = new c(this);
        int i = this.a;
        int i2 = (i & 1) != 1 ? 0 : 1;
        cVar.f = this.b;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        cVar.g = this.c;
        if ((this.a & 4) == 4) {
            this.d = Collections.unmodifiableList(this.d);
            this.a &= -5;
        }
        cVar.h = this.d;
        if ((this.a & 8) == 8) {
            this.e = Collections.unmodifiableList(this.e);
            this.a &= -9;
        }
        cVar.i = this.e;
        if ((this.a & 16) == 16) {
            this.f = Collections.unmodifiableList(this.f);
            this.a &= -17;
        }
        cVar.j = this.f;
        if ((i & 32) == 32) {
            i2 |= 4;
        }
        cVar.k = this.g;
        if ((i & 64) == 64) {
            i2 |= 8;
        }
        cVar.l = this.h;
        if ((i & 128) == 128) {
            i2 |= 16;
        }
        cVar.m = this.i;
        if ((i & 256) == 256) {
            i2 |= 32;
        }
        cVar.n = this.j;
        if ((this.a & 512) == 512) {
            this.k = Collections.unmodifiableList(this.k);
            this.a &= -513;
        }
        cVar.o = this.k;
        if ((this.a & 1024) == 1024) {
            this.l = Collections.unmodifiableList(this.l);
            this.a &= -1025;
        }
        cVar.p = this.l;
        if ((i & 2048) == 2048) {
            i2 |= 64;
        }
        cVar.q = this.m;
        cVar.e = i2;
        return cVar;
    }

    public c d(int i) {
        return (c) this.k.get(i);
    }

    public e d(c cVar) {
        if (cVar == null) {
            throw new NullPointerException();
        }
        x();
        this.f.add(cVar);
        return this;
    }

    public boolean i() {
        return (this.a & 1) == 1;
    }

    @Override // com.google.tagmanager.a.ao
    public final boolean j() {
        if (!i()) {
            return false;
        }
        for (int i = 0; i < k(); i++) {
            if (!a(i).j()) {
                return false;
            }
        }
        for (int i2 = 0; i2 < l(); i2++) {
            if (!b(i2).j()) {
                return false;
            }
        }
        for (int i3 = 0; i3 < m(); i3++) {
            if (!c(i3).j()) {
                return false;
            }
        }
        for (int i4 = 0; i4 < n(); i4++) {
            if (!d(i4).j()) {
                return false;
            }
        }
        return s();
    }

    public int k() {
        return this.d.size();
    }

    public int l() {
        return this.e.size();
    }

    public int m() {
        return this.f.size();
    }

    public int n() {
        return this.k.size();
    }
}
