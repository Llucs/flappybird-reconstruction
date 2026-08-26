package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class f implements Parcelable.Creator {
    static void a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, latLngBounds.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) latLngBounds.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) latLngBounds.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LatLngBounds createFromParcel(Parcel parcel) {
        LatLng latLng;
        LatLng latLng2;
        int iF;
        LatLng latLng3 = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    LatLng latLng5 = latLng3;
                    latLng2 = latLng4;
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    latLng = latLng5;
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    LatLng latLng6 = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLng.CREATOR);
                    iF = i;
                    latLng = latLng3;
                    latLng2 = latLng6;
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLng.CREATOR);
                    latLng2 = latLng4;
                    iF = i;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    latLng = latLng3;
                    latLng2 = latLng4;
                    iF = i;
                    break;
            }
            i = iF;
            latLng4 = latLng2;
            latLng3 = latLng;
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new LatLngBounds(i, latLng4, latLng3);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
