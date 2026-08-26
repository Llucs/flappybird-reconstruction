package com.google.android.gms.maps.a;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static byte a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }

    public static Boolean a(byte b) {
        switch (b) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                return Boolean.FALSE;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                return Boolean.TRUE;
            default:
                return null;
        }
    }
}
