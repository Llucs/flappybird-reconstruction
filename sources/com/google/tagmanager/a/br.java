package com.google.tagmanager.a;

/* JADX INFO: loaded from: classes.dex */
public enum br {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(h.a),
    ENUM(null),
    MESSAGE(null);

    private final Object j;

    br(Object obj) {
        this.j = obj;
    }
}
