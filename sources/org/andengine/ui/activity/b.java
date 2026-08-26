package org.andengine.ui.activity;

import org.andengine.c.b.e;

/* JADX INFO: loaded from: classes.dex */
class b implements org.andengine.ui.c {
    final /* synthetic */ BaseGameActivity a;
    private final /* synthetic */ org.andengine.ui.d b;

    b(BaseGameActivity baseGameActivity, org.andengine.ui.d dVar) {
        this.a = baseGameActivity;
        this.b = dVar;
    }

    @Override // org.andengine.ui.c
    public void a(e eVar) {
        this.a.k.a(eVar);
        try {
            org.andengine.d.e.a.b(String.valueOf(this.a.getClass().getSimpleName()) + ".onPopulateScene @(Thread: '" + Thread.currentThread().getName() + "')");
            this.a.a(eVar, this.b);
        } catch (Throwable th) {
            org.andengine.d.e.a.b(String.valueOf(this.a.getClass().getSimpleName()) + ".onPopulateScene failed. @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
    }
}
