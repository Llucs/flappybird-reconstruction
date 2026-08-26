package com.google.android.gms.plus;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class h implements k {
    private Context a;

    private h(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.plus.k
    public Drawable a(int i) {
        return this.a.getResources().getDrawable(R.drawable.btn_default);
    }

    @Override // com.google.android.gms.plus.k
    public boolean a() {
        return true;
    }
}
