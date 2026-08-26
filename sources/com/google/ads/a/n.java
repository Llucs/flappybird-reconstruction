package com.google.ads.a;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.google.ads.AdView;
import com.google.ads.az;
import com.google.ads.ba;
import com.google.ads.bc;
import com.google.ads.bq;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import com.google.ads.util.AdUtil;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class n implements Runnable {
    boolean a;
    private String b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    private y g;
    private com.google.ads.d h;
    private WebView i;
    private bq j;
    private String k;
    private String l;
    private LinkedList m;
    private String n;
    private com.google.ads.g o;
    private boolean p;
    private volatile boolean q;
    private boolean r;
    private com.google.ads.e s;
    private boolean t;
    private int u;
    private Thread v;
    private boolean w;
    private u x;

    protected n() {
        this.p = false;
        this.x = u.ONLINE_SERVER_REQUEST;
    }

    public n(bq bqVar) {
        this.p = false;
        this.x = u.ONLINE_SERVER_REQUEST;
        this.j = bqVar;
        this.k = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.m = new LinkedList();
        this.s = null;
        this.t = false;
        this.u = -1;
        this.f = false;
        this.r = false;
        this.n = null;
        this.o = null;
        if (((Activity) ((bt) bqVar.a.a()).c.a()) == null) {
            this.i = null;
            this.g = null;
            com.google.ads.util.g.e("activity was null while trying to create an AdLoader.");
        } else {
            this.i = new e((bt) bqVar.a.a(), null);
            this.i.setWebViewClient(ad.a((w) ((bt) bqVar.a.a()).b.a(), h.b, false, false));
            this.i.setVisibility(8);
            this.i.setWillNotDraw(true);
            this.g = new y(bqVar);
        }
    }

    static void a(String str, ba baVar, bc bcVar) {
        if (str == null || str.contains("no-store") || str.contains("no-cache")) {
            return;
        }
        Matcher matcher = Pattern.compile("max-age\\s*=\\s*(\\d+)").matcher(str);
        if (!matcher.find()) {
            com.google.ads.util.g.c("Unrecognized cacheControlDirective: '" + str + "'. Not caching configuration.");
            return;
        }
        try {
            int i = Integer.parseInt(matcher.group(1));
            bcVar.a(baVar, i);
            com.google.ads.util.g.c(String.format(Locale.US, "Caching gWhirl configuration for: %d seconds", Integer.valueOf(i)));
        } catch (NumberFormatException e) {
            com.google.ads.util.g.b("Caught exception trying to parse cache control directive. Overflow?", e);
        }
    }

    private void b(String str, String str2) {
        ((Handler) br.a().c.a()).post(new t(this, this.i, str2, str));
    }

    private String c() {
        return this.h instanceof com.google.ads.c.a ? "AFMA_buildAdURL" : "AFMA_buildAdURL";
    }

    private String d() {
        return this.h instanceof com.google.ads.c.a ? "AFMA_getSdkConstants();" : "AFMA_getSdkConstants();";
    }

    private String e() {
        return this.h instanceof com.google.ads.c.a ? "http://www.gstatic.com/safa/" : "http://media.admob.com/";
    }

    private String f() {
        return this.h instanceof com.google.ads.c.a ? "<html><head><script src=\"http://www.gstatic.com/safa/sdk-core-v40.js\"></script><script>" : "<html><head><script src=\"http://media.admob.com/sdk-core-v40.js\"></script><script>";
    }

    private String g() {
        return this.h instanceof com.google.ads.c.a ? "</script></head><body></body></html>" : "</script></head><body></body></html>";
    }

    private void h() {
        e eVarK = ((w) ((bt) this.j.a.a()).b.a()).k();
        ((w) ((bt) this.j.a.a()).b.a()).l().c(true);
        ((w) ((bt) this.j.a.a()).b.a()).m().h();
        ((Handler) br.a().c.a()).post(new t(this, eVarK, this.b, this.c));
    }

    private void i() {
        ((Handler) br.a().c.a()).post(new v(this, (w) ((bt) this.j.a.a()).b.a(), this.i, this.m, this.u, this.r, this.n, this.o));
    }

    public String a(Map map, Activity activity) throws s {
        Context applicationContext = activity.getApplicationContext();
        ab abVarM = ((w) ((bt) this.j.a.a()).b.a()).m();
        long jM = abVarM.m();
        if (jM > 0) {
            map.put("prl", Long.valueOf(jM));
        }
        long jN = abVarM.n();
        if (jN > 0) {
            map.put("prnl", Long.valueOf(jN));
        }
        String strL = abVarM.l();
        if (strL != null) {
            map.put("ppcl", strL);
        }
        String strK = abVarM.k();
        if (strK != null) {
            map.put("pcl", strK);
        }
        long j = abVarM.j();
        if (j > 0) {
            map.put("pcc", Long.valueOf(j));
        }
        map.put("preqs", Long.valueOf(abVarM.o()));
        map.put("oar", Long.valueOf(abVarM.p()));
        map.put("bas_on", Long.valueOf(abVarM.s()));
        map.put("bas_off", Long.valueOf(abVarM.v()));
        if (abVarM.y()) {
            map.put("aoi_timeout", "true");
        }
        if (abVarM.A()) {
            map.put("aoi_nofill", "true");
        }
        String strD = abVarM.D();
        if (strD != null) {
            map.put("pit", strD);
        }
        map.put("ptime", Long.valueOf(ab.E()));
        abVarM.a();
        abVarM.i();
        if (((bt) this.j.a.a()).b()) {
            map.put("format", "interstitial_mb");
        } else {
            com.google.ads.g gVarC = ((ac) ((bt) this.j.a.a()).g.a()).c();
            if (gVarC.c()) {
                map.put("smart_w", "full");
            }
            if (gVarC.d()) {
                map.put("smart_h", "auto");
            }
            if (gVarC.e()) {
                HashMap map2 = new HashMap();
                map2.put("w", Integer.valueOf(gVarC.a()));
                map2.put("h", Integer.valueOf(gVarC.b()));
                map.put("ad_frame", map2);
            } else {
                map.put("format", gVarC.toString());
            }
        }
        map.put("slotname", ((bt) this.j.a.a()).h.a());
        map.put("js", "afma-sdk-a-v6.4.1");
        try {
            int i = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionCode;
            String strF = AdUtil.f(applicationContext);
            if (!TextUtils.isEmpty(strF)) {
                map.put("mv", strF);
            }
            String str = (String) br.a().a.a();
            if (!TextUtils.isEmpty(str)) {
                map.put("imbf", str);
            }
            map.put("msid", applicationContext.getPackageName());
            map.put("app_name", i + ".android." + applicationContext.getPackageName());
            map.put("isu", AdUtil.a(applicationContext));
            String strD2 = AdUtil.d(applicationContext);
            if (strD2 == null) {
                strD2 = "null";
            }
            map.put("net", strD2);
            String strE = AdUtil.e(applicationContext);
            if (strE != null && strE.length() != 0) {
                map.put("cap", strE);
            }
            map.put("u_audio", Integer.valueOf(AdUtil.g(applicationContext).ordinal()));
            DisplayMetrics displayMetricsA = AdUtil.a(activity);
            map.put("u_sd", Float.valueOf(displayMetricsA.density));
            map.put("u_h", Integer.valueOf(AdUtil.a(applicationContext, displayMetricsA)));
            map.put("u_w", Integer.valueOf(AdUtil.b(applicationContext, displayMetricsA)));
            map.put("hl", Locale.getDefault().getLanguage());
            bt btVar = (bt) this.j.a.a();
            com.google.ads.ai aiVarA = (com.google.ads.ai) btVar.r.a();
            if (aiVarA == null) {
                aiVarA = com.google.ads.ai.a("afma-sdk-a-v6.4.1", activity);
                btVar.r.a(aiVarA);
                btVar.s.a(new com.google.ads.ak(aiVarA));
            }
            map.put("ms", aiVarA.a(applicationContext));
            if (((bt) this.j.a.a()).j != null && ((bt) this.j.a.a()).j.a() != null) {
                AdView adView = (AdView) ((bt) this.j.a.a()).j.a();
                if (adView.getParent() != null) {
                    int[] iArr = new int[2];
                    adView.getLocationOnScreen(iArr);
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    DisplayMetrics displayMetrics = ((Context) ((bt) this.j.a.a()).f.a()).getResources().getDisplayMetrics();
                    int i4 = (!adView.isShown() || adView.getWidth() + i2 <= 0 || adView.getHeight() + i3 <= 0 || i2 > displayMetrics.widthPixels || i3 > displayMetrics.heightPixels) ? 0 : 1;
                    HashMap map3 = new HashMap();
                    map3.put("x", Integer.valueOf(i2));
                    map3.put("y", Integer.valueOf(i3));
                    map3.put("width", Integer.valueOf(adView.getWidth()));
                    map3.put("height", Integer.valueOf(adView.getHeight()));
                    map3.put("visible", Integer.valueOf(i4));
                    map.put("ad_pos", map3);
                }
            }
            StringBuilder sb = new StringBuilder();
            com.google.ads.g[] gVarArr = (com.google.ads.g[]) ((bt) this.j.a.a()).n.a();
            if (gVarArr != null) {
                for (com.google.ads.g gVar : gVarArr) {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    sb.append(gVar.a() + "x" + gVar.b());
                }
                map.put("sz", sb.toString());
            }
            TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
            String networkOperator = telephonyManager.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                map.put("carrier", networkOperator);
            }
            map.put("pt", Integer.valueOf(telephonyManager.getPhoneType()));
            map.put("gnt", Integer.valueOf(telephonyManager.getNetworkType()));
            if (AdUtil.c()) {
                map.put("simulator", 1);
            }
            map.put("session_id", az.a().b().toString());
            map.put("seq_num", az.a().c().toString());
            if (((ac) ((bt) this.j.a.a()).g.a()).b()) {
                map.put("swipeable", 1);
            }
            if (((Boolean) ((bt) this.j.a.a()).t.a()).booleanValue()) {
                map.put("d_imp_hdr", 1);
            }
            String strA = AdUtil.a(map);
            String str2 = ((Boolean) ((bs) ((br) ((bt) this.j.a.a()).d.a()).b.a()).o.a()).booleanValue() ? f() + c() + "(" + strA + ");" + g() : f() + d() + c() + "(" + strA + ");" + g();
            com.google.ads.util.g.c("adRequestUrlHtml: " + str2);
            return str2;
        } catch (PackageManager.NameNotFoundException e) {
            throw new s(this, "NameNotFoundException");
        }
    }

    protected void a() {
        try {
            if (TextUtils.isEmpty(this.e)) {
                com.google.ads.util.g.b("Got a mediation response with no content type. Aborting mediation.");
                a(com.google.ads.e.INTERNAL_ERROR, false);
            } else if (this.e.startsWith("application/json")) {
                ba baVarA = ba.a(this.c);
                a(this.d, baVarA, ((w) ((bt) this.j.a.a()).b.a()).i());
                ((Handler) br.a().c.a()).post(new p(this, baVarA));
            } else {
                com.google.ads.util.g.b("Got a mediation response with a content type: '" + this.e + "'. Expected something starting with 'application/json'. Aborting mediation.");
                a(com.google.ads.e.INTERNAL_ERROR, false);
            }
        } catch (JSONException e) {
            com.google.ads.util.g.b("AdLoader can't parse gWhirl server configuration.", e);
            a(com.google.ads.e.INTERNAL_ERROR, false);
        }
    }

    public synchronized void a(int i) {
        this.u = i;
    }

    public synchronized void a(u uVar) {
        this.x = uVar;
    }

    protected void a(com.google.ads.d dVar) {
        this.h = dVar;
        this.q = false;
        this.v = new Thread(this);
        this.v.start();
    }

    public synchronized void a(com.google.ads.e eVar) {
        this.s = eVar;
        notify();
    }

    protected void a(com.google.ads.e eVar, boolean z) {
        ((Handler) br.a().c.a()).post(new r((w) ((bt) this.j.a.a()).b.a(), this.i, this.g, eVar, z));
    }

    public synchronized void a(com.google.ads.g gVar) {
        this.o = gVar;
    }

    protected synchronized void a(String str) {
        this.m.add(str);
    }

    protected synchronized void a(String str, String str2) {
        this.b = str2;
        this.c = str;
        notify();
    }

    public synchronized void a(boolean z) {
        this.p = z;
    }

    protected synchronized void b() {
        this.t = true;
        notify();
    }

    protected synchronized void b(String str) {
        this.e = str;
    }

    protected synchronized void b(boolean z) {
        this.f = z;
    }

    protected synchronized void c(String str) {
        this.d = str;
    }

    public synchronized void c(boolean z) {
        this.r = z;
    }

    public synchronized void d(String str) {
        this.k = str;
        notify();
    }

    public synchronized void d(boolean z) {
        this.w = z;
    }

    public synchronized void e(String str) {
        this.l = str;
    }

    public synchronized void e(boolean z) {
        this.a = z;
    }

    public synchronized void f(String str) {
        this.n = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b9 A[Catch: all -> 0x003a, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:14:0x0038, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:53:0x0109, B:55:0x0111, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00ff, B:49:0x0102, B:51:0x0106, B:69:0x015e, B:71:0x0162, B:72:0x0168, B:74:0x016b, B:76:0x016f, B:77:0x0191, B:79:0x0194, B:81:0x01ac, B:83:0x01b4, B:84:0x01bf, B:66:0x0145, B:67:0x015b, B:86:0x01c2, B:87:0x01e2, B:88:0x01e5, B:90:0x01e9, B:92:0x020d, B:93:0x023c, B:94:0x0243, B:96:0x0247, B:98:0x024b, B:100:0x024f, B:102:0x025a, B:114:0x02b5, B:116:0x02b9, B:118:0x02bc, B:120:0x02c0, B:121:0x02c6, B:123:0x02c9, B:125:0x02cd, B:126:0x02ef, B:130:0x030f, B:132:0x0313, B:134:0x0317, B:135:0x0330, B:137:0x0333, B:139:0x0337, B:141:0x0341, B:143:0x034b, B:144:0x036f, B:146:0x0372, B:148:0x0384, B:150:0x0388, B:151:0x0393, B:153:0x0396, B:155:0x03b4, B:156:0x03d2, B:158:0x03d5, B:160:0x03d9, B:161:0x03e1, B:162:0x03fa, B:164:0x03fe, B:166:0x0402, B:168:0x041a, B:170:0x0420, B:172:0x042b, B:178:0x0449, B:180:0x044d, B:59:0x0121, B:181:0x0452, B:175:0x0430, B:176:0x0446, B:105:0x025f, B:106:0x0275, B:128:0x02f2, B:108:0x0278, B:109:0x0288, B:110:0x0292, B:111:0x029f, B:112:0x02b2, B:62:0x0125, B:63:0x0141, B:8:0x000c, B:9:0x0017, B:58:0x0116), top: B:194:0x0004, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bc A[Catch: all -> 0x003a, Throwable -> 0x0115, TRY_ENTER, TryCatch #4 {Throwable -> 0x0115, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:53:0x0109, B:55:0x0111, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00ff, B:49:0x0102, B:69:0x015e, B:71:0x0162, B:74:0x016b, B:76:0x016f, B:79:0x0194, B:81:0x01ac, B:83:0x01b4, B:66:0x0145, B:86:0x01c2, B:87:0x01e2, B:88:0x01e5, B:90:0x01e9, B:92:0x020d, B:93:0x023c, B:94:0x0243, B:96:0x0247, B:98:0x024b, B:100:0x024f, B:102:0x025a, B:114:0x02b5, B:118:0x02bc, B:120:0x02c0, B:123:0x02c9, B:125:0x02cd, B:130:0x030f, B:132:0x0313, B:134:0x0317, B:137:0x0333, B:139:0x0337, B:141:0x0341, B:143:0x034b, B:146:0x0372, B:148:0x0384, B:150:0x0388, B:153:0x0396, B:155:0x03b4, B:158:0x03d5, B:160:0x03d9, B:161:0x03e1, B:162:0x03fa, B:164:0x03fe, B:166:0x0402, B:168:0x041a, B:170:0x0420, B:172:0x042b, B:178:0x0449, B:180:0x044d, B:181:0x0452, B:175:0x0430, B:105:0x025f, B:128:0x02f2, B:108:0x0278, B:109:0x0288, B:110:0x0292, B:111:0x029f, B:62:0x0125, B:8:0x000c), top: B:193:0x0004, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f2 A[Catch: all -> 0x003a, Throwable -> 0x0115, TRY_ENTER, TryCatch #4 {Throwable -> 0x0115, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:53:0x0109, B:55:0x0111, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00ff, B:49:0x0102, B:69:0x015e, B:71:0x0162, B:74:0x016b, B:76:0x016f, B:79:0x0194, B:81:0x01ac, B:83:0x01b4, B:66:0x0145, B:86:0x01c2, B:87:0x01e2, B:88:0x01e5, B:90:0x01e9, B:92:0x020d, B:93:0x023c, B:94:0x0243, B:96:0x0247, B:98:0x024b, B:100:0x024f, B:102:0x025a, B:114:0x02b5, B:118:0x02bc, B:120:0x02c0, B:123:0x02c9, B:125:0x02cd, B:130:0x030f, B:132:0x0313, B:134:0x0317, B:137:0x0333, B:139:0x0337, B:141:0x0341, B:143:0x034b, B:146:0x0372, B:148:0x0384, B:150:0x0388, B:153:0x0396, B:155:0x03b4, B:158:0x03d5, B:160:0x03d9, B:161:0x03e1, B:162:0x03fa, B:164:0x03fe, B:166:0x0402, B:168:0x041a, B:170:0x0420, B:172:0x042b, B:178:0x0449, B:180:0x044d, B:181:0x0452, B:175:0x0430, B:105:0x025f, B:128:0x02f2, B:108:0x0278, B:109:0x0288, B:110:0x0292, B:111:0x029f, B:62:0x0125, B:8:0x000c), top: B:193:0x0004, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0313 A[Catch: all -> 0x003a, Throwable -> 0x0115, TryCatch #4 {Throwable -> 0x0115, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:53:0x0109, B:55:0x0111, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00ff, B:49:0x0102, B:69:0x015e, B:71:0x0162, B:74:0x016b, B:76:0x016f, B:79:0x0194, B:81:0x01ac, B:83:0x01b4, B:66:0x0145, B:86:0x01c2, B:87:0x01e2, B:88:0x01e5, B:90:0x01e9, B:92:0x020d, B:93:0x023c, B:94:0x0243, B:96:0x0247, B:98:0x024b, B:100:0x024f, B:102:0x025a, B:114:0x02b5, B:118:0x02bc, B:120:0x02c0, B:123:0x02c9, B:125:0x02cd, B:130:0x030f, B:132:0x0313, B:134:0x0317, B:137:0x0333, B:139:0x0337, B:141:0x0341, B:143:0x034b, B:146:0x0372, B:148:0x0384, B:150:0x0388, B:153:0x0396, B:155:0x03b4, B:158:0x03d5, B:160:0x03d9, B:161:0x03e1, B:162:0x03fa, B:164:0x03fe, B:166:0x0402, B:168:0x041a, B:170:0x0420, B:172:0x042b, B:178:0x0449, B:180:0x044d, B:181:0x0452, B:175:0x0430, B:105:0x025f, B:128:0x02f2, B:108:0x0278, B:109:0x0288, B:110:0x0292, B:111:0x029f, B:62:0x0125, B:8:0x000c), top: B:193:0x0004, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x044d A[Catch: all -> 0x003a, Throwable -> 0x0115, TryCatch #4 {Throwable -> 0x0115, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:53:0x0109, B:55:0x0111, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00ff, B:49:0x0102, B:69:0x015e, B:71:0x0162, B:74:0x016b, B:76:0x016f, B:79:0x0194, B:81:0x01ac, B:83:0x01b4, B:66:0x0145, B:86:0x01c2, B:87:0x01e2, B:88:0x01e5, B:90:0x01e9, B:92:0x020d, B:93:0x023c, B:94:0x0243, B:96:0x0247, B:98:0x024b, B:100:0x024f, B:102:0x025a, B:114:0x02b5, B:118:0x02bc, B:120:0x02c0, B:123:0x02c9, B:125:0x02cd, B:130:0x030f, B:132:0x0313, B:134:0x0317, B:137:0x0333, B:139:0x0337, B:141:0x0341, B:143:0x034b, B:146:0x0372, B:148:0x0384, B:150:0x0388, B:153:0x0396, B:155:0x03b4, B:158:0x03d5, B:160:0x03d9, B:161:0x03e1, B:162:0x03fa, B:164:0x03fe, B:166:0x0402, B:168:0x041a, B:170:0x0420, B:172:0x042b, B:178:0x0449, B:180:0x044d, B:181:0x0452, B:175:0x0430, B:105:0x025f, B:128:0x02f2, B:108:0x0278, B:109:0x0288, B:110:0x0292, B:111:0x029f, B:62:0x0125, B:8:0x000c), top: B:193:0x0004, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0452 A[Catch: all -> 0x003a, Throwable -> 0x0115, TRY_LEAVE, TryCatch #4 {Throwable -> 0x0115, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:53:0x0109, B:55:0x0111, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00ff, B:49:0x0102, B:69:0x015e, B:71:0x0162, B:74:0x016b, B:76:0x016f, B:79:0x0194, B:81:0x01ac, B:83:0x01b4, B:66:0x0145, B:86:0x01c2, B:87:0x01e2, B:88:0x01e5, B:90:0x01e9, B:92:0x020d, B:93:0x023c, B:94:0x0243, B:96:0x0247, B:98:0x024b, B:100:0x024f, B:102:0x025a, B:114:0x02b5, B:118:0x02bc, B:120:0x02c0, B:123:0x02c9, B:125:0x02cd, B:130:0x030f, B:132:0x0313, B:134:0x0317, B:137:0x0333, B:139:0x0337, B:141:0x0341, B:143:0x034b, B:146:0x0372, B:148:0x0384, B:150:0x0388, B:153:0x0396, B:155:0x03b4, B:158:0x03d5, B:160:0x03d9, B:161:0x03e1, B:162:0x03fa, B:164:0x03fe, B:166:0x0402, B:168:0x041a, B:170:0x0420, B:172:0x042b, B:178:0x0449, B:180:0x044d, B:181:0x0452, B:175:0x0430, B:105:0x025f, B:128:0x02f2, B:108:0x0278, B:109:0x0288, B:110:0x0292, B:111:0x029f, B:62:0x0125, B:8:0x000c), top: B:193:0x0004, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e9 A[Catch: all -> 0x003a, Throwable -> 0x0115, TryCatch #4 {Throwable -> 0x0115, blocks: (B:4:0x0004, B:6:0x0008, B:11:0x0019, B:13:0x002d, B:19:0x003d, B:21:0x0079, B:23:0x0085, B:24:0x0089, B:26:0x0093, B:27:0x0097, B:29:0x00a1, B:30:0x00a5, B:32:0x00af, B:34:0x00b7, B:53:0x0109, B:55:0x0111, B:35:0x00ba, B:37:0x00c4, B:39:0x00cc, B:40:0x00e1, B:42:0x00e5, B:44:0x00e9, B:45:0x00ed, B:48:0x00ff, B:49:0x0102, B:69:0x015e, B:71:0x0162, B:74:0x016b, B:76:0x016f, B:79:0x0194, B:81:0x01ac, B:83:0x01b4, B:66:0x0145, B:86:0x01c2, B:87:0x01e2, B:88:0x01e5, B:90:0x01e9, B:92:0x020d, B:93:0x023c, B:94:0x0243, B:96:0x0247, B:98:0x024b, B:100:0x024f, B:102:0x025a, B:114:0x02b5, B:118:0x02bc, B:120:0x02c0, B:123:0x02c9, B:125:0x02cd, B:130:0x030f, B:132:0x0313, B:134:0x0317, B:137:0x0333, B:139:0x0337, B:141:0x0341, B:143:0x034b, B:146:0x0372, B:148:0x0384, B:150:0x0388, B:153:0x0396, B:155:0x03b4, B:158:0x03d5, B:160:0x03d9, B:161:0x03e1, B:162:0x03fa, B:164:0x03fe, B:166:0x0402, B:168:0x041a, B:170:0x0420, B:172:0x042b, B:178:0x0449, B:180:0x044d, B:181:0x0452, B:175:0x0430, B:105:0x025f, B:128:0x02f2, B:108:0x0278, B:109:0x0288, B:110:0x0292, B:111:0x029f, B:62:0x0125, B:8:0x000c), top: B:193:0x0004, outer: #5 }] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:163:0x03fc
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SynchronizedRegionMaker.process(SynchronizedRegionMaker.java:87)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:118)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.a.n.run():void");
    }
}
