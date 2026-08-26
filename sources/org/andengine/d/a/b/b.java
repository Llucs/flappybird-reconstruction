package org.andengine.d.a.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends a {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.andengine.d.a.b.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c c() {
        c cVar = (c) super.c();
        cVar.b = this;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.andengine.d.a.b.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(c cVar) {
        cVar.c = false;
        cVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.andengine.d.a.b.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(c cVar) {
        cVar.a();
        cVar.c = true;
    }

    @Override // org.andengine.d.a.b.a
    public synchronized void c(c cVar) {
        if (cVar.b == null) {
            throw new IllegalArgumentException("PoolItem not assigned to a pool!");
        }
        if (!cVar.a(this)) {
            throw new IllegalArgumentException("PoolItem from another pool!");
        }
        if (cVar.b()) {
            throw new IllegalArgumentException("PoolItem already recycled!");
        }
        super.c((Object) cVar);
    }

    public synchronized boolean d(c cVar) {
        return cVar.b == this;
    }
}
