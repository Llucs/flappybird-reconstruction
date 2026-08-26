package com.google.tagmanager;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
class g implements j {
    private k a = k.WARNING;

    g() {
    }

    @Override // com.google.tagmanager.j
    public void a(String str) {
        if (this.a.ordinal() <= k.ERROR.ordinal()) {
            Log.e("GoogleTagManager", str);
        }
    }

    @Override // com.google.tagmanager.j
    public void b(String str) {
        if (this.a.ordinal() <= k.WARNING.ordinal()) {
            Log.w("GoogleTagManager", str);
        }
    }

    @Override // com.google.tagmanager.j
    public void c(String str) {
        if (this.a.ordinal() <= k.INFO.ordinal()) {
            Log.i("GoogleTagManager", str);
        }
    }

    @Override // com.google.tagmanager.j
    public void d(String str) {
        if (this.a.ordinal() <= k.VERBOSE.ordinal()) {
            Log.v("GoogleTagManager", str);
        }
    }
}
