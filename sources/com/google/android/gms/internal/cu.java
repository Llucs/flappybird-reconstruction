package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class cu extends dd {
    private cr a;

    public cu(cr crVar) {
        this.a = crVar;
    }

    @Override // com.google.android.gms.internal.dc
    public void a(int i, IBinder iBinder, Bundle bundle) {
        Cdo.a("onPostInitComplete can be called only once per call to getServiceFromBroker", this.a);
        this.a.a(i, iBinder, bundle);
        this.a = null;
    }
}
