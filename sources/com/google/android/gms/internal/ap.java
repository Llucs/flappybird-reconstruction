package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ap implements Parcelable.Creator {
    static void a(bi biVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, biVar.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, biVar.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, biVar.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, biVar.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, biVar.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, biVar.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, biVar.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, biVar.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bi createFromParcel(Parcel parcel) {
        double dJ = 0.0d;
        short sE = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String strL = null;
        float fI = 0.0f;
        long jG = 0;
        double dJ2 = 0.0d;
        int iF = 0;
        int iF2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    jG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    sE = com.google.android.gms.common.internal.safeparcel.a.e(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    dJ2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    dJ = com.google.android.gms.common.internal.safeparcel.a.j(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    fI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case 1000:
                    iF2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new bi(iF2, strL, iF, sE, dJ2, dJ, fI, jG);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bi[] newArray(int i) {
        return new bi[i];
    }
}
