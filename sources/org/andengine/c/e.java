package org.andengine.c;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class e implements Comparator {
    final /* synthetic */ d a;

    e(d dVar) {
        this.a = dVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(c cVar, c cVar2) {
        return cVar.f() - cVar2.f();
    }
}
