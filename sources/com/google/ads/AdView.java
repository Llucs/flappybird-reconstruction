package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.ads.util.AdUtil;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class AdView extends RelativeLayout implements a {
    private static final com.google.ads.a.h b = (com.google.ads.a.h) com.google.ads.a.h.a.b();
    protected com.google.ads.a.w a;

    public AdView(Activity activity, g gVar, String str) {
        super(activity.getApplicationContext());
        try {
            a(activity, gVar, (AttributeSet) null);
            b(activity, gVar, null);
            a(activity, gVar, str);
        } catch (com.google.ads.a.m e) {
            a(activity, e.c("Could not initialize AdView"), gVar, (AttributeSet) null);
            e.a("Could not initialize AdView");
        }
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet);
    }

    private void a(Activity activity, g gVar, String str) {
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setFocusable(false);
        this.a = new com.google.ads.a.w(this, activity, gVar, str, frameLayout, false);
        setGravity(17);
        try {
            ViewGroup viewGroupA = com.google.ads.a.ag.a(activity, this.a);
            if (viewGroupA != null) {
                viewGroupA.addView(frameLayout, -2, -2);
                addView(viewGroupA, -2, -2);
            } else {
                addView(frameLayout, -2, -2);
            }
        } catch (VerifyError e) {
            com.google.ads.util.g.a("Gestures disabled: Not supported on this version of Android.", e);
            addView(frameLayout, -2, -2);
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        g[] gVarArr;
        com.google.ads.a.m mVar;
        if (attributeSet == null) {
            return;
        }
        try {
            String strB = b("adSize", context, attributeSet, true);
            g[] gVarArrA = a(strB);
            if (gVarArrA != null) {
                try {
                    if (gVarArrA.length != 0) {
                        if (!a("adUnitId", attributeSet)) {
                            throw new com.google.ads.a.m("Required XML attribute \"adUnitId\" missing", true);
                        }
                        if (isInEditMode()) {
                            a(context, "Ads by Google", -1, gVarArrA[0], attributeSet);
                            return;
                        }
                        String strB2 = b("adUnitId", context, attributeSet, true);
                        boolean zA = a("loadAdOnCreate", context, attributeSet, false);
                        if (!(context instanceof Activity)) {
                            throw new com.google.ads.a.m("AdView was initialized with a Context that wasn't an Activity.", true);
                        }
                        Activity activity = (Activity) context;
                        a(activity, gVarArrA[0], attributeSet);
                        b(activity, gVarArrA[0], attributeSet);
                        if (gVarArrA.length == 1) {
                            a(activity, gVarArrA[0], strB2);
                        } else {
                            a(activity, new g(0, 0), strB2);
                            a(gVarArrA);
                        }
                        if (zA) {
                            Set setC = c("testDevices", context, attributeSet, false);
                            if (setC.contains("TEST_EMULATOR")) {
                                setC.remove("TEST_EMULATOR");
                                setC.add(d.a);
                            }
                            a(new d().b(setC).a(c("keywords", context, attributeSet, false)));
                            return;
                        }
                        return;
                    }
                } catch (com.google.ads.a.m e) {
                    mVar = e;
                    gVarArr = gVarArrA;
                    a(context, mVar.c("Could not initialize AdView"), (gVarArr == null || gVarArr.length <= 0) ? g.b : gVarArr[0], attributeSet);
                    mVar.a("Could not initialize AdView");
                    if (isInEditMode()) {
                        return;
                    }
                    mVar.b("Could not initialize AdView");
                    return;
                }
            }
            throw new com.google.ads.a.m("Attribute \"adSize\" invalid: " + strB, true);
        } catch (com.google.ads.a.m e2) {
            gVarArr = null;
            mVar = e2;
        }
    }

    private void a(Context context, String str, g gVar, AttributeSet attributeSet) {
        com.google.ads.util.g.b(str);
        a(context, str, -65536, gVar, attributeSet);
    }

    private void a(g... gVarArr) {
        g[] gVarArr2 = new g[gVarArr.length];
        for (int i = 0; i < gVarArr.length; i++) {
            gVarArr2[i] = g.a(gVarArr[i], getContext());
        }
        this.a.h().n.a(gVarArr2);
    }

    private boolean a(Context context, g gVar, AttributeSet attributeSet) {
        if (AdUtil.c(context)) {
            return true;
        }
        a(context, "You must have AdActivity declared in AndroidManifest.xml with configChanges.", gVar, attributeSet);
        return false;
    }

    private boolean a(String str, Context context, AttributeSet attributeSet, boolean z) throws com.google.ads.a.m {
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", str);
        boolean attributeBooleanValue = attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/lib/com.google.ads", str, z);
        if (attributeValue != null) {
            String packageName = context.getPackageName();
            if (attributeValue.matches("^@([^:]+)\\:(.*)$")) {
                packageName = attributeValue.replaceFirst("^@([^:]+)\\:(.*)$", "$1");
                attributeValue = attributeValue.replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
            }
            if (attributeValue.startsWith("@bool/")) {
                String strSubstring = attributeValue.substring("@bool/".length());
                TypedValue typedValue = new TypedValue();
                try {
                    getResources().getValue(packageName + ":bool/" + strSubstring, typedValue, true);
                    if (typedValue.type == 18) {
                        return typedValue.data != 0;
                    }
                    throw new com.google.ads.a.m("Resource " + str + " was not a boolean: " + typedValue, true);
                } catch (Resources.NotFoundException e) {
                    throw new com.google.ads.a.m("Could not find resource for " + str + ": " + attributeValue, true, e);
                }
            }
        }
        return attributeBooleanValue;
    }

    private boolean a(String str, AttributeSet attributeSet) {
        return attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", str) != null;
    }

    private String b(String str, Context context, AttributeSet attributeSet, boolean z) throws com.google.ads.a.m {
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", str);
        if (attributeValue != null) {
            String packageName = context.getPackageName();
            if (attributeValue.matches("^@([^:]+)\\:(.*)$")) {
                packageName = attributeValue.replaceFirst("^@([^:]+)\\:(.*)$", "$1");
                attributeValue = attributeValue.replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
            }
            if (attributeValue.startsWith("@string/")) {
                String strSubstring = attributeValue.substring("@string/".length());
                TypedValue typedValue = new TypedValue();
                try {
                    getResources().getValue(packageName + ":string/" + strSubstring, typedValue, true);
                    if (typedValue.string == null) {
                        throw new com.google.ads.a.m("Resource " + str + " was not a string: " + typedValue, true);
                    }
                    attributeValue = typedValue.string.toString();
                } catch (Resources.NotFoundException e) {
                    throw new com.google.ads.a.m("Could not find resource for " + str + ": " + attributeValue, true, e);
                }
            }
        }
        if (z && attributeValue == null) {
            throw new com.google.ads.a.m("Required XML attribute \"" + str + "\" missing", true);
        }
        return attributeValue;
    }

    private boolean b(Context context, g gVar, AttributeSet attributeSet) {
        if (AdUtil.b(context)) {
            return true;
        }
        a(context, "You must have INTERNET and ACCESS_NETWORK_STATE permissions in AndroidManifest.xml.", gVar, attributeSet);
        return false;
    }

    private Set c(String str, Context context, AttributeSet attributeSet, boolean z) throws com.google.ads.a.m {
        String strB = b(str, context, attributeSet, z);
        HashSet hashSet = new HashSet();
        if (strB != null) {
            String[] strArrSplit = strB.split(",");
            for (String str2 : strArrSplit) {
                String strTrim = str2.trim();
                if (strTrim.length() != 0) {
                    hashSet.add(strTrim);
                }
            }
        }
        return hashSet;
    }

    void a(Context context, String str, int i, g gVar, AttributeSet attributeSet) {
        if (gVar == null) {
            gVar = g.b;
        }
        g gVarA = g.a(gVar, context.getApplicationContext());
        if (getChildCount() == 0) {
            TextView textView = attributeSet == null ? new TextView(context) : new TextView(context, attributeSet);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(-16777216);
            LinearLayout linearLayout = attributeSet == null ? new LinearLayout(context) : new LinearLayout(context, attributeSet);
            linearLayout.setGravity(17);
            LinearLayout linearLayout2 = attributeSet == null ? new LinearLayout(context) : new LinearLayout(context, attributeSet);
            linearLayout2.setGravity(17);
            linearLayout2.setBackgroundColor(i);
            int iA = AdUtil.a(context, gVarA.a());
            int iA2 = AdUtil.a(context, gVarA.b());
            linearLayout.addView(textView, iA - 2, iA2 - 2);
            linearLayout2.addView(linearLayout);
            addView(linearLayout2, iA, iA2);
        }
    }

    public void a(d dVar) {
        if (this.a != null) {
            if (a()) {
                this.a.e();
            }
            this.a.a(dVar);
        }
    }

    public boolean a() {
        if (this.a == null) {
            return false;
        }
        return this.a.r();
    }

    g[] a(String str) {
        g gVar;
        String[] strArrSplit = str.split(",");
        g[] gVarArr = new g[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    gVar = new g("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException e) {
                    return null;
                }
            } else {
                gVar = "BANNER".equals(strTrim) ? g.b : "SMART_BANNER".equals(strTrim) ? g.a : "IAB_MRECT".equals(strTrim) ? g.c : "IAB_BANNER".equals(strTrim) ? g.d : "IAB_LEADERBOARD".equals(strTrim) ? g.e : "IAB_WIDE_SKYSCRAPER".equals(strTrim) ? g.f : null;
            }
            if (gVar == null) {
                return null;
            }
            gVarArr[i] = gVar;
        }
        return gVarArr;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        com.google.ads.a.e eVarK;
        if (!isInEditMode() && (eVarK = this.a.k()) != null) {
            eVarK.setVisibility(0);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (isInEditMode() || !((com.google.ads.a.ac) this.a.h().g.a()).b() || i == 0 || this.a.h().l.a() == null || this.a.h().e.a() == null) {
            return;
        }
        if (!AdActivity.b() || AdActivity.c()) {
            b.a((WebView) this.a.h().e.a(), "onleaveapp", null);
        } else {
            b.a((WebView) this.a.h().e.a(), "onopeninapp", null);
        }
    }

    public void setAdListener(c cVar) {
        this.a.h().o.a(cVar);
    }

    protected void setAppEventListener(h hVar) {
        this.a.h().p.a(hVar);
    }

    protected void setSupportedAdSizes(g... gVarArr) {
        if (this.a.h().n.a() == null) {
            com.google.ads.util.g.e("Warning: Tried to set supported ad sizes on a single-size AdView. AdSizes ignored. To create a multi-sized AdView, use an AdView constructor that takes in an AdSize[] array.");
        } else {
            a(gVarArr);
        }
    }

    protected void setSwipeableEventListener(j jVar) {
        this.a.h().q.a(jVar);
    }
}
