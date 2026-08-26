package com.google.android.gms.maps;

import android.view.ViewGroup;
import com.google.android.gms.internal.Cdo;
import com.google.android.gms.maps.a.m;

/* JADX INFO: loaded from: classes.dex */
class c implements com.google.android.gms.b.a {
    private final ViewGroup a;
    private final m b;

    public c(ViewGroup viewGroup, m mVar) {
        this.b = (m) Cdo.a(mVar);
        this.a = (ViewGroup) Cdo.a(viewGroup);
    }

    public m a() {
        return this.b;
    }
}
