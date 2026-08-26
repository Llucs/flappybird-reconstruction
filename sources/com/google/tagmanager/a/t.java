package com.google.tagmanager.a;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends a implements Serializable {
    protected t() {
    }

    protected t(v vVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(q qVar, am amVar, k kVar, m mVar, o oVar, int i) throws IOException {
        boolean z;
        boolean z2;
        Object objB;
        am amVar2;
        int iA = bk.a(i);
        aa aaVarA = oVar.a(amVar, bk.b(i));
        if (aaVarA == null) {
            z = false;
            z2 = true;
        } else if (iA == q.a(aaVarA.b.a(), false)) {
            z = false;
            z2 = false;
        } else if (aaVarA.b.d && aaVarA.b.c.c() && iA == q.a(aaVarA.b.a(), true)) {
            z = true;
            z2 = false;
        } else {
            z = false;
            z2 = true;
        }
        if (z2) {
            return kVar.a(i, mVar);
        }
        if (z) {
            int iC = kVar.c(kVar.s());
            if (aaVarA.b.a() == bm.n) {
                while (kVar.w() > 0) {
                    ad adVarB = aaVarA.b.e().b(kVar.n());
                    if (adVarB == null) {
                        return true;
                    }
                    qVar.b(aaVarA.b, aaVarA.a(adVarB));
                }
            } else {
                while (kVar.w() > 0) {
                    qVar.b(aaVarA.b, q.a(kVar, aaVarA.b.a(), false));
                }
            }
            kVar.d(iC);
        } else {
            switch (u.a[aaVarA.b.b().ordinal()]) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    an anVarN = (aaVarA.b.c() || (amVar2 = (am) qVar.a(aaVarA.b)) == null) ? null : amVar2.n();
                    if (anVarN == null) {
                        anVarN = aaVarA.b().o();
                    }
                    if (aaVarA.b.a() == bm.j) {
                        kVar.a(aaVarA.a(), anVarN, oVar);
                    } else {
                        kVar.a(anVarN, oVar);
                    }
                    objB = anVarN.h();
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    int iN = kVar.n();
                    objB = aaVarA.b.e().b(iN);
                    if (objB == null) {
                        mVar.d(i);
                        mVar.b(iN);
                        return true;
                    }
                    break;
                default:
                    objB = q.a(kVar, aaVarA.b.a(), false);
                    break;
            }
            if (aaVarA.b.c()) {
                qVar.b(aaVarA.b, aaVarA.a(objB));
            } else {
                qVar.a(aaVarA.b, aaVarA.a(objB));
            }
        }
        return true;
    }

    protected void R() {
    }

    protected boolean a(k kVar, m mVar, o oVar, int i) {
        return kVar.a(i, mVar);
    }

    @Override // com.google.tagmanager.a.am
    public aq c() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }
}
