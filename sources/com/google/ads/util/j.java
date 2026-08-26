package com.google.ads.util;

/* JADX INFO: loaded from: classes.dex */
public class j {
    static final /* synthetic */ boolean a;

    static {
        a = !j.class.desiredAssertionStatus();
    }

    private j() {
    }

    public static byte[] a(String str) {
        return a(str.getBytes(), 0);
    }

    public static byte[] a(byte[] bArr, int i) {
        return a(bArr, 0, bArr.length, i);
    }

    public static byte[] a(byte[] bArr, int i, int i2, int i3) {
        l lVar = new l(i3, new byte[(i2 * 3) / 4]);
        if (!lVar.a(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        if (lVar.b == lVar.a.length) {
            return lVar.a;
        }
        byte[] bArr2 = new byte[lVar.b];
        System.arraycopy(lVar.a, 0, bArr2, 0, lVar.b);
        return bArr2;
    }
}
