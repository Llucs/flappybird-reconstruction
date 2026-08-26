package com.google.tagmanager.a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class ah extends AbstractList implements ai, RandomAccess {
    public static final ai a = new bg(new ah());
    private final List b;

    public ah() {
        this.b = new ArrayList();
    }

    public ah(ai aiVar) {
        this.b = new ArrayList(aiVar.size());
        addAll(aiVar);
    }

    private static String a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof h ? ((h) obj).f() : ac.b((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String strF = hVar.f();
            if (hVar.g()) {
                this.b.set(i, strF);
            }
            return strF;
        }
        byte[] bArr = (byte[]) obj;
        String strB = ac.b(bArr);
        if (ac.a(bArr)) {
            this.b.set(i, strB);
        }
        return strB;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        return a(this.b.set(i, str));
    }

    @Override // com.google.tagmanager.a.ai
    public List a() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // com.google.tagmanager.a.ai
    public void a(h hVar) {
        this.b.add(hVar);
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        if (collection instanceof ai) {
            collection = ((ai) collection).a();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        Object objRemove = this.b.remove(i);
        this.modCount++;
        return a(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        this.b.add(i, str);
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.b.clear();
        this.modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.b.size();
    }
}
