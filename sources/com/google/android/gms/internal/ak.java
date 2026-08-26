package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ae;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ak extends ae implements SafeParcelable {
    public static final i CREATOR = new i();
    private final int a;
    private final Parcel b;
    private final int c = 2;
    private final ah d;
    private final String e;
    private int f;
    private int g;

    ak(int i, Parcel parcel, ah ahVar) {
        this.a = i;
        this.b = (Parcel) Cdo.a(parcel);
        this.d = ahVar;
        if (this.d == null) {
            this.e = null;
        } else {
            this.e = this.d.d();
        }
        this.f = 2;
    }

    public static HashMap a(Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            map.put(str, bundle.getString(str));
        }
        return map;
    }

    private static HashMap a(HashMap map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(Integer.valueOf(((ae.a) entry.getValue()).g()), entry);
        }
        return map2;
    }

    private void a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                sb.append(obj);
                return;
            case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                sb.append("\"").append(n.a(obj.toString())).append("\"");
                return;
            case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                sb.append("\"").append(l.a((byte[]) obj)).append("\"");
                return;
            case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                sb.append("\"").append(l.b((byte[]) obj));
                sb.append("\"");
                return;
            case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                o.a(sb, (HashMap) obj);
                return;
            case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    private void a(StringBuilder sb, ae.a aVar, Parcel parcel, int i) {
        switch (aVar.d()) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                a(sb, aVar, a(aVar, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.f(parcel, i))));
                return;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                a(sb, aVar, a(aVar, com.google.android.gms.common.internal.safeparcel.a.h(parcel, i)));
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                a(sb, aVar, a(aVar, Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i))));
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                a(sb, aVar, a(aVar, Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i))));
                return;
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                a(sb, aVar, a(aVar, Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.j(parcel, i))));
                return;
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                a(sb, aVar, a(aVar, com.google.android.gms.common.internal.safeparcel.a.k(parcel, i)));
                return;
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                a(sb, aVar, a(aVar, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i))));
                return;
            case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                a(sb, aVar, a(aVar, com.google.android.gms.common.internal.safeparcel.a.l(parcel, i)));
                return;
            case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
            case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                a(sb, aVar, a(aVar, com.google.android.gms.common.internal.safeparcel.a.o(parcel, i)));
                return;
            case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                a(sb, aVar, a(aVar, a(com.google.android.gms.common.internal.safeparcel.a.n(parcel, i))));
                return;
            case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown field out type = " + aVar.d());
        }
    }

    private void a(StringBuilder sb, ae.a aVar, Object obj) {
        if (aVar.c()) {
            a(sb, aVar, (ArrayList) obj);
        } else {
            a(sb, aVar.b(), obj);
        }
    }

    private void a(StringBuilder sb, ae.a aVar, ArrayList arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            a(sb, aVar.b(), arrayList.get(i));
        }
        sb.append("]");
    }

    private void a(StringBuilder sb, String str, ae.a aVar, Parcel parcel, int i) {
        sb.append("\"").append(str).append("\":");
        if (aVar.j()) {
            a(sb, aVar, parcel, i);
        } else {
            b(sb, aVar, parcel, i);
        }
    }

    private void a(StringBuilder sb, HashMap map, Parcel parcel) {
        HashMap mapA = a(map);
        sb.append('{');
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            Map.Entry entry = (Map.Entry) mapA.get(Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.a(iA)));
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                a(sb, (String) entry.getKey(), (ae.a) entry.getValue(), parcel, iA);
                z = true;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        sb.append('}');
    }

    private void b(StringBuilder sb, ae.a aVar, Parcel parcel, int i) {
        if (aVar.e()) {
            sb.append("[");
            switch (aVar.d()) {
                case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                    k.a(sb, com.google.android.gms.common.internal.safeparcel.a.q(parcel, i));
                    break;
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    k.a(sb, com.google.android.gms.common.internal.safeparcel.a.s(parcel, i));
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    k.a(sb, com.google.android.gms.common.internal.safeparcel.a.r(parcel, i));
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    k.a(sb, com.google.android.gms.common.internal.safeparcel.a.t(parcel, i));
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    k.a(sb, com.google.android.gms.common.internal.safeparcel.a.u(parcel, i));
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    k.a(sb, com.google.android.gms.common.internal.safeparcel.a.v(parcel, i));
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    k.a(sb, com.google.android.gms.common.internal.safeparcel.a.p(parcel, i));
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    k.a(sb, com.google.android.gms.common.internal.safeparcel.a.w(parcel, i));
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                    Parcel[] parcelArrZ = com.google.android.gms.common.internal.safeparcel.a.z(parcel, i);
                    int length = parcelArrZ.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            sb.append(",");
                        }
                        parcelArrZ[i2].setDataPosition(0);
                        a(sb, aVar.l(), parcelArrZ[i2]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            sb.append("]");
            return;
        }
        switch (aVar.d()) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                sb.append(com.google.android.gms.common.internal.safeparcel.a.f(parcel, i));
                return;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                sb.append(com.google.android.gms.common.internal.safeparcel.a.h(parcel, i));
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                sb.append(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i));
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                sb.append(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i));
                return;
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                sb.append(com.google.android.gms.common.internal.safeparcel.a.j(parcel, i));
                return;
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                sb.append(com.google.android.gms.common.internal.safeparcel.a.k(parcel, i));
                return;
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                sb.append(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i));
                return;
            case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                sb.append("\"").append(n.a(com.google.android.gms.common.internal.safeparcel.a.l(parcel, i))).append("\"");
                return;
            case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                sb.append("\"").append(l.a(com.google.android.gms.common.internal.safeparcel.a.o(parcel, i))).append("\"");
                return;
            case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                sb.append("\"").append(l.b(com.google.android.gms.common.internal.safeparcel.a.o(parcel, i)));
                sb.append("\"");
                return;
            case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                Bundle bundleN = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i);
                Set<String> setKeySet = bundleN.keySet();
                setKeySet.size();
                sb.append("{");
                boolean z = true;
                for (String str : setKeySet) {
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append("\"").append(str).append("\"");
                    sb.append(":");
                    sb.append("\"").append(n.a(bundleN.getString(str))).append("\"");
                    z = false;
                }
                sb.append("}");
                return;
            case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                Parcel parcelY = com.google.android.gms.common.internal.safeparcel.a.y(parcel, i);
                parcelY.setDataPosition(0);
                a(sb, aVar.l(), parcelY);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    public int a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ae
    protected Object a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.internal.ae
    public HashMap b() {
        if (this.d == null) {
            return null;
        }
        return this.d.a(this.e);
    }

    @Override // com.google.android.gms.internal.ae
    protected boolean b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        i iVar = CREATOR;
        return 0;
    }

    public Parcel e() {
        switch (this.f) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                this.g = com.google.android.gms.common.internal.safeparcel.c.a(this.b);
                com.google.android.gms.common.internal.safeparcel.c.a(this.b, this.g);
                this.f = 2;
                break;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                com.google.android.gms.common.internal.safeparcel.c.a(this.b, this.g);
                this.f = 2;
                break;
        }
        return this.b;
    }

    ah f() {
        switch (this.c) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                return null;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                return this.d;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                return this.d;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.c);
        }
    }

    @Override // com.google.android.gms.internal.ae
    public String toString() {
        Cdo.a(this.d, "Cannot convert to JSON on client side.");
        Parcel parcelE = e();
        parcelE.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        a(sb, this.d.a(this.e), parcelE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        i iVar = CREATOR;
        i.a(this, parcel, i);
    }
}
