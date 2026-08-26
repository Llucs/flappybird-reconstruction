package com.dotgears;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public class g extends m {
    public static g D;
    public int A;
    public l B;
    public p C;
    public int e;
    public r f;
    public int g;
    public r h;
    public int i;
    public int j;
    public int k;
    public int l;
    public n m;
    public n n;
    protected i o;
    protected i p;
    public boolean r;
    protected int u;
    int v;
    public int y;
    public int z;
    public int[] b = new int[50];
    public int[] c = new int[50];
    public m[] d = new m[50];
    public int q = 1;
    protected int[] s = new int[10];
    protected int[] t = new int[10];
    int[] w = new int[50];
    double[] x = new double[50];
    public final float E = 0.015f;
    public i[] a = new i[512];

    public g(int i, int i2, InputStream inputStream) {
        this.z = i;
        this.A = i2;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                if (line.length() > 1) {
                    String[] strArrSplit = line.split("\\s+");
                    i iVar = new i(strArrSplit[0], Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), Float.parseFloat(strArrSplit[3]), Float.parseFloat(strArrSplit[4]), Float.parseFloat(strArrSplit[5]), Float.parseFloat(strArrSplit[6]));
                    iVar.f = iVar.d + iVar.f;
                    iVar.g = iVar.e + iVar.g;
                    this.a[iVar.i] = iVar;
                    Log.i("FlappyBird", iVar.a + " " + iVar.b + " " + iVar.c + " " + iVar.d + " " + iVar.e + " " + iVar.f + " " + iVar.g);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a() {
        j.x = new j();
        this.f = new r();
        this.h = new r();
        this.o = b("black");
        this.p = b("white");
        this.u = 0;
        this.m = new n();
        for (int i = 0; i < 20; i++) {
            this.m.a(new o());
        }
        this.n = new n();
        for (int i2 = 0; i2 < 10; i2++) {
            this.n.a(new e());
        }
        this.B = new l("number_score");
        this.C = new p();
        this.l = 0;
        this.r = false;
        this.v = 0;
        d();
        c();
        a(false, 0, 0.5f);
    }

    public void a(int i) {
        c(0, i);
        if (i > this.z) {
            this.z = i;
        }
    }

    public void a(int i, float f) {
    }

    public void a(int i, int i2) {
    }

    public void a(int i, int i2, int i3, float f, float f2, float f3) {
        i iVar = this.a[i];
        a(i2, i3, (int) (i2 + (iVar.b * f)), (int) (i3 + (iVar.c * f2)), iVar.d, iVar.e, iVar.f, iVar.g, f3);
    }

    public void a(int i, int i2, int i3, int i4) {
    }

    public void a(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        c.a(i, i2, i3, i4, f, f2, f3, f4, f5);
    }

    public void a(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5, int i5) {
        c.a(i, i2, i3, i4, f, f2, f3, f4, f5, i5);
    }

    public void a(int i, int i2, int i3, int i4, int i5, float f) {
        i iVar = this.a[i];
        a(i2, i3, i2 + i4, i3 + i5, iVar.d, iVar.e, iVar.f, iVar.g, f);
    }

    public void a(int i, m mVar) {
    }

    public void a(int i, m mVar, int i2) {
        this.c[this.e] = i;
        this.d[this.e] = mVar;
        this.b[this.e] = i2;
        this.e++;
        if (this.e >= 50) {
            this.e = 0;
        }
    }

    public void a(i iVar, int i, int i2, float f) {
        a(i, i2, i + iVar.b, i2 + iVar.c, iVar.d, iVar.e, iVar.f, iVar.g, f);
    }

    public void a(i iVar, int i, int i2, float f, int i3) {
        a(i, i2, i + iVar.b, i2 + iVar.c, iVar.d, iVar.e, iVar.f, iVar.g, f, i3);
    }

    public void a(boolean z, int i, float f) {
        if (this.f.g) {
            if (z) {
                this.f.a(0.0f, 1.0f, 5, f);
            } else {
                this.f.a(1.0f, 0.0f, 5, f);
            }
            this.f.a(0.0f);
            this.g = i;
        }
    }

    public void a(float[] fArr, float[] fArr2) {
        for (int i = 0; i < 10; i++) {
            this.s[i] = (int) fArr[i];
            this.t[i] = (int) fArr2[i];
        }
        this.u = 10;
    }

    public i[] a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < 512; i2++) {
            if (this.a[i2] != null && this.a[i2].a.startsWith(str)) {
                i++;
            }
        }
        if (i <= 0) {
            return null;
        }
        i[] iVarArr = new i[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 512; i4++) {
            if (this.a[i4] != null && this.a[i4].a.startsWith(str)) {
                iVarArr[i3] = this.a[i4];
                i3++;
            }
        }
        return iVarArr;
    }

    public i b(String str) {
        for (int i = 0; i < 512; i++) {
            if (this.a[i] != null && this.a[i].a.startsWith(str)) {
                return this.a[i];
            }
        }
        return null;
    }

    public void b() {
        this.v = 0;
        if (!this.r) {
            for (int i = 0; i < 50; i++) {
                if (this.b[i] > 0) {
                    this.b[i] = r4[i] - 30;
                    if (this.b[i] <= 0) {
                        a(this.c[i], this.d[i]);
                    }
                }
            }
        }
        b(0.015f);
        if (!this.r) {
            this.C.a(0.015f);
            this.n.a(0.015f);
            if (!this.f.g || this.f.a != 0.0f) {
                this.f.a(0.015f);
                if (this.f.g) {
                    a(this.g, this);
                }
            }
            if (!this.h.g || this.h.a != 0.0f) {
                this.h.a(0.015f);
            }
            if (this.l > 0) {
                this.l--;
                this.i = j.a(-this.k, this.k);
                this.j = j.a(-this.k, this.k);
            } else {
                this.i = 0;
                this.j = 0;
            }
        }
        this.C.a(this);
        this.n.a(this);
        if (!this.f.g || this.f.a != 0.0f) {
            a(this.o.i, -144, -256, 864, 1536, this.f.a);
        }
        if (this.h.g && this.h.a == 0.0f) {
            return;
        }
        a(this.p.i, -144, -256, 864, 1536, this.h.a);
    }

    public void b(float f) {
    }

    public void b(int i, int i2) {
        ((e) this.n.c()).a(i, i2);
    }

    public void c() {
    }

    public void c(float f) {
        if (this.h.g) {
            this.h.a(1.0f, 0.0f, 11, f);
            this.h.a(0.0f);
        }
    }

    public void c(int i, int i2) {
        this.w[this.v] = i;
        this.x[this.v] = i2;
        this.v++;
    }

    public void d() {
        this.e = 0;
        for (int i = 0; i < 50; i++) {
            this.b[i] = 0;
        }
    }
}
