package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.games.PlayerEntity;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r extends cr {
    private final String f;
    private final String g;
    private final Map h;
    private PlayerEntity i;
    private final ai j;
    private boolean k;
    private final Binder l;
    private final long m;
    private final boolean n;

    public r(Context context, String str, String str2, com.google.android.gms.common.c cVar, com.google.android.gms.common.d dVar, String[] strArr, int i, View view, boolean z) {
        super(context, cVar, dVar, strArr);
        this.k = false;
        this.f = str;
        this.g = (String) Cdo.a(str2);
        this.l = new Binder();
        this.h = new HashMap();
        this.j = ai.a(this, i);
        a(view);
        this.m = hashCode();
        this.n = z;
    }

    private void o() {
        this.i = null;
    }

    private void p() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            try {
                ((an) it.next()).a();
            } catch (IOException e) {
                w.a("GamesClient", "IOException:", e);
            }
        }
        this.h.clear();
    }

    public Intent a(String str) {
        m();
        Intent intent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARD_SCORES");
        intent.putExtra("com.google.android.gms.games.LEADERBOARD_ID", str);
        intent.addFlags(67108864);
        return v.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cr
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ad b(IBinder iBinder) {
        return af.a(iBinder);
    }

    @Override // com.google.android.gms.internal.cr
    public void a() {
        o();
        super.a();
    }

    @Override // com.google.android.gms.internal.cr
    protected void a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null) {
            this.k = bundle.getBoolean("show_welcome_popup");
        }
        super.a(i, iBinder, bundle);
    }

    public void a(IBinder iBinder, Bundle bundle) {
        if (h()) {
            try {
                ((ad) n()).a(iBinder, bundle);
            } catch (RemoteException e) {
                w.a("GamesClient", "service died");
            }
        }
    }

    public void a(View view) {
        this.j.a(view);
    }

    @Override // com.google.android.gms.internal.cr
    protected void a(com.google.android.gms.common.a aVar) {
        super.a(aVar);
        this.k = false;
    }

    public void a(com.google.android.gms.games.a.a aVar, String str, long j) {
        s sVar;
        if (aVar == null) {
            sVar = null;
        } else {
            try {
                sVar = new s(this, aVar);
            } catch (RemoteException e) {
                w.a("GamesClient", "service died");
                return;
            }
        }
        ((ad) n()).a(sVar, str, j);
    }

    @Override // com.google.android.gms.internal.cr
    protected void a(df dfVar, cu cuVar) {
        String string = j().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.n);
        dfVar.a(cuVar, 3265100, j().getPackageName(), this.g, k(), this.f, this.j.b(), string, bundle);
    }

    @Override // com.google.android.gms.internal.cr
    protected void a(String... strArr) {
        boolean z = false;
        boolean z2 = false;
        for (String str : strArr) {
            if (str.equals("https://www.googleapis.com/auth/games")) {
                z2 = true;
            } else if (str.equals("https://www.googleapis.com/auth/games.firstparty")) {
                z = true;
            }
        }
        if (z) {
            Cdo.a(!z2, String.format("Cannot have both %s and %s!", "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"));
        } else {
            Cdo.a(z2, String.format("GamesClient requires %s to function.", "https://www.googleapis.com/auth/games"));
        }
    }

    @Override // com.google.android.gms.internal.cr
    public void b() {
        this.k = false;
        if (h()) {
            try {
                ad adVar = (ad) n();
                adVar.c();
                adVar.b(this.m);
                adVar.a(this.m);
            } catch (RemoteException e) {
                w.a("GamesClient", "Failed to notify client disconnect.");
            }
        }
        p();
        super.b();
    }

    @Override // com.google.android.gms.internal.cr
    protected String c() {
        return "com.google.android.gms.games.service.START";
    }

    @Override // com.google.android.gms.internal.cr
    protected String d() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    @Override // com.google.android.gms.internal.cr
    protected Bundle e() {
        try {
            Bundle bundleB = ((ad) n()).b();
            if (bundleB == null) {
                return bundleB;
            }
            bundleB.setClassLoader(r.class.getClassLoader());
            return bundleB;
        } catch (RemoteException e) {
            w.a("GamesClient", "service died");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.cr
    protected void f() {
        super.f();
        if (this.k) {
            this.j.a();
            this.k = false;
        }
    }

    public void g() {
        if (h()) {
            try {
                ((ad) n()).c();
            } catch (RemoteException e) {
                w.a("GamesClient", "service died");
            }
        }
    }
}
