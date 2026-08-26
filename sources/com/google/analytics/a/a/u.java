package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u extends com.google.tagmanager.a.t implements x {
    private final com.google.tagmanager.a.h d;
    private List e;
    private List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;
    private List l;
    private List m;
    private List n;
    private byte o;
    private int p;
    public static aq a = new v();
    private static volatile ap q = null;
    private static final u c = new u(true);

    static {
        c.E();
    }

    private u(com.google.tagmanager.a.k kVar, com.google.tagmanager.a.o oVar) {
        this.o = (byte) -1;
        this.p = -1;
        E();
        int i = 0;
        com.google.tagmanager.a.m mVarA = com.google.tagmanager.a.m.a(com.google.tagmanager.a.h.i());
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int iA = kVar.a();
                        switch (iA) {
                            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                                z = true;
                                break;
                            case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                                if ((i & 1) != 1) {
                                    this.e = new ArrayList();
                                    i |= 1;
                                }
                                this.e.add(Integer.valueOf(kVar.f()));
                                break;
                            case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                                int iC = kVar.c(kVar.s());
                                if ((i & 1) != 1 && kVar.w() > 0) {
                                    this.e = new ArrayList();
                                    i |= 1;
                                }
                                while (kVar.w() > 0) {
                                    this.e.add(Integer.valueOf(kVar.f()));
                                }
                                kVar.d(iC);
                                break;
                            case 16:
                                if ((i & 2) != 2) {
                                    this.f = new ArrayList();
                                    i |= 2;
                                }
                                this.f.add(Integer.valueOf(kVar.f()));
                                break;
                            case 18:
                                int iC2 = kVar.c(kVar.s());
                                if ((i & 2) != 2 && kVar.w() > 0) {
                                    this.f = new ArrayList();
                                    i |= 2;
                                }
                                while (kVar.w() > 0) {
                                    this.f.add(Integer.valueOf(kVar.f()));
                                }
                                kVar.d(iC2);
                                break;
                            case 24:
                                if ((i & 4) != 4) {
                                    this.g = new ArrayList();
                                    i |= 4;
                                }
                                this.g.add(Integer.valueOf(kVar.f()));
                                break;
                            case 26:
                                int iC3 = kVar.c(kVar.s());
                                if ((i & 4) != 4 && kVar.w() > 0) {
                                    this.g = new ArrayList();
                                    i |= 4;
                                }
                                while (kVar.w() > 0) {
                                    this.g.add(Integer.valueOf(kVar.f()));
                                }
                                kVar.d(iC3);
                                break;
                            case 32:
                                if ((i & 8) != 8) {
                                    this.h = new ArrayList();
                                    i |= 8;
                                }
                                this.h.add(Integer.valueOf(kVar.f()));
                                break;
                            case 34:
                                int iC4 = kVar.c(kVar.s());
                                if ((i & 8) != 8 && kVar.w() > 0) {
                                    this.h = new ArrayList();
                                    i |= 8;
                                }
                                while (kVar.w() > 0) {
                                    this.h.add(Integer.valueOf(kVar.f()));
                                }
                                kVar.d(iC4);
                                break;
                            case 40:
                                if ((i & 16) != 16) {
                                    this.i = new ArrayList();
                                    i |= 16;
                                }
                                this.i.add(Integer.valueOf(kVar.f()));
                                break;
                            case 42:
                                int iC5 = kVar.c(kVar.s());
                                if ((i & 16) != 16 && kVar.w() > 0) {
                                    this.i = new ArrayList();
                                    i |= 16;
                                }
                                while (kVar.w() > 0) {
                                    this.i.add(Integer.valueOf(kVar.f()));
                                }
                                kVar.d(iC5);
                                break;
                            case 48:
                                if ((i & 32) != 32) {
                                    this.j = new ArrayList();
                                    i |= 32;
                                }
                                this.j.add(Integer.valueOf(kVar.f()));
                                break;
                            case 50:
                                int iC6 = kVar.c(kVar.s());
                                if ((i & 32) != 32 && kVar.w() > 0) {
                                    this.j = new ArrayList();
                                    i |= 32;
                                }
                                while (kVar.w() > 0) {
                                    this.j.add(Integer.valueOf(kVar.f()));
                                }
                                kVar.d(iC6);
                                break;
                            case 56:
                                if ((i & 64) != 64) {
                                    this.k = new ArrayList();
                                    i |= 64;
                                }
                                this.k.add(Integer.valueOf(kVar.f()));
                                break;
                            case 58:
                                int iC7 = kVar.c(kVar.s());
                                if ((i & 64) != 64 && kVar.w() > 0) {
                                    this.k = new ArrayList();
                                    i |= 64;
                                }
                                while (kVar.w() > 0) {
                                    this.k.add(Integer.valueOf(kVar.f()));
                                }
                                kVar.d(iC7);
                                break;
                            case 64:
                                if ((i & 128) != 128) {
                                    this.l = new ArrayList();
                                    i |= 128;
                                }
                                this.l.add(Integer.valueOf(kVar.f()));
                                break;
                            case 66:
                                int iC8 = kVar.c(kVar.s());
                                if ((i & 128) != 128 && kVar.w() > 0) {
                                    this.l = new ArrayList();
                                    i |= 128;
                                }
                                while (kVar.w() > 0) {
                                    this.l.add(Integer.valueOf(kVar.f()));
                                }
                                kVar.d(iC8);
                                break;
                            case 72:
                                if ((i & 256) != 256) {
                                    this.m = new ArrayList();
                                    i |= 256;
                                }
                                this.m.add(Integer.valueOf(kVar.f()));
                                break;
                            case 74:
                                int iC9 = kVar.c(kVar.s());
                                if ((i & 256) != 256 && kVar.w() > 0) {
                                    this.m = new ArrayList();
                                    i |= 256;
                                }
                                while (kVar.w() > 0) {
                                    this.m.add(Integer.valueOf(kVar.f()));
                                }
                                kVar.d(iC9);
                                break;
                            case 80:
                                if ((i & 512) != 512) {
                                    this.n = new ArrayList();
                                    i |= 512;
                                }
                                this.n.add(Integer.valueOf(kVar.f()));
                                break;
                            case 82:
                                int iC10 = kVar.c(kVar.s());
                                if ((i & 512) != 512 && kVar.w() > 0) {
                                    this.n = new ArrayList();
                                    i |= 512;
                                }
                                while (kVar.w() > 0) {
                                    this.n.add(Integer.valueOf(kVar.f()));
                                }
                                kVar.d(iC10);
                                break;
                            default:
                                if (!a(kVar, mVarA, oVar, iA)) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (af e) {
                        throw e.a(this);
                    }
                } catch (IOException e2) {
                    throw new af(e2.getMessage()).a(this);
                }
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.e = Collections.unmodifiableList(this.e);
                }
                if ((i & 2) == 2) {
                    this.f = Collections.unmodifiableList(this.f);
                }
                if ((i & 4) == 4) {
                    this.g = Collections.unmodifiableList(this.g);
                }
                if ((i & 8) == 8) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if ((i & 16) == 16) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if ((i & 32) == 32) {
                    this.j = Collections.unmodifiableList(this.j);
                }
                if ((i & 64) == 64) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if ((i & 128) == 128) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if ((i & 256) == 256) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if ((i & 512) == 512) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                try {
                    mVarA.a();
                } catch (IOException e3) {
                } finally {
                }
                R();
                throw th;
            }
        }
        if ((i & 1) == 1) {
            this.e = Collections.unmodifiableList(this.e);
        }
        if ((i & 2) == 2) {
            this.f = Collections.unmodifiableList(this.f);
        }
        if ((i & 4) == 4) {
            this.g = Collections.unmodifiableList(this.g);
        }
        if ((i & 8) == 8) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if ((i & 16) == 16) {
            this.i = Collections.unmodifiableList(this.i);
        }
        if ((i & 32) == 32) {
            this.j = Collections.unmodifiableList(this.j);
        }
        if ((i & 64) == 64) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if ((i & 128) == 128) {
            this.l = Collections.unmodifiableList(this.l);
        }
        if ((i & 256) == 256) {
            this.m = Collections.unmodifiableList(this.m);
        }
        if ((i & 512) == 512) {
            this.n = Collections.unmodifiableList(this.n);
        }
        try {
            mVarA.a();
        } catch (IOException e4) {
        } finally {
        }
        R();
    }

    private u(com.google.tagmanager.a.v vVar) {
        super(vVar);
        this.o = (byte) -1;
        this.p = -1;
        this.d = vVar.r();
    }

    private u(boolean z) {
        this.o = (byte) -1;
        this.p = -1;
        this.d = com.google.tagmanager.a.h.a;
    }

    public static w B() {
        return w.l();
    }

    private void E() {
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
        this.g = Collections.emptyList();
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        this.k = Collections.emptyList();
        this.l = Collections.emptyList();
        this.m = Collections.emptyList();
        this.n = Collections.emptyList();
    }

    public static u a() {
        return c;
    }

    public static w a(u uVar) {
        return B().a(uVar);
    }

    public int A() {
        return this.n.size();
    }

    @Override // com.google.tagmanager.a.am
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public w o() {
        return B();
    }

    @Override // com.google.tagmanager.a.am
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public w n() {
        return a(this);
    }

    @Override // com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u p() {
        return c;
    }

    @Override // com.google.tagmanager.a.t, com.google.tagmanager.a.am
    public aq c() {
        return a;
    }

    public List d() {
        return this.e;
    }

    public int e() {
        return this.e.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return super.equals(obj);
        }
        u uVar = (u) obj;
        return (((((((((d().equals(uVar.d())) && f().equals(uVar.f())) && h().equals(uVar.h())) && k().equals(uVar.k())) && m().equals(uVar.m())) && r().equals(uVar.r())) && t().equals(uVar.t())) && v().equals(uVar.v())) && x().equals(uVar.x())) && z().equals(uVar.z());
    }

    public List f() {
        return this.f;
    }

    public int g() {
        return this.f.size();
    }

    public List h() {
        return this.g;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int iHashCode = u.class.hashCode() + 779;
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
        if (w() > 0) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + v().hashCode();
        }
        if (y() > 0) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + x().hashCode();
        }
        if (A() > 0) {
            iHashCode = (((iHashCode * 37) + 10) * 53) + z().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.d.hashCode();
        this.b = iHashCode2;
        return iHashCode2;
    }

    public int i() {
        return this.g.size();
    }

    @Override // com.google.tagmanager.a.ao
    public final boolean j() {
        byte b = this.o;
        if (b != -1) {
            return b == 1;
        }
        this.o = (byte) 1;
        return true;
    }

    public List k() {
        return this.h;
    }

    public int l() {
        return this.h.size();
    }

    public List m() {
        return this.i;
    }

    public int q() {
        return this.i.size();
    }

    public List r() {
        return this.j;
    }

    public int s() {
        return this.j.size();
    }

    public List t() {
        return this.k;
    }

    public int u() {
        return this.k.size();
    }

    public List v() {
        return this.l;
    }

    public int w() {
        return this.l.size();
    }

    public List x() {
        return this.m;
    }

    public int y() {
        return this.m.size();
    }

    public List z() {
        return this.n;
    }
}
