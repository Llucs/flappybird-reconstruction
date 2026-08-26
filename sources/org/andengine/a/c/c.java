package org.andengine.a.c;

import android.media.SoundPool;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class c extends org.andengine.a.b implements SoundPool.OnLoadCompleteListener {
    private final SoundPool c;
    private final SparseArray d;

    public c() {
        this(5);
    }

    public c(int i) {
        this.d = new SparseArray();
        this.c = new SoundPool(i, 3, 0);
        this.c.setOnLoadCompleteListener(this);
    }

    @Override // org.andengine.a.b
    public void a(a aVar) {
        super.a((org.andengine.a.c) aVar);
        this.d.put(aVar.h(), aVar);
    }

    @Override // org.andengine.a.b
    public void b() {
        super.b();
        this.c.release();
    }

    @Override // org.andengine.a.b
    public boolean b(a aVar) {
        boolean zB = super.b((org.andengine.a.c) aVar);
        if (zB) {
            this.d.remove(aVar.h());
        }
        return zB;
    }

    SoundPool c() {
        return this.c;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public synchronized void onLoadComplete(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            a aVar = (a) this.d.get(i);
            if (aVar == null) {
                throw new org.andengine.a.c.a.a("Unexpected soundID: '" + i + "'.");
            }
            aVar.a(true);
        }
    }
}
