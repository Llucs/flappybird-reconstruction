package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class s {
    static void a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, groundOverlayOptions.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, groundOverlayOptions.a(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) groundOverlayOptions.c(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, groundOverlayOptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, groundOverlayOptions.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, (Parcelable) groundOverlayOptions.f(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, groundOverlayOptions.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, groundOverlayOptions.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, groundOverlayOptions.l());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, groundOverlayOptions.i());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, groundOverlayOptions.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, groundOverlayOptions.k());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }
}
