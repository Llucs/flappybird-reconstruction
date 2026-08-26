package com.google.tagmanager.a;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ay extends ax {
    ay(int i) {
        super(i, null);
    }

    @Override // com.google.tagmanager.a.ax
    public void a() {
        if (!b()) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= c()) {
                    break;
                }
                Map.Entry entryB = b(i2);
                if (((s) entryB.getKey()).c()) {
                    entryB.setValue(Collections.unmodifiableList((List) entryB.getValue()));
                }
                i = i2 + 1;
            }
            for (Map.Entry entry : d()) {
                if (((s) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }

    @Override // com.google.tagmanager.a.ax, java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((s) obj, obj2);
    }
}
