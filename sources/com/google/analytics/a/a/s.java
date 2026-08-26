package com.google.analytics.a.a;

import com.google.tagmanager.a.ah;
import com.google.tagmanager.a.ai;
import com.google.tagmanager.a.am;
import com.google.tagmanager.a.bg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s extends com.google.tagmanager.a.v implements t {
    private int a;
    private float n;
    private boolean o;
    private int q;
    private ai b = ah.a;
    private List c = Collections.emptyList();
    private List d = Collections.emptyList();
    private List e = Collections.emptyList();
    private List f = Collections.emptyList();
    private List g = Collections.emptyList();
    private List h = Collections.emptyList();
    private Object i = "";
    private Object j = "";
    private Object k = "0";
    private Object l = "";
    private c m = c.a();
    private ai p = ah.a;

    private s() {
        q();
    }

    private void A() {
        if ((this.a & 16384) != 16384) {
            this.p = new ah(this.p);
            this.a |= 16384;
        }
    }

    private void q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s s() {
        return new s();
    }

    private void t() {
        if ((this.a & 1) != 1) {
            this.b = new ah(this.b);
            this.a |= 1;
        }
    }

    private void u() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList(this.c);
            this.a |= 2;
        }
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
        if ((this.a & 32) != 32) {
            this.g = new ArrayList(this.g);
            this.a |= 32;
        }
    }

    private void z() {
        if ((this.a & 64) != 64) {
            this.h = new ArrayList(this.h);
            this.a |= 64;
        }
    }

    @Override // com.google.tagmanager.a.v, com.google.tagmanager.a.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public s clone() {
        return s().a(d());
    }

    public s a(float f) {
        this.a |= 4096;
        this.n = f;
        return this;
    }

    public s a(c cVar) {
        if ((this.a & 2048) != 2048 || this.m == c.a()) {
            this.m = cVar;
        } else {
            this.m = c.a(this.m).a(cVar).d();
        }
        this.a |= 2048;
        return this;
    }

    @Override // com.google.tagmanager.a.v
    public s a(q qVar) {
        if (qVar != q.a()) {
            if (!qVar.f.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = qVar.f;
                    this.a &= -2;
                } else {
                    t();
                    this.b.addAll(qVar.f);
                }
            }
            if (!qVar.g.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = qVar.g;
                    this.a &= -3;
                } else {
                    u();
                    this.c.addAll(qVar.g);
                }
            }
            if (!qVar.h.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = qVar.h;
                    this.a &= -5;
                } else {
                    v();
                    this.d.addAll(qVar.h);
                }
            }
            if (!qVar.i.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = qVar.i;
                    this.a &= -9;
                } else {
                    w();
                    this.e.addAll(qVar.i);
                }
            }
            if (!qVar.j.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = qVar.j;
                    this.a &= -17;
                } else {
                    x();
                    this.f.addAll(qVar.j);
                }
            }
            if (!qVar.k.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = qVar.k;
                    this.a &= -33;
                } else {
                    y();
                    this.g.addAll(qVar.k);
                }
            }
            if (!qVar.l.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = qVar.l;
                    this.a &= -65;
                } else {
                    z();
                    this.h.addAll(qVar.l);
                }
            }
            if (qVar.v()) {
                this.a |= 128;
                this.i = qVar.m;
            }
            if (qVar.x()) {
                this.a |= 256;
                this.j = qVar.n;
            }
            if (qVar.z()) {
                this.a |= 512;
                this.k = qVar.o;
            }
            if (qVar.B()) {
                this.a |= 1024;
                this.l = qVar.p;
            }
            if (qVar.D()) {
                a(qVar.E());
            }
            if (qVar.F()) {
                a(qVar.G());
            }
            if (qVar.H()) {
                a(qVar.I());
            }
            if (!qVar.t.isEmpty()) {
                if (this.p.isEmpty()) {
                    this.p = qVar.t;
                    this.a &= -16385;
                } else {
                    A();
                    this.p.addAll(qVar.t);
                }
            }
            if (qVar.L()) {
                f(qVar.M());
            }
            a(r().a(qVar.d));
        }
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
    public com.google.analytics.a.a.s c(com.google.tagmanager.a.k r5, com.google.tagmanager.a.o r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r2 = 0
            com.google.tagmanager.a.aq r0 = com.google.analytics.a.a.q.a     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            java.lang.Object r0 = r0.b(r5, r6)     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            com.google.analytics.a.a.q r0 = (com.google.analytics.a.a.q) r0     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            if (r0 == 0) goto Le
            r4.a(r0)
        Le:
            return r4
        Lf:
            r0 = move-exception
            r1 = r0
            com.google.tagmanager.a.am r0 = r1.a()     // Catch: java.lang.Throwable -> L22
            com.google.analytics.a.a.q r0 = (com.google.analytics.a.a.q) r0     // Catch: java.lang.Throwable -> L22
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.a.s.c(com.google.tagmanager.a.k, com.google.tagmanager.a.o):com.google.analytics.a.a.s");
    }

    public s a(boolean z) {
        this.a |= 8192;
        this.o = z;
        return this;
    }

    public com.google.analytics.b.a.a.c a(int i) {
        return (com.google.analytics.b.a.a.c) this.c.get(i);
    }

    public m b(int i) {
        return (m) this.d.get(i);
    }

    @Override // com.google.tagmanager.a.v, com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q p() {
        return q.a();
    }

    public i c(int i) {
        return (i) this.e.get(i);
    }

    @Override // com.google.tagmanager.a.an
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public q h() {
        q qVarD = d();
        if (qVarD.j()) {
            return qVarD;
        }
        throw a((am) qVarD);
    }

    public i d(int i) {
        return (i) this.f.get(i);
    }

    public q d() {
        q qVar = new q(this);
        int i = this.a;
        if ((this.a & 1) == 1) {
            this.b = new bg(this.b);
            this.a &= -2;
        }
        qVar.f = this.b;
        if ((this.a & 2) == 2) {
            this.c = Collections.unmodifiableList(this.c);
            this.a &= -3;
        }
        qVar.g = this.c;
        if ((this.a & 4) == 4) {
            this.d = Collections.unmodifiableList(this.d);
            this.a &= -5;
        }
        qVar.h = this.d;
        if ((this.a & 8) == 8) {
            this.e = Collections.unmodifiableList(this.e);
            this.a &= -9;
        }
        qVar.i = this.e;
        if ((this.a & 16) == 16) {
            this.f = Collections.unmodifiableList(this.f);
            this.a &= -17;
        }
        qVar.j = this.f;
        if ((this.a & 32) == 32) {
            this.g = Collections.unmodifiableList(this.g);
            this.a &= -33;
        }
        qVar.k = this.g;
        if ((this.a & 64) == 64) {
            this.h = Collections.unmodifiableList(this.h);
            this.a &= -65;
        }
        qVar.l = this.h;
        int i2 = (i & 128) != 128 ? 0 : 1;
        qVar.m = this.i;
        if ((i & 256) == 256) {
            i2 |= 2;
        }
        qVar.n = this.j;
        if ((i & 512) == 512) {
            i2 |= 4;
        }
        qVar.o = this.k;
        if ((i & 1024) == 1024) {
            i2 |= 8;
        }
        qVar.p = this.l;
        if ((i & 2048) == 2048) {
            i2 |= 16;
        }
        qVar.q = this.m;
        if ((i & 4096) == 4096) {
            i2 |= 32;
        }
        qVar.r = this.n;
        if ((i & 8192) == 8192) {
            i2 |= 64;
        }
        qVar.s = this.o;
        if ((this.a & 16384) == 16384) {
            this.p = new bg(this.p);
            this.a &= -16385;
        }
        qVar.t = this.p;
        if ((i & 32768) == 32768) {
            i2 |= 128;
        }
        qVar.u = this.q;
        qVar.e = i2;
        return qVar;
    }

    public i e(int i) {
        return (i) this.g.get(i);
    }

    public s f(int i) {
        this.a |= 32768;
        this.q = i;
        return this;
    }

    public int i() {
        return this.c.size();
    }

    @Override // com.google.tagmanager.a.ao
    public final boolean j() {
        for (int i = 0; i < i(); i++) {
            if (!a(i).j()) {
                return false;
            }
        }
        for (int i2 = 0; i2 < k(); i2++) {
            if (!b(i2).j()) {
                return false;
            }
        }
        for (int i3 = 0; i3 < l(); i3++) {
            if (!c(i3).j()) {
                return false;
            }
        }
        for (int i4 = 0; i4 < m(); i4++) {
            if (!d(i4).j()) {
                return false;
            }
        }
        for (int i5 = 0; i5 < n(); i5++) {
            if (!e(i5).j()) {
                return false;
            }
        }
        return true;
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
        return this.g.size();
    }
}
