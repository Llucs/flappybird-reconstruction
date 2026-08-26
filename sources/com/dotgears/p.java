package com.dotgears;

/* JADX INFO: loaded from: classes.dex */
public class p extends m {
    public int a;
    public int b;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean m;
    public int e = 0;
    public int f = 0;
    public int l = 0;
    public i r = g.D.b("score_panel");
    public i q = g.D.b("new");
    public l s = g.D.B;
    public int c = this.r.b;
    public int d = this.r.c;
    public int n = (512 - this.d) >> 1;
    public r p = new r();
    public k o = new k();

    @Override // com.dotgears.m
    public void a(float f) {
        if (this.F) {
            if (!this.p.g) {
                this.p.a(f);
            }
            switch (this.k) {
                case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                    this.b = (int) this.p.a;
                    if (this.p.g) {
                        if (this.l <= 0) {
                            this.k = 2;
                        } else {
                            this.k = 1;
                            this.p.a(0.0f, this.l, 0, 0.5f);
                        }
                    }
                    break;
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    this.e = (int) this.p.a;
                    if (this.p.g) {
                        this.k = 2;
                        g.D.a(this.e);
                        if (this.e > this.f) {
                            this.f = this.e;
                            this.m = true;
                        }
                        if (this.e >= this.j) {
                            this.o.a(0);
                        } else if (this.e >= this.i) {
                            this.o.a(1);
                        } else if (this.e >= this.h) {
                            this.o.a(2);
                        } else if (this.e >= this.g) {
                            this.o.a(3);
                        }
                        this.o.a = this.a + 32;
                        this.o.b = this.b + 44;
                    }
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    this.o.a(f);
                    break;
            }
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.l = i;
        this.f = i2;
        this.e = 0;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.F = true;
        this.G = true;
        this.m = false;
        this.a = (288 - this.c) >> 1;
        this.b = 504;
        this.p.a(this.b, this.n, 11, 0.5f);
        this.k = 0;
        this.o.F = false;
        this.o.G = false;
    }

    @Override // com.dotgears.m
    public void a(g gVar) {
        if (this.G) {
            gVar.a(this.r.i, this.a, this.b, 1.0f, 1.0f, 1.0f);
            this.s.a(gVar, this.e, this.a + 210, this.b + 36, false, 10);
            this.s.a(gVar, this.f, this.a + 210, this.b + 78, false, 10);
            if (this.m) {
                gVar.a(this.q.i, this.a + 142, this.b + 60, 1.0f, 1.0f, 1.0f);
            }
            this.o.a(gVar);
        }
    }
}
