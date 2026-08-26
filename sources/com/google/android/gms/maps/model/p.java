package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class p implements Parcelable.Creator {
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

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public VisibleRegion createFromParcel(Parcel parcel) {
        LatLngBounds latLngBounds = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iF = 0;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    latLng4 = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLng.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    latLng3 = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLng.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    latLng2 = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLng.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLng.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    latLngBounds = (LatLngBounds) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLngBounds.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new VisibleRegion(iF, latLng4, latLng3, latLng2, latLng, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
