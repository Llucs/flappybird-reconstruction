package com.google.ads.b;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private com.google.ads.d a;
    private boolean b;
    private boolean c;

    public a(com.google.ads.d dVar, Context context, boolean z) {
        this.a = dVar;
        this.c = z;
        if (context == null) {
            this.b = true;
        } else {
            this.b = dVar.b(context);
        }
    }
}
