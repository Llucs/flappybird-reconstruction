package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
class ae implements ac {
    private IBinder a;

    ae(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // com.google.android.gms.maps.a.ac
    public com.google.android.gms.b.e a(com.google.android.gms.maps.model.a.m mVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            parcelObtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            this.a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return com.google.android.gms.b.f.a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }

    @Override // com.google.android.gms.maps.a.ac
    public com.google.android.gms.b.e b(com.google.android.gms.maps.model.a.m mVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            parcelObtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            this.a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return com.google.android.gms.b.f.a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
