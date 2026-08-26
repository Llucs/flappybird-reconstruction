package android.support.v4.view;

import android.os.Build;
import android.view.VelocityTracker;

/* JADX INFO: loaded from: classes.dex */
public class ao {
    static final ar a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            a = new aq();
        } else {
            a = new ap();
        }
    }

    public static float a(VelocityTracker velocityTracker, int i) {
        return a.a(velocityTracker, i);
    }

    public static float b(VelocityTracker velocityTracker, int i) {
        return a.b(velocityTracker, i);
    }
}
