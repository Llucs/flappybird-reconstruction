package com.google.ads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class br extends com.google.ads.util.aa {
    private static final br d = new br();
    public final com.google.ads.util.ae a = new com.google.ads.util.ae(this, "marketPackages", null);
    public final com.google.ads.util.ad b = new com.google.ads.util.ad(this, "constants", new bs());
    public final com.google.ads.util.ad c = new com.google.ads.util.ad(this, "uiHandler", new Handler(Looper.getMainLooper()));

    private br() {
    }

    public static br a() {
        return d;
    }
}
