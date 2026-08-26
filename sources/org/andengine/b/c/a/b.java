package org.andengine.b.c.a;

import android.view.View;
import org.andengine.opengl.view.RenderSurfaceView;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    private final float a;
    private final float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;

    public b(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // org.andengine.b.c.a.c
    public void a(RenderSurfaceView renderSurfaceView, int i, int i2) {
        float f;
        float f2;
        float f3;
        a.a(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f4 = this.a / this.b;
        if (size / size2 < f4) {
            f2 = size2 * f4;
            f = size2;
            f3 = this.b / f;
        } else {
            f = size / f4;
            f2 = size;
            f3 = this.a / f2;
        }
        this.c = size * f3;
        this.d = f3 * size2;
        this.e = (this.a - this.c) / 2.0f;
        this.f = this.c + this.e;
        this.h = (this.b - this.d) / 2.0f;
        this.g = this.d + this.h;
        renderSurfaceView.a((int) f2, (int) f);
    }
}
