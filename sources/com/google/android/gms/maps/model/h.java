package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class h implements Parcelable.Creator {
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
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, markerOptions.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, markerOptions.k());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, markerOptions.l());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, markerOptions.m());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MarkerOptions createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iF = 0;
        LatLng latLng = null;
        String strL = null;
        String strL2 = null;
        IBinder iBinderM = null;
        float fI = 0.0f;
        float fI2 = 0.0f;
        boolean zC = false;
        boolean zC2 = false;
        boolean zC3 = false;
        float fI3 = 0.0f;
        float fI4 = 0.5f;
        float fI5 = 0.0f;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLng.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    strL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    iBinderM = com.google.android.gms.common.internal.safeparcel.a.m(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    fI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    fI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                    zC3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                    fI3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_useViewLifecycle /* 12 */:
                    fI4 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_zOrderOnTop /* 13 */:
                    fI5 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new MarkerOptions(iF, latLng, strL, strL2, iBinderM, fI, fI2, zC, zC2, zC3, fI3, fI4, fI5);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
