package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable.Creator {
    static void a(ActivityRecognitionResult activityRecognitionResult, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 1, activityRecognitionResult.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, activityRecognitionResult.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, activityRecognitionResult.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, activityRecognitionResult.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ActivityRecognitionResult createFromParcel(Parcel parcel) {
        long jG = 0;
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int iF = 0;
        ArrayList arrayListC = null;
        long jG2 = 0;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case e.MapAttrs_cameraBearing /* 1 */:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, DetectedActivity.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLat /* 2 */:
                    jG2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, iA);
                    break;
                case e.MapAttrs_cameraTargetLng /* 3 */:
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
        return new ActivityRecognitionResult(iF, arrayListC, jG2, jG);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ActivityRecognitionResult[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
