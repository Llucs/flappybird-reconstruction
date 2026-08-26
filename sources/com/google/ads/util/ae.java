package com.google.ads.util;

/* JADX INFO: loaded from: classes.dex */
public final class ae extends ac {
    final /* synthetic */ aa d;
    private boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(aa aaVar, String str) {
        super(aaVar, str);
        this.d = aaVar;
        this.e = false;
        this.e = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(aa aaVar, String str, Object obj) {
        super(aaVar, str, obj);
        this.d = aaVar;
        this.e = false;
        this.e = false;
    }

    public synchronized Object a() {
        return this.a;
    }

    public synchronized void a(Object obj) {
        g.d("State changed - " + this.d.toString() + "." + this.b + ": '" + obj + "' <-- '" + this.a + "'.");
        this.a = obj;
        this.e = true;
    }

    @Override // com.google.ads.util.ac
    public String toString() {
        return super.toString() + (this.e ? " (*)" : "");
    }
}
