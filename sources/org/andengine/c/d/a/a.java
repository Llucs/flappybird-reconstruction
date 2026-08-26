package org.andengine.c.d.a;

import org.andengine.opengl.d.a.c;
import org.andengine.opengl.d.e;

/* JADX INFO: loaded from: classes.dex */
public class a extends org.andengine.opengl.d.b implements b {
    public a(e eVar, int i, org.andengine.opengl.d.a aVar, boolean z, c cVar) {
        super(eVar, i, aVar, z, cVar);
    }

    @Override // org.andengine.c.d.a.b
    public void a(org.andengine.c.d.a aVar) {
        float[] fArr = this.a;
        float f = aVar.g().f();
        fArr[2] = f;
        fArr[7] = f;
        fArr[12] = f;
        fArr[17] = f;
        f();
    }

    @Override // org.andengine.c.d.a.b
    public void a(org.andengine.c.d.a aVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float[] fArr = this.a;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[10] = f5;
        fArr[11] = f6;
        fArr[15] = f7;
        fArr[16] = f8;
        f();
    }

    @Override // org.andengine.c.d.a.b
    public void b(org.andengine.c.d.a aVar) {
        float[] fArr = this.a;
        float fO = aVar.o();
        float fP = aVar.p();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = fP;
        fArr[10] = fO;
        fArr[11] = 0.0f;
        fArr[15] = fO;
        fArr[16] = fP;
        f();
    }

    @Override // org.andengine.c.d.a.b
    public void c(org.andengine.c.d.a aVar) {
        float fD;
        float fE;
        float f;
        float fG;
        float[] fArr = this.a;
        org.andengine.opengl.c.c.b bVarT = aVar.t();
        if (aVar.v()) {
            if (aVar.u()) {
                fD = bVarT.e();
                fE = bVarT.d();
                f = bVarT.g();
                fG = bVarT.f();
            } else {
                fD = bVarT.d();
                fE = bVarT.e();
                f = bVarT.g();
                fG = bVarT.f();
            }
        } else if (aVar.u()) {
            fD = bVarT.e();
            fE = bVarT.d();
            f = bVarT.f();
            fG = bVarT.g();
        } else {
            fD = bVarT.d();
            fE = bVarT.e();
            f = bVarT.f();
            fG = bVarT.g();
        }
        if (bVarT.h()) {
            fArr[3] = fE;
            fArr[4] = f;
            fArr[8] = fD;
            fArr[9] = f;
            fArr[13] = fE;
            fArr[14] = fG;
            fArr[18] = fD;
            fArr[19] = fG;
        } else {
            fArr[3] = fD;
            fArr[4] = f;
            fArr[8] = fD;
            fArr[9] = fG;
            fArr[13] = fE;
            fArr[14] = f;
            fArr[18] = fE;
            fArr[19] = fG;
        }
        f();
    }
}
