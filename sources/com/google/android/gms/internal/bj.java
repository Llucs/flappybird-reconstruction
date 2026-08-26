package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class bj extends cr {
    private final String f;

    public bj(Context context, com.google.android.gms.common.c cVar, com.google.android.gms.common.d dVar, String str, String[] strArr) {
        super(context, cVar, dVar, strArr);
        this.f = (String) Cdo.a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cr
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ce b(IBinder iBinder) {
        return cf.a(iBinder);
    }

    @Override // com.google.android.gms.internal.cr
    protected void a(df dfVar, cu cuVar) {
        dfVar.a(cuVar, 3265100, j().getPackageName(), this.f, k());
    }

    @Override // com.google.android.gms.internal.cr
    protected void a(String... strArr) {
        boolean z = false;
        for (String str : strArr) {
            if (str.equals("https://www.googleapis.com/auth/appstate")) {
                z = true;
            }
        }
        Cdo.a(z, String.format("AppStateClient requires %s to function.", "https://www.googleapis.com/auth/appstate"));
    }

    @Override // com.google.android.gms.internal.cr
    protected String c() {
        return "com.google.android.gms.appstate.service.START";
    }

    @Override // com.google.android.gms.internal.cr
    protected String d() {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }
}
