package org.andengine.b.c;

/* JADX INFO: loaded from: classes.dex */
public enum h {
    BRIGHT(26),
    SCREEN_BRIGHT(10),
    SCREEN_DIM(6),
    SCREEN_ON(-1);

    private final int e;

    h(int i) {
        this.e = i;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static h[] valuesCustom() {
        h[] hVarArrValuesCustom = values();
        int length = hVarArrValuesCustom.length;
        h[] hVarArr = new h[length];
        System.arraycopy(hVarArrValuesCustom, 0, hVarArr, 0, length);
        return hVarArr;
    }

    public int a() {
        return this.e;
    }
}
