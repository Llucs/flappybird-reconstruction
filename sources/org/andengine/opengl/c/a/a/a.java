package org.andengine.opengl.c.a.a;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.util.ArrayList;
import org.andengine.opengl.c.a.c;
import org.andengine.opengl.c.e;
import org.andengine.opengl.c.f;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {
    private final org.andengine.opengl.c.b.a j;

    public a(e eVar, int i, int i2, org.andengine.opengl.c.b.a aVar, f fVar, org.andengine.opengl.c.a.b bVar) {
        super(eVar, i, i2, aVar.b(), fVar, bVar);
        this.j = aVar;
    }

    public a(e eVar, int i, int i2, f fVar) {
        this(eVar, i, i2, org.andengine.opengl.c.b.a.RGBA_8888, fVar, null);
    }

    @Override // org.andengine.opengl.c.d
    protected void e(org.andengine.opengl.util.e eVar) {
        org.andengine.opengl.c.c cVarB = this.j.b();
        int iA = cVarB.a();
        int iB = cVarB.b();
        int iC = cVarB.c();
        GLES20.glTexImage2D(3553, 0, iA, this.g, this.h, 0, iB, iC, null);
        boolean z = this.c.n;
        Bitmap.Config configA = z ? this.j.a() : Bitmap.Config.ARGB_8888;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        org.andengine.opengl.c.a.b bVarK = k();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            org.andengine.opengl.c.a.a.a.b bVar = (org.andengine.opengl.c.a.a.a.b) arrayList.get(i2);
            try {
                Bitmap bitmapA = bVar.a(configA);
                if (bitmapA == null) {
                    throw new org.andengine.d.f.b("Caused by: " + bVar.getClass().toString() + " --> " + bVar.toString() + " returned a null Bitmap.");
                }
                boolean z2 = org.andengine.d.g.a.a(bitmapA.getWidth()) && org.andengine.d.g.a.a(bitmapA.getHeight()) && cVarB == org.andengine.opengl.c.c.RGBA_8888;
                if (!z2) {
                    GLES20.glPixelStorei(3317, 1);
                }
                if (z) {
                    GLUtils.texSubImage2D(3553, 0, bVar.a(), bVar.b(), bitmapA, iB, iC);
                } else {
                    eVar.a(3553, 0, bVar.a(), bVar.b(), bitmapA, this.b);
                }
                if (!z2) {
                    GLES20.glPixelStorei(3317, 4);
                }
                bitmapA.recycle();
                if (bVarK != null) {
                    bVarK.a(this, bVar);
                }
            } catch (org.andengine.d.f.b e) {
                if (bVarK == null) {
                    throw e;
                }
                bVarK.a(this, bVar, e);
            }
            i = i2 + 1;
        }
    }
}
