package org.andengine.opengl.c.a.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements b {
    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // org.andengine.opengl.c.a.b.b
    public int a() {
        return this.a;
    }

    @Override // org.andengine.opengl.c.a.b.b
    public void a(int i) {
        this.a = i;
    }

    @Override // org.andengine.opengl.c.a.b.b
    public int b() {
        return this.b;
    }

    @Override // org.andengine.opengl.c.a.b.b
    public void b(int i) {
        this.b = i;
    }

    @Override // org.andengine.opengl.c.a.b.b
    public int c() {
        return this.c;
    }

    @Override // org.andengine.opengl.c.a.b.b
    public int d() {
        return this.d;
    }

    public String toString() {
        return String.valueOf(getClass().getSimpleName()) + "( " + c() + "x" + d() + " @ " + this.a + "/" + this.b + " )";
    }
}
