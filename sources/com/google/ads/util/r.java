package com.google.ads.util;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ads.AdActivity;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;

/* JADX INFO: loaded from: classes.dex */
public class r extends WebChromeClient {
    private final bt a;

    public r(bt btVar) {
        this.a = btVar;
    }

    private static void a(AlertDialog.Builder builder, Context context, String str, String str2, JsPromptResult jsPromptResult) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(str);
        EditText editText = new EditText(context);
        editText.setText(str2);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        builder.setView(linearLayout).setPositiveButton(R.string.ok, new x(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new w(jsPromptResult)).setOnCancelListener(new v(jsPromptResult)).create().show();
    }

    private static void a(AlertDialog.Builder builder, String str, JsResult jsResult) {
        builder.setMessage(str).setPositiveButton(R.string.ok, new u(jsResult)).setNegativeButton(R.string.cancel, new t(jsResult)).setOnCancelListener(new s(jsResult)).create().show();
    }

    private static boolean a(WebView webView, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        AdActivity adActivityI;
        if (!(webView instanceof com.google.ads.a.e) || (adActivityI = ((com.google.ads.a.e) webView).i()) == null) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(adActivityI);
        builder.setTitle(str);
        if (z) {
            a(builder, adActivityI, str2, str3, jsPromptResult);
        } else {
            a(builder, str2, jsResult);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        if (webView instanceof com.google.ads.a.e) {
            ((com.google.ads.a.e) webView).f();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        switch (q.a[consoleMessage.messageLevel().ordinal()]) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                g.b(str);
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                g.e(str);
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                g.c(str);
                break;
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                g.a(str);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        bs bsVar = (bs) ((br) this.a.d.a()).b.a();
        long jLongValue = ((Long) bsVar.l.a()).longValue() - j3;
        if (jLongValue <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > jLongValue || j2 > ((Long) bsVar.m.a()).longValue()) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(((Long) bsVar.n.a()).longValue(), jLongValue) + j, ((Long) bsVar.m.a()).longValue());
        } else {
            if (j2 <= Math.min(((Long) bsVar.m.a()).longValue() - j, jLongValue)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(webView, str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(webView, str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(webView, str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(webView, str, str2, str3, null, jsPromptResult, true);
    }

    public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        bs bsVar = (bs) ((br) this.a.d.a()).b.a();
        long jLongValue = ((Long) bsVar.k.a()).longValue() - j2;
        long jLongValue2 = ((Long) bsVar.j.a()).longValue() + j;
        if (jLongValue < jLongValue2) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(jLongValue2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
    }
}
