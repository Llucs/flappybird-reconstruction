package org.andengine.b;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public class d extends Thread {
    private a a;
    private final org.andengine.b.b.a.a b;

    public d() {
        super(d.class.getSimpleName());
        this.b = new org.andengine.b.b.a.a();
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(this.a.d().l());
        while (true) {
            try {
                this.b.a_(0.0f);
                this.a.m();
            } catch (InterruptedException e) {
                org.andengine.d.e.a.a(String.valueOf(getClass().getSimpleName()) + " interrupted. Don't worry - this " + e.getClass().getSimpleName() + " is most likely expected!", e);
                interrupt();
                return;
            }
        }
    }
}
