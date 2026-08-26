package com.google.android.gms.maps.a;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
class bi implements bg {
    private IBinder a;

    bi(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // com.google.android.gms.maps.a.bg
    public void a(Bitmap bitmap) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            if (bitmap != null) {
                parcelObtain.writeInt(1);
                bitmap.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }
}
