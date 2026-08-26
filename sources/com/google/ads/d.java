package com.google.ads;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.google.ads.util.AdUtil;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final String a;
    private static final SimpleDateFormat b = new SimpleDateFormat("yyyyMMdd");
    private static Method c;
    private static Method d;
    private f e = null;
    private Date f = null;
    private Set g = null;
    private Map h = null;
    private final Map i = new HashMap();
    private Location j = null;
    private boolean k = false;
    private boolean l = false;
    private Set m = null;

    static {
        c = null;
        d = null;
        try {
            for (Method method : Class.forName("com.google.analytics.tracking.android.AdMobInfo").getMethods()) {
                if (method.getName().equals("getInstance") && method.getParameterTypes().length == 0) {
                    c = method;
                } else if (method.getName().equals("getJoinIds") && method.getParameterTypes().length == 0) {
                    d = method;
                }
            }
            if (c == null || d == null) {
                c = null;
                d = null;
                com.google.ads.util.g.e("No Google Analytics: Library Incompatible.");
            }
        } catch (ClassNotFoundException e) {
            com.google.ads.util.g.a("No Google Analytics: Library Not Found.");
        } catch (Throwable th) {
            com.google.ads.util.g.a("No Google Analytics: Error Loading Library");
        }
        a = AdUtil.b("emulator");
    }

    public d a(com.google.ads.b.j jVar) {
        if (jVar != null) {
            this.i.put(jVar.getClass(), jVar);
        }
        return this;
    }

    public d a(Set set) {
        this.g = set;
        return this;
    }

    public Object a(Class cls) {
        return this.i.get(cls);
    }

    public Map a(Context context) {
        HashMap map = new HashMap();
        if (this.g != null) {
            map.put("kw", this.g);
        }
        if (this.e != null) {
            map.put("cust_gender", Integer.valueOf(this.e.ordinal()));
        }
        if (this.f != null) {
            map.put("cust_age", b.format(this.f));
        }
        if (this.j != null) {
            map.put("uule", AdUtil.a(this.j));
        }
        if (this.k) {
            map.put("testing", 1);
        }
        if (b(context)) {
            map.put("adtest", "on");
        } else if (!this.l) {
            com.google.ads.util.g.c("To get test ads on this device, call adRequest.addTestDevice(" + (AdUtil.c() ? "AdRequest.TEST_EMULATOR" : "\"" + AdUtil.a(context) + "\"") + ");");
            this.l = true;
        }
        com.google.ads.b.a.a aVar = (com.google.ads.b.a.a) a(com.google.ads.b.a.a.class);
        com.google.ads.doubleclick.a aVar2 = (com.google.ads.doubleclick.a) a(com.google.ads.doubleclick.a.class);
        if (aVar2 != null && aVar2.d() != null && !aVar2.d().isEmpty()) {
            map.put("extras", aVar2.d());
        } else if (aVar != null && aVar.d() != null && !aVar.d().isEmpty()) {
            map.put("extras", aVar.d());
        }
        if (aVar2 != null) {
            String strA = aVar2.a();
            if (!TextUtils.isEmpty(strA)) {
                map.put("ppid", strA);
            }
        }
        if (this.h != null) {
            map.put("mediation_extras", this.h);
        }
        try {
            if (c != null) {
                Map map2 = (Map) d.invoke(c.invoke(null, new Object[0]), new Object[0]);
                if (map2 != null && map2.size() > 0) {
                    map.put("analytics_join_id", map2);
                }
            }
        } catch (Throwable th) {
            com.google.ads.util.g.c("Internal Analytics Error:", th);
        }
        return map;
    }

    public d b(Set set) {
        this.m = set;
        return this;
    }

    public boolean b(Context context) {
        String strA;
        return (this.m == null || (strA = AdUtil.a(context)) == null || !this.m.contains(strA)) ? false : true;
    }
}
