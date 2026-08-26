package com.google.tagmanager.a;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
class au implements Iterator {
    private final Deque a;
    private aj b;

    private au(h hVar) {
        this.a = new ArrayDeque(ar.c.length);
        this.b = a(hVar);
    }

    private aj a(h hVar) {
        h hVar2 = hVar;
        while (hVar2 instanceof ar) {
            ar arVar = (ar) hVar2;
            this.a.push(arVar);
            hVar2 = arVar.e;
        }
        return (aj) hVar2;
    }

    private aj b() {
        while (!this.a.isEmpty()) {
            aj ajVarA = a(((ar) this.a.pop()).f);
            if (!ajVarA.d()) {
                return ajVarA;
            }
        }
        return null;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aj next() {
        if (this.b == null) {
            throw new NoSuchElementException();
        }
        aj ajVar = this.b;
        this.b = b();
        return ajVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
