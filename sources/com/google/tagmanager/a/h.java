package com.google.tagmanager.a;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Iterable {
    public static final h a;
    static final /* synthetic */ boolean b;

    static {
        b = !h.class.desiredAssertionStatus();
        a = new aj(new byte[0]);
    }

    h() {
    }

    public static h a(Iterable iterable) {
        Collection collection;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add((h) it.next());
            }
            collection = arrayList;
        }
        return collection.isEmpty() ? a : a(collection.iterator(), collection.size());
    }

    private static h a(Iterator it, int i) {
        if (!b && i < 1) {
            throw new AssertionError();
        }
        if (i == 1) {
            return (h) it.next();
        }
        int i2 = i >>> 1;
        return a(it, i2).a(a(it, i - i2));
    }

    public static h a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new aj(bArr2);
    }

    public static j i() {
        return new j(128);
    }

    public abstract int a();

    protected abstract int a(int i, int i2, int i3);

    public h a(h hVar) {
        int iA = a();
        int iA2 = hVar.a();
        if (((long) iA) + ((long) iA2) >= 2147483647L) {
            throw new IllegalArgumentException("ByteString would be too long: " + iA + "+" + iA2);
        }
        return ar.a(this, hVar);
    }

    public abstract String a(String str);

    void a(OutputStream outputStream, int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + i);
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + i2);
        }
        if (i + i2 > a()) {
            throw new IndexOutOfBoundsException("Source end offset exceeded: " + (i + i2));
        }
        if (i2 > 0) {
            b(outputStream, i, i2);
        }
    }

    protected abstract void a(byte[] bArr, int i, int i2, int i3);

    protected abstract int b(int i, int i2, int i3);

    abstract void b(OutputStream outputStream, int i, int i2);

    public void b(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + i);
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Target offset < 0: " + i2);
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + i3);
        }
        if (i + i3 > a()) {
            throw new IndexOutOfBoundsException("Source end offset < 0: " + (i + i3));
        }
        if (i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException("Target end offset < 0: " + (i2 + i3));
        }
        if (i3 > 0) {
            a(bArr, i, i2, i3);
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract i iterator();

    public boolean d() {
        return a() == 0;
    }

    public byte[] e() {
        int iA = a();
        if (iA == 0) {
            return ac.a;
        }
        byte[] bArr = new byte[iA];
        a(bArr, 0, 0, iA);
        return bArr;
    }

    public String f() {
        try {
            return a("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public abstract boolean g();

    public abstract k h();

    public abstract int hashCode();

    protected abstract int j();

    protected abstract boolean k();

    protected abstract int l();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a()));
    }
}
