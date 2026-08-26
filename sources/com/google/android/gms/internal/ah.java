package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ae;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ah implements SafeParcelable {
    public static final g CREATOR = new g();
    private final int a;
    private final HashMap b;
    private final ArrayList c = null;
    private final String d;

    public class a implements SafeParcelable {
        public static final h CREATOR = new h();
        final int a;
        final String b;
        final ArrayList c;

        a(int i, String str, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = arrayList;
        }

        a(String str, HashMap map) {
            this.a = 1;
            this.b = str;
            this.c = a(map);
        }

        private static ArrayList a(HashMap map) {
            if (map == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : map.keySet()) {
                arrayList.add(new b(str, (ae.a) map.get(str)));
            }
            return arrayList;
        }

        HashMap a() {
            HashMap map = new HashMap();
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                b bVar = (b) this.c.get(i);
                map.put(bVar.b, bVar.c);
            }
            return map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            h hVar = CREATOR;
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            h hVar = CREATOR;
            h.a(this, parcel, i);
        }
    }

    public class b implements SafeParcelable {
        public static final f CREATOR = new f();
        final int a;
        final String b;
        final ae.a c;

        b(int i, String str, ae.a aVar) {
            this.a = i;
            this.b = str;
            this.c = aVar;
        }

        b(String str, ae.a aVar) {
            this.a = 1;
            this.b = str;
            this.c = aVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            f fVar = CREATOR;
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            f fVar = CREATOR;
            f.a(this, parcel, i);
        }
    }

    ah(int i, ArrayList arrayList, String str) {
        this.a = i;
        this.b = a(arrayList);
        this.d = (String) Cdo.a(str);
        a();
    }

    private static HashMap a(ArrayList arrayList) {
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) arrayList.get(i);
            map.put(aVar.b, aVar.a());
        }
        return map;
    }

    public HashMap a(String str) {
        return (HashMap) this.b.get(str);
    }

    public void a() {
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            HashMap map = (HashMap) this.b.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((ae.a) map.get((String) it2.next())).a(this);
            }
        }
    }

    int b() {
        return this.a;
    }

    ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            arrayList.add(new a(str, (HashMap) this.b.get(str)));
        }
        return arrayList;
    }

    public String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        g gVar = CREATOR;
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.b.keySet()) {
            sb.append(str).append(":\n");
            HashMap map = (HashMap) this.b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ").append(str2).append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        g gVar = CREATOR;
        g.a(this, parcel, i);
    }
}
