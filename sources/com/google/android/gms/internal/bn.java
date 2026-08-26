package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cc;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class bn implements Parcelable.Creator {
    static void a(cc.b bVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        Set setE = bVar.e();
        if (setE.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, bVar.f());
        }
        if (setE.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) bVar.g(), i, true);
        }
        if (setE.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) bVar.h(), i, true);
        }
        if (setE.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, bVar.i());
        }
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cc.b createFromParcel(Parcel parcel) {
        cc.b.C0000b c0000b = null;
        int iF = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashSet = new HashSet();
        cc.b.a aVar = null;
        int iF2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    iF2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    hashSet.add(1);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    cc.b.a aVar2 = (cc.b.a) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, cc.b.a.CREATOR);
                    hashSet.add(2);
                    aVar = aVar2;
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    cc.b.C0000b c0000b2 = (cc.b.C0000b) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, cc.b.C0000b.CREATOR);
                    hashSet.add(3);
                    c0000b = c0000b2;
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    hashSet.add(4);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new cc.b(hashSet, iF2, aVar, c0000b, iF);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cc.b[] newArray(int i) {
        return new cc.b[i];
    }
}
