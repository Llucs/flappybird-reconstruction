package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f implements Parcelable.Creator {
    static void a(InvitationEntity invitationEntity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, (Parcelable) invitationEntity.b(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, invitationEntity.h());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, invitationEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, invitationEntity.e());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, invitationEntity.f());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, (Parcelable) invitationEntity.d(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 6, invitationEntity.i(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, invitationEntity.g());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvitationEntity createFromParcel(Parcel parcel) {
        int iF = 0;
        ArrayList arrayListC = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long jG = 0;
        ParticipantEntity participantEntity = null;
        int iF2 = 0;
        String strL = null;
        GameEntity gameEntity = null;
        int iF3 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    gameEntity = (GameEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, GameEntity.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    jG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    iF2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    participantEntity = (ParticipantEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, ParticipantEntity.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, ParticipantEntity.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
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
        return new InvitationEntity(iF3, gameEntity, strL, jG, iF2, participantEntity, arrayListC, iF);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvitationEntity[] newArray(int i) {
        return new InvitationEntity[i];
    }
}
