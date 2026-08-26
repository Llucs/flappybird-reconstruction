package com.google.tagmanager.a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class ab extends c implements Serializable {
    protected h b = h.a;

    public abstract ab a(ab abVar);

    @Override // com.google.tagmanager.a.am
    public aq c() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.google.tagmanager.a.ao
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract ab p();
}
