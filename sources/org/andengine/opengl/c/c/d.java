package org.andengine.opengl.c.c;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static c a(org.andengine.opengl.c.a.a aVar, org.andengine.opengl.c.a.b.b bVar, int i, int i2) {
        return a(aVar, bVar, i, i2, false);
    }

    public static c a(org.andengine.opengl.c.a.a aVar, org.andengine.opengl.c.a.b.b bVar, int i, int i2, boolean z) {
        c cVar = new c(aVar, i, i2, bVar.c(), bVar.d(), z);
        aVar.a(bVar, i, i2);
        return cVar;
    }
}
