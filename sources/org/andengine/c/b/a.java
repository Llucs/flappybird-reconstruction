package org.andengine.c.b;

/* JADX INFO: loaded from: classes.dex */
public class a extends e {
    protected org.andengine.b.a.a a;

    public a() {
        this(null);
    }

    public a(org.andengine.b.a.a aVar) {
        this.a = aVar;
    }

    @Override // org.andengine.c.b.e
    public boolean a(org.andengine.input.a.a aVar) {
        if (this.a == null) {
            return false;
        }
        this.a.a(aVar);
        if (super.a(aVar)) {
            return true;
        }
        this.a.b(aVar);
        return false;
    }

    @Override // org.andengine.c.b.e
    protected boolean b(org.andengine.input.a.a aVar) {
        if (!(this.I instanceof a)) {
            return super.b(aVar);
        }
        this.a.b(aVar);
        boolean zB = super.b(aVar);
        this.a.a(aVar);
        return zB;
    }

    @Override // org.andengine.c.b.e
    protected void f(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        this.a.d(eVar);
    }
}
