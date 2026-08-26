package com.google.android.gms.plus;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class l implements Parcelable.Creator {
    static void a(a aVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, aVar.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, aVar.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, aVar.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, aVar.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, aVar.e(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, aVar.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, aVar.g(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, aVar.h(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a createFromParcel(Parcel parcel) {
        String strL = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iF = 0;
        String strL2 = null;
        String strL3 = null;
        String[] strArrW = null;
        String[] strArrW2 = null;
        String[] strArrW3 = null;
        String strL4 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    strL4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    strArrW3 = com.google.android.gms.common.internal.safeparcel.a.w(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    strArrW2 = com.google.android.gms.common.internal.safeparcel.a.w(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    strArrW = com.google.android.gms.common.internal.safeparcel.a.w(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    strL3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    strL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case 1000:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new a(iF, strL4, strArrW3, strArrW2, strArrW, strL3, strL2, strL);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a[] newArray(int i) {
        return new a[i];
    }
}
