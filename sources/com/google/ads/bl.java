package com.google.ads;

/* JADX INFO: loaded from: classes.dex */
class bl implements Runnable {
    final /* synthetic */ bk a;

    bl(bk bkVar) {
        this.a = bkVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.h()) {
            com.google.ads.util.e.a(this.a.g);
            try {
                this.a.g.a();
                com.google.ads.util.g.a("Called destroy() for adapter with class: " + this.a.g.getClass().getName());
            } catch (Throwable th) {
                com.google.ads.util.g.b("Error while destroying adapter (" + this.a.f() + "):", th);
            }
        }
    }
}
