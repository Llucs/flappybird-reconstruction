package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class cs extends Handler {
    final /* synthetic */ cr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs(cr crVar, Looper looper) {
        super(looper);
        this.a = crVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 1 && !this.a.i()) {
            ct ctVar = (ct) message.obj;
            ctVar.a();
            ctVar.c();
            return;
        }
        synchronized (this.a.o) {
            this.a.d = false;
        }
        if (message.what == 3) {
            this.a.a(new com.google.android.gms.common.a(((Integer) message.obj).intValue(), null));
            return;
        }
        if (message.what == 4) {
            synchronized (this.a.h) {
                if (this.a.c && this.a.h() && this.a.h.contains(message.obj)) {
                    ((com.google.android.gms.common.c) message.obj).a(this.a.e());
                }
            }
            return;
        }
        if (message.what == 2 && !this.a.h()) {
            ct ctVar2 = (ct) message.obj;
            ctVar2.a();
            ctVar2.c();
        } else if (message.what == 2 || message.what == 1) {
            ((ct) message.obj).b();
        } else {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
        }
    }
}
