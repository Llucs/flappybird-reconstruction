package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
class dk implements di {
    private IBinder a;

    dk(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // com.google.android.gms.internal.di
    public com.google.android.gms.b.e a(com.google.android.gms.b.e eVar, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
            parcelObtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
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
}
