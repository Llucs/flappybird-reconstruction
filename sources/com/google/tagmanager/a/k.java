package com.google.tagmanager.a;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    private final byte[] a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final InputStream f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private l n;

    private k(aj ajVar) {
        this.h = false;
        this.j = Integer.MAX_VALUE;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.a = ajVar.c;
        this.e = ajVar.b();
        this.c = ajVar.b() + ajVar.a();
        this.i = -this.e;
        this.f = null;
        this.b = true;
    }

    private k(InputStream inputStream) {
        this.h = false;
        this.j = Integer.MAX_VALUE;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.a = new byte[4096];
        this.c = 0;
        this.e = 0;
        this.i = 0;
        this.f = inputStream;
        this.b = false;
    }

    public static long a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    static k a(aj ajVar) {
        k kVar = new k(ajVar);
        try {
            kVar.c(ajVar.a());
            return kVar;
        } catch (af e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static k a(InputStream inputStream) {
        return new k(inputStream);
    }

    private boolean a(boolean z) throws af {
        if (this.e < this.c) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        if (this.i + this.c == this.j) {
            if (z) {
                throw af.b();
            }
            return false;
        }
        if (this.n != null) {
            this.n.a();
        }
        this.i += this.c;
        this.e = 0;
        this.c = this.f == null ? -1 : this.f.read(this.a);
        if (this.c == 0 || this.c < -1) {
            throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.c + "\nThe InputStream implementation is buggy.");
        }
        if (this.c == -1) {
            this.c = 0;
            if (z) {
                throw af.b();
            }
            return false;
        }
        z();
        int i = this.i + this.c + this.d;
        if (i > this.m || i < 0) {
            throw af.i();
        }
        return true;
    }

    public static int b(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    private void z() {
        this.c += this.d;
        int i = this.i + this.c;
        if (i <= this.j) {
            this.d = 0;
        } else {
            this.d = i - this.j;
            this.c -= this.d;
        }
    }

    public int a() throws af {
        if (x()) {
            this.g = 0;
            return 0;
        }
        this.g = s();
        if (bk.b(this.g) == 0) {
            throw af.e();
        }
        return this.g;
    }

    public am a(aq aqVar, o oVar) throws af {
        int iS = s();
        if (this.k >= this.l) {
            throw af.h();
        }
        int iC = c(iS);
        this.k++;
        am amVar = (am) aqVar.b(this, oVar);
        a(0);
        this.k--;
        d(iC);
        return amVar;
    }

    public void a(int i) throws af {
        if (this.g != i) {
            throw af.f();
        }
    }

    public void a(int i, an anVar, o oVar) throws af {
        if (this.k >= this.l) {
            throw af.h();
        }
        this.k++;
        anVar.c(this, oVar);
        a(bk.a(i, 4));
        this.k--;
    }

    public void a(an anVar, o oVar) throws af {
        int iS = s();
        if (this.k >= this.l) {
            throw af.h();
        }
        int iC = c(iS);
        this.k++;
        anVar.c(this, oVar);
        a(0);
        this.k--;
        d(iC);
    }

    public void a(m mVar) throws af {
        int iA;
        do {
            iA = a();
            if (iA == 0) {
                return;
            }
        } while (a(iA, mVar));
    }

    public boolean a(int i, m mVar) throws IOException {
        switch (bk.a(i)) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                long jE = e();
                mVar.d(i);
                mVar.a(jE);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                long jV = v();
                mVar.d(i);
                mVar.b(jV);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                h hVarL = l();
                mVar.d(i);
                mVar.a(hVarL);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                mVar.d(i);
                a(mVar);
                int iA = bk.a(bk.b(i), 4);
                a(iA);
                mVar.d(iA);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                return false;
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                int iU = u();
                mVar.d(i);
                mVar.a(iU);
                return true;
            default:
                throw af.g();
        }
    }

    public double b() {
        return Double.longBitsToDouble(v());
    }

    public float c() {
        return Float.intBitsToFloat(u());
    }

    public int c(int i) throws af {
        if (i < 0) {
            throw af.c();
        }
        int i2 = this.i + this.e + i;
        int i3 = this.j;
        if (i2 > i3) {
            throw af.b();
        }
        this.j = i2;
        z();
        return i3;
    }

    public long d() {
        return t();
    }

    public void d(int i) {
        this.j = i;
        z();
    }

    public long e() {
        return t();
    }

    public byte[] e(int i) throws af {
        if (i < 0) {
            throw af.c();
        }
        if (this.i + this.e + i > this.j) {
            f((this.j - this.i) - this.e);
            throw af.b();
        }
        if (i <= this.c - this.e) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.a, this.e, bArr, 0, i);
            this.e += i;
            return bArr;
        }
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i2 = this.c - this.e;
            System.arraycopy(this.a, this.e, bArr2, 0, i2);
            this.e = this.c;
            a(true);
            while (i - i2 > this.c) {
                System.arraycopy(this.a, 0, bArr2, i2, this.c);
                i2 += this.c;
                this.e = this.c;
                a(true);
            }
            System.arraycopy(this.a, 0, bArr2, i2, i - i2);
            this.e = i - i2;
            return bArr2;
        }
        int i3 = this.e;
        int i4 = this.c;
        this.i += this.c;
        this.e = 0;
        this.c = 0;
        ArrayList arrayList = new ArrayList();
        int i5 = i - (i4 - i3);
        while (i5 > 0) {
            byte[] bArr3 = new byte[Math.min(i5, 4096)];
            int i6 = 0;
            while (i6 < bArr3.length) {
                int i7 = this.f == null ? -1 : this.f.read(bArr3, i6, bArr3.length - i6);
                if (i7 == -1) {
                    throw af.b();
                }
                this.i += i7;
                i6 += i7;
            }
            int length = i5 - bArr3.length;
            arrayList.add(bArr3);
            i5 = length;
        }
        byte[] bArr4 = new byte[i];
        int length2 = i4 - i3;
        System.arraycopy(this.a, i3, bArr4, 0, length2);
        Iterator it = arrayList.iterator();
        while (true) {
            int i8 = length2;
            if (!it.hasNext()) {
                return bArr4;
            }
            byte[] bArr5 = (byte[]) it.next();
            System.arraycopy(bArr5, 0, bArr4, i8, bArr5.length);
            length2 = bArr5.length + i8;
        }
    }

    public int f() {
        return s();
    }

    public void f(int i) throws af {
        if (i < 0) {
            throw af.c();
        }
        if (this.i + this.e + i > this.j) {
            f((this.j - this.i) - this.e);
            throw af.b();
        }
        if (i <= this.c - this.e) {
            this.e += i;
            return;
        }
        int i2 = this.c - this.e;
        this.e = this.c;
        a(true);
        while (i - i2 > this.c) {
            i2 += this.c;
            this.e = this.c;
            a(true);
        }
        this.e = i - i2;
    }

    public long g() {
        return v();
    }

    public int h() {
        return u();
    }

    public boolean i() {
        return s() != 0;
    }

    public String j() throws af {
        int iS = s();
        if (iS > this.c - this.e || iS <= 0) {
            return new String(e(iS), "UTF-8");
        }
        String str = new String(this.a, this.e, iS, "UTF-8");
        this.e = iS + this.e;
        return str;
    }

    public String k() throws af {
        h ajVar;
        int iS = s();
        if (iS > this.c - this.e || iS <= 0) {
            ajVar = new aj(e(iS));
        } else {
            ajVar = h.a(this.a, this.e, iS);
            this.e = iS + this.e;
        }
        if (ajVar.g()) {
            return ajVar.f();
        }
        throw af.j();
    }

    public h l() throws af {
        int iS = s();
        if (iS == 0) {
            return h.a;
        }
        if (iS > this.c - this.e || iS <= 0) {
            return new aj(e(iS));
        }
        h eVar = (this.b && this.h) ? new e(this.a, this.e, iS) : h.a(this.a, this.e, iS);
        this.e = iS + this.e;
        return eVar;
    }

    public int m() {
        return s();
    }

    public int n() {
        return s();
    }

    public int o() {
        return u();
    }

    public long p() {
        return v();
    }

    public int q() {
        return b(s());
    }

    public long r() {
        return a(t());
    }

    public int s() throws af {
        byte bY = y();
        if (bY >= 0) {
            return bY;
        }
        int i = bY & 127;
        byte bY2 = y();
        if (bY2 >= 0) {
            return i | (bY2 << 7);
        }
        int i2 = i | ((bY2 & 127) << 7);
        byte bY3 = y();
        if (bY3 >= 0) {
            return i2 | (bY3 << 14);
        }
        int i3 = i2 | ((bY3 & 127) << 14);
        byte bY4 = y();
        if (bY4 >= 0) {
            return i3 | (bY4 << 21);
        }
        int i4 = i3 | ((bY4 & 127) << 21);
        byte bY5 = y();
        int i5 = i4 | (bY5 << 28);
        if (bY5 >= 0) {
            return i5;
        }
        for (int i6 = 0; i6 < 5; i6++) {
            if (y() >= 0) {
                return i5;
            }
        }
        throw af.d();
    }

    public long t() throws af {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bY = y();
            j |= ((long) (bY & 127)) << i;
            if ((bY & 128) == 0) {
                return j;
            }
        }
        throw af.d();
    }

    public int u() throws af {
        return (y() & 255) | ((y() & 255) << 8) | ((y() & 255) << 16) | ((y() & 255) << 24);
    }

    public long v() throws af {
        byte bY = y();
        return ((((long) y()) & 255) << 8) | (((long) bY) & 255) | ((((long) y()) & 255) << 16) | ((((long) y()) & 255) << 24) | ((((long) y()) & 255) << 32) | ((((long) y()) & 255) << 40) | ((((long) y()) & 255) << 48) | ((((long) y()) & 255) << 56);
    }

    public int w() {
        if (this.j == Integer.MAX_VALUE) {
            return -1;
        }
        return this.j - (this.i + this.e);
    }

    public boolean x() {
        return this.e == this.c && !a(false);
    }

    public byte y() throws af {
        if (this.e == this.c) {
            a(true);
        }
        byte[] bArr = this.a;
        int i = this.e;
        this.e = i + 1;
        return bArr[i];
    }
}
