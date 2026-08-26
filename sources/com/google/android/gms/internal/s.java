package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class s extends q {
    final /* synthetic */ r a;
    private final com.google.android.gms.games.a.a b;

    public s(r rVar, com.google.android.gms.games.a.a aVar) {
        this.a = rVar;
        this.b = (com.google.android.gms.games.a.a) Cdo.a(aVar, "Listener must not be null");
    }

    @Override // com.google.android.gms.internal.q, com.google.android.gms.internal.y
    public void c(com.google.android.gms.common.data.d dVar) {
        this.a.a(new t(this.a, this.b, new com.google.android.gms.games.a.b(dVar)));
    }
}
