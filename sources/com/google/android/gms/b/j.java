package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.internal.Cdo;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    private final String a;
    private Object b;

    protected j(String str) {
        this.a = str;
    }

    protected final Object a(Context context) throws k {
        if (this.b == null) {
            Cdo.a(context);
            Context contextB = com.google.android.gms.common.f.b(context);
            if (contextB == null) {
                throw new k("Could not get remote context.");
            }
            try {
                this.b = a((IBinder) contextB.getClassLoader().loadClass(this.a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new k("Could not load creator class.");
            } catch (IllegalAccessException e2) {
                throw new k("Could not access creator.");
            } catch (InstantiationException e3) {
                throw new k("Could not instantiate creator.");
            }
        }
        return this.b;
    }

    protected abstract Object a(IBinder iBinder);
}
