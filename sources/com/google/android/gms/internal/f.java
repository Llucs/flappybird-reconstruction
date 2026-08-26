package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ae;
import com.google.android.gms.internal.ah;

/* JADX INFO: loaded from: classes.dex */
public class f implements Parcelable.Creator {
    static void a(ah.b bVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, bVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, bVar.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) bVar.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ah.b createFromParcel(Parcel parcel) {
        ae.a aVar = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iF = 0;
        String strL = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    aVar = (ae.a) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ae.a.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new ah.b(iF, strL, aVar);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ah.b[] newArray(int i) {
        return new ah.b[i];
    }
}
