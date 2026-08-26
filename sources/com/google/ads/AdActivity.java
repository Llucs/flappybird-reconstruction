package com.google.ads;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.google.ads.util.AdUtil;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AdActivity extends Activity implements View.OnClickListener {
    private static final com.google.ads.a.h a = (com.google.ads.a.h) com.google.ads.a.h.a.b();
    private static final Object b = new Object();
    private static AdActivity c = null;
    private static com.google.ads.a.w d = null;
    private static AdActivity e = null;
    private static AdActivity f = null;
    private static final b g = new b();
    private com.google.ads.a.e h;
    private FrameLayout i;
    private int j;
    private boolean l;
    private long m;
    private RelativeLayout n;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private com.google.ads.a.c t;
    private ViewGroup k = null;
    private AdActivity o = null;

    public static void a(com.google.ads.a.w wVar, com.google.ads.a.x xVar) {
        g.a(wVar, xVar);
    }

    private void a(String str) {
        com.google.ads.util.g.b(str);
        finish();
    }

    private void a(String str, Throwable th) {
        com.google.ads.util.g.b(str, th);
        finish();
    }

    public static boolean b() {
        return g.a();
    }

    private RelativeLayout.LayoutParams c(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        return layoutParams;
    }

    public static boolean c() {
        return g.b();
    }

    private void h() {
        if (this.l) {
            return;
        }
        if (this.h != null) {
            a.b(this.h);
            this.h.setAdActivity(null);
            this.h.setIsExpandedMraid(false);
            if (!this.q && this.n != null && this.k != null) {
                if (this.r && !this.s) {
                    com.google.ads.util.g.a("Disabling hardware acceleration on collapsing MRAID WebView.");
                    this.h.g();
                } else if (!this.r && this.s) {
                    com.google.ads.util.g.a("Re-enabling hardware acceleration on collapsing MRAID WebView.");
                    this.h.h();
                }
                this.n.removeView(this.h);
                this.k.addView(this.h);
            }
        }
        if (this.t != null) {
            this.t.e();
            this.t = null;
        }
        if (this == c) {
            c = null;
        }
        f = this.o;
        synchronized (b) {
            if (d != null && this.q && this.h != null) {
                if (this.h == d.k()) {
                    d.a();
                }
                this.h.stopLoading();
            }
            if (this == e) {
                e = null;
                if (d != null) {
                    d.s();
                    d = null;
                } else {
                    com.google.ads.util.g.e("currentAdManager is null while trying to destroy AdActivity.");
                }
            }
        }
        this.l = true;
        com.google.ads.util.g.a("AdActivity is closing.");
    }

    protected View a(int i, boolean z) {
        this.j = (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
        this.i = new FrameLayout(getApplicationContext());
        this.i.setMinimumWidth(this.j);
        this.i.setMinimumHeight(this.j);
        this.i.setOnClickListener(this);
        a(z);
        return this.i;
    }

    public com.google.ads.a.c a() {
        return this.t;
    }

    protected com.google.ads.a.c a(Activity activity) {
        return new com.google.ads.a.c(activity, this.h);
    }

    public void a(int i, int i2, int i3, int i4) {
        if (this.t != null) {
            this.t.setLayoutParams(c(i, i2, i3, i4));
            this.t.requestLayout();
        }
    }

    protected void a(com.google.ads.a.e eVar, boolean z, int i, boolean z2, boolean z3) {
        requestWindowFeature(1);
        Window window = getWindow();
        window.setFlags(1024, 1024);
        if (AdUtil.a >= 11) {
            if (this.r) {
                com.google.ads.util.g.a("Enabling hardware acceleration on the AdActivity window.");
                com.google.ads.util.p.a(window);
            } else {
                com.google.ads.util.g.a("Disabling hardware acceleration on the AdActivity WebView.");
                eVar.g();
            }
        }
        ViewParent parent = eVar.getParent();
        if (parent != null) {
            if (!z2) {
                a("Interstitial created with an AdWebView that has a parent.");
                return;
            } else if (!(parent instanceof ViewGroup)) {
                a("MRAID banner was not a child of a ViewGroup.");
                return;
            } else {
                this.k = (ViewGroup) parent;
                this.k.removeView(eVar);
            }
        }
        if (eVar.i() != null) {
            a("Interstitial created with an AdWebView that is already in use by another AdActivity.");
            return;
        }
        setRequestedOrientation(i);
        eVar.setAdActivity(this);
        View viewA = a(z2 ? 50 : 32, z3);
        this.n.addView(eVar, -1, -1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (z2) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        }
        this.n.addView(viewA, layoutParams);
        this.n.setKeepScreenOn(true);
        setContentView(this.n);
        this.n.getRootView().setBackgroundColor(-16777216);
        if (z) {
            a.a(eVar);
        }
    }

    protected void a(com.google.ads.a.w wVar) {
        this.h = null;
        this.m = SystemClock.elapsedRealtime();
        this.p = true;
        synchronized (b) {
            if (c == null) {
                c = this;
                wVar.u();
            }
        }
    }

    protected void a(HashMap map, com.google.ads.a.w wVar) {
        int i;
        if (map == null) {
            a("Could not get the paramMap in launchIntent()");
            return;
        }
        Intent intent = new Intent();
        String str = (String) map.get("u");
        String str2 = (String) map.get("m");
        String str3 = (String) map.get("i");
        String str4 = (String) map.get("p");
        String str5 = (String) map.get("c");
        String str6 = (String) map.get("f");
        String str7 = (String) map.get("e");
        boolean z = !TextUtils.isEmpty(str);
        boolean z2 = !TextUtils.isEmpty(str2);
        if (z && z2) {
            intent.setDataAndType(Uri.parse(str), str2);
        } else if (z) {
            intent.setData(Uri.parse(str));
        } else if (z2) {
            intent.setType(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.setAction(str3);
        } else if (z) {
            intent.setAction("android.intent.action.VIEW");
        }
        if (!TextUtils.isEmpty(str4) && AdUtil.a >= 4) {
            com.google.ads.util.n.a(intent, str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/");
            if (strArrSplit.length < 2) {
                com.google.ads.util.g.e("Warning: Could not parse component name from open GMSG: " + str5);
            }
            intent.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        if (!TextUtils.isEmpty(str6)) {
            try {
                i = Integer.parseInt(str6);
            } catch (NumberFormatException e2) {
                com.google.ads.util.g.e("Warning: Could not parse flags from open GMSG: " + str6);
                i = 0;
            }
            intent.addFlags(i);
        }
        if (!TextUtils.isEmpty(str7)) {
            try {
                JSONObject jSONObject = new JSONObject(str7);
                JSONArray jSONArrayNames = jSONObject.names();
                for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                    String string = jSONArrayNames.getString(i2);
                    JSONObject jSONObject2 = jSONObject.getJSONObject(string);
                    int i3 = jSONObject2.getInt("t");
                    switch (i3) {
                        case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                            intent.putExtra(string, jSONObject2.getBoolean("v"));
                            break;
                        case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                            intent.putExtra(string, jSONObject2.getDouble("v"));
                            break;
                        case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                            intent.putExtra(string, jSONObject2.getInt("v"));
                            break;
                        case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                            intent.putExtra(string, jSONObject2.getLong("v"));
                            break;
                        case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                            intent.putExtra(string, jSONObject2.getString("v"));
                            break;
                        default:
                            com.google.ads.util.g.e("Warning: Unknown type in extras from open GMSG: " + string + " (type: " + i3 + ")");
                            break;
                    }
                }
            } catch (JSONException e3) {
                com.google.ads.util.g.e("Warning: Could not parse extras from open GMSG: " + str7);
            }
        }
        if (intent.filterEquals(new Intent())) {
            a("Tried to launch empty intent.");
            return;
        }
        try {
            com.google.ads.util.g.a("Launching an intent from AdActivity: " + intent);
            startActivity(intent);
            a(wVar);
        } catch (ActivityNotFoundException e4) {
            a(e4.getMessage(), e4);
        }
    }

    public void a(boolean z) {
        if (this.i != null) {
            this.i.removeAllViews();
            if (z) {
                return;
            }
            ImageButton imageButton = new ImageButton(this);
            imageButton.setImageResource(R.drawable.btn_dialog);
            imageButton.setBackgroundColor(0);
            imageButton.setOnClickListener(this);
            imageButton.setPadding(0, 0, 0, 0);
            this.i.addView(imageButton, new FrameLayout.LayoutParams(this.j, this.j, 17));
        }
    }

    public void b(int i, int i2, int i3, int i4) {
        if (this.t == null) {
            this.t = a(this);
            this.n.addView(this.t, 0, c(i, i2, i3, i4));
            synchronized (b) {
                if (d == null) {
                    com.google.ads.util.g.e("currentAdManager was null while trying to get the opening AdWebView.");
                } else {
                    d.l().b(false);
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean zJ;
        boolean z = false;
        super.onCreate(bundle);
        this.l = false;
        synchronized (b) {
            if (d == null) {
                a("Could not get currentAdManager.");
                return;
            }
            com.google.ads.a.w wVar = d;
            if (e == null) {
                e = this;
                wVar.t();
            }
            if (this.o == null && f != null) {
                this.o = f;
            }
            f = this;
            if ((wVar.h().a() && e == this) || (wVar.h().b() && this.o == e)) {
                wVar.v();
            }
            boolean zQ = wVar.q();
            bs bsVar = (bs) ((br) wVar.h().d.a()).b.a();
            this.s = AdUtil.a >= ((Integer) bsVar.b.a()).intValue();
            this.r = AdUtil.a >= ((Integer) bsVar.d.a()).intValue();
            this.n = null;
            this.p = false;
            this.q = true;
            this.t = null;
            Bundle bundleExtra = getIntent().getBundleExtra("com.google.ads.AdOpener");
            if (bundleExtra == null) {
                a("Could not get the Bundle used to create AdActivity.");
                return;
            }
            com.google.ads.a.x xVar = new com.google.ads.a.x(bundleExtra);
            String strB = xVar.b();
            HashMap mapC = xVar.c();
            if (strB.equals("intent")) {
                a(mapC, wVar);
                return;
            }
            this.n = new RelativeLayout(getApplicationContext());
            if (strB.equals("webapp")) {
                this.h = new com.google.ads.a.e(wVar.h(), null);
                com.google.ads.a.ad adVarA = com.google.ads.a.ad.a(wVar, com.google.ads.a.h.d, true, !zQ);
                adVarA.d(true);
                if (zQ) {
                    adVarA.a(true);
                }
                this.h.setWebViewClient(adVarA);
                String str = (String) mapC.get("u");
                String str2 = (String) mapC.get("baseurl");
                String str3 = (String) mapC.get("html");
                if (str != null) {
                    this.h.loadUrl(str);
                } else {
                    if (str3 == null) {
                        a("Could not get the URL or HTML parameter to show a web app.");
                        return;
                    }
                    this.h.loadDataWithBaseURL(str2, str3, "text/html", "utf-8", null);
                }
                String str4 = (String) mapC.get("o");
                a(this.h, false, "p".equals(str4) ? AdUtil.b() : "l".equals(str4) ? AdUtil.a() : this == e ? wVar.n() : -1, zQ, mapC != null && "1".equals(mapC.get("custom_close")));
                return;
            }
            if (!strB.equals("interstitial") && !strB.equals("expand")) {
                a("Unknown AdOpener, <action: " + strB + ">");
                return;
            }
            this.h = wVar.k();
            int iN = wVar.n();
            if (strB.equals("expand")) {
                this.h.setIsExpandedMraid(true);
                this.q = false;
                if (mapC != null && "1".equals(mapC.get("custom_close"))) {
                    z = true;
                }
                if (!this.r || this.s) {
                    zJ = z;
                } else {
                    com.google.ads.util.g.a("Re-enabling hardware acceleration on expanding MRAID WebView.");
                    this.h.h();
                    zJ = z;
                }
            } else {
                zJ = this.h.j();
            }
            a(this.h, true, iN, zQ, zJ);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (this.n != null) {
            this.n.removeAllViews();
        }
        if (isFinishing()) {
            h();
            if (this.q && this.h != null) {
                this.h.stopLoading();
                this.h.destroy();
                this.h = null;
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        if (isFinishing()) {
            h();
        }
        super.onPause();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (this.p && z && SystemClock.elapsedRealtime() - this.m > 250) {
            com.google.ads.util.g.d("Launcher AdActivity got focus and is closing.");
            finish();
        }
        super.onWindowFocusChanged(z);
    }
}
