package org.andengine.d.i;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;

    static {
        a = Build.VERSION.SDK_INT >= 5;
        b = Build.VERSION.SDK_INT >= 8;
        c = Build.VERSION.SDK_INT >= 9;
        d = Build.VERSION.SDK_INT >= 11;
        e = Build.VERSION.SDK_INT >= 14;
    }

    public static boolean a(int i) {
        return Build.VERSION.SDK_INT <= i;
    }

    public static boolean a(int i, int i2) {
        return Build.VERSION.SDK_INT >= i && Build.VERSION.SDK_INT <= i2;
    }
}
