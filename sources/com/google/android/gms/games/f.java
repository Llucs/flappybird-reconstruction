package com.google.android.gms.games;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private final Context a;
    private String b;
    private final com.google.android.gms.common.c d;
    private final com.google.android.gms.common.d e;
    private View h;
    private String c = "<<default account>>";
    private String[] f = {"https://www.googleapis.com/auth/games"};
    private int g = 49;

    public f(Context context, com.google.android.gms.common.c cVar, com.google.android.gms.common.d dVar) {
        this.a = context;
        this.b = context.getPackageName();
        this.d = cVar;
        this.e = dVar;
    }

    public c a() {
        return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public f a(int i) {
        this.g = i;
        return this;
    }

    public f a(String... strArr) {
        this.f = strArr;
        return this;
    }
}
