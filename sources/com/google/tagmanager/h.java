package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class h {
    static Map a = new HashMap();
    private static String b;

    h() {
    }

    static String a(String str, String str2) {
        if (str2 != null) {
            return Uri.parse("http://hostname/?" + str).getQueryParameter(str2);
        }
        if (str.length() > 0) {
            return str;
        }
        return null;
    }

    static void a(Context context, String str) {
        p.a(context, "gtm_install_referrer", "referrer", str);
        b(context, str);
    }

    static void a(String str) {
        synchronized (h.class) {
            b = str;
        }
    }

    static void b(Context context, String str) {
        String strA = a(str, "conv");
        if (strA == null || strA.length() <= 0) {
            return;
        }
        a.put(strA, str);
        p.a(context, "gtm_click_referrers", strA, str);
    }
}
