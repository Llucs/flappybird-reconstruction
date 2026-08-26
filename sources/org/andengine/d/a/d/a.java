package org.andengine.d.a.d;

import android.util.FloatMath;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private float a = 1.0f;
    private float b = 0.0f;
    private float c = 0.0f;
    private float d = 1.0f;
    private float e = 0.0f;
    private float f = 0.0f;

    private void a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = this.a;
        float f8 = this.b;
        float f9 = this.c;
        float f10 = this.d;
        float f11 = this.e;
        float f12 = this.f;
        this.a = (f7 * f) + (f8 * f3);
        this.b = (f7 * f2) + (f8 * f4);
        this.c = (f9 * f) + (f10 * f3);
        this.d = (f9 * f2) + (f10 * f4);
        this.e = (f11 * f) + (f12 * f3) + f5;
        this.f = (f11 * f2) + (f12 * f4) + f6;
    }

    private void b(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = this.a;
        float f8 = this.b;
        float f9 = this.c;
        float f10 = this.d;
        float f11 = this.e;
        float f12 = this.f;
        this.a = (f * f7) + (f2 * f9);
        this.b = (f * f8) + (f2 * f10);
        this.c = (f3 * f7) + (f4 * f9);
        this.d = (f3 * f8) + (f4 * f10);
        this.e = (f7 * f5) + (f9 * f6) + f11;
        this.f = (f5 * f8) + (f6 * f10) + f12;
    }

    public final void a() {
        this.a = 1.0f;
        this.d = 1.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
    }

    public final void a(float f) {
        float f2 = 0.017453292f * f;
        float fSin = FloatMath.sin(f2);
        float fCos = FloatMath.cos(f2);
        float f3 = this.a;
        float f4 = this.b;
        float f5 = this.c;
        float f6 = this.d;
        float f7 = this.e;
        float f8 = this.f;
        this.a = (f3 * fCos) - (f4 * fSin);
        this.b = (f3 * fSin) + (f4 * fCos);
        this.c = (f5 * fCos) - (f6 * fSin);
        this.d = (f5 * fSin) + (f6 * fCos);
        this.e = (f7 * fCos) - (f8 * fSin);
        this.f = (fCos * f8) + (fSin * f7);
    }

    public final void a(float f, float f2) {
        this.e += f;
        this.f += f2;
    }

    public final void a(a aVar) {
        this.a = aVar.a;
        this.d = aVar.d;
        this.b = aVar.b;
        this.c = aVar.c;
        this.e = aVar.e;
        this.f = aVar.f;
    }

    public final void a(float[] fArr) {
        int i = 0;
        int length = fArr.length >> 1;
        int i2 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            int i3 = i2 + 1;
            float f = fArr[i2];
            i2 = i3 + 1;
            float f2 = fArr[i3];
            int i4 = i + 1;
            fArr[i] = (this.a * f) + (this.c * f2) + this.e;
            i = i4 + 1;
            fArr[i4] = (f2 * this.d) + (f * this.b) + this.f;
        }
    }

    public final void b(float f, float f2) {
        this.a *= f;
        this.b *= f2;
        this.c *= f;
        this.d *= f2;
        this.e *= f;
        this.f *= f2;
    }

    public final void b(a aVar) {
        a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f);
    }

    public final void c(float f, float f2) {
        float fTan = (float) Math.tan((-0.017453292f) * f);
        float fTan2 = (float) Math.tan((-0.017453292f) * f2);
        float f3 = this.a;
        float f4 = this.b;
        float f5 = this.c;
        float f6 = this.d;
        float f7 = this.e;
        float f8 = this.f;
        this.a = (f4 * fTan) + f3;
        this.b = (f3 * fTan2) + f4;
        this.c = (f6 * fTan) + f5;
        this.d = (f5 * fTan2) + f6;
        this.e = (fTan * f8) + f7;
        this.f = (f7 * fTan2) + f8;
    }

    public final void c(a aVar) {
        b(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f);
    }

    public String toString() {
        return "Transformation{[" + this.a + ", " + this.c + ", " + this.e + "][" + this.b + ", " + this.d + ", " + this.f + "][0.0, 0.0, 1.0]}";
    }
}
