package org.andengine.b.a;

import org.andengine.b.b.c;
import org.andengine.b.b.d;
import org.andengine.opengl.util.e;

/* JADX INFO: loaded from: classes.dex */
public class a implements c {
    static final float[] a = new float[2];
    protected float b;
    protected float c;
    protected float d;
    protected float e;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected boolean l;
    protected d m;
    private org.andengine.b.a.a.a p;
    private org.andengine.c.c q;
    private float n = -1.0f;
    private float o = 1.0f;
    protected float f = 0.0f;
    protected float g = 0.0f;

    public a(float f, float f2, float f3, float f4) {
        a(f, f2, f + f3, f2 + f4);
    }

    private void a(org.andengine.input.a.a aVar, float f, float f2) {
        float fA = a();
        float fB = b();
        float fC = c();
        aVar.a(fA + ((fB - fA) * f), ((d() - fC) * f2) + fC);
    }

    private static void a(e eVar, float f, float f2, float f3) {
        eVar.b(f, f2, 0.0f);
        eVar.b(f3, 0.0f, 0.0f, 1.0f);
        eVar.b(-f, -f2, 0.0f);
    }

    private void e(org.andengine.input.a.a aVar) {
        float f = this.f;
        if (f != 0.0f) {
            a[0] = aVar.b();
            a[1] = aVar.c();
            org.andengine.d.g.a.a(a, -f, g(), h());
            aVar.a(a[0], a[1]);
        }
    }

    private void f(org.andengine.input.a.a aVar) {
        float f = this.f;
        if (f != 0.0f) {
            a[0] = aVar.b();
            a[1] = aVar.c();
            org.andengine.d.g.a.b(a, f, g(), h());
            aVar.a(a[0], a[1]);
        }
    }

    private void g(org.andengine.input.a.a aVar) {
        float f = -this.g;
        if (f != 0.0f) {
            a[0] = aVar.b();
            a[1] = aVar.c();
            org.andengine.d.g.a.a(a, f, (this.c - this.b) * 0.5f, (this.e - this.d) * 0.5f);
            aVar.a(a[0], a[1]);
        }
    }

    private void h(org.andengine.input.a.a aVar) {
        float f = -this.g;
        if (f != 0.0f) {
            a[0] = aVar.b();
            a[1] = aVar.c();
            org.andengine.d.g.a.b(a, f, (this.c - this.b) * 0.5f, (this.e - this.d) * 0.5f);
            aVar.a(a[0], a[1]);
        }
    }

    public float a() {
        return this.b;
    }

    public void a(float f, float f2) {
        float fG = f - g();
        float fH = f2 - h();
        this.b += fG;
        this.c = fG + this.c;
        this.d += fH;
        this.e += fH;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f3;
        this.d = f2;
        this.e = f4;
    }

    public void a(int i, int i2, int i3, int i4) {
        if (this.k == 0 && this.j == 0) {
            b(i, i2, i3, i4);
        } else {
            if (this.j == i3 && this.k == i4) {
                return;
            }
            a(this.h, this.i, this.j, this.k, i, i2, i3, i4);
        }
    }

    protected void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.l) {
            float fG = g();
            float fH = h();
            float fE = (i7 / i3) * e() * 0.5f;
            float f = (i8 / i4) * f() * 0.5f;
            a(fG - fE, fH - f, fE + fG, f + fH);
        }
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.k = i8;
    }

    public void a(org.andengine.input.a.a aVar) {
        f(aVar);
        c(aVar);
        g(aVar);
    }

    public void a(org.andengine.input.a.a aVar, int i, int i2) {
        float f;
        float f2;
        float fB = aVar.b();
        float fC = aVar.c();
        float f3 = this.f;
        if (f3 == 0.0f) {
            f = fB / i;
            f2 = fC / i2;
        } else if (f3 == 180.0f) {
            f = 1.0f - (fB / i);
            f2 = 1.0f - (fC / i2);
        } else {
            a[0] = fB;
            a[1] = fC;
            org.andengine.d.g.a.a(a, f3, i >> 1, i2 >> 1);
            f = a[0] / i;
            f2 = a[1] / i2;
        }
        a(aVar, f, f2);
    }

    public void a(e eVar) {
        if (this.p != null) {
            this.p.a(eVar, this);
        }
    }

    @Override // org.andengine.b.b.c
    public void a_(float f) {
        if (this.m != null) {
            this.m.a_(f);
        }
        if (this.p != null) {
            this.p.a_(f);
        }
        l();
    }

    public float b() {
        return this.c;
    }

    protected void b(int i, int i2, int i3, int i4) {
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    public void b(org.andengine.input.a.a aVar) {
        h(aVar);
        d(aVar);
        e(aVar);
    }

    public void b(e eVar) {
        eVar.a(a(), b(), d(), c(), this.n, this.o);
        float f = this.f;
        if (f != 0.0f) {
            a(eVar, g(), h(), f);
        }
    }

    public float c() {
        return this.d;
    }

    protected void c(org.andengine.input.a.a aVar) {
        aVar.b(-this.b, -this.d);
    }

    public void c(e eVar) {
        float fE = e();
        float f = f();
        eVar.a(0.0f, fE, f, 0.0f, this.n, this.o);
        float f2 = this.f;
        if (f2 != 0.0f) {
            a(eVar, fE * 0.5f, f * 0.5f, f2);
        }
    }

    public float d() {
        return this.e;
    }

    protected void d(org.andengine.input.a.a aVar) {
        aVar.b(this.b, this.d);
    }

    public void d(e eVar) {
        float fE = e();
        float f = f();
        eVar.a(0.0f, fE, f, 0.0f, this.n, this.o);
        float f2 = this.g;
        if (f2 != 0.0f) {
            a(eVar, fE * 0.5f, f * 0.5f, f2);
        }
    }

    public float e() {
        return this.c - this.b;
    }

    public float f() {
        return this.e - this.d;
    }

    public float g() {
        return (this.b + this.c) * 0.5f;
    }

    public float h() {
        return (this.d + this.e) * 0.5f;
    }

    public org.andengine.b.a.a.a i() {
        return this.p;
    }

    public boolean j() {
        return this.p != null;
    }

    public float k() {
        return this.f;
    }

    public void l() {
        if (this.q != null) {
            float[] fArrH = this.q.h();
            a(fArrH[0], fArrH[1]);
        }
    }
}
