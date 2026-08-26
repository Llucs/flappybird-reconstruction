package org.andengine.opengl.c.b;

import android.graphics.Bitmap;
import org.andengine.opengl.c.c;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    RGBA_8888(Bitmap.Config.ARGB_8888, c.RGBA_8888),
    RGB_565(Bitmap.Config.RGB_565, c.RGB_565),
    RGBA_4444(Bitmap.Config.ARGB_4444, c.RGBA_4444),
    A_8(Bitmap.Config.ALPHA_8, c.A_8);

    private final Bitmap.Config e;
    private final c f;

    a(Bitmap.Config config, c cVar) {
        this.e = config;
        this.f = cVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] aVarArrValuesCustom = values();
        int length = aVarArrValuesCustom.length;
        a[] aVarArr = new a[length];
        System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
        return aVarArr;
    }

    public Bitmap.Config a() {
        return this.e;
    }

    public c b() {
        return this.f;
    }
}
