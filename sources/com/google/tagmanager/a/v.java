package com.google.tagmanager.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends b {
    private h a = h.a;

    protected v() {
    }

    public final v a(h hVar) {
        this.a = hVar;
        return this;
    }

    public abstract v a(t tVar);

    @Override // com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract t p();

    @Override // com.google.tagmanager.a.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public v clone() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public final h r() {
        return this.a;
    }
}
