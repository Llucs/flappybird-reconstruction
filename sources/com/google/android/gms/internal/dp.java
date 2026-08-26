package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class dp extends com.google.android.gms.b.j {
    private static final dp a = new dp();

    private dp() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View a(Context context, int i, int i2) {
        return a.b(context, i, i2);
    }

    private View b(Context context, int i, int i2) throws com.google.android.gms.b.k {
        try {
            return (View) com.google.android.gms.b.h.a(((di) a(context)).a(com.google.android.gms.b.h.a(context), i, i2));
        } catch (Exception e) {
            throw new com.google.android.gms.b.k("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    @Override // com.google.android.gms.b.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public di a(IBinder iBinder) {
        return dj.a(iBinder);
    }
}
