package com.google.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public void a(com.google.ads.a.w wVar, com.google.ads.a.x xVar) {
        synchronized (AdActivity.b) {
            if (AdActivity.d == null) {
                com.google.ads.a.w unused = AdActivity.d = wVar;
            } else if (AdActivity.d != wVar) {
                com.google.ads.util.g.b("Tried to launch a new AdActivity with a different AdManager.");
                return;
            }
            Activity activity = (Activity) wVar.h().c.a();
            if (activity == null) {
                com.google.ads.util.g.e("activity was null while launching an AdActivity.");
                return;
            }
            Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) AdActivity.class);
            intent.putExtra("com.google.ads.AdOpener", xVar.a());
            try {
                com.google.ads.util.g.a("Launching AdActivity.");
                activity.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                com.google.ads.util.g.b("Activity not found.", e);
            }
        }
    }

    public boolean a() {
        boolean z;
        synchronized (AdActivity.b) {
            z = AdActivity.e != null;
        }
        return z;
    }

    public boolean b() {
        boolean z;
        synchronized (AdActivity.b) {
            z = AdActivity.c != null;
        }
        return z;
    }
}
