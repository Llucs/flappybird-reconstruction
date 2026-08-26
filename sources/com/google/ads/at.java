package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class at {
    private static final com.google.ads.a.h a = (com.google.ads.a.h) com.google.ads.a.h.a.b();

    public static void a(Activity activity) {
        new Thread(new av(activity)).start();
    }

    public static boolean a(Context context, long j) {
        if (!a(context, j, PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()))) {
            return false;
        }
        new Thread(new au(context)).start();
        return true;
    }

    static boolean a(Context context, long j, SharedPreferences sharedPreferences) {
        return (sharedPreferences.contains("drt") && sharedPreferences.contains("drt_ts") && sharedPreferences.getLong("drt_ts", 0L) >= new Date().getTime() - j) ? false : true;
    }
}
