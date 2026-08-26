package com.google.tagmanager.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class x extends t implements y {
    private final q a;

    protected x() {
        this.a = q.a();
    }

    protected x(w wVar) {
        this.a = wVar.b();
    }

    protected boolean I() {
        return this.a.e();
    }

    @Override // com.google.tagmanager.a.t
    protected void R() {
        this.a.c();
    }

    @Override // com.google.tagmanager.a.t
    protected boolean a(k kVar, m mVar, o oVar, int i) {
        return t.b(this.a, p(), kVar, mVar, oVar, i);
    }
}
