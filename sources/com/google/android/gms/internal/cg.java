package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
class cg implements ce {
    private IBinder a;

    cg(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // com.google.android.gms.internal.ce
    public int a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            this.a.transact(5001, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ce
    public void a(ca caVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            this.a.transact(5005, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ce
    public void a(ca caVar, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            parcelObtain.writeInt(i);
            this.a.transact(5004, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ce
    public void a(ca caVar, int i, String str, byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeByteArray(bArr);
            this.a.transact(5006, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ce
    public void a(ca caVar, int i, byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeByteArray(bArr);
            this.a.transact(5003, parcelObtain, parcelObtain2, 0);
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

    @Override // com.google.android.gms.internal.ce
    public int b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            this.a.transact(5002, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ce
    public void b(ca caVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            this.a.transact(5008, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ce
    public void b(ca caVar, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            parcelObtain.writeInt(i);
            this.a.transact(5007, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ce
    public void c(ca caVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            this.a.transact(5009, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
