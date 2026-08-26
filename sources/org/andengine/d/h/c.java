package org.andengine.d.h;

/* JADX INFO: loaded from: classes.dex */
public class c extends org.andengine.d.a.a.b implements org.andengine.b.b.c {
    private final Object a;

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Supplied " + a.class.getSimpleName() + " must not be null.");
        }
        return super.add(aVar);
    }

    @Override // org.andengine.b.b.c
    public void a_(float f) {
        int size = size();
        if (size > 0) {
            for (int i = size - 1; i >= 0; i--) {
                a aVar = (a) get(i);
                aVar.a(f, this.a);
                if (aVar.a() && aVar.b()) {
                    remove(i);
                }
            }
        }
    }
}
