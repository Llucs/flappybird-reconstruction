package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class cb extends Binder implements ca {
    public static ca a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ca)) ? new cd(iBinder) : (ca) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                a(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                a();
                parcel2.writeNoException();
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
