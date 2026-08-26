package android.support.v4.view.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class p implements w {
    final /* synthetic */ k a;
    final /* synthetic */ o b;

    p(o oVar, k kVar) {
        this.b = oVar;
        this.a = kVar;
    }

    @Override // android.support.v4.view.a.w
    public Object a(int i) {
        a aVarA = this.a.a(i);
        if (aVarA == null) {
            return null;
        }
        return aVarA.a();
    }

    @Override // android.support.v4.view.a.w
    public List a(String str, int i) {
        List listA = this.a.a(str, i);
        ArrayList arrayList = new ArrayList();
        int size = listA.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((a) listA.get(i2)).a());
        }
        return arrayList;
    }

    @Override // android.support.v4.view.a.w
    public boolean a(int i, int i2, Bundle bundle) {
        return this.a.a(i, i2, bundle);
    }

    @Override // android.support.v4.view.a.w
    public Object b(int i) {
        a aVarB = this.a.b(i);
        if (aVarB == null) {
            return null;
        }
        return aVarB.a();
    }
}
