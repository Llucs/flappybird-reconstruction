package org.andengine.opengl.c;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    UNDEFINED(-1, -1, -1, -1),
    RGBA_4444(6408, 6408, 32819, 16),
    RGBA_5551(6407, 6408, 32820, 16),
    RGBA_8888(6408, 6408, 5121, 32),
    RGB_565(6407, 6407, 33635, 16),
    A_8(6406, 6406, 5121, 8),
    I_8(6409, 6409, 5121, 8),
    AI_88(6410, 6410, 5121, 16);

    private final int i;
    private final int j;
    private final int k;
    private final int l;

    c(int i, int i2, int i3, int i4) {
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        c[] cVarArrValuesCustom = values();
        int length = cVarArrValuesCustom.length;
        c[] cVarArr = new c[length];
        System.arraycopy(cVarArrValuesCustom, 0, cVarArr, 0, length);
        return cVarArr;
    }

    public int a() {
        return this.i;
    }

    public int b() {
        return this.j;
    }

    public int c() {
        return this.k;
    }
}
