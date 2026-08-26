package org.andengine.c;

/* JADX INFO: loaded from: classes.dex */
public class a implements c {
    private static final float[] a = new float[2];
    private static final float[] b = new float[2];
    private static final org.andengine.d.c.a c = new b();
    protected float A;
    protected float B;
    protected float C;
    protected float D;
    protected float E;
    protected float F;
    protected float G;
    protected float H;
    private org.andengine.d.a.d.a I;
    private org.andengine.d.a.d.a J;
    private c d;
    private org.andengine.c.a.a e;
    private org.andengine.b.b.d f;
    private boolean g;
    private boolean h;
    private org.andengine.d.a.d.a i;
    private org.andengine.d.a.d.a j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    protected boolean q;
    protected int r;
    protected int s;
    protected org.andengine.d.a.a.b t;
    protected org.andengine.d.d.a u;
    protected float v;
    protected float w;
    protected float x;
    protected float y;
    protected float z;

    public a() {
        this(0.0f, 0.0f);
    }

    public a(float f, float f2) {
        this.l = true;
        this.o = true;
        this.r = Integer.MIN_VALUE;
        this.s = 0;
        this.u = new org.andengine.d.d.a(1.0f, 1.0f, 1.0f, 1.0f);
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.C = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.H = 0.0f;
        this.g = true;
        this.h = true;
        this.v = f;
        this.w = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    protected void a() {
        this.t = new org.andengine.d.a.a.b(4);
    }

    private void c(c cVar) {
        if (cVar.d()) {
            throw new IllegalStateException("pEntity '" + cVar.getClass().getSimpleName() + "' already has a parent: '" + cVar.e().getClass().getSimpleName() + "'. New parent: '" + getClass().getSimpleName() + "'!");
        }
    }

    protected void a(float f) {
        if (this.e != null) {
            this.e.a_(f);
        }
        if (this.f != null) {
            this.f.a_(f);
        }
        if (this.t == null || this.p) {
            return;
        }
        org.andengine.d.a.a.b bVar = this.t;
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            ((c) bVar.get(i)).a_(f);
        }
    }

