package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, googleMapOptions.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, googleMapOptions.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, googleMapOptions.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, googleMapOptions.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable) googleMapOptions.k(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, googleMapOptions.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, googleMapOptions.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, googleMapOptions.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, googleMapOptions.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, googleMapOptions.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, googleMapOptions.i());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GoogleMapOptions createFromParcel(Parcel parcel) {
        byte bD = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        CameraPosition cameraPosition = null;
        byte bD2 = 0;
        byte bD3 = 0;
        byte bD4 = 0;
        byte bD5 = 0;
        byte bD6 = 0;
        int iF = 0;
        byte bD7 = 0;
        byte bD8 = 0;
        int iF2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    iF2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    bD8 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    bD7 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    cameraPosition = (CameraPosition) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, CameraPosition.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    bD6 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    bD5 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                    bD4 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                    bD3 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                    bD2 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                    bD = com.google.android.gms.common.internal.safeparcel.a.d(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new GoogleMapOptions(iF2, bD8, bD7, iF, cameraPosition, bD6, bD5, bD4, bD3, bD2, bD);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
