package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

/* JADX INFO: loaded from: classes.dex */
public abstract class aa extends Binder implements y {
    public aa() {
        attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
    }

    public static y a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof y)) ? new ac(iBinder) : (y) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                b(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                b(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5006:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                c(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5007:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5008:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                e(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5009:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                f(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5010:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                g(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5011:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                h(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5012:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                k(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5013:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5014:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                l(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5015:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5016:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a();
                parcel2.writeNoException();
                return true;
            case 5017:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                i(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5018:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                m(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5019:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                n(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5020:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                c(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5021:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                o(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5022:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                p(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5023:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                q(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5024:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                r(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5025:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                s(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5026:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5027:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                b(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5028:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                c(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5029:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5030:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                e(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5031:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                f(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5032:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readInt() != 0 ? (RealTimeMessage) RealTimeMessage.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5033:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5034:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5035:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                u(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5036:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                c(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5037:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                j(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5038:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                t(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5039:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                v(parcel.readInt() != 0 ? com.google.android.gms.common.data.d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5040:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.games.internal.IGamesCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
