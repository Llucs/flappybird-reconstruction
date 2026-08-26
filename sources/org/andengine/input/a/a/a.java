package org.andengine.input.a.a;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {
    private e a;
    private final org.andengine.d.a.b.g b = new b(this);

    protected void a(float f, float f2, int i, int i2, MotionEvent motionEvent) {
        org.andengine.input.a.a aVarA = org.andengine.input.a.a.a(f, f2, i, i2, MotionEvent.obtain(motionEvent));
        c cVar = (c) this.b.d();
        cVar.a(aVarA);
        this.b.b(cVar);
    }

    @Override // org.andengine.input.a.a.d
    public void a(e eVar) {
        this.a = eVar;
    }

    @Override // org.andengine.b.b.c
    public void a_(float f) {
        this.b.a_(f);
    }
}
