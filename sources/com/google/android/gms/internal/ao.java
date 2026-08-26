package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ao {
    public static String a(int i) {
        switch (i) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                return "DAILY";
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                return "WEEKLY";
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                return "ALL_TIME";
            default:
                throw new IllegalArgumentException("Unknown time span " + i);
        }
    }
}
