package com.google.tagmanager.a;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class ar extends h {
    private static final int[] c;
    private final int d;
    private final h e;
    private final h f;
    private final int g;
    private final int h;
    private int i;

    static {
        int i = 1;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        c = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= c.length) {
                return;
            }
            c[i5] = ((Integer) arrayList.get(i5)).intValue();
            i4 = i5 + 1;
        }
    }

    private ar(h hVar, h hVar2) {
        this.i = 0;
        this.e = hVar;
        this.f = hVar2;
        this.g = hVar.a();
        this.d = this.g + hVar2.a();
        this.h = Math.max(hVar.j(), hVar2.j()) + 1;
    }

    static h a(h hVar, h hVar2) {
        ar arVar = hVar instanceof ar ? (ar) hVar : null;
        if (hVar2.a() == 0) {
            return hVar;
        }
        if (hVar.a() == 0) {
            return hVar2;
        }
        int iA = hVar.a() + hVar2.a();
        if (iA < 128) {
            return b(hVar, hVar2);
        }
        if (arVar != null && arVar.f.a() + hVar2.a() < 128) {
            return new ar(arVar.e, b(arVar.f, hVar2));
        }
        if (arVar == null || arVar.e.j() <= arVar.f.j() || arVar.j() <= hVar2.j()) {
            return iA >= c[Math.max(hVar.j(), hVar2.j()) + 1] ? new ar(hVar, hVar2) : new at().a(hVar, hVar2);
        }
        return new ar(arVar.e, new ar(arVar.f, hVar2));
    }

    private static aj b(h hVar, h hVar2) {
        int iA = hVar.a();
        int iA2 = hVar2.a();
        byte[] bArr = new byte[iA + iA2];
        hVar.b(bArr, 0, 0, iA);
        hVar2.b(bArr, 0, iA, iA2);
        return new aj(bArr);
    }

    private boolean b(h hVar) {
        int i;
        aj ajVar;
        as asVar = null;
        au auVar = new au(this);
        aj ajVar2 = (aj) auVar.next();
        au auVar2 = new au(hVar);
        aj ajVar3 = (aj) auVar2.next();
        int i2 = 0;
        aj ajVar4 = ajVar2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int iA = ajVar4.a() - i3;
            int iA2 = ajVar3.a() - i2;
            int iMin = Math.min(iA, iA2);
            if (!(i3 == 0 ? ajVar4.a(ajVar3, i2, iMin) : ajVar3.a(ajVar4, i3, iMin))) {
                return false;
            }
            int i5 = i4 + iMin;
            if (i5 >= this.d) {
                if (i5 == this.d) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iA) {
                ajVar4 = (aj) auVar.next();
                i3 = 0;
            } else {
                i3 += iMin;
            }
            if (iMin == iA2) {
                ajVar = (aj) auVar2.next();
                i = 0;
            } else {
                aj ajVar5 = ajVar3;
                i = i2 + iMin;
                ajVar = ajVar5;
            }
            i2 = i;
            ajVar3 = ajVar;
            i4 = i5;
        }
    }

    @Override // com.google.tagmanager.a.h
    public int a() {
        return this.d;
    }

    @Override // com.google.tagmanager.a.h
    protected int a(int i, int i2, int i3) {
        if (i2 + i3 <= this.g) {
            return this.e.a(i, i2, i3);
        }
        if (i2 >= this.g) {
            return this.f.a(i, i2 - this.g, i3);
        }
        int i4 = this.g - i2;
        return this.f.a(this.e.a(i, i2, i4), 0, i3 - i4);
    }

    @Override // com.google.tagmanager.a.h
    public String a(String str) {
        return new String(e(), str);
    }

    @Override // com.google.tagmanager.a.h
    protected void a(byte[] bArr, int i, int i2, int i3) {
        if (i + i3 <= this.g) {
            this.e.a(bArr, i, i2, i3);
        } else {
            if (i >= this.g) {
                this.f.a(bArr, i - this.g, i2, i3);
                return;
            }
            int i4 = this.g - i;
            this.e.a(bArr, i, i2, i4);
            this.f.a(bArr, 0, i2 + i4, i3 - i4);
        }
    }

    @Override // com.google.tagmanager.a.h
    protected int b(int i, int i2, int i3) {
        if (i2 + i3 <= this.g) {
            return this.e.b(i, i2, i3);
        }
        if (i2 >= this.g) {
            return this.f.b(i, i2 - this.g, i3);
        }
        int i4 = this.g - i2;
        return this.f.b(this.e.b(i, i2, i4), 0, i3 - i4);
    }

    @Override // com.google.tagmanager.a.h
    void b(OutputStream outputStream, int i, int i2) {
        if (i + i2 <= this.g) {
            this.e.b(outputStream, i, i2);
        } else {
            if (i >= this.g) {
                this.f.b(outputStream, i - this.g, i2);
                return;
            }
            int i3 = this.g - i;
            this.e.b(outputStream, i, i3);
            this.f.b(outputStream, 0, i2 - i3);
        }
    }

    @Override // com.google.tagmanager.a.h, java.lang.Iterable
    /* JADX INFO: renamed from: c */
    public i iterator() {
        return new av(this);
    }

    public boolean equals(Object obj) {
        int iL;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.d != hVar.a()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        if (this.i == 0 || (iL = hVar.l()) == 0 || this.i == iL) {
            return b(hVar);
        }
        return false;
    }

    @Override // com.google.tagmanager.a.h
    public boolean g() {
        return this.f.a(this.e.a(0, 0, this.g), 0, this.f.a()) == 0;
    }

    @Override // com.google.tagmanager.a.h
    public k h() {
        return k.a(new aw(this));
    }

    @Override // com.google.tagmanager.a.h
    public int hashCode() {
        int iB = this.i;
        if (iB == 0) {
            iB = b(this.d, 0, this.d);
            if (iB == 0) {
                iB = 1;
            }
            this.i = iB;
        }
        return iB;
    }

    @Override // com.google.tagmanager.a.h
    protected int j() {
        return this.h;
    }

    @Override // com.google.tagmanager.a.h
    protected boolean k() {
        return this.d >= c[this.h];
    }

    @Override // com.google.tagmanager.a.h
    protected int l() {
        return this.i;
    }
}
