package com.google.ads.a;

import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
class z implements aa {
    z() {
    }

    @Override // com.google.ads.a.aa
    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
