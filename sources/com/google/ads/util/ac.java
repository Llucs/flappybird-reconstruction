package com.google.ads.util;

/* JADX INFO: loaded from: classes.dex */
public abstract class ac {
    protected Object a;
    protected final String b;
    final /* synthetic */ aa c;

    private ac(aa aaVar, String str) {
        this(aaVar, str, (Object) null);
    }

    private ac(aa aaVar, String str, Object obj) {
        this.c = aaVar;
        this.b = str;
        aaVar.a(this);
        this.a = obj;
    }

    public String toString() {
        return this.c.toString() + "." + this.b + " = " + this.a;
    }
}
