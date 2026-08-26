package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class ar extends Binder implements aq {
    public static aq a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof aq)) ? new as(iBinder) : (aq) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ak.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                b(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                b(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0 ? bv.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_useViewLifecycle /* 12 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                b(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_zOrderOnTop /* 13 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? co.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? cq.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(x.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.plus.internal.IPlusCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
