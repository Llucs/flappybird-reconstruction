package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class q {
    static void a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, cameraPosition.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) cameraPosition.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, cameraPosition.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, cameraPosition.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, cameraPosition.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }
}
