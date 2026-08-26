package com.google.ads.util;

import android.view.View;
import android.webkit.WebChromeClient;
import com.google.ads.bt;

/* JADX INFO: loaded from: classes.dex */
public class d extends r {
    public d(bt btVar) {
        super(btVar);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
    }
}
