package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.e;

/* JADX INFO: loaded from: classes.dex */
public class c implements Parcelable.Creator {
    static void a(LocationRequest locationRequest, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, locationRequest.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, locationRequest.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, locationRequest.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, locationRequest.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, locationRequest.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, locationRequest.e);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, locationRequest.f);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, locationRequest.g);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LocationRequest createFromParcel(Parcel parcel) {
        boolean zC = false;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iF = 102;
        long jG = 3600000;
        long jG2 = 600000;
        long jG3 = Long.MAX_VALUE;
        int iF2 = Integer.MAX_VALUE;
        float fI = 0.0f;
        int iF3 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case e.MapAttrs_cameraBearing /* 1 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case e.MapAttrs_cameraTargetLat /* 2 */:
                    jG = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case e.MapAttrs_cameraTargetLng /* 3 */:
                    jG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case e.MapAttrs_cameraTilt /* 4 */:
                    zC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA);
                    break;
                case e.MapAttrs_cameraZoom /* 5 */:
                    jG3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case e.MapAttrs_uiCompass /* 6 */:
                    iF2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case e.MapAttrs_uiRotateGestures /* 7 */:
                    fI = com.google.android.gms.common.internal.safeparcel.a.i(parcel, iA);
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
        return new LocationRequest(iF3, iF, jG, jG2, zC, jG3, iF2, fI);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
