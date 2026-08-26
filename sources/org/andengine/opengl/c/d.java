package org.andengine.opengl.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements a {
    protected final e a;
    protected final c b;
    protected final f c;
    protected int d = -1;
    protected boolean e = false;
    protected b f;

    public d(e eVar, c cVar, f fVar, b bVar) {
        this.a = eVar;
        this.b = cVar;
        this.c = fVar;
        this.f = bVar;
    }

    @Override // org.andengine.opengl.c.a
    public void a(org.andengine.opengl.util.e eVar) {
        this.d = eVar.i();
        eVar.d(this.d);
        e(eVar);
        this.c.a();
        this.e = false;
        if (this.f != null) {
            this.f.a(this);
        }
    }

    @Override // org.andengine.opengl.c.a
    public void b(org.andengine.opengl.util.e eVar) {
        eVar.e(this.d);
        this.d = -1;
        if (this.f != null) {
            this.f.b(this);
        }
    }

    @Override // org.andengine.opengl.c.a
    public void c(org.andengine.opengl.util.e eVar) {
        b(eVar);
        a(eVar);
    }

    @Override // org.andengine.opengl.c.a
    public boolean c() {
        return this.d != -1;
    }

    @Override // org.andengine.opengl.c.a
    public void d() {
        this.d = -1;
    }

    @Override // org.andengine.opengl.c.a
    public void d(org.andengine.opengl.util.e eVar) {
        eVar.d(this.d);
    }

    protected abstract void e(org.andengine.opengl.util.e eVar);

    @Override // org.andengine.opengl.c.a
    public boolean e() {
        return this.e;
    }

    @Override // org.andengine.opengl.c.a
    public c f() {
        return this.b;
    }

    @Override // org.andengine.opengl.c.a
    public f g() {
        return this.c;
    }

    public b h() {
        return this.f;
    }

    public void i() {
        this.a.a(this);
    }
}
