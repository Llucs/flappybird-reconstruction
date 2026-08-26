package android.support.v4.b;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l {
    static Object[] b;
    static int c;
    static Object[] d;
    static int e;
    int[] f = c.a;
    Object[] g = c.c;
    int h = 0;

    private static void a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (a.class) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    d = objArr;
                    e++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (a.class) {
                if (c < 10) {
                    objArr[0] = b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    b = objArr;
                    c++;
                }
            }
        }
    }

    private void e(int i) {
        if (i == 8) {
            synchronized (a.class) {
                if (d != null) {
                    Object[] objArr = d;
                    this.g = objArr;
                    d = (Object[]) objArr[0];
                    this.f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (a.class) {
                if (b != null) {
                    Object[] objArr2 = b;
                    this.g = objArr2;
                    b = (Object[]) objArr2[0];
                    this.f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    c--;
                    return;
                }
            }
        }
        this.f = new int[i];
        this.g = new Object[i << 1];
    }

    int a() {
        int i = this.h;
        if (i == 0) {
            return -1;
        }
        int iA = c.a(this.f, i, 0);
        if (iA < 0 || this.g[iA << 1] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.f[i2] == 0) {
            if (this.g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.f[i3] == 0; i3--) {
            if (this.g[i3 << 1] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    int a(Object obj) {
        int i = 1;
        int i2 = this.h * 2;
        Object[] objArr = this.g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    int a(Object obj, int i) {
        int i2 = this.h;
        if (i2 == 0) {
            return -1;
        }
        int iA = c.a(this.f, i2, i);
        if (iA < 0 || obj.equals(this.g[iA << 1])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.f[i3] == i) {
            if (obj.equals(this.g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.f[i4] == i; i4--) {
            if (obj.equals(this.g[i4 << 1])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    public Object a(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object obj2 = this.g[i2];
        this.g[i2] = obj;
        return obj2;
    }

    public void a(int i) {
        if (this.f.length < i) {
            int[] iArr = this.f;
            Object[] objArr = this.g;
            e(i);
            if (this.h > 0) {
                System.arraycopy(iArr, 0, this.f, 0, this.h);
                System.arraycopy(objArr, 0, this.g, 0, this.h << 1);
            }
            a(iArr, objArr, this.h);
        }
    }

    public Object b(int i) {
        return this.g[i << 1];
    }

    public Object c(int i) {
        return this.g[(i << 1) + 1];
    }

    public void clear() {
        if (this.h != 0) {
            a(this.f, this.g, this.h);
            this.f = c.a;
            this.g = c.c;
            this.h = 0;
        }
    }

    public boolean containsKey(Object obj) {
        return obj == null ? a() >= 0 : a(obj, obj.hashCode()) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public Object d(int i) {
        Object obj = this.g[(i << 1) + 1];
        if (this.h <= 1) {
            a(this.f, this.g, this.h);
            this.f = c.a;
            this.g = c.c;
            this.h = 0;
        } else if (this.f.length <= 8 || this.h >= this.f.length / 3) {
            this.h--;
            if (i < this.h) {
                System.arraycopy(this.f, i + 1, this.f, i, this.h - i);
                System.arraycopy(this.g, (i + 1) << 1, this.g, i << 1, (this.h - i) << 1);
            }
            this.g[this.h << 1] = null;
            this.g[(this.h << 1) + 1] = null;
        } else {
            int i2 = this.h > 8 ? this.h + (this.h >> 1) : 8;
            int[] iArr = this.f;
            Object[] objArr = this.g;
            e(i2);
            this.h--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f, 0, i);
                System.arraycopy(objArr, 0, this.g, 0, i << 1);
            }
            if (i < this.h) {
                System.arraycopy(iArr, i + 1, this.f, i, this.h - i);
                System.arraycopy(objArr, (i + 1) << 1, this.g, i << 1, (this.h - i) << 1);
            }
        }
        return obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        for (int i = 0; i < this.h; i++) {
            try {
                Object objB = b(i);
                Object objC = c(i);
                Object obj2 = map.get(objB);
                if (objC == null) {
                    if (obj2 != null || !map.containsKey(objB)) {
                        return false;
                    }
                } else if (!objC.equals(obj2)) {
                    return false;
                }
            } catch (ClassCastException e2) {
                return false;
            } catch (NullPointerException e3) {
                return false;
            }
        }
        return true;
    }

    public Object get(Object obj) {
        int iA = obj == null ? a() : a(obj, obj.hashCode());
        if (iA >= 0) {
            return this.g[(iA << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f;
        Object[] objArr = this.g;
        int i = this.h;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.h <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int iHashCode;
        int iA;
        int i = 8;
        if (obj == null) {
            iA = a();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iA = a(obj, iHashCode);
        }
        if (iA >= 0) {
            int i2 = (iA << 1) + 1;
            Object obj3 = this.g[i2];
            this.g[i2] = obj2;
            return obj3;
        }
        int i3 = iA ^ (-1);
        if (this.h >= this.f.length) {
            if (this.h >= 8) {
                i = this.h + (this.h >> 1);
            } else if (this.h < 4) {
                i = 4;
            }
            int[] iArr = this.f;
            Object[] objArr = this.g;
            e(i);
            if (this.f.length > 0) {
                System.arraycopy(iArr, 0, this.f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.g, 0, objArr.length);
            }
            a(iArr, objArr, this.h);
        }
        if (i3 < this.h) {
            System.arraycopy(this.f, i3, this.f, i3 + 1, this.h - i3);
            System.arraycopy(this.g, i3 << 1, this.g, (i3 + 1) << 1, (this.h - i3) << 1);
        }
        this.f[i3] = iHashCode;
        this.g[i3 << 1] = obj;
        this.g[(i3 << 1) + 1] = obj2;
        this.h++;
        return null;
    }

    public Object remove(Object obj) {
        int iA = obj == null ? a() : a(obj, obj.hashCode());
        if (iA >= 0) {
            return d(iA);
        }
        return null;
    }

    public int size() {
        return this.h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        for (int i = 0; i < this.h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objB = b(i);
            if (objB != this) {
                sb.append(objB);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objC = c(i);
            if (objC != this) {
                sb.append(objC);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
