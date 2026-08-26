package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class dj extends Binder implements di {
    public static di a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof di)) ? new dk(iBinder) : (di) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
                com.google.android.gms.b.e eVarA = a(com.google.android.gms.b.f.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarA != null ? eVarA.asBinder() : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.common.internal.ISignInButtonCreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
