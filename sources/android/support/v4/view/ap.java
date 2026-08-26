package android.support.v4.view;

import android.view.VelocityTracker;

/* JADX INFO: loaded from: classes.dex */
class ap implements ar {
    ap() {
    }

    @Override // android.support.v4.view.ar
    public float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity();
    }

    @Override // android.support.v4.view.ar
    public float b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity();
    }
}
