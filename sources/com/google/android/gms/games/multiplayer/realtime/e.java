package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements Parcelable.Creator {
    static void a(RoomEntity roomEntity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, roomEntity.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, roomEntity.k());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, roomEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, roomEntity.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, roomEntity.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, roomEntity.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, roomEntity.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, roomEntity.h(), false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 8, roomEntity.i(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, roomEntity.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RoomEntity createFromParcel(Parcel parcel) {
        int iF = 0;
        ArrayList arrayListC = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long jG = 0;
        Bundle bundleN = null;
        int iF2 = 0;
        String strL = null;
        int iF3 = 0;
        String strL2 = null;
        String strL3 = null;
        int iF4 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    strL3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    strL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    jG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    iF3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    iF2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    bundleN = com.google.android.gms.common.internal.safeparcel.a.n(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, ParticipantEntity.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case 1000:
                    iF4 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new RoomEntity(iF4, strL3, strL2, jG, iF3, strL, iF2, bundleN, arrayListC, iF);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RoomEntity[] newArray(int i) {
        return new RoomEntity[i];
    }
}
