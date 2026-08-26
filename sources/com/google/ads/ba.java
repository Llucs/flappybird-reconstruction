package com.google.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ba {
    private static final Map a = Collections.unmodifiableMap(new bb());
    private final String b;
    private final String c;
    private final List d;
    private final Integer e;
    private final Integer f;
    private final List g;
    private final List h;
    private final List i;

    private ba(String str, String str2, List list, Integer num, Integer num2, List list2, List list3, List list4) {
        com.google.ads.util.e.a(str);
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = num;
        this.f = num2;
        this.g = list2;
        this.h = list3;
        this.i = list4;
    }

    public static ba a(String str) throws JSONException {
        List listA;
        List listA2;
        List listA3;
        Integer num;
        Integer numValueOf;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("qdata");
        String string2 = jSONObject.has("ad_type") ? jSONObject.getString("ad_type") : null;
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.getJSONObject(i)));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            numValueOf = jSONObjectOptJSONObject.has("refresh") ? Integer.valueOf(jSONObjectOptJSONObject.getInt("refresh")) : null;
            Integer numValueOf2 = jSONObjectOptJSONObject.has("ad_network_timeout_millis") ? Integer.valueOf(jSONObjectOptJSONObject.getInt("ad_network_timeout_millis")) : null;
            listA2 = a(jSONObjectOptJSONObject, "imp_urls");
            listA3 = a(jSONObjectOptJSONObject, "click_urls");
            listA = a(jSONObjectOptJSONObject, "nofill_urls");
            num = numValueOf2;
        } else {
            listA = null;
            listA2 = null;
            listA3 = null;
            num = null;
            numValueOf = null;
        }
        return new ba(string, string2, arrayList, numValueOf, num, listA2, listA3, listA);
    }

    private static k a(JSONObject jSONObject) throws JSONException {
        HashMap map;
        String string = jSONObject.getString("id");
        String strOptString = jSONObject.optString("allocation_id", null);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        List listA = a(jSONObject, "imp_urls");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        HashMap map2 = new HashMap(0);
        if (jSONObjectOptJSONObject != null) {
            map = new HashMap(jSONObjectOptJSONObject.length());
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.getString(next));
            }
        } else {
            map = map2;
        }
        return new k(strOptString, string, arrayList, listA, map);
    }

    private static List a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(jSONArrayOptJSONArray.getString(i));
        }
        return arrayList;
    }

    public boolean a() {
        return this.f != null;
    }

    public int b() {
        return this.f.intValue();
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return this.e != null;
    }

    public int e() {
        return this.e.intValue();
    }

    public List f() {
        return this.d;
    }

    public List g() {
        return this.g;
    }

    public List h() {
        return this.h;
    }

    public List i() {
        return this.i;
    }

    public com.google.ads.a.ac j() {
        if (this.c == null) {
            return null;
        }
        if ("interstitial".equals(this.c)) {
            return com.google.ads.a.ac.a;
        }
        g gVar = (g) a.get(this.c);
        if (gVar != null) {
            return com.google.ads.a.ac.a(gVar);
        }
        return null;
    }
}
