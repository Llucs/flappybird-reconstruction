package org.andengine.d.h;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class b implements Comparator {
    b() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(a aVar, a aVar2) {
        float fC = aVar.c();
        float fC2 = aVar2.c();
        if (fC < fC2) {
            return 1;
        }
        return fC > fC2 ? -1 : 0;
    }
}
