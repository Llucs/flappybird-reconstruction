package com.google.analytics.a.a;

import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ah;
import com.google.tagmanager.a.ai;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.bg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q extends com.google.tagmanager.a.t implements t {
    private final com.google.tagmanager.a.h d;
    private int e;
    private ai f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;
    private List l;
    private Object m;
    private Object n;
    private Object o;
    private Object p;
    private c q;
    private float r;
    private boolean s;
    private ai t;
    private int u;
    private byte v;
    private int w;
    public static aq a = new r();
    private static volatile ap x = null;
    private static final q c = new q(true);

    static {
        c.S();
    }

    private q(com.google.tagmanager.a.k kVar, com.google.tagmanager.a.o oVar) throws Throwable {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        this.v = (byte) -1;
        this.w = -1;
        S();
        int i10 = 0;
        com.google.tagmanager.a.m mVarA = com.google.tagmanager.a.m.a(com.google.tagmanager.a.h.i());
        boolean z2 = false;
        while (!z2) {
            try {
                try {
                    int iA = kVar.a();
                    switch (iA) {
                        case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                            z = true;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                            com.google.tagmanager.a.h hVarL = kVar.l();
                            if ((i10 & 1) != 1) {
                                this.f = new ah();
                                i9 = i10 | 1;
                            } else {
                                i9 = i10;
                            }
                            try {
                                this.f.a(hVarL);
                                boolean z3 = z2;
                                i = i9;
                                z = z3;
                                i10 = i;
                                z2 = z;
                            } catch (af e) {
                                e = e;
                                throw e.a(this);
                            } catch (IOException e2) {
                                e = e2;
                                throw new af(e.getMessage()).a(this);
                            } catch (Throwable th) {
                                i10 = i9;
                                th = th;
                                if ((i10 & 1) == 1) {
                                    this.f = new bg(this.f);
                                }
                                if ((i10 & 2) == 2) {
                                    this.g = Collections.unmodifiableList(this.g);
                                }
                                if ((i10 & 4) == 4) {
                                    this.h = Collections.unmodifiableList(this.h);
                                }
                                if ((i10 & 8) == 8) {
                                    this.i = Collections.unmodifiableList(this.i);
                                }
                                if ((i10 & 16) == 16) {
                                    this.j = Collections.unmodifiableList(this.j);
                                }
                                if ((i10 & 32) == 32) {
                                    this.k = Collections.unmodifiableList(this.k);
                                }
                                if ((i10 & 64) == 64) {
                                    this.l = Collections.unmodifiableList(this.l);
                                }
                                if ((i10 & 16384) == 16384) {
                                    this.t = new bg(this.t);
                                }
                                try {
                                    mVarA.a();
                                } catch (IOException e3) {
                                } finally {
                                }
                                R();
                                throw th;
                            }
                            break;
                        case 18:
                            if ((i10 & 2) != 2) {
                                this.g = new ArrayList();
                                i8 = i10 | 2;
                            } else {
                                i8 = i10;
                            }
                            this.g.add(kVar.a(com.google.analytics.b.a.a.c.a, oVar));
                            boolean z4 = z2;
                            i = i8;
                            z = z4;
                            i10 = i;
                            z2 = z;
                            break;
                        case 26:
                            if ((i10 & 4) != 4) {
                                this.h = new ArrayList();
                                i7 = i10 | 4;
                            } else {
                                i7 = i10;
                            }
                            this.h.add(kVar.a(m.a, oVar));
                            boolean z5 = z2;
                            i = i7;
                            z = z5;
                            i10 = i;
                            z2 = z;
                            break;
                        case 34:
                            if ((i10 & 8) != 8) {
                                this.i = new ArrayList();
                                i6 = i10 | 8;
                            } else {
                                i6 = i10;
                            }
                            this.i.add(kVar.a(i.a, oVar));
                            boolean z6 = z2;
                            i = i6;
                            z = z6;
                            i10 = i;
                            z2 = z;
                            break;
                        case 42:
                            if ((i10 & 16) != 16) {
                                this.j = new ArrayList();
                                i5 = i10 | 16;
                            } else {
                                i5 = i10;
                            }
                            this.j.add(kVar.a(i.a, oVar));
                            boolean z7 = z2;
                            i = i5;
                            z = z7;
                            i10 = i;
                            z2 = z;
                            break;
                        case 50:
                            if ((i10 & 32) != 32) {
                                this.k = new ArrayList();
                                i4 = i10 | 32;
                            } else {
                                i4 = i10;
                            }
                            this.k.add(kVar.a(i.a, oVar));
                            boolean z8 = z2;
                            i = i4;
                            z = z8;
                            i10 = i;
                            z2 = z;
                            break;
                        case 58:
                            if ((i10 & 64) != 64) {
                                this.l = new ArrayList();
                                i3 = i10 | 64;
                            } else {
                                i3 = i10;
                            }
                            this.l.add(kVar.a(u.a, oVar));
                            boolean z9 = z2;
                            i = i3;
                            z = z9;
                            i10 = i;
                            z2 = z;
                            break;
                        case 74:
                            com.google.tagmanager.a.h hVarL2 = kVar.l();
                            this.e |= 1;
                            this.m = hVarL2;
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 82:
                            com.google.tagmanager.a.h hVarL3 = kVar.l();
                            this.e |= 2;
                            this.n = hVarL3;
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 98:
                            com.google.tagmanager.a.h hVarL4 = kVar.l();
                            this.e |= 4;
                            this.o = hVarL4;
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 106:
                            com.google.tagmanager.a.h hVarL5 = kVar.l();
                            this.e |= 8;
                            this.p = hVarL5;
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 114:
                            e eVarN = (this.e & 16) == 16 ? this.q.n() : null;
                            this.q = (c) kVar.a(c.a, oVar);
                            if (eVarN != null) {
                                eVarN.a(this.q);
                                this.q = eVarN.d();
                            }
                            this.e |= 16;
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 125:
                            this.e |= 32;
                            this.r = kVar.c();
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 130:
                            com.google.tagmanager.a.h hVarL6 = kVar.l();
                            if ((i10 & 16384) != 16384) {
                                this.t = new ah();
                                i2 = i10 | 16384;
                            } else {
                                i2 = i10;
                            }
                            this.t.a(hVarL6);
                            boolean z10 = z2;
                            i = i2;
                            z = z10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 136:
                            this.e |= 128;
                            this.u = kVar.f();
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 144:
                            this.e |= 64;
                            this.s = kVar.i();
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        default:
                            if (a(kVar, mVarA, oVar, iA)) {
                                z = z2;
                                i = i10;
                            } else {
                                z = true;
                                i = i10;
                            }
                            i10 = i;
                            z2 = z;
                            break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (af e4) {
                e = e4;
            } catch (IOException e5) {
                e = e5;
            }
        }
        if ((i10 & 1) == 1) {
            this.f = new bg(this.f);
        }
        if ((i10 & 2) == 2) {
            this.g = Collections.unmodifiableList(this.g);
        }
        if ((i10 & 4) == 4) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if ((i10 & 8) == 8) {
            this.i = Collections.unmodifiableList(this.i);
        }
        if ((i10 & 16) == 16) {
            this.j = Collections.unmodifiableList(this.j);
        }
        if ((i10 & 32) == 32) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if ((i10 & 64) == 64) {
            this.l = Collections.unmodifiableList(this.l);
        }
        if ((i10 & 16384) == 16384) {
            this.t = new bg(this.t);
        }
        try {
            mVarA.a();
        } catch (IOException e6) {
        } finally {
        }
        R();
    }

    private q(com.google.tagmanager.a.v vVar) {
        super(vVar);
        this.v = (byte) -1;
        this.w = -1;
        this.d = vVar.r();
    }

    private q(boolean z) {
        this.v = (byte) -1;
        this.w = -1;
        this.d = com.google.tagmanager.a.h.a;
    }

    public static s N() {
        return s.s();
    }

    private void S() {
        this.f = ah.a;
        this.g = Collections.emptyList();
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        this.k = Collections.emptyList();
        this.l = Collections.emptyList();
        this.m = "";
        this.n = "";
        this.o = "0";
        this.p = "";
        this.q = c.a();
        this.r = 0.0f;
        this.s = false;
        this.t = ah.a;
        this.u = 0;
    }

    public static q a() {
        return c;
    }

    public static s a(q qVar) {
        return N().a(qVar);
    }

    public String A() {
        Object obj = this.o;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.tagmanager.a.h hVar = (com.google.tagmanager.a.h) obj;
        String strF = hVar.f();
        if (hVar.g()) {
            this.o = strF;
        }
        return strF;
    }

    public boolean B() {
        return (this.e & 8) == 8;
    }

    public String C() {
        Object obj = this.p;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.tagmanager.a.h hVar = (com.google.tagmanager.a.h) obj;
        String strF = hVar.f();
        if (hVar.g()) {
            this.p = strF;
        }
        return strF;
    }

    public boolean D() {
        return (this.e & 16) == 16;
    }

    public c E() {
        return this.q;
    }

    public boolean F() {
        return (this.e & 32) == 32;
    }

    public float G() {
        return this.r;
    }

    public boolean H() {
        return (this.e & 64) == 64;
    }

    public boolean I() {
        return this.s;
    }

    public List J() {
        return this.t;
    }

    public int K() {
        return this.t.size();
    }

    public boolean L() {
        return (this.e & 128) == 128;
    }

    public int M() {
        return this.u;
    }

    @Override // com.google.tagmanager.a.am
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public s o() {
        return N();
    }

    @Override // com.google.tagmanager.a.am
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public s n() {
        return a(this);
    }

    public com.google.analytics.b.a.a.c a(int i) {
        return (com.google.analytics.b.a.a.c) this.g.get(i);
    }

    public m b(int i) {
        return (m) this.h.get(i);
    }

    @Override // com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q p() {
        return c;
    }

    public i c(int i) {
        return (i) this.i.get(i);
    }

    @Override // com.google.tagmanager.a.t, com.google.tagmanager.a.am
    public aq c() {
        return a;
    }

    public i d(int i) {
        return (i) this.j.get(i);
    }

    public List d() {
        return this.f;
    }

    public int e() {
        return this.f.size();
    }

    public i e(int i) {
        return (i) this.k.get(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return super.equals(obj);
        }
        q qVar = (q) obj;
        boolean z = (((((((d().equals(qVar.d())) && f().equals(qVar.f())) && h().equals(qVar.h())) && k().equals(qVar.k())) && m().equals(qVar.m())) && r().equals(qVar.r())) && t().equals(qVar.t())) && v() == qVar.v();
        if (v()) {
            z = z && w().equals(qVar.w());
        }
        boolean z2 = z && x() == qVar.x();
        if (x()) {
            z2 = z2 && y().equals(qVar.y());
        }
        boolean z3 = z2 && z() == qVar.z();
        if (z()) {
            z3 = z3 && A().equals(qVar.A());
        }
        boolean z4 = z3 && B() == qVar.B();
        if (B()) {
            z4 = z4 && C().equals(qVar.C());
        }
        boolean z5 = z4 && D() == qVar.D();
        if (D()) {
            z5 = z5 && E().equals(qVar.E());
        }
        boolean z6 = z5 && F() == qVar.F();
        if (F()) {
            z6 = z6 && Float.floatToIntBits(G()) == Float.floatToIntBits(qVar.G());
        }
        boolean z7 = z6 && H() == qVar.H();
        if (H()) {
            z7 = z7 && I() == qVar.I();
        }
        boolean z8 = (z7 && J().equals(qVar.J())) && L() == qVar.L();
        return L() ? z8 && M() == qVar.M() : z8;
    }

    public List f() {
        return this.g;
    }

    public int g() {
        return this.g.size();
    }

    public List h() {
        return this.h;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int iHashCode = q.class.hashCode() + 779;
        if (e() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + d().hashCode();
        }
        if (g() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + f().hashCode();
        }
        if (i() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + h().hashCode();
        }
        if (l() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + k().hashCode();
        }
        if (q() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + m().hashCode();
        }
        if (s() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + r().hashCode();
        }
        if (u() > 0) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + t().hashCode();
        }
        if (v()) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + w().hashCode();
        }
        if (x()) {
            iHashCode = (((iHashCode * 37) + 10) * 53) + y().hashCode();
        }
        if (z()) {
            iHashCode = (((iHashCode * 37) + 12) * 53) + A().hashCode();
        }
        if (B()) {
            iHashCode = (((iHashCode * 37) + 13) * 53) + C().hashCode();
        }
        if (D()) {
            iHashCode = (((iHashCode * 37) + 14) * 53) + E().hashCode();
        }
        if (F()) {
            iHashCode = (((iHashCode * 37) + 15) * 53) + Float.floatToIntBits(G());
        }
        if (H()) {
            iHashCode = (((iHashCode * 37) + 18) * 53) + ac.a(I());
        }
        if (K() > 0) {
            iHashCode = (((iHashCode * 37) + 16) * 53) + J().hashCode();
        }
        if (L()) {
            iHashCode = (((iHashCode * 37) + 17) * 53) + M();
        }
        int iHashCode2 = (iHashCode * 29) + this.d.hashCode();
        this.b = iHashCode2;
        return iHashCode2;
    }

    public int i() {
        return this.h.size();
    }

    @Override // com.google.tagmanager.a.ao
    public final boolean j() {
        byte b = this.v;
        if (b != -1) {
            return b == 1;
        }
        for (int i = 0; i < g(); i++) {
            if (!a(i).j()) {
                this.v = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!b(i2).j()) {
                this.v = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < l(); i3++) {
            if (!c(i3).j()) {
                this.v = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < q(); i4++) {
            if (!d(i4).j()) {
                this.v = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < s(); i5++) {
            if (!e(i5).j()) {
                this.v = (byte) 0;
                return false;
            }
        }
        this.v = (byte) 1;
        return true;
    }

    public List k() {
        return this.i;
    }

    public int l() {
        return this.i.size();
    }

    public List m() {
        return this.j;
    }

    public int q() {
        return this.j.size();
    }

    public List r() {
        return this.k;
    }

    public int s() {
        return this.k.size();
    }

    public List t() {
        return this.l;
    }

    public int u() {
        return this.l.size();
    }

    public boolean v() {
        return (this.e & 1) == 1;
    }

    public String w() {
        Object obj = this.m;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.tagmanager.a.h hVar = (com.google.tagmanager.a.h) obj;
        String strF = hVar.f();
        if (hVar.g()) {
            this.m = strF;
        }
        return strF;
    }

    public boolean x() {
        return (this.e & 2) == 2;
    }

    public String y() {
        Object obj = this.n;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.tagmanager.a.h hVar = (com.google.tagmanager.a.h) obj;
        String strF = hVar.f();
        if (hVar.g()) {
            this.n = strF;
        }
        return strF;
    }

    public boolean z() {
        return (this.e & 4) == 4;
    }
}
