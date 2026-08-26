package org.andengine.opengl.view;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes.dex */
public class a implements GLSurfaceView.EGLConfigChooser {
    private static final int[] a = new int[1];
    private static final int[] b = {12324, 5, 12323, 6, 12322, 5, 12321, 0, 12325, 0, 12326, 0, 12352, 4, 12338, 1, 12337, 2, 12344};
    private static final int[] c = {12324, 5, 12323, 6, 12322, 5, 12321, 0, 12325, 0, 12326, 0, 12352, 4, 12512, 1, 12513, 2, 12344};
    private static final int[] d = {12324, 5, 12323, 6, 12322, 5, 12321, 0, 12325, 0, 12326, 0, 12352, 4, 12344};
    private final boolean e;
    private boolean f;
    private boolean g;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;

    public a(boolean z) {
        this.e = z;
    }

    private static int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, a) ? a[0] : i2;
    }

    private static int a(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        if (egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, a)) {
            return a[0];
        }
        throw new IllegalArgumentException("EGLCONFIG_FALLBACK failed!");
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, b bVar) {
        a[0] = 0;
        if (this.e) {
            int iA = a(egl10, eGLDisplay, b);
            if (iA > 0) {
                this.f = true;
                return a(egl10, eGLDisplay, b, iA, bVar);
            }
            int iA2 = a(egl10, eGLDisplay, c);
            if (iA2 > 0) {
                this.g = true;
                return a(egl10, eGLDisplay, c, iA2, bVar);
            }
        }
        int iA3 = a(egl10, eGLDisplay, d);
        if (iA3 > 0) {
            return a(egl10, eGLDisplay, d, iA3, bVar);
        }
        throw new IllegalArgumentException("No " + EGLConfig.class.getSimpleName() + " found!");
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr, int i, b bVar) {
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i, a)) {
            return a(egl10, eGLDisplay, eGLConfigArr, bVar);
        }
        throw new IllegalArgumentException("findEGLConfig failed!");
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr, b bVar) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            if (eGLConfig != null) {
                int iA = a(egl10, eGLDisplay, eGLConfig, 12324, 0);
                int iA2 = a(egl10, eGLDisplay, eGLConfig, 12323, 0);
                int iA3 = a(egl10, eGLDisplay, eGLConfig, 12322, 0);
                int iA4 = a(egl10, eGLDisplay, eGLConfig, 12321, 0);
                int iA5 = a(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int iA6 = a(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (bVar.a(iA, iA2, iA3, iA4, iA5, iA6)) {
                    this.h = iA;
                    this.i = iA2;
                    this.j = iA3;
                    this.k = iA4;
                    this.l = iA5;
                    this.m = iA6;
                    return eGLConfig;
                }
            }
        }
        throw new IllegalArgumentException("No EGLConfig found!");
    }

    public boolean a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        try {
            return a(egl10, eGLDisplay, b.a);
        } catch (IllegalArgumentException e) {
            try {
                return a(egl10, eGLDisplay, b.b);
            } catch (IllegalArgumentException e2) {
                try {
                    return a(egl10, eGLDisplay, b.c);
                } catch (IllegalArgumentException e3) {
                    return a(egl10, eGLDisplay, b.d);
                }
            }
        }
    }

    public int d() {
        return this.j;
    }

    public int e() {
        return this.k;
    }

    public int f() {
        return this.l;
    }

    public int g() {
        return this.m;
    }
}
