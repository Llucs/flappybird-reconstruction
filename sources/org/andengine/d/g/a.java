package org.andengine.d.g;

import android.util.FloatMath;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final Random a = new Random(System.nanoTime());

    public static final float a(float f) {
        return 0.017453292f * f;
    }

    public static final boolean a(int i) {
        return i != 0 && ((i + (-1)) & i) == 0;
    }

    public static float[] a(float[] fArr, float f, float f2, float f3) {
        if (f != 0.0f) {
            float fA = a(f);
            float fSin = FloatMath.sin(fA);
            float fCos = FloatMath.cos(fA);
            for (int length = fArr.length - 2; length >= 0; length -= 2) {
                float f4 = fArr[length];
                float f5 = fArr[length + 1];
                fArr[length] = (((f4 - f2) * fCos) - ((f5 - f3) * fSin)) + f2;
                fArr[length + 1] = ((f4 - f2) * fSin) + ((f5 - f3) * fCos) + f3;
            }
        }
        return fArr;
    }

    public static float[] b(float[] fArr, float f, float f2, float f3) {
        return a(fArr, -f, f2, f3);
    }
}
