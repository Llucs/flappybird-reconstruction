package com.google.ads.a;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.bq;
import com.google.ads.bt;
import com.google.ads.util.AdUtil;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Runnable {
    private final bq a;
    private final aa b;
    private volatile boolean c;
    private boolean d;
    private String e;
    private Thread f;

    y(bq bqVar) {
        this(bqVar, new z());
    }

    y(bq bqVar, aa aaVar) {
        this.f = null;
        this.a = bqVar;
        this.b = aaVar;
    }

    private void a(Context context, HttpURLConnection httpURLConnection) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("drt", "");
        if (!this.d || TextUtils.isEmpty(string)) {
            return;
        }
        if (AdUtil.a == 8) {
            httpURLConnection.addRequestProperty("X-Afma-drt-Cookie", string);
        } else {
            httpURLConnection.addRequestProperty("Cookie", string);
        }
    }

    private void a(HttpURLConnection httpURLConnection) {
        b(httpURLConnection);
        f(httpURLConnection);
        g(httpURLConnection);
        h(httpURLConnection);
        i(httpURLConnection);
        e(httpURLConnection);
        j(httpURLConnection);
        k(httpURLConnection);
        l(httpURLConnection);
        d(httpURLConnection);
        c(httpURLConnection);
        m(httpURLConnection);
        n(httpURLConnection);
    }

    private void a(HttpURLConnection httpURLConnection, int i) {
        if (300 <= i && i < 400) {
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField != null) {
                a(httpURLConnection);
                this.e = headerField;
                return;
            } else {
                com.google.ads.util.g.c("Could not get redirect location from a " + i + " redirect.");
                ((n) this.a.b.a()).a(com.google.ads.e.INTERNAL_ERROR);
                a();
                return;
            }
        }
        if (i != 200) {
            if (i == 400) {
                com.google.ads.util.g.c("Bad request");
                ((n) this.a.b.a()).a(com.google.ads.e.INVALID_REQUEST);
                a();
                return;
            } else {
                com.google.ads.util.g.c("Invalid response code: " + i);
                ((n) this.a.b.a()).a(com.google.ads.e.INTERNAL_ERROR);
                a();
                return;
            }
        }
        a(httpURLConnection);
        String strTrim = AdUtil.a(new InputStreamReader(httpURLConnection.getInputStream())).trim();
        com.google.ads.util.g.a("Response content is: " + strTrim);
        if (!TextUtils.isEmpty(strTrim)) {
            ((n) this.a.b.a()).a(strTrim, this.e);
            a();
        } else {
            com.google.ads.util.g.a("Response message is null or zero length: " + strTrim);
            ((n) this.a.b.a()).a(com.google.ads.e.NO_FILL);
            a();
        }
    }

    private void b() {
        while (!this.c) {
            HttpURLConnection httpURLConnectionA = this.b.a(new URL(this.e));
            try {
                a((Context) ((bt) this.a.a.a()).f.a(), httpURLConnectionA);
                AdUtil.a(httpURLConnectionA, (Context) ((bt) this.a.a.a()).f.a());
                httpURLConnectionA.setInstanceFollowRedirects(false);
                httpURLConnectionA.connect();
                a(httpURLConnectionA, httpURLConnectionA.getResponseCode());
            } finally {
                httpURLConnectionA.disconnect();
            }
        }
    }

    private void b(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Debug-Dialog");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        ((n) this.a.b.a()).f(headerField);
    }

    private void c(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Type");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        ((n) this.a.b.a()).b(headerField);
    }

    private void d(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Mediation");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        ((n) this.a.b.a()).b(Boolean.valueOf(headerField).booleanValue());
    }

    private void e(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Interstitial-Timeout");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        try {
            ((w) ((bt) this.a.a.a()).b.a()).a((long) (Float.parseFloat(headerField) * 1000.0f));
        } catch (NumberFormatException e) {
            com.google.ads.util.g.d("Could not get timeout value: " + headerField, e);
        }
    }

    private void f(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Tracking-Urls");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        for (String str : headerField.trim().split("\\s+")) {
            ((w) ((bt) this.a.a.a()).b.a()).b(str);
        }
    }

    private void g(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Manual-Tracking-Urls");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        for (String str : headerField.trim().split("\\s+")) {
            ((w) ((bt) this.a.a.a()).b.a()).c(str);
        }
    }

    private void h(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Click-Tracking-Urls");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        for (String str : headerField.trim().split("\\s+")) {
            ((n) this.a.b.a()).a(str);
        }
    }

    private void i(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Refresh-Rate");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        try {
            float f = Float.parseFloat(headerField);
            w wVar = (w) ((bt) this.a.a.a()).b.a();
            if (f <= 0.0f) {
                if (wVar.r()) {
                    wVar.e();
                }
            } else {
                wVar.a(f);
                if (wVar.r()) {
                    return;
                }
                wVar.f();
            }
        } catch (NumberFormatException e) {
            com.google.ads.util.g.d("Could not get refresh value: " + headerField, e);
        }
    }

    private void j(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Orientation");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        if (headerField.equals("portrait")) {
            ((n) this.a.b.a()).a(AdUtil.b());
        } else if (headerField.equals("landscape")) {
            ((n) this.a.b.a()).a(AdUtil.a());
        }
    }

    private void k(HttpURLConnection httpURLConnection) {
        if (TextUtils.isEmpty(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"))) {
            return;
        }
        try {
            ((w) ((bt) this.a.a.a()).b.a()).b(Long.parseLong(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life")));
        } catch (NumberFormatException e) {
            com.google.ads.util.g.e("Got bad value of Doritos cookie cache life from header: " + httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life") + ". Using default value instead.");
        }
    }

    private void l(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Cache-Control");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        ((n) this.a.b.a()).c(headerField);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void m(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Ad-Size");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        try {
            String[] strArrSplit = headerField.split("x", 2);
            if (strArrSplit.length != 2) {
                com.google.ads.util.g.e("Could not parse size header: " + headerField);
                headerField = headerField;
            } else {
                int i = Integer.parseInt(strArrSplit[0]);
                int i2 = Integer.parseInt(strArrSplit[1]);
                n nVar = (n) this.a.b.a();
                nVar.a(new com.google.ads.g(i, i2));
                headerField = nVar;
            }
        } catch (NumberFormatException e) {
            com.google.ads.util.g.e("Could not parse size header: " + headerField);
        }
    }

    private void n(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Disable-Activation-And-Scroll");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        ((n) this.a.b.a()).a(headerField.equals("1"));
    }

    void a() {
        this.c = true;
    }

    synchronized void a(String str) {
        if (this.f == null) {
            this.e = str;
            this.c = false;
            this.f = new Thread(this);
            this.f.start();
        }
    }

    public void a(boolean z) {
        this.d = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            b();
        } catch (MalformedURLException e) {
            com.google.ads.util.g.b("Received malformed ad url from javascript.", e);
            ((n) this.a.b.a()).a(com.google.ads.e.INTERNAL_ERROR);
        } catch (IOException e2) {
            com.google.ads.util.g.b("IOException connecting to ad url.", e2);
            ((n) this.a.b.a()).a(com.google.ads.e.NETWORK_ERROR);
        } catch (Throwable th) {
            com.google.ads.util.g.b("An unknown error occurred in AdResponseLoader.", th);
            ((n) this.a.b.a()).a(com.google.ads.e.INTERNAL_ERROR);
        }
    }
}
