package com.google.analytics.a.a;

import com.google.tagmanager.a.am;

/* JADX INFO: loaded from: classes.dex */
public final class o extends com.google.tagmanager.a.v implements p {
    private int a;
    private int b;
    private int c;

    private o() {
        m();
    }

    private void m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o n() {
        return new o();
    }

    @Override // com.google.tagmanager.a.v, com.google.tagmanager.a.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o clone() {
        return n().a(d());
    }

    public o a(int i) {
        this.a |= 1;
        this.b = i;
        return this;
    }

    @Override // com.google.tagmanager.a.v
    public o a(m mVar) {
        if (mVar != m.a()) {
            if (mVar.d()) {
                a(mVar.e());
            }
            if (mVar.f()) {
                b(mVar.g());
            }
            a(r().a(mVar.d));
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
    public com.google.analytics.a.a.o c(com.google.tagmanager.a.k r5, com.google.tagmanager.a.o r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r2 = 0
            com.google.tagmanager.a.aq r0 = com.google.analytics.a.a.m.a     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            java.lang.Object r0 = r0.b(r5, r6)     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            com.google.analytics.a.a.m r0 = (com.google.analytics.a.a.m) r0     // Catch: com.google.tagmanager.a.af -> Lf java.lang.Throwable -> L22
            if (r0 == 0) goto Le
            r4.a(r0)
        Le:
            return r4
        Lf:
            r0 = move-exception
            r1 = r0
            com.google.tagmanager.a.am r0 = r1.a()     // Catch: java.lang.Throwable -> L22
            com.google.analytics.a.a.m r0 = (com.google.analytics.a.a.m) r0     // Catch: java.lang.Throwable -> L22
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.a.a.o.c(com.google.tagmanager.a.k, com.google.tagmanager.a.o):com.google.analytics.a.a.o");
    }

    @Override // com.google.tagmanager.a.v, com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m p() {
        return m.a();
    }

    public o b(int i) {
        this.a |= 2;
        this.c = i;
        return this;
    }

    @Override // com.google.tagmanager.a.an
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m h() {
        m mVarD = d();
        if (mVarD.j()) {
            return mVarD;
        }
        throw a((am) mVarD);
    }

    public m d() {
        m mVar = new m(this);
        int i = this.a;
        int i2 = (i & 1) != 1 ? 0 : 1;
        mVar.f = this.b;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        mVar.g = this.c;
        mVar.e = i2;
        return mVar;
    }

    public boolean i() {
        return (this.a & 1) == 1;
    }

    @Override // com.google.tagmanager.a.ao
    public final boolean j() {
        return i() && k();
    }

    public boolean k() {
        return (this.a & 2) == 2;
    }
}
