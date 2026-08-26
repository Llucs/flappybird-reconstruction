package com.google.tagmanager.a;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class bc implements Comparable, Map.Entry {
    final /* synthetic */ ax a;
    private final Comparable b;
    private Object c;

    bc(ax axVar, Comparable comparable, Object obj) {
        this.a = axVar;
        this.b = comparable;
        this.c = obj;
    }

    bc(ax axVar, Map.Entry entry) {
        this(axVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(bc bcVar) {
        return getKey().compareTo(bcVar.getKey());
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Comparable getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.b, entry.getKey()) && a(this.c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (this.b == null ? 0 : this.b.hashCode()) ^ (this.c != null ? this.c.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        this.a.e();
        Object obj2 = this.c;
        this.c = obj;
        return obj2;
    }

    public String toString() {
        return this.b + "=" + this.c;
    }
}
