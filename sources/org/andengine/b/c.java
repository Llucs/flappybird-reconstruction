package org.andengine.b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class c extends ReentrantLock {
    final Condition a;
    final AtomicBoolean b;

    public c(boolean z) {
        super(z);
        this.a = newCondition();
        this.b = new AtomicBoolean(false);
    }

    void a() {
        this.b.set(true);
        this.a.signalAll();
    }

    void b() {
        this.b.set(false);
        this.a.signalAll();
    }

    void c() throws InterruptedException {
        while (!this.b.get()) {
            this.a.await();
        }
    }

    void d() throws InterruptedException {
        while (this.b.get()) {
            this.a.await();
        }
    }
}
