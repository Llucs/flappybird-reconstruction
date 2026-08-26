package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;

/* JADX INFO: loaded from: classes.dex */
public class g implements Parcelable.Creator {
    static void a(ParticipantEntity participantEntity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, participantEntity.i(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, participantEntity.k());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, participantEntity.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, (Parcelable) participantEntity.g(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) participantEntity.h(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, participantEntity.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, participantEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, participantEntity.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, (Parcelable) participantEntity.j(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, participantEntity.d());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParticipantEntity createFromParcel(Parcel parcel) {
        int iF = 0;
        PlayerEntity playerEntity = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        boolean zC = false;
        String strL = null;
        int iF2 = 0;
        Uri uri = null;
        Uri uri2 = null;
        String strL2 = null;
        String strL3 = null;
        int iF3 = 0;
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
                    uri2 = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    iF2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                    playerEntity = (PlayerEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, PlayerEntity.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case 1000:
                    iF3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new ParticipantEntity(iF3, strL3, strL2, uri2, uri, iF2, strL, zC, playerEntity, iF);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParticipantEntity[] newArray(int i) {
        return new ParticipantEntity[i];
    }
}
