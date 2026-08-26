package com.google.ads.a;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class x {
    private final String a;
    private HashMap b;

    public x(Bundle bundle) {
        this.a = bundle.getString("action");
        this.b = a(bundle.getSerializable("params"));
    }

    public x(String str) {
        this.a = str;
    }

    public x(String str, HashMap map) {
        this(str);
        this.b = map;
    }

    private HashMap a(Serializable serializable) {
        if (serializable instanceof HashMap) {
            return (HashMap) serializable;
        }
        return null;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("action", this.a);
        bundle.putSerializable("params", this.b);
        return bundle;
    }

    public String b() {
        return this.a;
    }

    public HashMap c() {
        return this.b;
    }
}
