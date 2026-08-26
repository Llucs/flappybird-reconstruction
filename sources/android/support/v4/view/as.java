package android.support.v4.view;

import android.view.VelocityTracker;

/* JADX INFO: loaded from: classes.dex */
class as {
    public static float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    public static float b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }
}
