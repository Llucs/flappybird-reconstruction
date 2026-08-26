package com.google.android.gms.games.a;

import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.Cdo;
import com.google.android.gms.internal.ao;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final String[] a = {"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest"};
    private String b;
    private String c;
    private int d;
    private HashMap e = new HashMap();

    public b(d dVar) {
        this.d = dVar.e();
        int iG = dVar.g();
        Cdo.b(iG == 3);
        for (int i = 0; i < iG; i++) {
            int iA = dVar.a(i);
            if (i == 0) {
                this.b = dVar.c("leaderboardId", i, iA);
                this.c = dVar.c("playerId", i, iA);
            }
            if (dVar.d("hasResult", i, iA)) {
                a(new c(dVar.a("rawScore", i, iA), dVar.c("formattedScore", i, iA), dVar.d("newBest", i, iA)), dVar.b("timeSpan", i, iA));
            }
        }
    }

    private void a(c cVar, int i) {
        this.e.put(Integer.valueOf(i), cVar);
    }

    public int a() {
        return this.d;
    }

    public String toString() {
        dn dnVarA = dl.a(this).a("PlayerId", this.c).a("StatusCode", Integer.valueOf(this.d));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 3) {
                return dnVarA.toString();
            }
            c cVar = (c) this.e.get(Integer.valueOf(i2));
            dnVarA.a("TimesSpan", ao.a(i2));
            dnVarA.a("Result", cVar == null ? "null" : cVar.toString());
            i = i2 + 1;
        }
    }
}
