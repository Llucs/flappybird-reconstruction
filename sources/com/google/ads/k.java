package com.google.ads;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class k {
    private final String a;
    private final String b;
    private final List c;
    private final List d;
    private final HashMap e;

    public k(String str, String str2, List list, List list2, HashMap map) {
        com.google.ads.util.e.a(str2);
        if (str != null) {
            com.google.ads.util.e.a(str);
        }
        this.a = str;
        this.b = str2;
        this.c = list;
        this.e = map;
        this.d = list2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public List c() {
        return this.c;
    }

    public List d() {
        return this.d;
    }

    public HashMap e() {
        return this.e;
    }
}
