package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ax extends aw {
    ax() {
    }

    @Override // android.support.v4.view.au
    long a() {
        return bf.a();
    }

    @Override // android.support.v4.view.au, android.support.v4.view.bc
    public void a(View view, int i, Paint paint) {
        bf.a(view, i, paint);
    }

    @Override // android.support.v4.view.au, android.support.v4.view.bc
    public void a(View view, Paint paint) {
        a(view, d(view), paint);
        view.invalidate();
    }

    @Override // android.support.v4.view.au, android.support.v4.view.bc
    public int d(View view) {
        return bf.a(view);
    }
}
