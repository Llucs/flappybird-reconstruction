package org.andengine.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements org.andengine.b.b.c {
    private final org.andengine.d.a.c.a b = new org.andengine.d.a.c.a.a(new org.andengine.d.a.a.a());
    private final b a = new e(this);

    protected abstract void a(c cVar);

    @Override // org.andengine.b.b.c
    public void a_(float f) {
        org.andengine.d.a.c.a aVar = this.b;
        b bVar = this.a;
        while (true) {
            c cVar = (c) aVar.a();
            if (cVar == null) {
                return;
            }
            a(cVar);
            bVar.c(cVar);
        }
    }

    public void b(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("PoolItem already recycled!");
        }
        if (!this.a.d(cVar)) {
            throw new IllegalArgumentException("PoolItem from another pool!");
        }
        this.b.a(cVar);
    }

    protected abstract c c();

    public c d() {
        return (c) this.a.d();
    }
}
