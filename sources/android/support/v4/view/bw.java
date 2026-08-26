package android.support.v4.view;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
final class bw implements Interpolator {
    bw() {
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
