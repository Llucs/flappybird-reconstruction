package com.google.android.gms.maps.model;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class u {
    static void a(LatLng latLng, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, latLng.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, latLng.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, latLng.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }
}
