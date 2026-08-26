package com.google.ads.a;

import android.os.Handler;
import com.google.ads.br;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class d implements Runnable {
    private final WeakReference a;

    public d(c cVar) {
        this.a = new WeakReference(cVar);
    }

    public void a() {
        ((Handler) br.a().c.a()).postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public void run() {
        c cVar = (c) this.a.get();
        if (cVar == null) {
            com.google.ads.util.g.d("The video must be gone, so cancelling the timeupdate task.");
        } else {
            cVar.f();
            ((Handler) br.a().c.a()).postDelayed(this, 250L);
        }
    }
}
