package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class ck extends Drawable.ConstantState {
    private ck() {
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return cj.a;
    }
}
