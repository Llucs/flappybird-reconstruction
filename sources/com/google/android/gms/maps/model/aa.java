package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class aa {
    static void a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, visibleRegion.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) visibleRegion.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) visibleRegion.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) visibleRegion.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable) visibleRegion.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, (Parcelable) visibleRegion.e, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }
}
