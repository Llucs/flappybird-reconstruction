package com.google.tagmanager.a;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
class ax extends AbstractMap {
    private final int a;
    private List b;
    private Map c;
    private boolean d;
    private volatile be e;

    private ax(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
    }

    /* synthetic */ ax(int i, ay ayVar) {
        this(i);
    }

    private int a(Comparable comparable) {
        int i;
        int i2;
        int i3 = 0;
        int size = this.b.size() - 1;
        if (size >= 0) {
            int iCompareTo = comparable.compareTo(((bc) this.b.get(size)).a());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i3 <= size) {
            int i4 = (i3 + size) / 2;
            int iCompareTo2 = comparable.compareTo(((bc) this.b.get(i4)).a());
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
                i = i3;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                int i5 = size;
                i = i4 + 1;
                i2 = i5;
            }
            i3 = i;
            size = i2;
        }
        return -(i3 + 1);
    }

    static ax a(int i) {
        return new ay(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c(int i) {
        e();
        Object value = ((bc) this.b.remove(i)).getValue();
        if (!this.c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            this.b.add(new bc(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap f() {
        e();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            this.c = new TreeMap();
        }
        return (SortedMap) this.c;
    }

    private void g() {
        e();
        if (!this.b.isEmpty() || (this.b instanceof ArrayList)) {
            return;
        }
        this.b = new ArrayList(this.a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object put(Comparable comparable, Object obj) {
        e();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((bc) this.b.get(iA)).setValue(obj);
        }
        g();
        int i = -(iA + 1);
        if (i >= this.a) {
            return f().put(comparable, obj);
        }
        if (this.b.size() == this.a) {
            bc bcVar = (bc) this.b.remove(this.a - 1);
            f().put(bcVar.a(), bcVar.getValue());
        }
        this.b.add(i, new bc(this, comparable, obj));
        return null;
    }

    public void a() {
        if (this.d) {
            return;
        }
        this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
        this.d = true;
    }

    public Map.Entry b(int i) {
        return (Map.Entry) this.b.get(i);
    }

    public boolean b() {
        return this.d;
    }

    public int c() {
        return this.b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        e();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public Iterable d() {
        return this.c.isEmpty() ? az.a() : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.e == null) {
            this.e = new be(this, null);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((bc) this.b.get(iA)).getValue() : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return c(iA);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.b.size() + this.c.size();
    }
}
