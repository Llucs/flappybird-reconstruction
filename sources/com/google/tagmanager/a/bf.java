package com.google.tagmanager.a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bf extends RuntimeException {
    private final List a;

    public bf(am amVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.a = null;
    }

    public af a() {
        return new af(getMessage());
    }
}
