package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ae;

/* JADX INFO: loaded from: classes.dex */
public class e implements Parcelable.Creator {
    static void a(ae.a aVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, aVar.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, aVar.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, aVar.c());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, aVar.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, aVar.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, aVar.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, aVar.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, aVar.i(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, (Parcelable) aVar.k(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ae.a createFromParcel(Parcel parcel) {
        z zVar = null;
        int iF = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String strL = null;
        String strL2 = null;
        boolean zC = false;
        int iF2 = 0;
        boolean zC2 = false;
        int iF3 = 0;
        int iF4 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    iF4 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    iF3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    iF2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    strL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                    zVar = (z) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, z.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new ae.a(iF4, iF3, zC2, iF2, zC, strL2, iF, strL, zVar);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ae.a[] newArray(int i) {
        return new ae.a[i];
    }
}
