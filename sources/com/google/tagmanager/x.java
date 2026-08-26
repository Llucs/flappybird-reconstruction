package com.google.tagmanager;

/* JADX INFO: loaded from: classes.dex */
class x extends Number implements Comparable {
    private double a;
    private long b;
    private boolean c = true;

    private x(long j) {
        this.b = j;
    }

    public static x a(long j) {
        return new x(j);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(x xVar) {
        return (b() && xVar.b()) ? new Long(this.b).compareTo(Long.valueOf(xVar.b)) : Double.compare(doubleValue(), xVar.doubleValue());
    }

    public boolean a() {
        return !b();
    }

    public boolean b() {
        return this.c;
    }

    @Override // java.lang.Number
    public byte byteValue() {
        return (byte) longValue();
    }

    public long c() {
        return b() ? this.b : (long) this.a;
    }

    public int d() {
        return (int) longValue();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return b() ? this.b : this.a;
    }

    public short e() {
        return (short) longValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && compareTo((x) obj) == 0;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        return new Long(longValue()).hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        return d();
    }

    @Override // java.lang.Number
    public long longValue() {
        return c();
    }

    @Override // java.lang.Number
    public short shortValue() {
        return e();
    }

    public String toString() {
        return b() ? Long.toString(this.b) : Double.toString(this.a);
    }
}
