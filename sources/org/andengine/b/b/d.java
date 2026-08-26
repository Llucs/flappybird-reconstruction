package org.andengine.b.b;

/* JADX INFO: loaded from: classes.dex */
public class d extends org.andengine.d.a.a.b implements c {
    public d() {
    }

    public d(int i) {
        super(i);
    }

    @Override // org.andengine.b.b.c
    public void a_(float f) {
        for (int size = size() - 1; size >= 0; size--) {
            ((c) get(size)).a_(f);
        }
    }
}
