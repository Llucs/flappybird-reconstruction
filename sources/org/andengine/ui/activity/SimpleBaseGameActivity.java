package org.andengine.ui.activity;

import org.andengine.c.b.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleBaseGameActivity extends BaseGameActivity {
    @Override // org.andengine.ui.a
    public final void a(e eVar, org.andengine.ui.d dVar) {
        dVar.a();
    }

    @Override // org.andengine.ui.a
    public final void a(org.andengine.ui.b bVar) {
        l();
        bVar.a();
    }

    @Override // org.andengine.ui.a
    public final void a(org.andengine.ui.c cVar) {
        cVar.a(m());
    }

    protected abstract void l();

    protected abstract e m();
}
