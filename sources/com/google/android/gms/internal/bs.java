package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cc;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class bs implements Parcelable.Creator {
    static void a(cc.f fVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        Set setE = fVar.e();
        if (setE.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, fVar.f());
        }
        if (setE.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, fVar.g(), true);
        }
        if (setE.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, fVar.h(), true);
        }
        if (setE.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, fVar.i(), true);
        }
        if (setE.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, fVar.j(), true);
        }
        if (setE.contains(6)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, fVar.k(), true);
        }
        if (setE.contains(7)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, fVar.l());
        }
        if (setE.contains(8)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, fVar.m(), true);
        }
        if (setE.contains(9)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, fVar.n(), true);
        }
        if (setE.contains(10)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, fVar.o());
        }
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cc.f createFromParcel(Parcel parcel) {
        int iF = 0;
        String strL = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashSet = new HashSet();
        String strL2 = null;
        boolean zC = false;
        String strL3 = null;
        String strL4 = null;
        String strL5 = null;
        String strL6 = null;
        String strL7 = null;
        int iF2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    iF2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    hashSet.add(1);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    strL7 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(2);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    strL6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(3);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    strL5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(4);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    strL4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(5);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    strL3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(6);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    hashSet.add(7);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                    strL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(8);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(9);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    hashSet.add(10);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new cc.f(hashSet, iF2, strL7, strL6, strL5, strL4, strL3, zC, strL2, strL, iF);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cc.f[] newArray(int i) {
        return new cc.f[i];
    }
}
