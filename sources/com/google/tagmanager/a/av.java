package com.google.tagmanager.a;

/* JADX INFO: loaded from: classes.dex */
class av implements i {
    int a;
    final /* synthetic */ ar b;
    private final au c;
    private i d;

    private av(ar arVar) {
        this.b = arVar;
        this.c = new au(arVar);
        this.d = this.c.next().iterator();
        this.a = arVar.a();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte next() {
        return Byte.valueOf(b());
    }

    @Override // com.google.tagmanager.a.i
    public byte b() {
        if (!this.d.hasNext()) {
            this.d = this.c.next().iterator();
        }
        this.a--;
        return this.d.b();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.a > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
