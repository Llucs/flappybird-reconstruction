package com.google.analytics.a.a;

import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends com.google.tagmanager.a.t implements h {
    private final com.google.tagmanager.a.h d;
    private int e;
    private f f;
    private int g;
    private int h;
    private byte i;
    private int j;
    public static aq a = new d();
    private static volatile ap k = null;
    private static final c c = new c(true);

    static {
        c.q();
    }

    private c(com.google.tagmanager.a.k kVar, com.google.tagmanager.a.o oVar) {
        this.i = (byte) -1;
        this.j = -1;
        q();
        com.google.tagmanager.a.m mVarA = com.google.tagmanager.a.m.a(com.google.tagmanager.a.h.i());
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iA = kVar.a();
                    switch (iA) {
                        case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                            z = true;
                            break;
                        case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                            int iN = kVar.n();
                            f fVarA = f.a(iN);
                            if (fVarA == null) {
                                mVarA.d(iA);
                                mVarA.d(iN);
                            } else {
                                this.e |= 1;
                                this.f = fVarA;
                            }
                            break;
                        case 16:
                            this.e |= 2;
                            this.g = kVar.f();
                            break;
                        case 24:
                            this.e |= 4;
                            this.h = kVar.f();
                            break;
                        default:
                            if (!a(kVar, mVarA, oVar, iA)) {
                                z = true;
                            }
                            break;
                    }
                } catch (Throwable th) {
                    try {
                        mVarA.a();
                    } catch (IOException e) {
                    } finally {
                    }
                    R();
                    throw th;
                }
            } catch (af e2) {
                throw e2.a(this);
            } catch (IOException e3) {
                throw new af(e3.getMessage()).a(this);
            }
        }
        try {
            mVarA.a();
        } catch (IOException e4) {
        } finally {
        }
        R();
    }

    private c(com.google.tagmanager.a.v vVar) {
        super(vVar);
        this.i = (byte) -1;
        this.j = -1;
        this.d = vVar.r();
    }

    private c(boolean z) {
        this.i = (byte) -1;
        this.j = -1;
        this.d = com.google.tagmanager.a.h.a;
    }

    public static c a() {
        return c;
    }

    public static e a(c cVar) {
        return k().a(cVar);
    }

    public static e k() {
        return e.l();
    }

    private void q() {
        this.f = f.NO_CACHE;
        this.g = 0;
        this.h = 0;
    }

    @Override // com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c p() {
        return c;
    }

    @Override // com.google.tagmanager.a.t, com.google.tagmanager.a.am
    public aq c() {
        return a;
    }

    public boolean d() {
        return (this.e & 1) == 1;
    }

    public f e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return super.equals(obj);
        }
        c cVar = (c) obj;
        boolean z = d() == cVar.d();
        if (d()) {
            z = z && e() == cVar.e();
        }
        boolean z2 = z && f() == cVar.f();
        if (f()) {
            z2 = z2 && g() == cVar.g();
        }
        boolean z3 = z2 && h() == cVar.h();
        return h() ? z3 && i() == cVar.i() : z3;
    }

    public boolean f() {
        return (this.e & 2) == 2;
    }

    public int g() {
        return this.g;
    }

    public boolean h() {
        return (this.e & 4) == 4;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int iHashCode = c.class.hashCode() + 779;
        if (d()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + ac.a(e());
        }
        if (f()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + g();
        }
        if (h()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + i();
        }
        int iHashCode2 = (iHashCode * 29) + this.d.hashCode();
        this.b = iHashCode2;
        return iHashCode2;
    }

    public int i() {
        return this.h;
    }

    @Override // com.google.tagmanager.a.ao
    public final boolean j() {
        byte b = this.i;
        if (b != -1) {
            return b == 1;
        }
        this.i = (byte) 1;
        return true;
    }

    @Override // com.google.tagmanager.a.am
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e o() {
        return k();
    }

    @Override // com.google.tagmanager.a.am
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e n() {
        return a(this);
    }
}
