package com.google.analytics.tracking.android;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private static a a;

    private static c a() {
        if (a == null) {
            a = a.a();
        }
        if (a != null) {
            return a.b();
        }
        return null;
    }

    public static void a(String str) {
        c cVarA = a();
        if (cVarA != null) {
            cVarA.a(str);
        }
    }
}
