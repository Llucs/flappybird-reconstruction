package org.andengine.input.sensor.location;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    AVAILABLE,
    OUT_OF_SERVICE,
    TEMPORARILY_UNAVAILABLE;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        b[] bVarArrValuesCustom = values();
        int length = bVarArrValuesCustom.length;
        b[] bVarArr = new b[length];
        System.arraycopy(bVarArrValuesCustom, 0, bVarArr, 0, length);
        return bVarArr;
    }
}
