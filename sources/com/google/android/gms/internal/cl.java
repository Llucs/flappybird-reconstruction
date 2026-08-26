package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class cl extends Drawable.ConstantState {
    int a;
    int b;

    cl(cl clVar) {
        if (clVar != null) {
            this.a = clVar.a;
            this.b = clVar.b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new ch(this);
    }
}
