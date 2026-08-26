package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.Cdo;
import com.google.android.gms.internal.dl;
import com.google.android.gms.maps.a.bk;

/* JADX INFO: loaded from: classes.dex */
public final class CameraPosition implements SafeParcelable {
    public static final c CREATOR = new c();
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;
    private final int e;

    CameraPosition(int i, LatLng latLng, float f, float f2, float f3) {
        Cdo.a(latLng, "null camera target");
        Cdo.b(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive");
        this.e = i;
        this.a = latLng;
        this.b = f;
        this.c = f2 + 0.0f;
        this.d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this(1, latLng, f, f2, f3);
    }

    public static CameraPosition a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, com.google.android.gms.e.MapAttrs);
        LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(2) ? typedArrayObtainAttributes.getFloat(2, 0.0f) : 0.0f, typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 0.0f) : 0.0f);
        b bVarB = b();
        bVarB.a(latLng);
        if (typedArrayObtainAttributes.hasValue(5)) {
            bVarB.a(typedArrayObtainAttributes.getFloat(5, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(1)) {
            bVarB.c(typedArrayObtainAttributes.getFloat(1, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(4)) {
            bVarB.b(typedArrayObtainAttributes.getFloat(4, 0.0f));
        }
        return bVarB.a();
    }

    public static b b() {
        return new b();
    }

    int a() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d);
    }

    public int hashCode() {
        return dl.a(this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d));
    }

    public String toString() {
        return dl.a(this).a("target", this.a).a("zoom", Float.valueOf(this.b)).a("tilt", Float.valueOf(this.c)).a("bearing", Float.valueOf(this.d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (bk.a()) {
            q.a(this, parcel, i);
        } else {
            c.a(this, parcel, i);
        }
    }
}
