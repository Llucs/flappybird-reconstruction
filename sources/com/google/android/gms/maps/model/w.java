package com.google.android.gms.maps.model;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class w {
    static void a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, polygonOptions.a());
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 2, polygonOptions.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 3, polygonOptions.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, polygonOptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, polygonOptions.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, polygonOptions.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, polygonOptions.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, polygonOptions.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, polygonOptions.i());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }
}
