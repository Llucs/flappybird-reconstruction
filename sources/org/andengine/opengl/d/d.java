package org.andengine.opengl.d;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.andengine.opengl.b.g;
import org.andengine.opengl.util.BufferUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements c {
    protected final int c;
    protected final boolean d;
    protected final int e;
    protected final ByteBuffer f;
    protected int g = -1;
    protected boolean h = true;
    protected boolean i;
    protected final e j;
    protected final org.andengine.opengl.d.a.c k;

    public d(e eVar, int i, a aVar, boolean z, org.andengine.opengl.d.a.c cVar) {
        this.j = eVar;
        this.c = i;
        this.e = aVar.a();
        this.d = z;
        this.k = cVar;
        this.f = BufferUtils.a(i * 4);
        this.f.order(ByteOrder.nativeOrder());
    }

    private void c(org.andengine.opengl.util.e eVar) {
        this.g = eVar.h();
        this.h = true;
    }

    protected abstract void a();

    @Override // org.andengine.opengl.d.c
    public void a(int i, int i2) {
        GLES20.glDrawArrays(i, 0, i2);
    }

    @Override // org.andengine.opengl.d.c
    public void a(org.andengine.opengl.util.e eVar) {
        eVar.b(this.g);
        this.g = -1;
    }

    @Override // org.andengine.opengl.d.c
    public void a(org.andengine.opengl.util.e eVar, g gVar) {
        b(eVar);
        gVar.a(eVar, this.k);
    }

    public void b(org.andengine.opengl.util.e eVar) {
        if (this.g == -1) {
            c(eVar);
            if (this.j != null) {
                this.j.a(this);
            }
        }
        eVar.a(this.g);
        if (this.h) {
            a();
            this.h = false;
        }
    }

    @Override // org.andengine.opengl.d.c
    public void b(org.andengine.opengl.util.e eVar, g gVar) {
        gVar.b(eVar);
    }

    @Override // org.andengine.opengl.d.c
    public boolean b() {
        return this.d;
    }

    @Override // org.andengine.d.b
    public boolean c() {
        return this.i;
    }

    @Override // org.andengine.opengl.d.c
    public boolean d() {
        return this.g != -1;
    }

    @Override // org.andengine.opengl.d.c
    public void e() {
        this.g = -1;
        this.h = true;
    }

    public void f() {
        this.h = true;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.i) {
            return;
        }
        n();
    }

    @Override // org.andengine.d.b
    public void n() {
        if (this.i) {
            throw new org.andengine.d.c();
        }
        this.i = true;
        if (this.j != null) {
            this.j.b(this);
        }
        BufferUtils.a(this.f);
    }
}
