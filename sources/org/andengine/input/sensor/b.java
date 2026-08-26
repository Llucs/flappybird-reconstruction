package org.andengine.input.sensor;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    NORMAL(3),
    UI(2),
    GAME(1),
    FASTEST(0);

    private final int e;

    b(int i) {
        this.e = i;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        b[] bVarArrValuesCustom = values();
        int length = bVarArrValuesCustom.length;
        b[] bVarArr = new b[length];
        System.arraycopy(bVarArrValuesCustom, 0, bVarArr, 0, length);
        return bVarArr;
    }
}
