package android.support.v4.app;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class e implements l {
    final /* synthetic */ Fragment a;

    e(Fragment fragment) {
        this.a = fragment;
    }

    @Override // android.support.v4.app.l
    public View a(int i) {
        if (this.a.I == null) {
            throw new IllegalStateException("Fragment does not have a view");
        }
        return this.a.I.findViewById(i);
    }
}
