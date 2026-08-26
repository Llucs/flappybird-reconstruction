package com.google.tagmanager.a;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
class at {
    private final Deque a;

    private at() {
        this.a = new ArrayDeque(ar.c.length);
    }

    private int a(int i) {
        int iBinarySearch = Arrays.binarySearch(ar.c, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h a(h hVar, h hVar2) {
        a(hVar);
        a(hVar2);
        h arVar = (h) this.a.pop();
        while (!this.a.isEmpty()) {
            arVar = new ar((h) this.a.pop(), arVar);
        }
        return arVar;
    }

    private void a(h hVar) {
        if (hVar.k()) {
            b(hVar);
        } else {
            if (!(hVar instanceof ar)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + hVar.getClass());
            }
            ar arVar = (ar) hVar;
            a(arVar.e);
            a(arVar.f);
        }
    }

    private void b(h hVar) {
        as asVar = null;
        int iA = a(hVar.a());
        int i = ar.c[iA + 1];
        if (this.a.isEmpty() || ((h) this.a.peek()).a() >= i) {
            this.a.push(hVar);
            return;
        }
        int i2 = ar.c[iA];
        h arVar = (h) this.a.pop();
        while (!this.a.isEmpty() && ((h) this.a.peek()).a() < i2) {
            arVar = new ar((h) this.a.pop(), arVar);
        }
        ar arVar2 = new ar(arVar, hVar);
        while (!this.a.isEmpty()) {
            if (((h) this.a.peek()).a() >= ar.c[a(arVar2.a()) + 1]) {
                break;
            } else {
                arVar2 = new ar((h) this.a.pop(), arVar2);
            }
        }
        this.a.push(arVar2);
    }
}
