package org.andengine.ui.activity;

/* JADX INFO: loaded from: classes.dex */
class c implements org.andengine.ui.b {
    final /* synthetic */ BaseGameActivity a;
    private final /* synthetic */ org.andengine.ui.c b;

    c(BaseGameActivity baseGameActivity, org.andengine.ui.c cVar) {
        this.a = baseGameActivity;
        this.b = cVar;
    }

    @Override // org.andengine.ui.b
    public void a() {
        try {
            org.andengine.d.e.a.b(String.valueOf(this.a.getClass().getSimpleName()) + ".onCreateScene @(Thread: '" + Thread.currentThread().getName() + "')");
            this.a.a(this.b);
        } catch (Throwable th) {
            org.andengine.d.e.a.b(String.valueOf(this.a.getClass().getSimpleName()) + ".onCreateScene failed. @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
    }
}
