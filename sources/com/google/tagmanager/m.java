package com.google.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes.dex */
class m {
    private static m a;
    private volatile n b;
    private volatile String c;
    private volatile String d;
    private volatile String e;

    m() {
        e();
    }

    static m a() {
        m mVar;
        synchronized (m.class) {
            if (a == null) {
                a = new m();
            }
            mVar = a;
        }
        return mVar;
    }

    private String a(String str) {
        return str.split("&")[0].split("=")[1];
    }

    private String b(Uri uri) {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    synchronized boolean a(Uri uri) {
        boolean z = true;
        synchronized (this) {
            try {
                String strDecode = URLDecoder.decode(uri.toString(), "UTF-8");
                if (strDecode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                    i.d("Container preview url: " + strDecode);
                    if (strDecode.matches(".*?&gtm_debug=x$")) {
                        this.b = n.CONTAINER_DEBUG;
                    } else {
                        this.b = n.CONTAINER;
                    }
                    this.e = b(uri);
                    if (this.b == n.CONTAINER || this.b == n.CONTAINER_DEBUG) {
                        this.d = "/r?" + this.e;
                    }
                    this.c = a(this.e);
                } else if (!strDecode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                    i.b("Invalid preview uri: " + strDecode);
                    z = false;
                } else if (a(uri.getQuery()).equals(this.c)) {
                    i.d("Exit preview mode for container: " + this.c);
                    this.b = n.NONE;
                    this.d = null;
                } else {
                    z = false;
                }
            } catch (UnsupportedEncodingException e) {
                z = false;
            }
        }
        return z;
    }

    n b() {
        return this.b;
    }

    String c() {
        return this.d;
    }

    String d() {
        return this.c;
    }

    void e() {
        this.b = n.NONE;
        this.d = null;
        this.c = null;
        this.e = null;
    }
}
