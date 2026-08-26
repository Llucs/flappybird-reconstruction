package org.andengine.opengl.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.andengine.opengl.util.e;

/* JADX INFO: loaded from: classes.dex */
public class a {
    protected final Paint a;
    protected final Paint.FontMetrics b;
    protected final Canvas c;
    private final org.andengine.opengl.c.a d;
    private final SparseArray e;
    private final ArrayList f;
    private final Paint g;

    public float a() {
        return this.b.ascent;
    }

    protected Bitmap a(d dVar) {
        String strValueOf = String.valueOf(dVar.a);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dVar.d + 2, dVar.e + 2, Bitmap.Config.ARGB_8888);
        this.c.setBitmap(bitmapCreateBitmap);
        this.c.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), this.g);
        a(strValueOf, -dVar.f, -(dVar.g + a()));
        return bitmapCreateBitmap;
    }

    protected void a(String str, float f, float f2) {
        this.c.drawText(str, f + 1.0f, 1.0f + f2, this.a);
    }

    public synchronized void a(e eVar) {
        if (this.d.c()) {
            ArrayList arrayList = this.f;
            if (arrayList.size() > 0) {
                this.d.d(eVar);
                org.andengine.opengl.c.c cVarF = this.d.f();
                boolean z = this.d.g().n;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    d dVar = (d) arrayList.get(size);
                    if (!dVar.a()) {
                        Bitmap bitmapA = a(dVar);
                        boolean z2 = org.andengine.d.g.a.a(bitmapA.getWidth()) && org.andengine.d.g.a.a(bitmapA.getHeight()) && cVarF == org.andengine.opengl.c.c.RGBA_8888;
                        if (!z2) {
                            GLES20.glPixelStorei(3317, 1);
                        }
                        if (z) {
                            GLUtils.texSubImage2D(3553, 0, dVar.b, dVar.c, bitmapA);
                        } else {
                            eVar.a(3553, 0, dVar.b, dVar.c, bitmapA, cVarF);
                        }
                        if (!z2) {
                            GLES20.glPixelStorei(3317, 4);
                        }
                        bitmapA.recycle();
                    }
                }
                arrayList.clear();
                System.gc();
            }
        }
    }

    public synchronized void b() {
        ArrayList arrayList = this.f;
        SparseArray sparseArray = this.e;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            arrayList.add((d) sparseArray.valueAt(size));
        }
    }
}
