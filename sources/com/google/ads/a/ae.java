package com.google.ads.a;

import android.content.Context;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.util.AdUtil;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class ae implements Runnable {
    private String a;
    private Context b;

    public ae(String str, Context context) {
        this.a = str;
        this.b = context;
    }

    protected BufferedOutputStream a(HttpURLConnection httpURLConnection) {
        return new BufferedOutputStream(httpURLConnection.getOutputStream());
    }

    protected HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(true);
        AdUtil.a(httpURLConnection, this.b);
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        return httpURLConnection;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            HttpURLConnection httpURLConnectionA = a(new URL((String) ((bs) br.a().b.a()).h.a()));
            byte[] bytes = new af(this.a).a().toString().getBytes();
            httpURLConnectionA.setFixedLengthStreamingMode(bytes.length);
            try {
                BufferedOutputStream bufferedOutputStreamA = a(httpURLConnectionA);
                bufferedOutputStreamA.write(bytes);
                bufferedOutputStreamA.close();
                if (httpURLConnectionA.getResponseCode() != 200) {
                    com.google.ads.util.g.b("Got error response from BadAd backend: " + httpURLConnectionA.getResponseMessage());
                }
            } finally {
                httpURLConnectionA.disconnect();
            }
        } catch (IOException e) {
            com.google.ads.util.g.b("Error reporting bad ad.", e);
        }
    }
}
