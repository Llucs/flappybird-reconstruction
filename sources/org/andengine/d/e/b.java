package org.andengine.d.e;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    NONE,
    ERROR,
    WARNING,
    INFO,
    DEBUG,
    VERBOSE;

    public static b g = VERBOSE;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        b[] bVarArrValuesCustom = values();
        int length = bVarArrValuesCustom.length;
        b[] bVarArr = new b[length];
        System.arraycopy(bVarArrValuesCustom, 0, bVarArr, 0, length);
        return bVarArr;
    }

    public boolean a(b bVar) {
        return compareTo(bVar) >= 0;
    }
}
