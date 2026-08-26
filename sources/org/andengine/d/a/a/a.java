package org.andengine.d.a.a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements org.andengine.d.a.c.a {
    protected Object[] a;
    protected int b;
    protected int c;

    public a() {
        this(1);
    }

    public a(int i) {
        this.a = new Object[i];
    }

    private void c() {
        int length = this.a.length;
        if (this.c == length) {
            if (this.c - this.b != length) {
                b();
                return;
            }
            Object[] objArr = new Object[((length * 3) >> 1) + 1];
            System.arraycopy(this.a, 0, objArr, 0, length);
            this.a = objArr;
        }
    }

    @Override // org.andengine.d.a.c.a
    public Object a() {
        if (this.b == this.c) {
            return null;
        }
        Object obj = this.a[this.b];
        this.a[this.b] = null;
        this.b++;
        if (this.b == this.c) {
            this.b = 0;
            this.c = 0;
        }
        return obj;
    }

    @Override // org.andengine.d.a.c.a
    public void a(Object obj) {
        c();
        this.a[this.c] = obj;
        this.c++;
    }

    public void b() {
        int i = this.c - this.b;
        if (i == 0) {
            this.b = 0;
            this.c = 0;
            return;
        }
        System.arraycopy(this.a, this.b, this.a, 0, i);
        int iMax = Math.max(i, this.b);
        int iMax2 = Math.max(iMax, this.c);
        if (iMax < iMax2) {
            Arrays.fill(this.a, iMax, iMax2, (Object) null);
        }
        this.b = 0;
        this.c = i;
    }
}
