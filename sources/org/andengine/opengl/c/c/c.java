package org.andengine.opengl.c.c;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    protected float b;
    protected float c;
    protected float d;
    protected float e;
    protected float f;
    protected float g;
    protected float h;
    protected float i;
    protected final float j;
    protected final boolean k;

    public c(org.andengine.opengl.c.a aVar, float f, float f2, float f3, float f4, float f5, boolean z) {
        super(aVar);
        this.b = f;
        this.c = f2;
        if (z) {
            this.k = true;
            this.d = f4;
            this.e = f3;
        } else {
            this.k = false;
            this.d = f3;
            this.e = f4;
        }
        this.j = f5;
        l();
    }

    public c(org.andengine.opengl.c.a aVar, float f, float f2, float f3, float f4, boolean z) {
        this(aVar, f, f2, f3, f4, 1.0f, z);
    }

    @Override // org.andengine.opengl.c.c.b
    public void a(float f, float f2, float f3, float f4) {
        this.f = f;
        this.h = f2;
        this.g = f3;
        this.i = f4;
    }

    @Override // org.andengine.opengl.c.c.b
    public float b() {
        return this.k ? this.e * this.j : this.d * this.j;
    }

    @Override // org.andengine.opengl.c.c.b
    public float c() {
        return this.k ? this.d * this.j : this.e * this.j;
    }

    @Override // org.andengine.opengl.c.c.b
    public float d() {
        return this.f;
    }

    @Override // org.andengine.opengl.c.c.b
    public float e() {
        return this.g;
    }

    @Override // org.andengine.opengl.c.c.b
    public float f() {
        return this.h;
    }

    @Override // org.andengine.opengl.c.c.b
    public float g() {
        return this.i;
    }

    @Override // org.andengine.opengl.c.c.b
    public boolean h() {
        return this.k;
    }

    public c i() {
        return this.k ? new c(this.a, this.b, this.c, this.e, this.d, this.j, this.k) : new c(this.a, this.b, this.c, this.d, this.e, this.j, this.k);
    }

    public float j() {
        return this.b;
    }

    public float k() {
        return this.c;
    }

    public void l() {
        org.andengine.opengl.c.a aVar = this.a;
        float fA = aVar.a();
        float fB = aVar.b();
        float fJ = j();
        float fK = k();
        this.f = fJ / fA;
        this.g = (fJ + this.d) / fA;
        this.h = fK / fB;
        this.i = (this.e + fK) / fB;
    }
}
