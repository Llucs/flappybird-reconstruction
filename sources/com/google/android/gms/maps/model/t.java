package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class t {
    static void a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, latLngBounds.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) latLngBounds.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) latLngBounds.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }
}
