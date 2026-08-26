package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes.dex */
public abstract class aa extends Binder implements z {
    public static z a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof z)) ? new ab(iBinder) : (z) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                a(com.google.android.gms.b.f.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                j jVarB = b(com.google.android.gms.b.f.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(jVarB != null ? jVarB.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                m mVarA = a(com.google.android.gms.b.f.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? GoogleMapOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(mVarA != null ? mVarA.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                a aVarA = a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(aVarA != null ? aVarA.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                com.google.android.gms.maps.model.a.d dVarB = b();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(dVarB != null ? dVarB.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                a(com.google.android.gms.b.f.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.ICreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
