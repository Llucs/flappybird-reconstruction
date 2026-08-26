package com.google.analytics.a.a;

import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i extends com.google.tagmanager.a.t implements l {
    private final com.google.tagmanager.a.h d;
    private int e;
    private List f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private byte k;
    private int l;
    public static aq a = new j();
    private static volatile ap m = null;
    private static final i c = new i(true);

    static {
        c.u();
    }

    private i(com.google.tagmanager.a.k kVar, com.google.tagmanager.a.o oVar) {
        boolean z = false;
        this.k = (byte) -1;
        this.l = -1;
        u();
        com.google.tagmanager.a.m mVarA = com.google.tagmanager.a.m.a(com.google.tagmanager.a.h.i());
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iA = kVar.a();
                    switch (iA) {
                        case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                            z = true;
                            break;
                        case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                            this.e |= 8;
                            this.j = kVar.i();
                            break;
                        case 16:
                            this.e |= 1;
                            this.g = kVar.f();
                            break;
                        case 24:
                            if (!(z2 & true)) {
                                this.f = new ArrayList();
                                z2 |= true;
                            }
                            this.f.add(Integer.valueOf(kVar.f()));
                            break;
                        case 26:
                            int iC = kVar.c(kVar.s());
                            if (!(z2 & true) && kVar.w() > 0) {
                                this.f = new ArrayList();
                                z2 |= true;
                            }
                            while (kVar.w() > 0) {
                                this.f.add(Integer.valueOf(kVar.f()));
                            }
                            kVar.d(iC);
                            break;
                        case 32:
                            this.e |= 2;
                            this.h = kVar.f();
                            break;
                        case 48:
                            this.e |= 4;
                            this.i = kVar.i();
                            break;
                        default:
                            if (!a(kVar, mVarA, oVar, iA)) {
                                z = true;
                            }
                            break;
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
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
        if (z2 & true) {
            this.f = Collections.unmodifiableList(this.f);
        }
        try {
            mVarA.a();
        } catch (IOException e4) {
        } finally {
        }
        R();
    }

    private i(com.google.tagmanager.a.v vVar) {
        super(vVar);
        this.k = (byte) -1;
        this.l = -1;
        this.d = vVar.r();
    }

    private i(boolean z) {
        this.k = (byte) -1;
        this.l = -1;
        this.d = com.google.tagmanager.a.h.a;
    }

    public static i a() {
        return c;
    }

    public static k a(i iVar) {
        return r().a(iVar);
    }

    public static k r() {
        return k.m();
    }

    private void u() {
        this.f = Collections.emptyList();
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
    }

    @Override // com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i p() {
        return c;
    }

    @Override // com.google.tagmanager.a.t, com.google.tagmanager.a.am
    public aq c() {
        return a;
    }

    public List d() {
        return this.f;
    }

    public int e() {
        return this.f.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return super.equals(obj);
        }
        i iVar = (i) obj;
        boolean z = (d().equals(iVar.d())) && f() == iVar.f();
        if (f()) {
            z = z && g() == iVar.g();
        }
        boolean z2 = z && h() == iVar.h();
        if (h()) {
            z2 = z2 && i() == iVar.i();
        }
        boolean z3 = z2 && k() == iVar.k();
        if (k()) {
            z3 = z3 && l() == iVar.l();
        }
        boolean z4 = z3 && m() == iVar.m();
        return m() ? z4 && q() == iVar.q() : z4;
    }

    public boolean f() {
        return (this.e & 1) == 1;
    }

    public int g() {
        return this.g;
    }

    public boolean h() {
        return (this.e & 2) == 2;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int iHashCode = i.class.hashCode() + 779;
        if (e() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + d().hashCode();
        }
        if (f()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + g();
        }
        if (h()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + i();
        }
        if (k()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + ac.a(l());
        }
        if (m()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + ac.a(q());
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
        byte b = this.k;
        if (b != -1) {
            return b == 1;
        }
        if (f()) {
            this.k = (byte) 1;
            return true;
        }
        this.k = (byte) 0;
        return false;
    }

    public boolean k() {
        return (this.e & 4) == 4;
    }

    public boolean l() {
        return this.i;
    }

    public boolean m() {
        return (this.e & 8) == 8;
    }

    public boolean q() {
        return this.j;
    }

    @Override // com.google.tagmanager.a.am
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public k o() {
        return r();
    }

    @Override // com.google.tagmanager.a.am
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public k n() {
        return a(this);
    }
}
