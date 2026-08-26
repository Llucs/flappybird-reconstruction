package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class bd extends cr {
    private com.google.android.gms.plus.a.b.a f;
    private com.google.android.gms.plus.a g;

    public bd(Context context, com.google.android.gms.plus.a aVar, com.google.android.gms.common.c cVar, com.google.android.gms.common.d dVar) {
        super(context, cVar, dVar, aVar.c());
        this.g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cr
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ba b(IBinder iBinder) {
        return bb.a(iBinder);
    }

    @Override // com.google.android.gms.internal.cr
    protected void a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            this.f = cc.a(bundle.getByteArray("loaded_person"));
        }
        super.a(i, iBinder, bundle);
    }

    @Override // com.google.android.gms.internal.cr
    protected void a(df dfVar, cu cuVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("skip_oob", false);
        bundle.putStringArray("request_visible_actions", this.g.d());
        if (this.g.e() != null) {
            bundle.putStringArray("required_features", this.g.e());
        }
        if (this.g.h() != null) {
            bundle.putString("application_name", this.g.h());
        }
        dfVar.a(cuVar, 3265100, this.g.g(), this.g.f(), k(), this.g.b(), bundle);
    }

    @Override // com.google.android.gms.internal.cr
    protected String c() {
        return "com.google.android.gms.plus.service.START";
    }

    @Override // com.google.android.gms.internal.cr
    protected String d() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }
}
