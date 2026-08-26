package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.Cdo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d implements SafeParcelable {
    public static final f CREATOR = new f();
    private static final HashMap e = (HashMap) null;
    private static final Object f = new Object();
    private static final e l = new c(new String[0], null);
    Bundle a;
    int[] b;
    int c;
    boolean d = false;
    private final int g;
    private final String[] h;
    private final CursorWindow[] i;
    private final int j;
    private final Bundle k;

    d(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.g = i;
        this.h = strArr;
        this.i = cursorWindowArr;
        this.j = i2;
        this.k = bundle;
    }

    private void a(String str, int i) {
        if (this.a == null || !this.a.containsKey(str)) {
            throw new IllegalArgumentException("No such column: " + str);
        }
        if (h()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.c) {
            throw new CursorIndexOutOfBoundsException(i, this.c);
        }
    }

    public int a(int i) {
        int i2 = 0;
        Cdo.a(i >= 0 && i < this.c);
        while (true) {
            if (i2 >= this.b.length) {
                break;
            }
            if (i < this.b[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == this.b.length ? i2 - 1 : i2;
    }

    public long a(String str, int i, int i2) {
        a(str, i);
        return this.i[i2].getLong(i - this.b[i2], this.a.getInt(str));
    }

    public void a() {
        this.a = new Bundle();
        for (int i = 0; i < this.h.length; i++) {
            this.a.putInt(this.h[i], i);
        }
        this.b = new int[this.i.length];
        int numRows = 0;
        for (int i2 = 0; i2 < this.i.length; i2++) {
            this.b[i2] = numRows;
            numRows += this.i[i2].getNumRows();
        }
        this.c = numRows;
    }

    int b() {
        return this.g;
    }

    public int b(String str, int i, int i2) {
        a(str, i);
        return this.i[i2].getInt(i - this.b[i2], this.a.getInt(str));
    }

    public String c(String str, int i, int i2) {
        a(str, i);
        return this.i[i2].getString(i - this.b[i2], this.a.getInt(str));
    }

    String[] c() {
        return this.h;
    }

    public boolean d(String str, int i, int i2) {
        a(str, i);
        return Long.valueOf(this.i[i2].getLong(i - this.b[i2], this.a.getInt(str))).longValue() == 1;
    }

    CursorWindow[] d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.j;
    }

    public Uri e(String str, int i, int i2) {
        String strC = c(str, i, i2);
        if (strC == null) {
            return null;
        }
        return Uri.parse(strC);
    }

    public Bundle f() {
        return this.k;
    }

    public boolean f(String str, int i, int i2) {
        a(str, i);
        return this.i[i2].isNull(i - this.b[i2], this.a.getInt(str));
    }

    public int g() {
        return this.c;
    }

    public boolean h() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
