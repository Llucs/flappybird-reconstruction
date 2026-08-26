package org.andengine.b;

/* JADX INFO: loaded from: classes.dex */
public class e extends a {
    private final long e;

    public e(org.andengine.b.c.b bVar, int i) {
        super(bVar);
        this.e = 1000000000 / ((long) i);
    }

    @Override // org.andengine.b.a
    public void a(long j) throws InterruptedException {
        long j2 = this.e - j;
        if (j2 <= 0) {
            super.a(j);
        } else {
            Thread.sleep((int) (j2 / 1000000));
            super.a(j2 + j);
        }
    }
}
