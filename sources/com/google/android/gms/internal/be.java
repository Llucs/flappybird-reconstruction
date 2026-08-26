package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class be {
    private static Context a;
    private static at b;

    public static View a(Context context, int i, int i2, String str, int i3) {
        try {
            if (str == null) {
                throw new NullPointerException();
            }
            return (View) com.google.android.gms.b.h.a(a(context).a(com.google.android.gms.b.h.a(context), i, i2, str, i3));
        } catch (Exception e) {
            return new com.google.android.gms.plus.f(context, i);
        }
    }

    public static View a(Context context, int i, int i2, String str, String str2) {
        try {
            if (str == null) {
                throw new NullPointerException();
            }
            return (View) com.google.android.gms.b.h.a(a(context).a(com.google.android.gms.b.h.a(context), i, i2, str, str2));
        } catch (Exception e) {
            return new com.google.android.gms.plus.f(context, i);
        }
    }

    private static at a(Context context) throws bf {
        Cdo.a(context);
        if (b == null) {
            if (a == null) {
                a = com.google.android.gms.common.f.b(context);
                if (a == null) {
                    throw new bf("Could not get remote context.");
                }
            }
            try {
                b = au.a((IBinder) a.getClassLoader().loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
            } catch (ClassNotFoundException e) {
                throw new bf("Could not load creator class.");
            } catch (IllegalAccessException e2) {
                throw new bf("Could not access creator.");
            } catch (InstantiationException e3) {
                throw new bf("Could not instantiate creator.");
            }
        }
        return b;
    }
}
