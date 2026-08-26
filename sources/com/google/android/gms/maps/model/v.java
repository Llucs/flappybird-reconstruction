package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class v {
    static void a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, markerOptions.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) markerOptions.c(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, markerOptions.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, markerOptions.e(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, markerOptions.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, markerOptions.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, markerOptions.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, markerOptions.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, markerOptions.i());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }
}
