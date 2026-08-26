package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends Binder implements p {
    public static p a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p)) ? new r(iBinder) : (p) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                LatLng latLngA = a(com.google.android.gms.b.f.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (latLngA != null) {
                    parcel2.writeInt(1);
                    latLngA.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                com.google.android.gms.b.e eVarA = a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarA != null ? eVarA.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                VisibleRegion visibleRegionA = a();
                parcel2.writeNoException();
                if (visibleRegionA != null) {
                    parcel2.writeInt(1);
                    visibleRegionA.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
