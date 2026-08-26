package com.google.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class g {
    public static final g a = new g(-1, -2, "mb");
    public static final g b = new g(320, 50, "mb");
    public static final g c = new g(300, 250, "as");
    public static final g d = new g(468, 60, "as");
    public static final g e = new g(728, 90, "as");
    public static final g f = new g(160, 600, "as");
    private final int g;
    private final int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private String l;

    public g(int i, int i2) {
        this(i, i2, null);
        if (!f()) {
            this.k = true;
        } else {
            this.k = false;
            this.l = "mb";
        }
    }

    private g(int i, int i2, String str) {
        this.g = i;
        this.h = i2;
        this.l = str;
        this.i = i == -1;
        this.j = i2 == -2;
        this.k = false;
    }

    private static int a(Context context) {
        return (int) (r0.widthPixels / context.getResources().getDisplayMetrics().density);
    }

    public static g a(g gVar, Context context) {
        if (context == null || !gVar.f()) {
            return gVar.f() ? b : gVar;
        }
        g gVar2 = new g(gVar.i ? a(context) : gVar.a(), gVar.j ? b(context) : gVar.b(), gVar.l);
        gVar2.j = gVar.j;
        gVar2.i = gVar.i;
        gVar2.k = gVar.k;
        return gVar2;
    }

    private static int b(Context context) {
        int i = (int) (r0.heightPixels / context.getResources().getDisplayMetrics().density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    private boolean f() {
        return this.g < 0 || this.h < 0;
    }

    public int a() {
        if (this.g < 0) {
            throw new UnsupportedOperationException("Ad size was not set before getWidth() was called.");
        }
        return this.g;
    }

    public int b() {
        if (this.h < 0) {
            throw new UnsupportedOperationException("Ad size was not set before getHeight() was called.");
        }
        return this.h;
    }

    public boolean c() {
        return this.i;
    }

    public boolean d() {
        return this.j;
    }

    public boolean e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.g == gVar.g && this.h == gVar.h;
    }

    public int hashCode() {
        return (Integer.valueOf(this.g).hashCode() << 16) | (Integer.valueOf(this.h).hashCode() & 65535);
    }

    public String toString() {
        return a() + "x" + b() + (this.l == null ? "" : "_" + this.l);
    }
}
