package com.google.ads.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.bt;
import com.google.ads.util.AdUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends WebView {
    protected final bt a;
    private WeakReference b;
    private com.google.ads.g c;
    private boolean d;
    private boolean e;
    private boolean f;

    public e(bt btVar, com.google.ads.g gVar) {
        super((Context) btVar.f.a());
        this.a = btVar;
        this.c = gVar;
        this.b = null;
        this.d = false;
        this.e = false;
        this.f = false;
        setBackgroundColor(0);
        AdUtil.a(this);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        setDownloadListener(new f(this));
        if (AdUtil.a >= 17) {
            com.google.ads.util.z.a(settings, btVar);
        } else if (AdUtil.a >= 11) {
            com.google.ads.util.p.a(settings, btVar);
        }
        setScrollBarStyle(33554432);
        if (AdUtil.a >= 14) {
            setWebChromeClient(new com.google.ads.util.d(btVar));
        } else if (AdUtil.a >= 11) {
            setWebChromeClient(new com.google.ads.util.r(btVar));
        }
    }

    public void a(boolean z) {
        if (z) {
            setOnTouchListener(new g(this));
        } else {
            setOnTouchListener(null);
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable th) {
            com.google.ads.util.g.d("An error occurred while destroying an AdWebView:", th);
        }
        try {
            setWebViewClient(new WebViewClient());
        } catch (Throwable th2) {
        }
    }

    public void f() {
        AdActivity adActivityI = i();
        if (adActivityI != null) {
            adActivityI.finish();
        }
    }

    public void g() {
        if (AdUtil.a >= 11) {
            com.google.ads.util.p.a(this);
        }
        this.e = true;
    }

    public void h() {
        if (this.e && AdUtil.a >= 11) {
            com.google.ads.util.p.b(this);
        }
        this.e = false;
    }

    public AdActivity i() {
        if (this.b != null) {
            return (AdActivity) this.b.get();
        }
        return null;
    }

    public boolean j() {
        return this.f;
    }

    public boolean k() {
        return this.e;
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            com.google.ads.util.g.d("An error occurred while loading data in AdWebView:", th);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            com.google.ads.util.g.d("An error occurred while loading a URL in AdWebView:", th);
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        synchronized (this) {
            if (isInEditMode() || this.c == null || this.d) {
                super.onMeasure(i, i2);
            } else {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                int size2 = View.MeasureSpec.getSize(i2);
                float f = getContext().getResources().getDisplayMetrics().density;
                int iA = (int) (this.c.a() * f);
                int iB = (int) (this.c.b() * f);
                int i3 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
                int i4 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size2 : Integer.MAX_VALUE;
                if (iA - (f * 6.0f) > i3 || iB > i4) {
                    com.google.ads.util.g.b("Not enough space to show ad! Wants: <" + iA + ", " + iB + ">, Has: <" + size + ", " + size2 + ">");
                    setVisibility(8);
                    setMeasuredDimension(size, size2);
                } else {
                    setMeasuredDimension(iA, iB);
                }
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.google.ads.ai aiVar = (com.google.ads.ai) this.a.r.a();
        if (aiVar != null) {
            aiVar.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdActivity(AdActivity adActivity) {
        this.b = new WeakReference(adActivity);
    }

    public synchronized void setAdSize(com.google.ads.g gVar) {
        this.c = gVar;
        requestLayout();
    }

    public void setCustomClose(boolean z) {
        AdActivity adActivity;
        this.f = z;
        if (this.b == null || (adActivity = (AdActivity) this.b.get()) == null) {
            return;
        }
        adActivity.a(z);
    }

    public void setIsExpandedMraid(boolean z) {
        this.d = z;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Throwable th) {
            com.google.ads.util.g.d("An error occurred while stopping loading in AdWebView:", th);
        }
    }
}
