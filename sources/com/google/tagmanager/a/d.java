package com.google.tagmanager.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements aq {
    private static final o a = o.a();

    private bf a(am amVar) {
        return amVar instanceof a ? ((a) amVar).Q() : amVar instanceof c ? ((c) amVar).b() : new bf(amVar);
    }

    private am b(am amVar) throws af {
        if (amVar == null || amVar.j()) {
            return amVar;
        }
        throw a(amVar).a().a(amVar);
    }

    public am a(h hVar, o oVar) throws af {
        try {
            try {
                k kVarH = hVar.h();
                am amVar = (am) b(kVarH, oVar);
                try {
                    kVarH.a(0);
                    return amVar;
                } catch (af e) {
                    throw e.a(amVar);
                }
            } catch (IOException e2) {
                throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e2);
            }
        } catch (af e3) {
            throw e3;
        }
    }

    @Override // com.google.tagmanager.a.aq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public am c(h hVar, o oVar) {
        return b(a(hVar, oVar));
    }
}
