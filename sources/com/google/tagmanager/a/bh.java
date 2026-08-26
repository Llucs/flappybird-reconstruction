package com.google.tagmanager.a;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
class bh implements ListIterator {
    ListIterator a;
    final /* synthetic */ int b;
    final /* synthetic */ bg c;

    bh(bg bgVar, int i) {
        this.c = bgVar;
        this.b = i;
        this.a = this.c.a.listIterator(this.b);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        return (String) this.a.next();
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void set(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String previous() {
        return (String) this.a.previous();
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.a.nextIndex();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
