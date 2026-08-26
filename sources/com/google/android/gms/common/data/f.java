package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class f implements Parcelable.Creator {
    static void a(d dVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, dVar.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, dVar.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable[]) dVar.d(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, dVar.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, dVar.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d createFromParcel(Parcel parcel) {
        int iF = 0;
        Bundle bundleN = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArrW = null;
        int iF2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    strArrW = com.google.android.gms.common.internal.safeparcel.a.w(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    cursorWindowArr = (CursorWindow[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA, CursorWindow.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    bundleN = com.google.android.gms.common.internal.safeparcel.a.n(parcel, iA);
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
        d dVar = new d(iF2, strArrW, cursorWindowArr, iF, bundleN);
        dVar.a();
        return dVar;
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d[] newArray(int i) {
        return new d[i];
    }
}
