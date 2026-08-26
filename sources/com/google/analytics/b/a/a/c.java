package com.google.analytics.b.a.a;

import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.m;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.w;
import com.google.tagmanager.a.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c extends x implements j {
    private final com.google.tagmanager.a.h d;
    private int e;
    private h f;
    private Object g;
    private List h;
    private List i;
    private List j;
    private Object k;
    private Object l;
    private long m;
    private boolean n;
    private List o;
    private List p;
    private boolean q;
    private byte r;
    private int s;
    public static aq a = new d();
    private static volatile ap t = null;
    private static final c c = new c(true);

    static {
        c.J();
    }

    private c(k kVar, o oVar) throws Throwable {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        this.r = (byte) -1;
        this.s = -1;
        J();
        int i7 = 0;
        m mVarA = m.a(com.google.tagmanager.a.h.i());
        boolean z2 = false;
        while (!z2) {
            try {
                try {
                    int iA = kVar.a();
                    switch (iA) {
                        case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                            z = true;
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                            int iN = kVar.n();
                            h hVarA = h.a(iN);
                            if (hVarA == null) {
                                mVarA.d(iA);
                                mVarA.d(iN);
                                z = z2;
                                i2 = i7;
                            } else {
                                this.e |= 1;
                                this.f = hVarA;
                                z = z2;
                                i2 = i7;
                            }
                            i7 = i2;
                            z2 = z;
                            break;
                        case 18:
                            com.google.tagmanager.a.h hVarL = kVar.l();
                            this.e |= 2;
                            this.g = hVarL;
                            z = z2;
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 26:
                            if ((i7 & 4) != 4) {
                                this.h = new ArrayList();
                                i6 = i7 | 4;
                            } else {
                                i6 = i7;
                            }
                            try {
                                this.h.add(kVar.a(a, oVar));
                                boolean z3 = z2;
                                i2 = i6;
                                z = z3;
                                i7 = i2;
                                z2 = z;
                            } catch (af e) {
                                e = e;
                                throw e.a(this);
                            } catch (IOException e2) {
                                e = e2;
                                throw new af(e.getMessage()).a(this);
                            } catch (Throwable th) {
                                i7 = i6;
                                th = th;
                                if ((i7 & 4) == 4) {
                                    this.h = Collections.unmodifiableList(this.h);
                                }
                                if ((i7 & 8) == 8) {
                                    this.i = Collections.unmodifiableList(this.i);
                                }
                                if ((i7 & 16) == 16) {
                                    this.j = Collections.unmodifiableList(this.j);
                                }
                                if ((i7 & 1024) == 1024) {
                                    this.p = Collections.unmodifiableList(this.p);
                                }
                                if ((i7 & 512) == 512) {
                                    this.o = Collections.unmodifiableList(this.o);
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
                        case 34:
                            if ((i7 & 8) != 8) {
                                this.i = new ArrayList();
                                i5 = i7 | 8;
                            } else {
                                i5 = i7;
                            }
                            this.i.add(kVar.a(a, oVar));
                            boolean z4 = z2;
                            i2 = i5;
                            z = z4;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 42:
                            if ((i7 & 16) != 16) {
                                this.j = new ArrayList();
                                i4 = i7 | 16;
                            } else {
                                i4 = i7;
                            }
                            this.j.add(kVar.a(a, oVar));
                            boolean z5 = z2;
                            i2 = i4;
                            z = z5;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 50:
                            com.google.tagmanager.a.h hVarL2 = kVar.l();
                            this.e |= 4;
                            this.k = hVarL2;
                            z = z2;
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 58:
                            com.google.tagmanager.a.h hVarL3 = kVar.l();
                            this.e |= 8;
                            this.l = hVarL3;
                            z = z2;
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 64:
                            this.e |= 16;
                            this.m = kVar.e();
                            z = z2;
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 72:
                            this.e |= 64;
                            this.q = kVar.i();
                            z = z2;
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 80:
                            int iN2 = kVar.n();
                            f fVarA = f.a(iN2);
                            if (fVarA == null) {
                                mVarA.d(iA);
                                mVarA.d(iN2);
                                z = z2;
                                i2 = i7;
                            } else {
                                if ((i7 & 1024) != 1024) {
                                    this.p = new ArrayList();
                                    i3 = i7 | 1024;
                                } else {
                                    i3 = i7;
                                }
                                this.p.add(fVarA);
                                boolean z6 = z2;
                                i2 = i3;
                                z = z6;
                            }
                            i7 = i2;
                            z2 = z;
                            break;
                        case 82:
                            int iC = kVar.c(kVar.s());
                            int i8 = i7;
                            while (kVar.w() > 0) {
                                int iN3 = kVar.n();
                                f fVarA2 = f.a(iN3);
                                if (fVarA2 == null) {
                                    mVarA.d(iA);
                                    mVarA.d(iN3);
                                } else {
                                    if ((i8 & 1024) != 1024) {
                                        this.p = new ArrayList();
                                        i8 |= 1024;
                                    }
                                    this.p.add(fVarA2);
                                }
                            }
                            kVar.d(iC);
                            boolean z7 = z2;
                            i2 = i8;
                            z = z7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 90:
                            if ((i7 & 512) != 512) {
                                this.o = new ArrayList();
                                i = i7 | 512;
                            } else {
                                i = i7;
                            }
                            this.o.add(kVar.a(a, oVar));
                            boolean z8 = z2;
                            i2 = i;
                            z = z8;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 96:
                            this.e |= 32;
                            this.n = kVar.i();
                            z = z2;
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        default:
                            if (a(kVar, mVarA, oVar, iA)) {
                                z = z2;
                                i2 = i7;
                            } else {
                                z = true;
                                i2 = i7;
                            }
                            i7 = i2;
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
        if ((i7 & 4) == 4) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if ((i7 & 8) == 8) {
            this.i = Collections.unmodifiableList(this.i);
        }
        if ((i7 & 16) == 16) {
            this.j = Collections.unmodifiableList(this.j);
        }
        if ((i7 & 1024) == 1024) {
            this.p = Collections.unmodifiableList(this.p);
        }
        if ((i7 & 512) == 512) {
            this.o = Collections.unmodifiableList(this.o);
        }
        try {
            mVarA.a();
        } catch (IOException e6) {
        } finally {
        }
        R();
    }

    private c(w wVar) {
        super(wVar);
        this.r = (byte) -1;
        this.s = -1;
        this.d = wVar.r();
    }

    private c(boolean z) {
        this.r = (byte) -1;
        this.s = -1;
        this.d = com.google.tagmanager.a.h.a;
    }

    public static e F() {
        return e.u();
    }

    private void J() {
        this.f = h.STRING;
        this.g = "";
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        this.k = "";
        this.l = "";
        this.m = 0L;
        this.n = false;
        this.o = Collections.emptyList();
        this.p = Collections.emptyList();
        this.q = false;
    }

    public static c a() {
        return c;
    }

    public static e a(c cVar) {
        return F().a(cVar);
    }

    public int A() {
        return this.o.size();
    }

    public List B() {
        return this.p;
    }

    public int C() {
        return this.p.size();
    }

    public boolean D() {
        return (this.e & 64) == 64;
    }

    public boolean E() {
        return this.q;
    }

    @Override // com.google.tagmanager.a.am
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public e o() {
        return F();
    }

    @Override // com.google.tagmanager.a.am
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public e n() {
        return a(this);
    }

    public c a(int i) {
        return (c) this.h.get(i);
    }

    @Override // com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c p() {
        return c;
    }

    public c b(int i) {
        return (c) this.i.get(i);
    }

    public c c(int i) {
        return (c) this.j.get(i);
    }

    @Override // com.google.tagmanager.a.t, com.google.tagmanager.a.am
    public aq c() {
        return a;
    }

    public c d(int i) {
        return (c) this.o.get(i);
    }

    public boolean d() {
        return (this.e & 1) == 1;
    }

    public h e() {
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
            z2 = z2 && g().equals(cVar.g());
        }
        boolean z3 = (((z2 && h().equals(cVar.h())) && k().equals(cVar.k())) && m().equals(cVar.m())) && r() == cVar.r();
        if (r()) {
            z3 = z3 && s().equals(cVar.s());
        }
        boolean z4 = z3 && t() == cVar.t();
        if (t()) {
            z4 = z4 && u().equals(cVar.u());
        }
        boolean z5 = z4 && v() == cVar.v();
        if (v()) {
            z5 = z5 && w() == cVar.w();
        }
        boolean z6 = z5 && x() == cVar.x();
        if (x()) {
            z6 = z6 && y() == cVar.y();
        }
        boolean z7 = ((z6 && z().equals(cVar.z())) && B().equals(cVar.B())) && D() == cVar.D();
        return D() ? z7 && E() == cVar.E() : z7;
    }

    public boolean f() {
        return (this.e & 2) == 2;
    }

    public String g() {
        Object obj = this.g;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.tagmanager.a.h hVar = (com.google.tagmanager.a.h) obj;
        String strF = hVar.f();
        if (hVar.g()) {
            this.g = strF;
        }
        return strF;
    }

    public List h() {
        return this.h;
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
            iHashCode = (((iHashCode * 37) + 2) * 53) + g().hashCode();
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
        if (r()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + s().hashCode();
        }
        if (t()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + u().hashCode();
        }
        if (v()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + ac.a(w());
        }
        if (x()) {
            iHashCode = (((iHashCode * 37) + 12) * 53) + ac.a(y());
        }
        if (A() > 0) {
            iHashCode = (((iHashCode * 37) + 11) * 53) + z().hashCode();
        }
        if (C() > 0) {
            iHashCode = (((iHashCode * 37) + 10) * 53) + ac.a(B());
        }
        if (D()) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + ac.a(E());
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
        byte b = this.r;
        if (b != -1) {
            return b == 1;
        }
        if (!d()) {
            this.r = (byte) 0;
            return false;
        }
        for (int i = 0; i < i(); i++) {
            if (!a(i).j()) {
                this.r = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < l(); i2++) {
            if (!b(i2).j()) {
                this.r = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < q(); i3++) {
            if (!c(i3).j()) {
                this.r = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < A(); i4++) {
            if (!d(i4).j()) {
                this.r = (byte) 0;
                return false;
            }
        }
        if (I()) {
            this.r = (byte) 1;
            return true;
        }
        this.r = (byte) 0;
        return false;
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

    public boolean r() {
        return (this.e & 4) == 4;
    }

    public String s() {
        Object obj = this.k;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.tagmanager.a.h hVar = (com.google.tagmanager.a.h) obj;
        String strF = hVar.f();
        if (hVar.g()) {
            this.k = strF;
        }
        return strF;
    }

    public boolean t() {
        return (this.e & 8) == 8;
    }

    public String u() {
        Object obj = this.l;
        if (obj instanceof String) {
            return (String) obj;
        }
        com.google.tagmanager.a.h hVar = (com.google.tagmanager.a.h) obj;
        String strF = hVar.f();
        if (hVar.g()) {
            this.l = strF;
        }
        return strF;
    }

    public boolean v() {
        return (this.e & 16) == 16;
    }

    public long w() {
        return this.m;
    }

    public boolean x() {
        return (this.e & 32) == 32;
    }

    public boolean y() {
        return this.n;
    }

    public List z() {
        return this.o;
    }
}
