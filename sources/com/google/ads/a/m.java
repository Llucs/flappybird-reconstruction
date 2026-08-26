package com.google.ads.a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Exception {
    public final boolean a;

    public m(String str, boolean z) {
        super(str);
        this.a = z;
    }

    public m(String str, boolean z, Throwable th) {
        super(str, th);
        this.a = z;
    }

    public void a(String str) {
        com.google.ads.util.g.b(c(str));
        com.google.ads.util.g.a((String) null, this);
    }

    public void b(String str) {
        String strC = c(str);
        if (!this.a) {
            this = null;
        }
        throw new RuntimeException(strC, this);
    }

    public String c(String str) {
        return this.a ? str + ": " + getMessage() : str;
    }
}
