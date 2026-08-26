package org.andengine.opengl.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private final HashSet a = new HashSet();
    private final HashMap b = new HashMap();
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private g f;

    public synchronized void a() {
        this.f = new g();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[Catch: all -> 0x0049, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0012, B:7:0x0018, B:28:0x004c, B:30:0x0058, B:31:0x0060, B:33:0x0068, B:9:0x001d, B:11:0x0023, B:34:0x006c, B:36:0x0078, B:37:0x007b, B:15:0x002c, B:18:0x0031, B:20:0x003d, B:23:0x0045), top: B:43:0x0001, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(org.andengine.opengl.util.e r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.HashSet r3 = r8.a     // Catch: java.lang.Throwable -> L49
            java.util.ArrayList r4 = r8.c     // Catch: java.lang.Throwable -> L49
            java.util.ArrayList r5 = r8.d     // Catch: java.lang.Throwable -> L49
            java.util.ArrayList r6 = r8.e     // Catch: java.lang.Throwable -> L49
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L49
            int r0 = r0 + (-1)
            r1 = r0
        L10:
            if (r1 >= 0) goto L31
            int r7 = r5.size()     // Catch: java.lang.Throwable -> L49
            if (r7 <= 0) goto L1d
            int r0 = r7 + (-1)
            r2 = r0
        L1b:
            if (r2 >= 0) goto L4c
        L1d:
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L49
            if (r2 <= 0) goto L28
            int r0 = r2 + (-1)
            r1 = r0
        L26:
            if (r1 >= 0) goto L6c
        L28:
            if (r7 > 0) goto L2c
            if (r2 <= 0) goto L2f
        L2c:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L49
        L2f:
            monitor-exit(r8)
            return
        L31:
            java.lang.Object r0 = r4.get(r1)     // Catch: java.lang.Throwable -> L49
            org.andengine.opengl.c.a r0 = (org.andengine.opengl.c.a) r0     // Catch: java.lang.Throwable -> L49
            boolean r2 = r0.e()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L40
            r0.c(r9)     // Catch: java.io.IOException -> L44 java.lang.Throwable -> L49
        L40:
            int r0 = r1 + (-1)
            r1 = r0
            goto L10
        L44:
            r0 = move-exception
            org.andengine.d.e.a.a(r0)     // Catch: java.lang.Throwable -> L49
            goto L40
        L49:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L4c:
            java.lang.Object r0 = r5.remove(r2)     // Catch: java.lang.Throwable -> L49
            org.andengine.opengl.c.a r0 = (org.andengine.opengl.c.a) r0     // Catch: java.lang.Throwable -> L49
            boolean r1 = r0.c()     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L60
            r0.a(r9)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L67
            org.andengine.opengl.c.g r1 = r8.f     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L67
            r1.a(r9, r0)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L67
        L60:
            r4.add(r0)     // Catch: java.lang.Throwable -> L49
            int r0 = r2 + (-1)
            r2 = r0
            goto L1b
        L67:
            r1 = move-exception
            org.andengine.d.e.a.a(r1)     // Catch: java.lang.Throwable -> L49
            goto L60
        L6c:
            java.lang.Object r0 = r6.remove(r1)     // Catch: java.lang.Throwable -> L49
            org.andengine.opengl.c.a r0 = (org.andengine.opengl.c.a) r0     // Catch: java.lang.Throwable -> L49
            boolean r5 = r0.c()     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L7b
            r0.b(r9)     // Catch: java.lang.Throwable -> L49
        L7b:
            r4.remove(r0)     // Catch: java.lang.Throwable -> L49
            r3.remove(r0)     // Catch: java.lang.Throwable -> L49
            int r0 = r1 + (-1)
            r1 = r0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: org.andengine.opengl.c.e.a(org.andengine.opengl.util.e):void");
    }

    public synchronized boolean a(a aVar) {
        boolean z;
        if (aVar == null) {
            throw new IllegalArgumentException("pTexture must not be null!");
        }
        if (this.a.contains(aVar)) {
            this.e.remove(aVar);
            z = false;
        } else {
            this.a.add(aVar);
            this.d.add(aVar);
            z = true;
        }
        return z;
    }

    public synchronized void b() {
        HashSet hashSet = this.a;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((a) it.next()).d();
            }
        }
        if (!this.c.isEmpty()) {
            this.d.addAll(this.c);
            this.c.clear();
        }
        if (!this.e.isEmpty()) {
            this.a.removeAll(this.e);
            this.e.clear();
        }
        this.f.e();
    }

    public synchronized void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).d();
        }
        this.d.clear();
        this.c.clear();
        this.a.clear();
        this.b.clear();
        this.f.n();
        this.f = null;
    }
}
