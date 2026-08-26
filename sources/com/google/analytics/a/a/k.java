package com.google.analytics.a.a;

import com.google.tagmanager.a.am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k extends com.google.tagmanager.a.v implements l {
    private int a;
    private List b = Collections.emptyList();
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    private k() {
        l();
    }

    private void l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static k m() {
        return new k();
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList(this.b);
            this.a |= 1;
        }
    }

    @Override // com.google.tagmanager.a.v, com.google.tagmanager.a.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public k clone() {
        return m().a(d());
    }

    public k a(int i) {
        this.a |= 2;
        this.c = i;
        return this;
    }

    @Override // com.google.tagmanager.a.v
    public k a(i iVar) {
        if (iVar != i.a()) {
            if (!iVar.f.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = iVar.f;
                    this.a &= -2;
                } else {
                    n();
                    this.b.addAll(iVar.f);
                }
            }
            if (iVar.f()) {
                a(iVar.g());
            }
            if (iVar.h()) {
                b(iVar.i());
            }
            if (iVar.k()) {
                a(iVar.l());
            }
            if (iVar.m()) {
                b(iVar.q());
            }
            a(r().a(iVar.d));
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
    public com.google.analytics.a.a.k c(com.google.tagmanager.a.k r5, com.google.tagmanager.a.o r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r2 = 0
            com.google.tagmanager.a.aq r0 = com.google.analytics.a.a.i.a     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            java.lang.Object r0 = r0.b(r5, r6)     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            com.google.analytics.a.a.i r0 = (com.google.analytics.a.a.i) r0     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            if (r0 == 0) goto Le
            r4.a(r0)
        Le:
            return r4
        Lf:
            r0 = move-exception
            r1 = r0
            com.google.tagmanager.a.am r0 = r1.a()     // Catch: java.lang.Throwable -> L22
            com.google.analytics.a.a.i r0 = (com.google.analytics.a.a.i) r0     // Catch: java.lang.Throwable -> L22
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.a.k.c(com.google.tagmanager.a.k, com.google.tagmanager.a.o):com.google.analytics.a.a.k");
    }

    public k a(boolean z) {
        this.a |= 8;
        this.e = z;
        return this;
    }

    @Override // com.google.tagmanager.a.v, com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i p() {
        return i.a();
    }

    public k b(int i) {
        this.a |= 4;
        this.d = i;
        return this;
    }

    public k b(boolean z) {
        this.a |= 16;
        this.f = z;
        return this;
    }

    @Override // com.google.tagmanager.a.an
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i h() {
        i iVarD = d();
        if (iVarD.j()) {
            return iVarD;
        }
        throw a((am) iVarD);
    }

    public i d() {
        i iVar = new i(this);
        int i = this.a;
        if ((this.a & 1) == 1) {
            this.b = Collections.unmodifiableList(this.b);
            this.a &= -2;
        }
        iVar.f = this.b;
        int i2 = (i & 2) != 2 ? 0 : 1;
        iVar.g = this.c;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        iVar.h = this.d;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        iVar.i = this.e;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        iVar.j = this.f;
        iVar.e = i2;
        return iVar;
    }

    public boolean i() {
        return (this.a & 2) == 2;
    }

    @Override // com.google.tagmanager.a.ao
    public final boolean j() {
        return i();
    }
}
