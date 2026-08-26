package android.support.v4.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class af implements View.OnClickListener {
    final /* synthetic */ PagerTabStrip a;

    af(PagerTabStrip pagerTabStrip) {
        this.a = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.a.setCurrentItem(this.a.a.getCurrentItem() - 1);
    }
}
