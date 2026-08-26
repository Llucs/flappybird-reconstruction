package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Binder implements a {
    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new c(iBinder) : (a) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e eVarA = a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarA != null ? eVarA.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e eVarB = b();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarB != null ? eVarB.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e eVarA2 = a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarA2 != null ? eVarA2.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e eVarA3 = a(parcel.readFloat());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarA3 != null ? eVarA3.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e eVarB2 = b(parcel.readFloat());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarB2 != null ? eVarB2.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e eVarA4 = a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarA4 != null ? eVarA4.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e eVarA5 = a(parcel.readInt() != 0 ? CameraPosition.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarA5 != null ? eVarA5.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e eVarA6 = a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarA6 != null ? eVarA6.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e eVarA7 = a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null, parcel.readFloat());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarA7 != null ? eVarA7.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e eVarA8 = a(parcel.readInt() != 0 ? LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarA8 != null ? eVarA8.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e eVarA9 = a(parcel.readInt() != 0 ? LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarA9 != null ? eVarA9.asBinder() : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
