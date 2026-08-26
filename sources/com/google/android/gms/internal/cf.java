package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class cf extends Binder implements ce {
    public static ce a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ce)) ? new cg(iBinder) : (ce) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                int iA = a();
                parcel2.writeNoException();
                parcel2.writeInt(iA);
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                int iB = b();
                parcel2.writeNoException();
                parcel2.writeInt(iB);
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(cb.a(parcel.readStrongBinder()), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(cb.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(cb.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5006:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                a(cb.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 5007:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                b(cb.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5008:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                b(cb.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5009:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                c(cb.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.appstate.internal.IAppStateService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
