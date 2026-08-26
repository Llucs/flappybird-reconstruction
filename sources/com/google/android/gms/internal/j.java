package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements SafeParcelable {
    private static final Object a = new Object();
    private static ClassLoader b = null;
    private static Integer c = null;
    private boolean d = false;

    private static boolean a(Class cls) {
        try {
            return SafeParcelable.NULL.equals(cls.getField("NULL").get(null));
        } catch (IllegalAccessException e) {
            return false;
        } catch (NoSuchFieldException e2) {
            return false;
        }
    }

    protected static boolean b(String str) {
        ClassLoader classLoaderT = t();
        if (classLoaderT == null) {
            return true;
        }
        try {
            return a(classLoaderT.loadClass(str));
        } catch (Exception e) {
            return false;
        }
    }

    protected static ClassLoader t() {
        ClassLoader classLoader;
        synchronized (a) {
            classLoader = b;
        }
        return classLoader;
    }

    protected static Integer u() {
        Integer num;
        synchronized (a) {
            num = c;
        }
        return num;
    }

    protected boolean v() {
        return this.d;
    }
}
