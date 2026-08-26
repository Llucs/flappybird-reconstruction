package org.andengine.input.a.a;

/* JADX INFO: loaded from: classes.dex */
class c extends org.andengine.d.a.b.f {
    final /* synthetic */ a a;
    private org.andengine.input.a.a d;

    c(a aVar) {
        this.a = aVar;
    }

    @Override // org.andengine.d.a.b.c
    protected void a() {
        super.a();
        org.andengine.input.a.a aVar = this.d;
        aVar.k().recycle();
        aVar.a();
    }

    public void a(org.andengine.input.a.a aVar) {
        this.d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.a.a(this.d);
    }
}
