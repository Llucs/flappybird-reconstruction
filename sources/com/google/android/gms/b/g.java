package com.google.android.gms.b;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
class g implements e {
    private IBinder a;

    g(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }
}
