package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cc;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class br implements Parcelable.Creator {
    static void a(cc.d dVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        Set setE = dVar.e();
        if (setE.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, dVar.f());
        }
        if (setE.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, dVar.g(), true);
        }
        if (setE.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, dVar.h(), true);
        }
        if (setE.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, dVar.i(), true);
        }
        if (setE.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, dVar.j(), true);
        }
        if (setE.contains(6)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, dVar.k(), true);
        }
        if (setE.contains(7)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, dVar.l(), true);
        }
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cc.d createFromParcel(Parcel parcel) {
        String strL = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashSet = new HashSet();
        int iF = 0;
        String strL2 = null;
        String strL3 = null;
        String strL4 = null;
        String strL5 = null;
        String strL6 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    hashSet.add(1);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    strL6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(2);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    strL5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(3);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    strL4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(4);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    strL3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(5);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    strL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(6);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(7);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new cc.d(hashSet, iF, strL6, strL5, strL4, strL3, strL2, strL);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cc.d[] newArray(int i) {
        return new cc.d[i];
    }
}
