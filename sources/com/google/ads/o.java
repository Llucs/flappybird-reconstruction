package com.google.ads;

import android.content.Context;
import com.google.ads.util.AdUtil;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class o implements Runnable {
    private final Context a;
    private final String b;

    public o(String str, Context context) {
        this.b = str;
        this.a = context;
    }

    protected HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.google.ads.util.g.a("Pinging URL: " + this.b);
            HttpURLConnection httpURLConnectionA = a(new URL(this.b));
            try {
                AdUtil.a(httpURLConnectionA, this.a);
                httpURLConnectionA.setInstanceFollowRedirects(true);
                httpURLConnectionA.connect();
                int responseCode = httpURLConnectionA.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    com.google.ads.util.g.e("Did not receive 2XX (got " + responseCode + ") from pinging URL: " + this.b);
                }
            } finally {
                httpURLConnectionA.disconnect();
            }
        } catch (Throwable th) {
            com.google.ads.util.g.d("Unable to ping the URL: " + this.b, th);
        }
    }
}