    @Override // org.andengine.c.c
    public void a(StringBuilder sb) {
        sb.append(getClass().getSimpleName());
        if (this.t == null || this.t.size() <= 0) {
            return;
        }
        sb.append(" [");
        org.andengine.d.a.a.b bVar = this.t;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= bVar.size()) {
                sb.append("]");
                return;
            }
            ((c) bVar.get(i2)).a(sb);
            if (i2 < bVar.size() - 1) {
                sb.append(", ");
            }
            i = i2 + 1;
        }
    }

    @Override // org.andengine.c.c
    public void a(c cVar) {
        this.d = cVar;
    }

    protected void a(org.andengine.opengl.util.e eVar) {
        b(eVar);
        c(eVar);
        d(eVar);
        e(eVar);
    }

    @Override // org.andengine.b.b.b
    public final void a(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        if (this.l) {
            if (this.m && a(aVar)) {
                return;
            }
            e(eVar, aVar);
        }
    }

    public void a(boolean z) {
        this.l = z;
    }

    public boolean a(org.andengine.b.a.a aVar) {
        return false;
    }

    public float[] a(float f, float f2, float[] fArr) {
        org.andengine.d.a.d.a aVarK = k();
        fArr[0] = f;
        fArr[1] = f2;
        aVarK.a(fArr);
        return fArr;
    }

    @Override // org.andengine.b.b.c
    public final void a_(float f) {
        if (this.n) {
            return;
        }
        a(f);
    }

    public float[] a_(float f, float f2) {
        return a(f, f2, b);
    }

    protected void b() {
    }

    public void b(float f) {
        if (this.u.a(f)) {
            b();
        }
    }

    public void b(c cVar) {
        c(cVar);
        if (this.t == null) {
            a();
        }
        this.t.add(cVar);
        cVar.a(this);
        cVar.m();
    }

    protected void b(org.andengine.opengl.util.e eVar) {
        eVar.a(this.v, this.w, 0.0f);
    }

    protected void b(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
    }

    public float[] b(float f, float f2) {
        return b(f, f2, a);
    }

    public float[] b(float f, float f2, float[] fArr) {
        fArr[0] = f;
        fArr[1] = f2;
        l().a(fArr);
        return fArr;
    }

    protected void c(org.andengine.opengl.util.e eVar) {
        float f = this.x;
        if (f != 0.0f) {
            float f2 = this.y;
            float f3 = this.z;
            eVar.a(f2, f3, 0.0f);
            eVar.a(f, 0.0f, 0.0f, 1.0f);
            eVar.a(-f2, -f3, 0.0f);
        }
    }

    protected void c(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
    }

    @Override // org.andengine.d.b
    public boolean c() {
        return this.k;
    }

    protected void d(org.andengine.opengl.util.e eVar) {
        float f = this.E;
        float f2 = this.F;
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        float f3 = this.G;
        float f4 = this.H;
        eVar.a(f3, f4, 0.0f);
        eVar.a(f, f2);
        eVar.a(-f3, -f4, 0.0f);
    }

    protected void d(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
    }

    @Override // org.andengine.c.c
    public boolean d() {
        return this.d != null;
    }

    @Override // org.andengine.c.c
    public c e() {
        return this.d;
    }

    protected void e(org.andengine.opengl.util.e eVar) {
        float f = this.A;
        float f2 = this.B;
        if (f == 1.0f && f2 == 1.0f) {
            return;
        }
        float f3 = this.C;
        float f4 = this.D;
        eVar.a(f3, f4, 0.0f);
        eVar.a(f, f2, 1);
        eVar.a(-f3, -f4, 0.0f);
    }

    protected void e(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        int i = 0;
        eVar.j();
        a(eVar);
        org.andengine.d.a.a.b bVar = this.t;
        if (bVar == null || !this.o) {
            b(eVar, aVar);
            c(eVar, aVar);
            d(eVar, aVar);
        } else {
            if (this.q) {
                d.a().a(this.t);
                this.q = false;
            }
            int size = bVar.size();
            while (i < size) {
                c cVar = (c) bVar.get(i);
                if (cVar.f() >= 0) {
                    break;
                }
                cVar.a(eVar, aVar);
                i++;
            }
            b(eVar, aVar);
            c(eVar, aVar);
            d(eVar, aVar);
            while (i < size) {
                ((c) bVar.get(i)).a(eVar, aVar);
                i++;
            }
        }
        eVar.k();
    }

    @Override // org.andengine.c.c
    public int f() {
        return this.s;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.k) {
            return;
        }
        n();
    }

    public org.andengine.d.d.a g() {
        return this.u;
    }

    @Override // org.andengine.c.c
    public float[] h() {
        return a_(0.0f, 0.0f);
    }

    public org.andengine.d.a.d.a i() {
        if (this.i == null) {
            this.i = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a aVar = this.i;
        if (this.g) {
            aVar.a();
            float f = this.A;
            float f2 = this.B;
            if (f != 1.0f || f2 != 1.0f) {
                float f3 = this.C;
                float f4 = this.D;
                aVar.a(-f3, -f4);
                aVar.b(f, f2);
                aVar.a(f3, f4);
            }
            float f5 = this.E;
            float f6 = this.F;
            if (f5 != 0.0f || f6 != 0.0f) {
                float f7 = this.G;
                float f8 = this.H;
                aVar.a(-f7, -f8);
                aVar.c(f5, f6);
                aVar.a(f7, f8);
            }
            float f9 = this.x;
            if (f9 != 0.0f) {
                float f10 = this.y;
                float f11 = this.z;
                aVar.a(-f10, -f11);
                aVar.a(f9);
                aVar.a(f10, f11);
            }
            aVar.a(this.v, this.w);
            this.g = false;
        }
        return aVar;
    }

    public org.andengine.d.a.d.a j() {
        if (this.j == null) {
            this.j = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a aVar = this.j;
        if (this.h) {
            aVar.a();
            aVar.a(-this.v, -this.w);
            float f = this.x;
            if (f != 0.0f) {
                float f2 = this.y;
                float f3 = this.z;
                aVar.a(-f2, -f3);
                aVar.a(-f);
                aVar.a(f2, f3);
            }
            float f4 = this.E;
            float f5 = this.F;
            if (f4 != 0.0f || f5 != 0.0f) {
                float f6 = this.G;
                float f7 = this.H;
                aVar.a(-f6, -f7);
                aVar.c(-f4, -f5);
                aVar.a(f6, f7);
            }
            float f8 = this.A;
            float f9 = this.B;
            if (f8 != 1.0f || f9 != 1.0f) {
                float f10 = this.C;
                float f11 = this.D;
                aVar.a(-f10, -f11);
                aVar.b(1.0f / f8, 1.0f / f9);
                aVar.a(f10, f11);
            }
            this.h = false;
        }
        return aVar;
    }

    @Override // org.andengine.c.c
    public org.andengine.d.a.d.a k() {
        if (this.I == null) {
            this.I = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a aVar = this.I;
        aVar.a(i());
        c cVar = this.d;
        if (cVar != null) {
            aVar.b(cVar.k());
        }
        return aVar;
    }

    @Override // org.andengine.c.c
    public org.andengine.d.a.d.a l() {
        if (this.J == null) {
            this.J = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a aVar = this.J;
        aVar.a(j());
        c cVar = this.d;
        if (cVar != null) {
            aVar.c(cVar.l());
        }
        return aVar;
    }

    @Override // org.andengine.c.c
    public void m() {
    }

    @Override // org.andengine.d.b
    public void n() {
        if (this.k) {
            throw new org.andengine.d.c();
        }
        this.k = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }
}
