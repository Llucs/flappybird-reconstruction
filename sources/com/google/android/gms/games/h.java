package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class h implements Parcelable.Creator {
    static void a(GameEntity gameEntity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, gameEntity.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, gameEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, gameEntity.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, gameEntity.e(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, gameEntity.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, gameEntity.g(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, (Parcelable) gameEntity.h(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, (Parcelable) gameEntity.i(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, (Parcelable) gameEntity.j(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, gameEntity.k());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, gameEntity.l());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, gameEntity.m(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, gameEntity.n());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, gameEntity.o());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, gameEntity.p());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, gameEntity.q());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GameEntity createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iF = 0;
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        String strL4 = null;
        String strL5 = null;
        String strL6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        boolean zC = false;
        boolean zC2 = false;
        String strL7 = null;
        int iF2 = 0;
        int iF3 = 0;
        int iF4 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    strL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    strL3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    strL4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    strL5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    strL6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                    uri2 = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                    uri3 = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                    zC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_useViewLifecycle /* 12 */:
                    strL7 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_zOrderOnTop /* 13 */:
                    iF2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case 14:
                    iF3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case 15:
                    iF4 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
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
        return new GameEntity(iF, strL, strL2, strL3, strL4, strL5, strL6, uri, uri2, uri3, zC, zC2, strL7, iF2, iF3, iF4);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GameEntity[] newArray(int i) {
        return new GameEntity[i];
    }
}
