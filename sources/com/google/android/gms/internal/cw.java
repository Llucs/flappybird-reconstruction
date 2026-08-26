package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class cw extends ct {
    public final int a;
    public final Bundle c;
    public final IBinder d;
    final /* synthetic */ cr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(cr crVar, int i, IBinder iBinder, Bundle bundle) {
        super(crVar, true);
        this.e = crVar;
        this.a = i;
        this.d = iBinder;
        this.c = bundle;
    }

    @Override // com.google.android.gms.internal.ct
    protected void a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ct
    public void a(Boolean bool) {
        if (bool == null) {
            return;
        }
        switch (this.a) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                try {
                    if (this.e.d().equals(this.d.getInterfaceDescriptor())) {
                        this.e.g = this.e.b(this.d);
                        if (this.e.g != null) {
                            this.e.f();
                            return;
                        }
                    }
                } catch (RemoteException e) {
                }
                cx.a(this.e.f).b(this.e.c(), this.e.m);
                this.e.m = null;
                this.e.g = null;
                this.e.a(new com.google.android.gms.common.a(8, null));
                return;
            case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                PendingIntent pendingIntent = this.c != null ? (PendingIntent) this.c.getParcelable("pendingIntent") : null;
                if (this.e.m != null) {
                    cx.a(this.e.f).b(this.e.c(), this.e.m);
                    this.e.m = null;
                }
                this.e.g = null;
                this.e.a(new com.google.android.gms.common.a(this.a, pendingIntent));
                return;
        }
    }
}
