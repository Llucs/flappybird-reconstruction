package com.google.tagmanager.a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class bi implements Iterator {
    Iterator a;
    final /* synthetic */ bg b;

    bi(bg bgVar) {
        this.b = bgVar;
        this.a = this.b.a.iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        return (String) this.a.next();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
