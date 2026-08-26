package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class t extends ct {
    final /* synthetic */ r a;
    private final com.google.android.gms.games.a.b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, com.google.android.gms.games.a.a aVar, com.google.android.gms.games.a.b bVar) {
        super(rVar, aVar);
        this.a = rVar;
        this.c = bVar;
    }

    @Override // com.google.android.gms.internal.ct
    protected void a() {
    }

    @Override // com.google.android.gms.internal.ct
    public void a(com.google.android.gms.games.a.a aVar) {
        aVar.a(this.c.a(), this.c);
    }
}
