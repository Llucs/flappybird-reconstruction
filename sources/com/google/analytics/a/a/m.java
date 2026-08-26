package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class m extends com.google.tagmanager.a.t implements p {
    private final com.google.tagmanager.a.h d;
    private int e;
    private int f;
    private int g;
    private byte h;
    private int i;
    public static aq a = new n();
    private static volatile ap j = null;
    private static final m c = new m(true);

    static {
        c.l();
    }

    private m(com.google.tagmanager.a.k kVar, com.google.tagmanager.a.o oVar) {
        this.h = (byte) -1;
        this.i = -1;
        l();
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
                            this.e |= 1;
                            this.f = kVar.f();
                            break;
                        case 16:
                            this.e |= 2;
                            this.g = kVar.f();
                            break;
                        default:
                            if (!a(kVar, mVarA, oVar, iA)) {
                                z = true;
                            }
                            break;
                    }
                } catch (af e) {
                    throw e.a(this);
                } catch (IOException e2) {
                    throw new af(e2.getMessage()).a(this);
                }
            } catch (Throwable th) {
                try {
                    mVarA.a();
                } catch (IOException e3) {
                } finally {
                }
                R();
                throw th;
            }
        }
        try {
            mVarA.a();
        } catch (IOException e4) {
        } finally {
        }
        R();
    }

    private m(com.google.tagmanager.a.v vVar) {
        super(vVar);
        this.h = (byte) -1;
        this.i = -1;
        this.d = vVar.r();
    }

    private m(boolean z) {
        this.h = (byte) -1;
        this.i = -1;
        this.d = com.google.tagmanager.a.h.a;
    }

    public static m a() {
        return c;
    }

    public static o a(m mVar) {
        return h().a(mVar);
    }

    public static o h() {
        return o.n();
    }

    private void l() {
        this.f = 0;
        this.g = 0;
    }

    @Override // com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m p() {
        return c;
    }

    @Override // com.google.tagmanager.a.t, com.google.tagmanager.a.am
    public aq c() {
        return a;
    }

    public boolean d() {
        return (this.e & 1) == 1;
    }

    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        boolean z = d() == mVar.d();
        if (d()) {
            z = z && e() == mVar.e();
        }
        boolean z2 = z && f() == mVar.f();
        return f() ? z2 && g() == mVar.g() : z2;
    }

    public boolean f() {
        return (this.e & 2) == 2;
    }

    public int g() {
        return this.g;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int iHashCode = m.class.hashCode() + 779;
        if (d()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + e();
        }
        if (f()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + g();
        }
        int iHashCode2 = (iHashCode * 29) + this.d.hashCode();
        this.b = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.tagmanager.a.am
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public o o() {
        return h();
    }

    @Override // com.google.tagmanager.a.ao
    public final boolean j() {
        byte b = this.h;
        if (b != -1) {
            return b == 1;
        }
        if (!d()) {
            this.h = (byte) 0;
            return false;
        }
        if (f()) {
            this.h = (byte) 1;
            return true;
        }
        this.h = (byte) 0;
        return false;
    }

    @Override // com.google.tagmanager.a.am
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public o n() {
        return a(this);
    }
}
