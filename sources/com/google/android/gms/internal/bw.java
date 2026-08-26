package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class bw implements Parcelable.Creator {
    static void a(co coVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, coVar.g(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, coVar.k());
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 2, coVar.a(), false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 3, coVar.b(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) coVar.c(), i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, coVar.d(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, coVar.e(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, coVar.f(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, coVar.h(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, coVar.i(), false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, coVar.j());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public co createFromParcel(Parcel parcel) {
        int iF = 0;
        Bundle bundleN = null;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        Bundle bundleN2 = null;
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        Uri uri = null;
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        String strL4 = null;
        int iF2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    strL4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    arrayListC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, x.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, Uri.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, Uri.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    strL3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    strL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                    bundleN2 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                    bundleN = com.google.android.gms.common.internal.safeparcel.a.n(parcel, iA);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
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
        return new co(iF2, strL4, arrayListC2, arrayListC, uri, strL3, strL2, strL, bundleN2, bundleN, iF);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public co[] newArray(int i) {
        return new co[i];
    }
}
