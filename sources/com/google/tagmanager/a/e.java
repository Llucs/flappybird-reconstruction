package com.google.tagmanager.a;

/* JADX INFO: loaded from: classes.dex */
class e extends aj {
    private final int d;
    private final int e;

    e(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            throw new IllegalArgumentException("Offset too small: " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Length too small: " + i);
        }
        if (((long) i) + ((long) i2) > bArr.length) {
            throw new IllegalArgumentException("Offset+Length too large: " + i + "+" + i2);
        }
        this.d = i;
        this.e = i2;
    }

    @Override // com.google.tagmanager.a.aj
    public byte a(int i) {
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index too small: " + i);
        }
        if (i >= a()) {
            throw new ArrayIndexOutOfBoundsException("Index too large: " + i + ", " + a());
        }
        return this.c[this.d + i];
    }

    @Override // com.google.tagmanager.a.aj, com.google.tagmanager.a.h
    public int a() {
        return this.e;
    }

    @Override // com.google.tagmanager.a.aj, com.google.tagmanager.a.h
    protected void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, b() + i, bArr, i2, i3);
    }

    @Override // com.google.tagmanager.a.aj
    protected int b() {
        return this.d;
    }

    @Override // com.google.tagmanager.a.aj, com.google.tagmanager.a.h, java.lang.Iterable
    /* JADX INFO: renamed from: c */
    public i iterator() {
        return new g(this);
    }
}
