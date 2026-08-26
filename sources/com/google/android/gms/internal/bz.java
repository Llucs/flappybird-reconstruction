package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ae;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bz extends ae implements SafeParcelable, com.google.android.gms.plus.a.a.b {
    public static final bk CREATOR = new bk();
    private static final HashMap a = new HashMap();
    private final Set b;
    private final int c;
    private String d;
    private bx e;
    private String f;
    private bx g;
    private String h;

    static {
        a.put("id", ae.a.d("id", 2));
        a.put("result", ae.a.a("result", 4, bx.class));
        a.put("startDate", ae.a.d("startDate", 5));
        a.put("target", ae.a.a("target", 6, bx.class));
        a.put("type", ae.a.d("type", 7));
    }

    public bz() {
        this.c = 1;
        this.b = new HashSet();
    }

    bz(Set set, int i, String str, bx bxVar, String str2, bx bxVar2, String str3) {
        this.b = set;
        this.c = i;
        this.d = str;
        this.e = bxVar;
        this.f = str2;
        this.g = bxVar2;
        this.h = str3;
    }

    @Override // com.google.android.gms.internal.ae
    protected Object a(String str) {
        return null;
    }

    @Override // com.google.android.gms.internal.ae
    protected boolean a(ae.a aVar) {
        return this.b.contains(Integer.valueOf(aVar.g()));
    }

    @Override // com.google.android.gms.internal.ae
    protected Object b(ae.a aVar) {
        switch (aVar.g()) {
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                return this.d;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.g());
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                return this.e;
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                return this.f;
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                return this.g;
            case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                return this.h;
        }
    }

    @Override // com.google.android.gms.internal.ae
    public HashMap b() {
        return a;
    }

    @Override // com.google.android.gms.internal.ae
    protected boolean b(String str) {
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        bk bkVar = CREATOR;
        return 0;
    }

    Set e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bz)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bz bzVar = (bz) obj;
        for (ae.a aVar : a.values()) {
            if (a(aVar)) {
                if (bzVar.a(aVar) && b(aVar).equals(bzVar.b(aVar))) {
                }
                return false;
            }
            if (bzVar.a(aVar)) {
                return false;
            }
        }
        return true;
    }

    int f() {
        return this.c;
    }

    public String g() {
        return this.d;
    }

    bx h() {
        return this.e;
    }

    public int hashCode() {
        int iHashCode = 0;
        Iterator it = a.values().iterator();
        while (true) {
            int i = iHashCode;
            if (!it.hasNext()) {
                return i;
            }
            ae.a aVar = (ae.a) it.next();
            if (a(aVar)) {
                iHashCode = b(aVar).hashCode() + i + aVar.g();
            } else {
                iHashCode = i;
            }
        }
    }

    public String i() {
        return this.f;
    }

    bx j() {
        return this.g;
    }

    public String k() {
        return this.h;
    }

    @Override // com.google.android.gms.common.data.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public bz a() {
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        bk bkVar = CREATOR;
        bk.a(this, parcel, i);
    }
}
