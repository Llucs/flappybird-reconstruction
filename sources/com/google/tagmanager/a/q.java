package com.google.tagmanager.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class q {
    private static final q d = new q(true);
    private boolean b;
    private boolean c = false;
    private final ax a = ax.a(16);

    private q() {
    }

    private q(boolean z) {
        c();
    }

    static int a(bm bmVar, boolean z) {
        if (z) {
            return 2;
        }
        return bmVar.b();
    }

    public static q a() {
        return new q();
    }

    public static Object a(k kVar, bm bmVar, boolean z) {
        switch (r.b[bmVar.ordinal()]) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                return Double.valueOf(kVar.b());
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                return Float.valueOf(kVar.c());
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                return Long.valueOf(kVar.e());
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                return Long.valueOf(kVar.d());
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                return Integer.valueOf(kVar.f());
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                return Long.valueOf(kVar.g());
            case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                return Integer.valueOf(kVar.h());
            case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                return Boolean.valueOf(kVar.i());
            case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                return z ? kVar.k() : kVar.j();
            case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                return kVar.l();
            case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                return Integer.valueOf(kVar.m());
            case com.google.android.gms.e.MapAttrs_useViewLifecycle /* 12 */:
                return Integer.valueOf(kVar.o());
            case com.google.android.gms.e.MapAttrs_zOrderOnTop /* 13 */:
                return Long.valueOf(kVar.p());
            case 14:
                return Integer.valueOf(kVar.q());
            case 15:
                return Long.valueOf(kVar.r());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void a(bm bmVar, Object obj) {
        boolean z = false;
        if (obj == null) {
            throw new NullPointerException();
        }
        switch (r.a[bmVar.a().ordinal()]) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                z = obj instanceof Integer;
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                z = obj instanceof Long;
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                z = obj instanceof Float;
                break;
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                z = obj instanceof Double;
                break;
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                z = obj instanceof Boolean;
                break;
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                z = obj instanceof String;
                break;
            case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                if ((obj instanceof h) || (obj instanceof byte[])) {
                    z = true;
                }
                break;
            case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                if ((obj instanceof Integer) || (obj instanceof ad)) {
                    z = true;
                }
                break;
            case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                if ((obj instanceof am) || (obj instanceof ag)) {
                    z = true;
                }
                break;
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private boolean a(Map.Entry entry) {
        s sVar = (s) entry.getKey();
        if (sVar.b() == br.MESSAGE) {
            if (sVar.c()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((am) it.next()).j()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof am)) {
                    if (value instanceof ag) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((am) value).j()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static q b() {
        return d;
    }

    private void b(Map.Entry entry) {
        s sVar = (s) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof ag) {
            value = ((ag) value).a();
        }
        if (sVar.c()) {
            Object objA = a(sVar);
            if (objA == null) {
                this.a.put(sVar, new ArrayList((List) value));
                return;
            } else {
                ((List) objA).addAll((List) value);
                return;
            }
        }
        if (sVar.b() != br.MESSAGE) {
            this.a.put(sVar, value);
            return;
        }
        Object objA2 = a(sVar);
        if (objA2 == null) {
            this.a.put(sVar, value);
        } else {
            this.a.put(sVar, objA2 instanceof ap ? sVar.a((ap) objA2, (ap) value) : sVar.a(((am) objA2).n(), (am) value).h());
        }
    }

    public Object a(s sVar) {
        Object obj = this.a.get(sVar);
        return obj instanceof ag ? ((ag) obj).a() : obj;
    }

    public void a(q qVar) {
        for (int i = 0; i < qVar.a.c(); i++) {
            b(qVar.a.b(i));
        }
        Iterator it = qVar.a.d().iterator();
        while (it.hasNext()) {
            b((Map.Entry) it.next());
        }
    }

    public void a(s sVar, Object obj) {
        if (!sVar.c()) {
            a(sVar.a(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a(sVar.a(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof ag) {
            this.c = true;
        }
        this.a.put(sVar, obj);
    }

    public void b(s sVar, Object obj) {
        List arrayList;
        if (!sVar.c()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        a(sVar.a(), obj);
        Object objA = a(sVar);
        if (objA == null) {
            arrayList = new ArrayList();
            this.a.put(sVar, arrayList);
        } else {
            arrayList = (List) objA;
        }
        arrayList.add(obj);
    }

    public void c() {
        if (this.b) {
            return;
        }
        this.a.a();
        this.b = true;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public q clone() {
        q qVarA = a();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.c()) {
                break;
            }
            Map.Entry entryB = this.a.b(i2);
            qVarA.a((s) entryB.getKey(), entryB.getValue());
            i = i2 + 1;
        }
        for (Map.Entry entry : this.a.d()) {
            qVarA.a((s) entry.getKey(), entry.getValue());
        }
        qVarA.c = this.c;
        return qVarA;
    }

    public boolean e() {
        for (int i = 0; i < this.a.c(); i++) {
            if (!a(this.a.b(i))) {
                return false;
            }
        }
        Iterator it = this.a.d().iterator();
        while (it.hasNext()) {
            if (!a((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
