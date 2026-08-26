package android.support.v4.b;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class b extends f {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // android.support.v4.b.f
    protected int a() {
        return this.a.h;
    }

    @Override // android.support.v4.b.f
    protected int a(Object obj) {
        return obj == null ? this.a.a() : this.a.a(obj, obj.hashCode());
    }

    @Override // android.support.v4.b.f
    protected Object a(int i, int i2) {
        return this.a.g[(i << 1) + i2];
    }

    @Override // android.support.v4.b.f
    protected Object a(int i, Object obj) {
        return this.a.a(i, obj);
    }

    @Override // android.support.v4.b.f
    protected void a(int i) {
        this.a.d(i);
    }

    @Override // android.support.v4.b.f
    protected void a(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }

    @Override // android.support.v4.b.f
    protected int b(Object obj) {
        return this.a.a(obj);
    }

    @Override // android.support.v4.b.f
    protected Map b() {
        return this.a;
    }

    @Override // android.support.v4.b.f
    protected void c() {
        this.a.clear();
    }
}
