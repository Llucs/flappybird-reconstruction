package android.support.v4.b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a extends l implements Map {
    f a;

    private f b() {
        if (this.a == null) {
            this.a = new b(this);
        }
        return this.a;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return b().d();
    }

    @Override // java.util.Map
    public Set keySet() {
        return b().e();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        a(this.h + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        return b().f();
    }
}
