package org.andengine.opengl.d;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    STATIC(35044),
    DYNAMIC(35048),
    STREAM(35040);

    private final int d;

    a(int i) {
        this.d = i;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] aVarArrValuesCustom = values();
        int length = aVarArrValuesCustom.length;
        a[] aVarArr = new a[length];
        System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
        return aVarArr;
    }

    public int a() {
        return this.d;
    }
}
