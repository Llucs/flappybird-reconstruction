package com.google.tagmanager.a;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
class g implements i {
    final /* synthetic */ e a;
    private int b;
    private final int c;

    private g(e eVar) {
        this.a = eVar;
        this.b = eVar.b();
        this.c = this.b + eVar.a();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte next() {
        return Byte.valueOf(b());
    }

    @Override // com.google.tagmanager.a.i
    public byte b() {
        if (this.b >= this.c) {
            throw new NoSuchElementException();
        }
        byte[] bArr = this.a.c;
        int i = this.b;
        this.b = i + 1;
        return bArr[i];
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b < this.c;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
