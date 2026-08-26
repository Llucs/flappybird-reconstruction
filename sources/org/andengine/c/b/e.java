package org.andengine.c.b;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class e extends org.andengine.c.a {
    protected e I;
    private float a;
    private boolean b;
    private boolean c;
    private boolean d;
    private c f;
    private b g;
    protected org.andengine.d.a.a.b J = new org.andengine.d.a.a.b(4);
    private final org.andengine.b.b.a.a e = new org.andengine.b.b.a.a();
    private org.andengine.c.b.a.b h = new org.andengine.c.b.a.a(org.andengine.d.d.a.b);
    private boolean i = true;
    private boolean j = true;
    private boolean K = false;
    private boolean L = false;
    private final SparseArray M = new SparseArray();
    private boolean N = false;
    private final SparseArray O = new SparseArray();

    private Boolean a(org.andengine.input.a.a aVar, float f, float f2, d dVar) {
        float[] fArrB = dVar.b(f, f2);
        float f3 = fArrB[0];
        float f4 = fArrB[1];
        if (dVar.a(aVar, f3, f4)) {
            return Boolean.TRUE;
        }
        if (this.g != null) {
            return Boolean.valueOf(this.g.a(aVar, dVar, f3, f4));
        }
        return null;
    }

    @Override // org.andengine.c.a
    protected void a(float f) {
        this.a += f;
        this.e.a_(f);
        e eVar = this.I;
        if (eVar == null || !this.c) {
            this.h.a_(f);
            super.a(f);
        }
        if (eVar != null) {
            eVar.a_(f);
        }
    }

    public void a(c cVar) {
        this.f = cVar;
    }

    @Override // org.andengine.c.a, org.andengine.c.c
    public void a(org.andengine.c.c cVar) {
    }

    public boolean a(org.andengine.input.a.a aVar) {
        int size;
        Boolean boolA;
        Boolean boolA2;
        int iE = aVar.e();
        boolean zF = aVar.f();
        boolean zH = aVar.h();
        if (!zF) {
            if (this.N && ((c) this.O.get(aVar.d())) != null) {
                switch (iE) {
                    case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                        this.O.remove(aVar.d());
                        break;
                }
                Boolean boolValueOf = Boolean.valueOf(this.f.a(this, aVar));
                if (boolValueOf != null && boolValueOf.booleanValue()) {
                    return true;
                }
            }
            if (this.K) {
                SparseArray sparseArray = this.M;
                d dVar = (d) sparseArray.get(aVar.d());
                if (dVar != null) {
                    float fB = aVar.b();
                    float fC = aVar.c();
                    switch (iE) {
                        case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                        case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                            sparseArray.remove(aVar.d());
                            break;
                    }
                    Boolean boolA3 = a(aVar, fB, fC, dVar);
                    if (boolA3 != null && boolA3.booleanValue()) {
                        return true;
                    }
                }
            }
        }
        if (this.I != null) {
            if (b(aVar)) {
                return true;
            }
            if (this.d) {
                return false;
            }
        }
        float fB2 = aVar.b();
        float fC2 = aVar.c();
        org.andengine.d.a.a.b bVar = this.J;
        if (bVar != null && (size = bVar.size()) > 0) {
            if (this.j) {
                for (int i = 0; i < size; i++) {
                    d dVar2 = (d) bVar.get(i);
                    if (dVar2.a(fB2, fC2) && (boolA2 = a(aVar, fB2, fC2, dVar2)) != null && boolA2.booleanValue()) {
                        if ((this.K && zF) || (this.L && zH)) {
                            this.M.put(aVar.d(), dVar2);
                        }
                        return true;
                    }
                }
            } else {
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    d dVar3 = (d) bVar.get(i2);
                    if (dVar3.a(fB2, fC2) && (boolA = a(aVar, fB2, fC2, dVar3)) != null && boolA.booleanValue()) {
                        if ((this.K && zF) || (this.L && zH)) {
                            this.M.put(aVar.d(), dVar3);
                        }
                        return true;
                    }
                }
            }
        }
        if (this.f == null) {
            return false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(this.f.a(this, aVar));
        if (boolValueOf2 == null || !boolValueOf2.booleanValue()) {
            return false;
        }
        if (this.N && zF) {
            this.O.put(aVar.d(), this.f);
        }
        return true;
    }

    protected boolean b(org.andengine.input.a.a aVar) {
        return this.I.a(aVar);
    }

    @Override // org.andengine.c.a
    protected void e(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        e eVar2 = this.I;
        if (eVar2 == null || !this.b) {
            if (this.i) {
                eVar.m();
                aVar.c(eVar);
                eVar.l();
                this.h.a(eVar, aVar);
                eVar.n();
            }
            eVar.m();
            f(eVar, aVar);
            eVar.l();
            super.e(eVar, aVar);
            eVar.n();
        }
        if (eVar2 != null) {
            eVar2.a(eVar, aVar);
        }
    }

    protected void f(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        aVar.b(eVar);
    }
}
