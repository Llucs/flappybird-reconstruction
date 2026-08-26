package com.google.tagmanager.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class w extends v implements y {
    private q a = q.b();
    private boolean b;

    protected w() {
    }

    private void a() {
        if (this.b) {
            return;
        }
        this.a = this.a.clone();
        this.b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q b() {
        this.a.c();
        this.b = false;
        return this.a;
    }

    protected final void a(x xVar) {
        a();
        this.a.a(xVar.a);
    }

    @Override // com.google.tagmanager.a.v, com.google.tagmanager.a.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public w clone() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    protected boolean s() {
        return this.a.e();
    }
}
