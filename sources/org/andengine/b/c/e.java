package org.andengine.b.c;

/* JADX INFO: loaded from: classes.dex */
public enum e {
    LANDSCAPE_FIXED,
    LANDSCAPE_SENSOR,
    PORTRAIT_FIXED,
    PORTRAIT_SENSOR;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        e[] eVarArrValuesCustom = values();
        int length = eVarArrValuesCustom.length;
        e[] eVarArr = new e[length];
        System.arraycopy(eVarArrValuesCustom, 0, eVarArr, 0, length);
        return eVarArr;
    }
}
