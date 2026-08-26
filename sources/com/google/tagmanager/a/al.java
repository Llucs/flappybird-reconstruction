package com.google.tagmanager.a;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
class al implements i {
    final /* synthetic */ aj a;
    private int b;
    private final int c;

    private al(aj ajVar) {
        this.a = ajVar;
        this.b = 0;
        this.c = ajVar.a();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte next() {
        return Byte.valueOf(b());
    }

    @Override // com.google.tagmanager.a.i
    public byte b() {
        try {
            byte[] bArr = this.a.c;
            int i = this.b;
            this.b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
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
