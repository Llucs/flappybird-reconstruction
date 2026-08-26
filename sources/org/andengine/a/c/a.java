package org.andengine.a.c;

import android.media.SoundPool;

/* JADX INFO: loaded from: classes.dex */
public class a extends org.andengine.a.a {
    private int c;
    private int d;
    private boolean e;
    private int f;
    private float g;

    a(c cVar, int i) {
        super(cVar);
        this.g = 1.0f;
        this.c = i;
    }

    private SoundPool j() {
        return a().c();
    }

    public void a(boolean z) {
        this.e = z;
    }

    @Override // org.andengine.a.a
    protected void c() {
        throw new org.andengine.a.c.a.b();
    }

    @Override // org.andengine.a.a
    public void d() {
        super.d();
        float fB = b();
        this.d = j().play(this.c, this.a * fB, this.b * fB, 1, this.f, this.g);
    }

    @Override // org.andengine.a.a, org.andengine.a.c
    public void e() {
        super.e();
        if (this.d != 0) {
            j().stop(this.d);
        }
    }

    @Override // org.andengine.a.a, org.andengine.a.c
    public void f() {
        g();
        j().unload(this.c);
        this.c = 0;
        this.e = false;
        a().b(this);
        super.f();
    }

    public int h() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.andengine.a.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public c a() {
        return (c) super.a();
    }
}
