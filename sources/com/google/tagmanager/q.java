package com.google.tagmanager;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
final class q implements Runnable {
    final /* synthetic */ SharedPreferences.Editor a;

    q(SharedPreferences.Editor editor) {
        this.a = editor;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.commit();
    }
}
