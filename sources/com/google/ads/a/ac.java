package com.google.ads.a;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class ac {
    public static final ac a = new ac(null, true);
    private com.google.ads.g b;
    private boolean c;
    private final boolean d;

    private ac(com.google.ads.g gVar, boolean z) {
        this.b = gVar;
        this.d = z;
    }

    public static ac a(com.google.ads.g gVar) {
        return a(gVar, null);
    }

    public static ac a(com.google.ads.g gVar, Context context) {
        return new ac(com.google.ads.g.a(gVar, context), false);
    }

    public void a(boolean z) {
        this.c = z;
    }

    public boolean a() {
        return this.d;
    }

    public void b(com.google.ads.g gVar) {
        if (this.d) {
            return;
        }
        this.b = gVar;
    }

    public boolean b() {
        return this.c;
    }

    public com.google.ads.g c() {
        return this.b;
    }
}
