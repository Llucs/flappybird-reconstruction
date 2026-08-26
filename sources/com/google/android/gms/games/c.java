package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.internal.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements com.google.android.gms.common.b {
    private final r a;

    private c(Context context, String str, String str2, com.google.android.gms.common.c cVar, com.google.android.gms.common.d dVar, String[] strArr, int i, View view) {
        this.a = new r(context, str, str2, cVar, dVar, strArr, i, view, false);
    }

    public Intent a(String str) {
        return this.a.a(str);
    }

    public void a() {
        this.a.a();
    }

    public void a(String str, long j) {
        this.a.a((com.google.android.gms.games.a.a) null, str, j);
    }

    public boolean b() {
        return this.a.h();
    }

    public void c() {
        this.a.b();
    }
}
