package org.andengine.ui.activity;

/* JADX INFO: loaded from: classes.dex */
class a implements org.andengine.ui.d {
    final /* synthetic */ BaseGameActivity a;

    a(BaseGameActivity baseGameActivity) {
        this.a = baseGameActivity;
    }

    @Override // org.andengine.ui.d
    public void a() {
        try {
            org.andengine.d.e.a.b(String.valueOf(this.a.getClass().getSimpleName()) + ".onGameCreated @(Thread: '" + Thread.currentThread().getName() + "')");
            this.a.r();
        } catch (Throwable th) {
            org.andengine.d.e.a.b(String.valueOf(this.a.getClass().getSimpleName()) + ".onGameCreated failed. @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
        this.a.c();
    }
}
