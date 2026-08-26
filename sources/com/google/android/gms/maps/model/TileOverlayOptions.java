package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.bk;

/* JADX INFO: loaded from: classes.dex */
public final class TileOverlayOptions implements SafeParcelable {
    public static final n CREATOR = new n();
    private final int a;
    private com.google.android.gms.maps.model.a.v b;
    private o c;
    private boolean d;
    private float e;

    public TileOverlayOptions() {
        this.d = true;
        this.a = 1;
    }

    TileOverlayOptions(int i, IBinder iBinder, boolean z, float f) {
        this.d = true;
        this.a = i;
        this.b = com.google.android.gms.maps.model.a.w.a(iBinder);
        this.c = this.b == null ? null : new m(this);
        this.d = z;
        this.e = f;
    }

    int a() {
        return this.a;
    }

    IBinder b() {
        return this.b.asBinder();
    }

    public float c() {
        return this.e;
    }

    public boolean d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (bk.a()) {
            z.a(this, parcel, i);
        } else {
            n.a(this, parcel, i);
        }
    }
}
