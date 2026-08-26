package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class af extends Binder implements ad {
    public static ad a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ad)) ? new ag(iBinder) : (ad) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                Bundle bundleB = b();
                parcel2.writeNoException();
                if (bundleB == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleB.writeToParcel(parcel2, 1);
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5006:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c();
                parcel2.writeNoException();
                return true;
            case 5007:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                String strD = d();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 5008:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5009:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5010:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5011:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0, parcel.createLongArray());
                parcel2.writeNoException();
                return true;
            case 5012:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                String strE = e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 5013:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                com.google.android.gms.common.data.d dVarF = f();
                parcel2.writeNoException();
                if (dVarF == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                dVarF.writeToParcel(parcel2, 1);
                return true;
            case 5014:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5015:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5016:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5017:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5018:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5019:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5020:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5021:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5022:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5023:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5024:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5025:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5026:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5027:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                e(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5028:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5029:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5030:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readStrongBinder(), parcel.readInt(), parcel.createStringArray(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5031:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readStrongBinder(), parcel.readString(), parcel.readInt() != 0, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5032:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                e(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5033:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                int iA = a(aa.a(parcel.readStrongBinder()), parcel.createByteArray(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iA);
                return true;
            case 5034:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                int iA2 = a(parcel.createByteArray(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                parcel2.writeInt(iA2);
                return true;
            case 5035:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                String strB = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 5036:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5037:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5038:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5039:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5040:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5041:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5042:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                g(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5043:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                h(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5044:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5045:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5046:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5047:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5048:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(aa.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5049:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                g(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5050:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5051:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5052:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5053:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                int iJ = j(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iJ);
                return true;
            case 5054:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5055:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5056:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                h(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5057:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                l(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5058:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5059:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5060:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                int iD = d(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iD);
                return true;
            case 5061:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                k(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5062:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5063:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5064:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                String strA2 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strA2);
                return true;
            case 5065:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5066:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                Uri uriE = e(parcel.readString());
                parcel2.writeNoException();
                if (uriE == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                uriE.writeToParcel(parcel2, 1);
                return true;
            case 5067:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean zG = g();
                parcel2.writeNoException();
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 5068:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5501:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5502:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                com.google.android.gms.common.data.d dVarH = h();
                parcel2.writeNoException();
                if (dVarH == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                dVarH.writeToParcel(parcel2, 1);
                return true;
            case 6001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6003:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(aa.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6004:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                e(aa.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6501:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6502:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6503:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(aa.a(parcel.readStrongBinder()), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6504:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6505:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6506:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6507:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                ParcelFileDescriptor parcelFileDescriptorA = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (parcelFileDescriptorA == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                parcelFileDescriptorA.writeToParcel(parcel2, 1);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.games.internal.IGamesService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
