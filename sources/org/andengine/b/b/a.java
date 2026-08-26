package org.andengine.b.b;

import org.andengine.opengl.util.e;

/* JADX INFO: loaded from: classes.dex */
public class a extends org.andengine.d.a.a.b implements b {
    public a() {
    }

    public a(int i) {
        super(i);
    }

    @Override // org.andengine.b.b.b
    public void a(e eVar, org.andengine.b.a.a aVar) {
        for (int size = size() - 1; size >= 0; size--) {
            ((b) get(size)).a(eVar, aVar);
        }
    }
}
