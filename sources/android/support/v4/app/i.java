package android.support.v4.app;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class i implements l {
    final /* synthetic */ FragmentActivity a;

    i(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    @Override // android.support.v4.app.l
    public View a(int i) {
        return this.a.findViewById(i);
    }
}
