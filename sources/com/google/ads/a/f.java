package com.google.ads.a;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.google.ads.AdActivity;
import com.google.ads.util.AdUtil;

/* JADX INFO: loaded from: classes.dex */
class f implements DownloadListener {
    final /* synthetic */ e a;

    f(e eVar) {
        this.a = eVar;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            AdActivity adActivityI = this.a.i();
            if (adActivityI == null || !AdUtil.a(intent, adActivityI)) {
                return;
            }
            adActivityI.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            com.google.ads.util.g.a("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        } catch (Throwable th) {
            com.google.ads.util.g.b("Unknown error trying to start activity to view URL: " + str, th);
        }
    }
}
