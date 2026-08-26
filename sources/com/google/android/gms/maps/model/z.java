package com.google.android.gms.maps.model;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class z {
    static void a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, tileOverlayOptions.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, tileOverlayOptions.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, tileOverlayOptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, tileOverlayOptions.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }
}
