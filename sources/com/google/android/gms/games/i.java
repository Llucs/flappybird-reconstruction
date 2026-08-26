package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class i implements Parcelable.Creator {
    static void a(PlayerEntity playerEntity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, playerEntity.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, playerEntity.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, playerEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) playerEntity.d(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) playerEntity.e(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, playerEntity.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PlayerEntity createFromParcel(Parcel parcel) {
        Uri uri = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iF = 0;
        long jG = 0;
        Uri uri2 = null;
        String strL = null;
        String strL2 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    strL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    uri2 = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    jG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
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
        return new PlayerEntity(iF, strL2, strL, uri2, uri, jG);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PlayerEntity[] newArray(int i) {
        return new PlayerEntity[i];
    }
}
