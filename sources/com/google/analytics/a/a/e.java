package com.google.analytics.a.a;

import com.google.tagmanager.a.am;

/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.tagmanager.a.v implements h {
    private int a;
    private f b = f.NO_CACHE;
    private int c;
    private int d;

    private e() {
        k();
    }

    private void k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e l() {
        return new e();
    }

    @Override // com.google.tagmanager.a.v, com.google.tagmanager.a.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return l().a(d());
    }

    public e a(int i) {
        this.a |= 2;
        this.c = i;
        return this;
    }

    @Override // com.google.tagmanager.a.v
    public e a(c cVar) {
        if (cVar != c.a()) {
            if (cVar.d()) {
                a(cVar.e());
            }
            if (cVar.f()) {
                a(cVar.g());
            }
            if (cVar.h()) {
                b(cVar.i());
            }
            a(r().a(cVar.d));
        }
        return this;
    }

    public e a(f fVar) {
        if (fVar == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = fVar;
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
    public com.google.analytics.a.a.e c(com.google.tagmanager.a.k r5, com.google.tagmanager.a.o r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r2 = 0
            com.google.tagmanager.a.aq r0 = com.google.analytics.a.a.c.a     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            java.lang.Object r0 = r0.b(r5, r6)     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            com.google.analytics.a.a.c r0 = (com.google.analytics.a.a.c) r0     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            if (r0 == 0) goto Le
            r4.a(r0)
        Le:
            return r4
        Lf:
            r0 = move-exception
            r1 = r0
            com.google.tagmanager.a.am r0 = r1.a()     // Catch: java.lang.Throwable -> L22
            com.google.analytics.a.a.c r0 = (com.google.analytics.a.a.c) r0     // Catch: java.lang.Throwable -> L22
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.a.e.c(com.google.tagmanager.a.k, com.google.tagmanager.a.o):com.google.analytics.a.a.e");
    }

    @Override // com.google.tagmanager.a.v, com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c p() {
        return c.a();
    }

    public e b(int i) {
        this.a |= 4;
        this.d = i;
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

    public c d() {
        c cVar = new c(this);
        int i = this.a;
        int i2 = (i & 1) != 1 ? 0 : 1;
        cVar.f = this.b;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        cVar.g = this.c;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        cVar.h = this.d;
        cVar.e = i2;
        return cVar;
    }

    @Override // com.google.tagmanager.a.ao
    public final boolean j() {
        return true;
    }
}
