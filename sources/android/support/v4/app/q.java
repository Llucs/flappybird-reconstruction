package android.support.v4.app;

import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
class q implements Animation.AnimationListener {
    final /* synthetic */ Fragment a;
    final /* synthetic */ o b;

    q(o oVar, Fragment fragment) {
        this.b = oVar;
        this.a = fragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (this.a.b != null) {
            this.a.b = null;
            this.b.a(this.a, this.a.c, 0, 0, false);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
