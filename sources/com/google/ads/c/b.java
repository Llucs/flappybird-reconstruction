package com.google.ads.c;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    NONE("none"),
    DASHED("dashed"),
    DOTTED("dotted"),
    SOLID("solid");

    private String e;

    b(String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.e;
    }
}
