package android.support.v4.view.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class n implements t {
    final /* synthetic */ k a;
    final /* synthetic */ m b;

    n(m mVar, k kVar) {
        this.b = mVar;
        this.a = kVar;
    }

    @Override // android.support.v4.view.a.t
    public Object a(int i) {
        a aVarA = this.a.a(i);
        if (aVarA == null) {
            return null;
        }
        return aVarA.a();
    }

    @Override // android.support.v4.view.a.t
    public List a(String str, int i) {
        List listA = this.a.a(str, i);
        ArrayList arrayList = new ArrayList();
        int size = listA.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((a) listA.get(i2)).a());
        }
        return arrayList;
    }

    @Override // android.support.v4.view.a.t
    public boolean a(int i, int i2, Bundle bundle) {
        return this.a.a(i, i2, bundle);
    }
}
