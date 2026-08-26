package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
class az extends ay {
    az() {
    }

    @Override // android.support.v4.view.au, android.support.v4.view.bc
    public void a(View view, int i, int i2, int i3, int i4) {
        bh.a(view, i, i2, i3, i4);
    }

    @Override // android.support.v4.view.au, android.support.v4.view.bc
    public void a(View view, Runnable runnable) {
        bh.a(view, runnable);
    }

    @Override // android.support.v4.view.au, android.support.v4.view.bc
    public void b(View view) {
        bh.a(view);
    }

    @Override // android.support.v4.view.au, android.support.v4.view.bc
    public void b(View view, int i) {
        bh.a(view, i);
    }

    @Override // android.support.v4.view.au, android.support.v4.view.bc
    public int c(View view) {
        return bh.b(view);
    }

    @Override // android.support.v4.view.au, android.support.v4.view.bc
    public ViewParent f(View view) {
        return bh.c(view);
    }
}
