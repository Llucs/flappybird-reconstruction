package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.e;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    static void a(DetectedActivity detectedActivity, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, detectedActivity.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, detectedActivity.b());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, detectedActivity.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DetectedActivity createFromParcel(Parcel parcel) {
        int iF = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iF2 = 0;
        int iF3 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case e.MapAttrs_cameraBearing /* 1 */:
                    iF2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    break;
                case e.MapAttrs_cameraTargetLat /* 2 */:
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
        return new DetectedActivity(iF3, iF2, iF);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DetectedActivity[] newArray(int i) {
        return new DetectedActivity[i];
    }
}
