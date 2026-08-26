package org.andengine.opengl.b;

import android.opengl.GLES20;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class g {
    private static final int[] a = new int[1];
    private static final int[] b = new int[1];
    private static final int[] c = new int[1];
    private static final int[] d = new int[1];
    private static final int[] e = new int[1];
    private static final byte[] l = new byte[64];
    protected final org.andengine.opengl.b.b.a f;
    protected final org.andengine.opengl.b.b.a g;
    protected int h;
    protected boolean i;
    protected final HashMap j;
    protected final HashMap k;

    public g(String str, String str2) {
        this(new org.andengine.opengl.b.b.b(str), new org.andengine.opengl.b.b.b(str2));
    }

    public g(org.andengine.opengl.b.b.a aVar, org.andengine.opengl.b.b.a aVar2) {
        this.h = -1;
        this.j = new HashMap();
        this.k = new HashMap();
        this.f = aVar;
        this.g = aVar2;
    }

    private static int a(String str, int i) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            throw new org.andengine.opengl.b.a.b("Could not create Shader of type: '" + i + '\"');
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        GLES20.glGetShaderiv(iGlCreateShader, 35713, a, 0);
        if (a[0] == 0) {
            throw new org.andengine.opengl.b.a.a(GLES20.glGetShaderInfoLog(iGlCreateShader), str);
        }
        return iGlCreateShader;
    }

    private void a() {
        this.j.clear();
        b[0] = 0;
        GLES20.glGetProgramiv(this.h, 35718, b, 0);
        int i = b[0];
        for (int i2 = 0; i2 < i; i2++) {
            GLES20.glGetActiveUniform(this.h, i2, 64, c, 0, d, 0, e, 0, l, 0);
            int i3 = c[0];
            if (i3 == 0) {
                while (i3 < 64 && l[i3] != 0) {
                    i3++;
                }
            }
            String str = new String(l, 0, i3);
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.h, str);
            if (iGlGetUniformLocation == -1) {
                int i4 = 0;
                while (i4 < 64 && l[i4] != 0) {
                    i4++;
                }
                str = new String(l, 0, i4);
                iGlGetUniformLocation = GLES20.glGetUniformLocation(this.h, str);
                if (iGlGetUniformLocation == -1) {
                    throw new org.andengine.opengl.b.a.c("Invalid location for uniform: '" + str + "'.");
                }
            }
            this.j.put(str, Integer.valueOf(iGlGetUniformLocation));
        }
    }

    @Deprecated
    private void c() {
        this.k.clear();
        b[0] = 0;
        GLES20.glGetProgramiv(this.h, 35721, b, 0);
        int i = b[0];
        for (int i2 = 0; i2 < i; i2++) {
            GLES20.glGetActiveAttrib(this.h, i2, 64, c, 0, d, 0, e, 0, l, 0);
            int i3 = c[0];
            if (i3 == 0) {
                while (i3 < 64 && l[i3] != 0) {
                    i3++;
                }
            }
            String str = new String(l, 0, i3);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.h, str);
            if (iGlGetAttribLocation == -1) {
                int i4 = 0;
                while (i4 < 64 && l[i4] != 0) {
                    i4++;
                }
                str = new String(l, 0, i4);
                iGlGetAttribLocation = GLES20.glGetAttribLocation(this.h, str);
                if (iGlGetAttribLocation == -1) {
                    throw new org.andengine.opengl.b.a.c("Invalid location for attribute: '" + str + "'.");
                }
            }
            this.k.put(str, Integer.valueOf(iGlGetAttribLocation));
        }
    }

    public int a(String str) {
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new org.andengine.opengl.b.a.b("Unexpected uniform: '" + str + "'. Existing uniforms: " + this.j.toString());
    }

    protected void a(org.andengine.opengl.util.e eVar) {
        GLES20.glLinkProgram(this.h);
        GLES20.glGetProgramiv(this.h, 35714, a, 0);
        if (a[0] == 0) {
            throw new org.andengine.opengl.b.a.c(GLES20.glGetProgramInfoLog(this.h));
        }
        c();
        a();
        this.i = true;
    }

    public void a(org.andengine.opengl.util.e eVar, org.andengine.opengl.d.a.c cVar) {
        if (!this.i) {
            c(eVar);
        }
        eVar.c(this.h);
        cVar.a();
    }

    public void a(boolean z) {
        this.i = z;
    }

    public void b(org.andengine.opengl.util.e eVar) {
    }

    public boolean b() {
        return this.i;
    }

    protected void c(org.andengine.opengl.util.e eVar) {
        String strA = this.f.a(eVar);
        int iA = a(strA, 35633);
        String strA2 = this.g.a(eVar);
        int iA2 = a(strA2, 35632);
        this.h = GLES20.glCreateProgram();
        GLES20.glAttachShader(this.h, iA);
        GLES20.glAttachShader(this.h, iA2);
        try {
            a(eVar);
            GLES20.glDeleteShader(iA);
            GLES20.glDeleteShader(iA2);
        } catch (org.andengine.opengl.b.a.c e2) {
            throw new org.andengine.opengl.b.a.c("VertexShaderSource:\n##########################\n" + strA + "\n##########################\n\nFragmentShaderSource:\n##########################\n" + strA2 + "\n##########################", e2);
        }
    }
}
