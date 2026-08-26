package com.google.ads.util;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class af extends ac {
    final /* synthetic */ aa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aa aaVar, String str, Object obj) {
        super(aaVar, str, new WeakReference(obj));
        this.d = aaVar;
    }

    public Object a() {
        return ((WeakReference) this.a).get();
    }

    @Override // com.google.ads.util.ac
    public String toString() {
        return this.d.toString() + "." + this.b + " = " + a() + " (?)";
    }
}
