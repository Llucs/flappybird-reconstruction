package com.google.tagmanager.a;

/* JADX INFO: loaded from: classes.dex */
final class z implements s {
    final ae a;
    final int b;
    final bm c;
    final boolean d;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(z zVar) {
        return this.b - zVar.b;
    }

    @Override // com.google.tagmanager.a.s
    public an a(an anVar, am amVar) {
        return ((v) anVar).a((t) amVar);
    }

    @Override // com.google.tagmanager.a.s
    public ap a(ap apVar, ap apVar2) {
        return ((ab) apVar).a((ab) apVar2);
    }

    @Override // com.google.tagmanager.a.s
    public bm a() {
        return this.c;
    }

    @Override // com.google.tagmanager.a.s
    public br b() {
        return this.c.a();
    }

    @Override // com.google.tagmanager.a.s
    public boolean c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }

    public ae e() {
        return this.a;
    }
}
