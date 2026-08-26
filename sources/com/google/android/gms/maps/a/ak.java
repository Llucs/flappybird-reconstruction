package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
class ak implements ai {
    private IBinder a;

    ak(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // com.google.android.gms.maps.a.ai
    public void a(com.google.android.gms.maps.model.a.m mVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
            parcelObtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
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
