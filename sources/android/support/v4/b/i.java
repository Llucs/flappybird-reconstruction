package android.support.v4.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class i implements Set {
    final /* synthetic */ f a;

    i(f fVar) {
        this.a = fVar;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.a.c();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.a.a(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return f.a(this.a.b(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        return f.a((Set) this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        int iHashCode = 0;
        for (int iA = this.a.a() - 1; iA >= 0; iA--) {
            Object objA = this.a.a(iA, 0);
            iHashCode += objA == null ? 0 : objA.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.a.a() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new g(this.a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int iA = this.a.a(obj);
        if (iA < 0) {
            return false;
        }
        this.a.a(iA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        return f.b(this.a.b(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        return f.c(this.a.b(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.a.a();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.a.b(0);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.a.a(objArr, 0);
    }
}
