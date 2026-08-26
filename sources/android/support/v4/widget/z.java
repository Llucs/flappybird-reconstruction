package android.support.v4.widget;

import android.support.v4.view.at;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class z implements y {
    z() {
    }

    @Override // android.support.v4.widget.y
    public void a(SlidingPaneLayout slidingPaneLayout, View view) {
        at.a(slidingPaneLayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }
}
