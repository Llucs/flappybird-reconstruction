package org.andengine.opengl.d;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import org.andengine.opengl.util.BufferUtils;

/* JADX INFO: loaded from: classes.dex */
public class b extends d {
    protected final float[] a;
    protected final FloatBuffer b;

    public b(e eVar, int i, a aVar, boolean z, org.andengine.opengl.d.a.c cVar) {
        super(eVar, i, aVar, z, cVar);
        this.a = new float[i];
        if (org.andengine.d.i.a.d) {
            this.b = this.f.asFloatBuffer();
        } else {
            this.b = null;
        }
    }

    @Override // org.andengine.opengl.d.d
    protected void a() {
        if (!org.andengine.d.i.a.d) {
            BufferUtils.a(this.f, this.a, this.a.length, 0);
            GLES20.glBufferData(34962, this.f.limit(), this.f, this.e);
        } else {
            this.b.position(0);
            this.b.put(this.a);
            GLES20.glBufferData(34962, this.f.capacity(), this.f, this.e);
        }
    }
}
