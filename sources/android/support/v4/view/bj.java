package android.support.v4.view;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class bj {
    static final bm a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            a = new bl();
        } else {
            a = new bk();
        }
    }

    public static int a(ViewConfiguration viewConfiguration) {
        return a.a(viewConfiguration);
    }
}
