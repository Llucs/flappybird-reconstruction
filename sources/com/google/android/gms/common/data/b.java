package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.internal.Cdo;
import com.google.android.gms.internal.dl;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    protected final d a;
    protected final int b;
    private final int c;

    public b(d dVar, int i) {
        this.a = (d) Cdo.a(dVar);
        Cdo.a(i >= 0 && i < dVar.g());
        this.b = i;
        this.c = dVar.a(this.b);
    }

    protected long a(String str) {
        return this.a.a(str, this.b, this.c);
    }

    protected int b(String str) {
        return this.a.b(str, this.b, this.c);
    }

    protected boolean c(String str) {
        return this.a.d(str, this.b, this.c);
    }

    protected String d(String str) {
        return this.a.c(str, this.b, this.c);
    }

    protected Uri e(String str) {
        return this.a.e(str, this.b, this.c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return dl.a(Integer.valueOf(bVar.b), Integer.valueOf(this.b)) && dl.a(Integer.valueOf(bVar.c), Integer.valueOf(this.c)) && bVar.a == this.a;
    }

    protected boolean f(String str) {
        return this.a.f(str, this.b, this.c);
    }

    public int hashCode() {
        return dl.a(Integer.valueOf(this.b), Integer.valueOf(this.c), this.a);
    }
}
