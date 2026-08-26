package com.google.ads.util;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static i a = null;
    private static int b = 5;

    private static void a(h hVar, String str) {
        a(hVar, str, null);
    }

    private static void a(h hVar, String str, Throwable th) {
        if (a != null) {
            a.a(hVar, str, th);
        }
    }

    public static void a(String str) {
        if (a("Ads", 3)) {
            Log.d("Ads", str);
        }
        a(h.DEBUG, str);
    }

    public static void a(String str, Throwable th) {
        if (a("Ads", 3)) {
            Log.d("Ads", str, th);
        }
        a(h.DEBUG, str, th);
    }

    private static boolean a(int i) {
        return i >= b;
    }

    public static boolean a(String str, int i) {
        return a(i) || Log.isLoggable(str, i);
    }

    public static void b(String str) {
        if (a("Ads", 6)) {
            Log.e("Ads", str);
        }
        a(h.ERROR, str);
    }

    public static void b(String str, Throwable th) {
        if (a("Ads", 6)) {
            Log.e("Ads", str);
            Log.i("Ads", "The following was caught and handled:", th);
        }
        a(h.ERROR, str, th);
    }

    public static void c(String str) {
        if (a("Ads", 4)) {
            Log.i("Ads", str);
        }
        a(h.INFO, str);
    }

    public static void c(String str, Throwable th) {
        if (a("Ads", 4)) {
            Log.i("Ads", str, th);
        }
        a(h.INFO, str, th);
    }

    public static void d(String str) {
        if (a("Ads", 2)) {
            Log.v("Ads", str);
        }
        a(h.VERBOSE, str);
    }

    public static void d(String str, Throwable th) {
        if (a("Ads", 5)) {
            Log.w("Ads", str);
            Log.i("Ads", "The following was caught and handled:", th);
        }
        a(h.WARN, str, th);
    }

    public static void e(String str) {
        if (a("Ads", 5)) {
            Log.w("Ads", str);
        }
        a(h.WARN, str);
    }
}
