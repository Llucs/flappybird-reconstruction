package android.support.v4.widget;

import android.support.v4.view.at;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class u implements Runnable {
    final View a;
    final /* synthetic */ SlidingPaneLayout b;

    u(SlidingPaneLayout slidingPaneLayout, View view) {
        this.b = slidingPaneLayout;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.getParent() == this.b) {
            at.a(this.a, 0, null);
            this.b.g(this.a);
        }
        this.b.t.remove(this);
    }
}
