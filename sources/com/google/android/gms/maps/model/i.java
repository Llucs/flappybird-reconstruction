package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class i implements Parcelable.Creator {
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

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PolygonOptions createFromParcel(Parcel parcel) {
        float fI = 0.0f;
        boolean zC = false;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        ArrayList arrayListC = null;
        ArrayList arrayList = new ArrayList();
        boolean zC2 = false;
        int iF = 0;
        int iF2 = 0;
        float fI2 = 0.0f;
        int iF3 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    iF3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, LatLng.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, arrayList, getClass().getClassLoader());
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    fI2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    iF2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    fI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new PolygonOptions(iF3, arrayListC, arrayList, fI2, iF2, iF, fI, zC2, zC);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
