package org.andengine.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c {
    protected float a = 1.0f;
    protected float b = 1.0f;
    private final d c;
    private boolean d;

    public a(d dVar) {
        this.c = dVar;
    }

    protected d a() {
        g();
        return this.c;
    }

    protected float b() {
        g();
        return this.c.a();
    }

    protected abstract void c();

    public void d() {
        g();
    }

    @Override // org.andengine.a.c
    public void e() {
        g();
    }

    @Override // org.andengine.a.c
    public void f() {
        g();
        this.d = true;
    }

    protected void g() {
        if (this.d) {
            c();
        }
    }
}
