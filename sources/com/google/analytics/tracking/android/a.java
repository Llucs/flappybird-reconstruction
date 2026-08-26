package com.google.analytics.tracking.android;

/* JADX INFO: loaded from: classes.dex */
public class a extends d {
    private static a b;
    private c a;

    static a a() {
        a aVar;
        synchronized (a.class) {
            aVar = b;
        }
        return aVar;
    }

    public c b() {
        return this.a;
    }
}
