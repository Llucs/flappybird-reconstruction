package com.google.android.gms.maps.a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.Cdo;

/* JADX INFO: loaded from: classes.dex */
public class bj {
    private static Context a;
    private static z b;

    public static z a(Context context) throws com.google.android.gms.common.e {
        Cdo.a(context);
        b(context);
        if (b == null) {
            d(context);
        }
        if (b != null) {
            return b;
        }
        b = aa.a((IBinder) a(e(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        c(context);
        return b;
    }

    private static Class a() {
        try {
            return Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    private static Object a(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unable to call the default constructor of " + cls.getName());
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + cls.getName());
        }
    }

    private static Object a(ClassLoader classLoader, String str) {
        try {
            return a(((ClassLoader) Cdo.a(classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class " + str);
        }
    }

    public static void b(Context context) throws com.google.android.gms.common.e {
        int iA = com.google.android.gms.common.f.a(context);
        if (iA != 0) {
            throw new com.google.android.gms.common.e(iA);
        }
    }

    private static void c(Context context) {
        try {
            b.a(com.google.android.gms.b.h.a(e(context).getResources()), 3265100);
        } catch (RemoteException e) {
            throw new com.google.android.gms.maps.model.k(e);
        }
    }

    private static void d(Context context) {
        Class clsA = a();
        if (clsA != null) {
            Log.i(bj.class.getSimpleName(), "Making Creator statically");
            b = (z) a(clsA);
            c(context);
        }
    }

    private static Context e(Context context) {
        if (a == null) {
            if (a() != null) {
                a = context;
            } else {
                a = com.google.android.gms.common.f.b(context);
            }
        }
        return a;
    }
}
