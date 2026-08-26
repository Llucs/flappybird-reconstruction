package org.andengine.c.d;

import org.andengine.c.c.c;
import org.andengine.opengl.b.g;
import org.andengine.opengl.c.c.b;
import org.andengine.opengl.d.a.d;
import org.andengine.opengl.d.e;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {
    public static final org.andengine.opengl.d.a.c g = new d(3).a(0, "a_position", 2, 5126, false).a(1, "a_color", 4, 5121, true).a(3, "a_textureCoordinates", 2, 5126, false).a();
    protected boolean I;
    public b h;
    protected final org.andengine.c.d.a.b i;
    protected boolean j;

    public a(float f, float f2, float f3, float f4, b bVar, org.andengine.c.d.a.b bVar2, g gVar) {
        super(f, f2, f3, f4, gVar);
        this.h = bVar;
        this.i = bVar2;
        b(true);
        a(bVar);
        x();
        b();
        y();
    }

    public a(float f, float f2, float f3, float f4, b bVar, e eVar, org.andengine.opengl.d.a aVar) {
        this(f, f2, f3, f4, bVar, eVar, aVar, org.andengine.opengl.b.b.a());
    }

    public a(float f, float f2, float f3, float f4, b bVar, e eVar, org.andengine.opengl.d.a aVar, g gVar) {
        this(f, f2, f3, f4, bVar, new org.andengine.c.d.a.a(eVar, 20, aVar, true, g), gVar);
    }

    public a(float f, float f2, b bVar, e eVar) {
        this(f, f2, bVar.b(), bVar.c(), bVar, eVar, org.andengine.opengl.d.a.STATIC);
    }

    protected void a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.i.a(this, f, f2, f3, f4, f5, f6, f7, f8);
    }

    public void a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.v = f;
        this.w = f2;
        this.a = f3 - f;
        this.b = f4 - f2;
        a(f9, f10, f11, f12, f13, f14, f15, f16);
        this.h.a(f5, f6, f7, f8);
        y();
    }

    @Override // org.andengine.c.a
    protected void b() {
        this.i.a(this);
    }

    public void b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.v = f;
        this.w = f2;
        this.a = f3 - f;
        this.b = f4 - f2;
        x();
        this.h.a(f5, f6, f7, f8);
        y();
    }

    @Override // org.andengine.c.c.d, org.andengine.c.a
    protected void b(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        super.b(eVar, aVar);
        t().a().d(eVar);
        this.i.a(eVar, this.f);
    }

    @Override // org.andengine.c.a
    protected void c(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        this.i.a(5, 4);
    }

    @Override // org.andengine.c.c.d, org.andengine.c.a
    protected void d(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        this.i.b(eVar, this.f);
        super.d(eVar, aVar);
    }

    public b t() {
        return this.h;
    }

    public boolean u() {
        return this.I;
    }

    public boolean v() {
        return this.j;
    }

    @Override // org.andengine.c.c.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public org.andengine.c.d.a.b a() {
        return this.i;
    }

    protected void x() {
        this.i.b(this);
    }

    protected void y() {
        this.i.c(this);
    }
}
