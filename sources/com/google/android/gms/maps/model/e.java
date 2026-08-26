package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class e implements Parcelable.Creator {
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

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GroundOverlayOptions createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iF = 0;
        IBinder iBinderM = null;
        LatLng latLng = null;
        float fI = 0.0f;
        float fI2 = 0.0f;
        LatLngBounds latLngBounds = null;
        float fI3 = 0.0f;
        float fI4 = 0.0f;
        boolean zC = false;
        float fI5 = 0.0f;
        float fI6 = 0.0f;
        float fI7 = 0.0f;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    iBinderM = com.google.android.gms.common.internal.safeparcel.a.m(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLng.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    fI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    fI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    latLngBounds = (LatLngBounds) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, LatLngBounds.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    fI3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                    fI4 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                    fI5 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                    fI6 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_useViewLifecycle /* 12 */:
                    fI7 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new GroundOverlayOptions(iF, iBinderM, latLng, fI, fI2, latLngBounds, fI3, fI4, zC, fI5, fI6, fI7);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GroundOverlayOptions[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
