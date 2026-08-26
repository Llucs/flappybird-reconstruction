package com.google.tagmanager.a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class bd implements Iterator {
    final /* synthetic */ ax a;
    private int b;
    private boolean c;
    private Iterator d;

    private bd(ax axVar) {
        this.a = axVar;
        this.b = -1;
    }

    /* synthetic */ bd(ax axVar, ay ayVar) {
        this(axVar);
    }

    private Iterator b() {
        if (this.d == null) {
            this.d = this.a.c.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        return i < this.a.b.size() ? (Map.Entry) this.a.b.get(this.b) : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b + 1 < this.a.b.size() || b().hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        this.a.e();
        if (this.b >= this.a.b.size()) {
            b().remove();
            return;
        }
        ax axVar = this.a;
        int i = this.b;
        this.b = i - 1;
        axVar.c(i);
    }
}
