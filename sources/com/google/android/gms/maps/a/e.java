package com.google.android.gms.maps.a;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends Binder implements d {
    public static d a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new f(iBinder) : (d) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                CameraPosition cameraPositionA = a();
                parcel2.writeNoException();
                if (cameraPositionA == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                cameraPositionA.writeToParcel(parcel2, 1);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                float fB = b();
                parcel2.writeNoException();
                parcel2.writeFloat(fB);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                float fC = c();
                parcel2.writeNoException();
                parcel2.writeFloat(fC);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(com.google.android.gms.b.f.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                b(com.google.android.gms.b.f.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(com.google.android.gms.b.f.a(parcel.readStrongBinder()), x.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(com.google.android.gms.b.f.a(parcel.readStrongBinder()), parcel.readInt(), x.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                d();
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                com.google.android.gms.maps.model.a.a aVarA = a(parcel.readInt() != 0 ? PolylineOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(aVarA != null ? aVarA.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                com.google.android.gms.maps.model.a.p pVarA = a(parcel.readInt() != 0 ? PolygonOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(pVarA != null ? pVarA.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                com.google.android.gms.maps.model.a.m mVarA = a(parcel.readInt() != 0 ? MarkerOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(mVarA != null ? mVarA.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_useViewLifecycle /* 12 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                com.google.android.gms.maps.model.a.j jVarA = a(parcel.readInt() != 0 ? GroundOverlayOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(jVarA != null ? jVarA.asBinder() : null);
                return true;
            case com.google.android.gms.e.MapAttrs_zOrderOnTop /* 13 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                com.google.android.gms.maps.model.a.s sVarA = a(parcel.readInt() != 0 ? TileOverlayOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(sVarA != null ? sVarA.asBinder() : null);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                e();
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                int iF = f();
                parcel2.writeNoException();
                parcel2.writeInt(iF);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean zG = g();
                parcel2.writeNoException();
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean zH = h();
                parcel2.writeNoException();
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean zB = b(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(zB ? 1 : 0);
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean zI = i();
                parcel2.writeNoException();
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                c(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                Location locationJ = j();
                parcel2.writeNoException();
                if (locationJ == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                locationJ.writeToParcel(parcel2, 1);
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(h.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                s sVarK = k();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(sVarK != null ? sVarK.asBinder() : null);
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                p pVarL = l();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(pVarL != null ? pVarL.asBinder() : null);
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(ag.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(ap.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(as.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 30:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(av.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(ay.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 32:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(aj.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 33:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(ad.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                com.google.android.gms.b.e eVarM = m();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(eVarM != null ? eVarM.asBinder() : null);
                return true;
            case 35:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                com.google.android.gms.maps.model.a.g gVarA = a(parcel.readInt() != 0 ? CircleOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(gVarA != null ? gVarA.asBinder() : null);
                return true;
            case 36:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(be.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(bb.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 38:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(bh.a(parcel.readStrongBinder()), com.google.android.gms.b.f.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 39:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
