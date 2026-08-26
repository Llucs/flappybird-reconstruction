package org.andengine.opengl.view;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public class g implements GLSurfaceView.Renderer {
    final org.andengine.b.a a;
    final a b;
    final boolean c;
    final h d;
    final org.andengine.opengl.util.e e = new org.andengine.opengl.util.e();

    public g(org.andengine.b.a aVar, a aVar2, h hVar) {
        this.a = aVar;
        this.b = aVar2;
        this.d = hVar;
        this.c = this.a.d().e().a();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        synchronized (org.andengine.opengl.util.e.class) {
            if (this.c && this.b.a()) {
                GLES20.glClear(32768);
            }
            try {
                this.a.a(this.e);
            } catch (InterruptedException e) {
                org.andengine.d.e.a.b("GLThread interrupted!", e);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.a.a(i, i2);
        GLES20.glViewport(0, 0, i, i2);
        this.e.o();
        if (this.d != null) {
            this.d.a(this.e, i, i2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        synchronized (org.andengine.opengl.util.e.class) {
            org.andengine.b.c.d dVarE = this.a.d().e();
            this.e.a(dVarE, this.b, eGLConfig);
            this.e.g();
            this.e.a();
            this.e.a(dVarE.b());
            if (this.d != null) {
                this.d.a(this.e);
            }
        }
    }
}
