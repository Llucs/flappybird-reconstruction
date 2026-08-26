package com.google.tagmanager.a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
class aj extends h {
    protected final byte[] c;
    private int d = 0;

    aj(byte[] bArr) {
        this.c = bArr;
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public byte a(int i) {
        return this.c[i];
    }

    @Override // com.google.tagmanager.a.h
    public int a() {
        return this.c.length;
    }

    @Override // com.google.tagmanager.a.h
    protected int a(int i, int i2, int i3) {
        int iB = b() + i2;
        return bj.a(i, this.c, iB, iB + i3);
    }

    @Override // com.google.tagmanager.a.h
    public String a(String str) {
        return new String(this.c, b(), a(), str);
    }

    @Override // com.google.tagmanager.a.h
    protected void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, i, bArr, i2, i3);
    }

    boolean a(aj ajVar, int i, int i2) {
        if (i2 > ajVar.a()) {
            throw new IllegalArgumentException("Length too large: " + i2 + a());
        }
        if (i + i2 > ajVar.a()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + ajVar.a());
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ajVar.c;
        int iB = b() + i2;
        int iB2 = b();
        int iB3 = ajVar.b() + i;
        while (iB2 < iB) {
            if (bArr[iB2] != bArr2[iB3]) {
                return false;
            }
            iB2++;
            iB3++;
        }
        return true;
    }

    protected int b() {
        return 0;
    }

    @Override // com.google.tagmanager.a.h
    protected int b(int i, int i2, int i3) {
        return a(i, this.c, b() + i2, i3);
    }

    @Override // com.google.tagmanager.a.h
    void b(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.c, b() + i, i2);
    }

    @Override // com.google.tagmanager.a.h, java.lang.Iterable
    /* JADX INFO: renamed from: c */
    public i iterator() {
        return new al(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof h) && a() == ((h) obj).a()) {
            if (a() == 0) {
                return true;
            }
            if (obj instanceof aj) {
                return a((aj) obj, 0, a());
            }
            if (obj instanceof ar) {
                return obj.equals(this);
            }
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + obj.getClass());
        }
        return false;
    }

    @Override // com.google.tagmanager.a.h
    public boolean g() {
        int iB = b();
        return bj.a(this.c, iB, a() + iB);
    }

    @Override // com.google.tagmanager.a.h
    public k h() {
        return k.a(this);
    }

    @Override // com.google.tagmanager.a.h
    public int hashCode() {
        int iB = this.d;
        if (iB == 0) {
            int iA = a();
            iB = b(iA, 0, iA);
            if (iB == 0) {
                iB = 1;
            }
            this.d = iB;
        }
        return iB;
    }

    @Override // com.google.tagmanager.a.h
    protected int j() {
        return 0;
    }

    @Override // com.google.tagmanager.a.h
    protected boolean k() {
        return true;
    }

    @Override // com.google.tagmanager.a.h
    protected int l() {
        return this.d;
    }
}
