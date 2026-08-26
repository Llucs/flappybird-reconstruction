package org.andengine.c.c;

import org.andengine.opengl.b.g;
import org.andengine.opengl.c.f;
import org.andengine.opengl.util.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends org.andengine.c.a implements b {
    protected int c;
    protected int d;
    protected boolean e;
    protected g f;

    public d(float f, float f2, g gVar) {
        super(f, f2);
        this.c = 770;
        this.d = 771;
        this.e = false;
        this.f = gVar;
    }

    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    protected void a(org.andengine.opengl.c.a aVar) {
        a(aVar.g());
    }

    protected void a(org.andengine.opengl.c.c.b bVar) {
        a(bVar.a());
    }

    protected void a(f fVar) {
        if (fVar.n) {
            a(1, 771);
        }
    }

    @Override // org.andengine.c.b.d
    public boolean a(org.andengine.input.a.a aVar, float f, float f2) {
        return false;
    }

    @Override // org.andengine.c.a
    protected void b(e eVar, org.andengine.b.a.a aVar) {
        if (this.e) {
            eVar.a();
            eVar.a(this.c, this.d);
        }
    }

    public void b(boolean z) {
        this.e = z;
    }

    @Override // org.andengine.c.a
    protected void d(e eVar, org.andengine.b.a.a aVar) {
        if (this.e) {
            eVar.b();
        }
    }

    @Override // org.andengine.c.a, org.andengine.d.b
    public void n() {
        super.n();
        org.andengine.opengl.d.c cVarA = a();
        if (cVarA == null || !cVarA.b() || cVarA.c()) {
            return;
        }
        cVarA.n();
    }
}
