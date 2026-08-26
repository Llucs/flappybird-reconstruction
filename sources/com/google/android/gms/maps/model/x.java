package com.google.android.gms.maps.model;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class x {
    static void a(PolylineOptions polylineOptions, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, polylineOptions.a());
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 2, polylineOptions.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, polylineOptions.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, polylineOptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, polylineOptions.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, polylineOptions.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, polylineOptions.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }
}
