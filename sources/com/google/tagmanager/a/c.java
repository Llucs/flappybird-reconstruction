package com.google.tagmanager.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements ap {
    private boolean b = true;
    protected int a = -1;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ap clone() {
        throw new UnsupportedOperationException("clone() should be implemented by subclasses.");
    }

    bf b() {
        return new bf(this);
    }

    @Override // com.google.tagmanager.a.am
    public an n() {
        throw new UnsupportedOperationException("toBuilder() is not supported in mutable messages.");
    }

    @Override // com.google.tagmanager.a.am
    public an o() {
        throw new UnsupportedOperationException("newBuilderForType() is not supported in mutable messages.");
    }
}
