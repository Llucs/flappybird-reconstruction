package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.util.AdUtil;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class cc implements bu {
    @Override // com.google.ads.bu
    public void a(com.google.ads.a.w wVar, HashMap map, WebView webView) {
        String strReplaceAll = (String) map.get("url");
        String str = (String) map.get("type");
        String str2 = (String) map.get("afma_notify_dt");
        String str3 = (String) map.get("activation_overlay_url");
        String str4 = (String) map.get("check_packages");
        boolean zEquals = "1".equals(map.get("drt_include"));
        String str5 = (String) map.get("request_scenario");
        boolean zEquals2 = "1".equals(map.get("use_webview_loadurl"));
        com.google.ads.a.u uVar = com.google.ads.a.u.OFFLINE_EMPTY.e.equals(str5) ? com.google.ads.a.u.OFFLINE_EMPTY : com.google.ads.a.u.OFFLINE_USING_BUFFERED_ADS.e.equals(str5) ? com.google.ads.a.u.OFFLINE_USING_BUFFERED_ADS : com.google.ads.a.u.ONLINE_USING_BUFFERED_ADS.e.equals(str5) ? com.google.ads.a.u.ONLINE_USING_BUFFERED_ADS : com.google.ads.a.u.ONLINE_SERVER_REQUEST;
        com.google.ads.util.g.c("Received ad url: <url: \"" + strReplaceAll + "\" type: \"" + str + "\" afmaNotifyDt: \"" + str2 + "\" activationOverlayUrl: \"" + str3 + "\" useWebViewLoadUrl: \"" + zEquals2 + "\">");
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(strReplaceAll)) {
            BigInteger bigInteger = new BigInteger(new byte[1]);
            String[] strArrSplit = str4.split(",");
            BigInteger bit = bigInteger;
            for (int i = 0; i < strArrSplit.length; i++) {
                if (AdUtil.a((Context) wVar.h().c.a(), strArrSplit[i])) {
                    bit = bit.setBit(i);
                }
            }
            String str6 = String.format(Locale.US, "%X", bit);
            strReplaceAll = strReplaceAll.replaceAll("%40installed_markets%40", str6);
            br.a().a.a(str6);
            com.google.ads.util.g.c("Ad url modified to " + strReplaceAll);
        }
        com.google.ads.a.n nVarJ = wVar.j();
        if (nVarJ != null) {
            nVarJ.d(zEquals);
            nVarJ.a(uVar);
            nVarJ.e(zEquals2);
            nVarJ.e(str3);
            nVarJ.d(strReplaceAll);
        }
    }
}
