package com.google.analytics.a.a;

import com.google.tagmanager.a.am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w extends com.google.tagmanager.a.v implements x {
    private int a;
    private List b = Collections.emptyList();
    private List c = Collections.emptyList();
    private List d = Collections.emptyList();
    private List e = Collections.emptyList();
    private List f = Collections.emptyList();
    private List g = Collections.emptyList();
    private List h = Collections.emptyList();
    private List i = Collections.emptyList();
    private List j = Collections.emptyList();
    private List k = Collections.emptyList();

    private w() {
        k();
    }

    private void k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w l() {
        return new w();
    }

    private void m() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList(this.b);
            this.a |= 1;
        }
    }

    private void n() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList(this.c);
            this.a |= 2;
        }
    }

    private void o() {
        if ((this.a & 4) != 4) {
            this.d = new ArrayList(this.d);
            this.a |= 4;
        }
    }

    private void q() {
        if ((this.a & 8) != 8) {
            this.e = new ArrayList(this.e);
            this.a |= 8;
        }
    }

    private void s() {
        if ((this.a & 16) != 16) {
            this.f = new ArrayList(this.f);
            this.a |= 16;
        }
    }

    private void t() {
        if ((this.a & 32) != 32) {
            this.g = new ArrayList(this.g);
            this.a |= 32;
        }
    }

    private void u() {
        if ((this.a & 64) != 64) {
            this.h = new ArrayList(this.h);
            this.a |= 64;
        }
    }

    private void v() {
        if ((this.a & 128) != 128) {
            this.i = new ArrayList(this.i);
            this.a |= 128;
        }
    }

    private void w() {
        if ((this.a & 256) != 256) {
            this.j = new ArrayList(this.j);
            this.a |= 256;
        }
    }

    private void x() {
        if ((this.a & 512) != 512) {
            this.k = new ArrayList(this.k);
            this.a |= 512;
        }
    }

    @Override // com.google.tagmanager.a.v, com.google.tagmanager.a.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w clone() {
        return l().a(d());
    }

    @Override // com.google.tagmanager.a.v
    public w a(u uVar) {
        if (uVar != u.a()) {
            if (!uVar.e.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = uVar.e;
                    this.a &= -2;
                } else {
                    m();
                    this.b.addAll(uVar.e);
                }
            }
            if (!uVar.f.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = uVar.f;
                    this.a &= -3;
                } else {
                    n();
                    this.c.addAll(uVar.f);
                }
            }
            if (!uVar.g.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = uVar.g;
                    this.a &= -5;
                } else {
                    o();
                    this.d.addAll(uVar.g);
                }
            }
            if (!uVar.h.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = uVar.h;
                    this.a &= -9;
                } else {
                    q();
                    this.e.addAll(uVar.h);
                }
            }
            if (!uVar.i.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = uVar.i;
                    this.a &= -17;
                } else {
                    s();
                    this.f.addAll(uVar.i);
                }
            }
            if (!uVar.j.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = uVar.j;
                    this.a &= -33;
                } else {
                    t();
                    this.g.addAll(uVar.j);
                }
            }
            if (!uVar.k.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = uVar.k;
                    this.a &= -65;
                } else {
                    u();
                    this.h.addAll(uVar.k);
                }
            }
            if (!uVar.l.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = uVar.l;
                    this.a &= -129;
                } else {
                    v();
                    this.i.addAll(uVar.l);
                }
            }
            if (!uVar.m.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = uVar.m;
                    this.a &= -257;
                } else {
                    w();
                    this.j.addAll(uVar.m);
                }
            }
            if (!uVar.n.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = uVar.n;
                    this.a &= -513;
                } else {
                    x();
                    this.k.addAll(uVar.n);
                }
            }
            a(r().a(uVar.d));
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
    public com.google.analytics.a.a.w c(com.google.tagmanager.a.k r5, com.google.tagmanager.a.o r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r2 = 0
            com.google.tagmanager.a.aq r0 = com.google.analytics.a.a.u.a     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            java.lang.Object r0 = r0.b(r5, r6)     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            com.google.analytics.a.a.u r0 = (com.google.analytics.a.a.u) r0     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            if (r0 == 0) goto Le
            r4.a(r0)
        Le:
            return r4
        Lf:
            r0 = move-exception
            r1 = r0
            com.google.tagmanager.a.am r0 = r1.a()     // Catch: java.lang.Throwable -> L22
            com.google.analytics.a.a.u r0 = (com.google.analytics.a.a.u) r0     // Catch: java.lang.Throwable -> L22
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.a.w.c(com.google.tagmanager.a.k, com.google.tagmanager.a.o):com.google.analytics.a.a.w");
    }

    @Override // com.google.tagmanager.a.v, com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u p() {
        return u.a();
    }

    @Override // com.google.tagmanager.a.an
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u h() {
        u uVarD = d();
        if (uVarD.j()) {
            return uVarD;
        }
        throw a((am) uVarD);
    }

    public u d() {
        u uVar = new u(this);
        int i = this.a;
        if ((this.a & 1) == 1) {
            this.b = Collections.unmodifiableList(this.b);
            this.a &= -2;
        }
        uVar.e = this.b;
        if ((this.a & 2) == 2) {
            this.c = Collections.unmodifiableList(this.c);
            this.a &= -3;
        }
        uVar.f = this.c;
        if ((this.a & 4) == 4) {
            this.d = Collections.unmodifiableList(this.d);
            this.a &= -5;
        }
        uVar.g = this.d;
        if ((this.a & 8) == 8) {
            this.e = Collections.unmodifiableList(this.e);
            this.a &= -9;
        }
        uVar.h = this.e;
        if ((this.a & 16) == 16) {
            this.f = Collections.unmodifiableList(this.f);
            this.a &= -17;
        }
        uVar.i = this.f;
        if ((this.a & 32) == 32) {
            this.g = Collections.unmodifiableList(this.g);
            this.a &= -33;
        }
        uVar.j = this.g;
        if ((this.a & 64) == 64) {
            this.h = Collections.unmodifiableList(this.h);
            this.a &= -65;
        }
        uVar.k = this.h;
        if ((this.a & 128) == 128) {
            this.i = Collections.unmodifiableList(this.i);
            this.a &= -129;
        }
        uVar.l = this.i;
        if ((this.a & 256) == 256) {
            this.j = Collections.unmodifiableList(this.j);
            this.a &= -257;
        }
        uVar.m = this.j;
        if ((this.a & 512) == 512) {
            this.k = Collections.unmodifiableList(this.k);
            this.a &= -513;
        }
        uVar.n = this.k;
        return uVar;
    }

    @Override // com.google.tagmanager.a.ao
    public final boolean j() {
        return true;
    }
}
