package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class bg implements Parcelable.Creator {
    static void a(bv bvVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, bvVar.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, bvVar.a());
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 2, bvVar.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 3, bvVar.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, bvVar.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bv createFromParcel(Parcel parcel) {
        boolean zC = false;
        ArrayList arrayListC = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        ArrayList arrayListC2 = null;
        String strL = null;
        int iF = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    arrayListC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, x.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, x.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
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
        return new bv(iF, strL, arrayListC2, arrayListC, zC);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bv[] newArray(int i) {
        return new bv[i];
    }
}
