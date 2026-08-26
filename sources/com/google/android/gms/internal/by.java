package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class by implements Parcelable.Creator {
    static void a(cq cqVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, cqVar.f());
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 2, cqVar.a(), false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 3, cqVar.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, cqVar.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, cqVar.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, cqVar.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cq createFromParcel(Parcel parcel) {
        Bundle bundleN = null;
        int iF = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        boolean zC = false;
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        int iF2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    arrayListC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, x.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, x.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    bundleN = com.google.android.gms.common.internal.safeparcel.a.n(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
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
        return new cq(iF2, arrayListC2, arrayListC, bundleN, zC, iF);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cq[] newArray(int i) {
        return new cq[i];
    }
}
