package com.google.ads.b;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    protected void a() {
    }

    public void a(Map map) throws h {
        String str;
        HashMap map2 = new HashMap();
        for (Field field : getClass().getFields()) {
            i iVar = (i) field.getAnnotation(i.class);
            if (iVar != null) {
                map2.put(iVar.a(), field);
            }
        }
        if (map2.isEmpty()) {
            com.google.ads.util.g.e("No server options fields detected.  To suppress this message either add a field with the @Parameter annotation, or override the load() method");
        }
        for (Map.Entry entry : map.entrySet()) {
            Field field2 = (Field) map2.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    com.google.ads.util.g.b("Server Option '" + ((String) entry.getKey()) + "' could not be set: Illegal Access");
                } catch (IllegalArgumentException e2) {
                    com.google.ads.util.g.b("Server Option '" + ((String) entry.getKey()) + "' could not be set: Bad Type");
                }
            } else {
                com.google.ads.util.g.e("Unexpected Server Option: " + ((String) entry.getKey()) + " = '" + ((String) entry.getValue()) + "'");
            }
        }
        String str2 = null;
        for (Field field3 : map2.values()) {
            if (((i) field3.getAnnotation(i.class)).b()) {
                com.google.ads.util.g.b("Required Server Option missing: " + ((i) field3.getAnnotation(i.class)).a());
                str = (str2 == null ? "" : str2 + ", ") + ((i) field3.getAnnotation(i.class)).a();
            } else {
                str = str2;
            }
            str2 = str;
        }
        if (str2 != null) {
            throw new h("Required Server Option(s) missing: " + str2);
        }
        a();
    }
}
