package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ah;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g implements Parcelable.Creator {
    static void a(ah ahVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, ahVar.b());
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 2, ahVar.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ahVar.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ah createFromParcel(Parcel parcel) {
        String strL = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iF = 0;
        ArrayList arrayListC = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, ah.a.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new ah(iF, arrayListC, strL);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ah[] newArray(int i) {
        return new ah[i];
    }
}
