package org.andengine.opengl.d.a;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private final int a;
    private final a[] b;

    public c(int i, a... aVarArr) {
        this.b = aVarArr;
        this.a = i;
    }

    public void a() {
        a[] aVarArr = this.b;
        int i = this.a;
        for (a aVar : aVarArr) {
            aVar.a(i);
        }
    }
}
