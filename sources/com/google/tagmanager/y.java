package com.google.tagmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class y {
    private static final Object a = null;
    private static Long b = new Long(0);
    private static Double c = new Double(0.0d);
    private static x d = x.a(0);
    private static String e = new String("");
    private static Boolean f = new Boolean(false);
    private static List g = new ArrayList(0);
    private static Map h = new HashMap();
    private static com.google.analytics.b.a.a.c i = a(e);

    public static com.google.analytics.b.a.a.c a() {
        return i;
    }

    public static com.google.analytics.b.a.a.c a(Object obj) {
        boolean z = false;
        com.google.analytics.b.a.a.e eVarF = com.google.analytics.b.a.a.c.F();
        if (obj instanceof com.google.analytics.b.a.a.c) {
            return (com.google.analytics.b.a.a.c) obj;
        }
        if (obj instanceof String) {
            eVarF.a(com.google.analytics.b.a.a.h.STRING).a((String) obj);
        } else if (obj instanceof List) {
            eVarF.a(com.google.analytics.b.a.a.h.LIST);
            Iterator it = ((List) obj).iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                com.google.analytics.b.a.a.c cVarA = a(it.next());
                if (cVarA == i) {
                    return i;
                }
                z2 = z2 || cVarA.E();
                eVarF.b(cVarA);
            }
            z = z2;
        } else if (obj instanceof Map) {
            eVarF.a(com.google.analytics.b.a.a.h.MAP);
            boolean z3 = false;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                com.google.analytics.b.a.a.c cVarA2 = a(entry.getKey());
                com.google.analytics.b.a.a.c cVarA3 = a(entry.getValue());
                if (cVarA2 == i || cVarA3 == i) {
                    return i;
                }
                boolean z4 = z3 || cVarA2.E() || cVarA3.E();
                eVarF.c(cVarA2);
                eVarF.d(cVarA3);
                z3 = z4;
            }
            z = z3;
        } else if (b(obj)) {
            eVarF.a(com.google.analytics.b.a.a.h.STRING).a(obj.toString());
        } else if (c(obj)) {
            eVarF.a(com.google.analytics.b.a.a.h.INTEGER).a(d(obj));
        } else {
            if (!(obj instanceof Boolean)) {
                i.a("Converting to Value from unknown object type: " + (obj == null ? "null" : obj.getClass().toString()));
                return i;
            }
            eVarF.a(com.google.analytics.b.a.a.h.BOOLEAN).a(((Boolean) obj).booleanValue());
        }
        if (z) {
            eVarF.b(true);
        }
        return eVarF.h();
    }

    private static boolean b(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof x) && ((x) obj).a());
    }

    private static boolean c(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof x) && ((x) obj).b());
    }

    private static long d(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        i.a("getInt64 received non-Number");
        return 0L;
    }
}
