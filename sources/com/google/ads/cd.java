package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.util.AdUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class cd implements bu {
    private void a(HashMap map, String str, com.google.ads.util.ae aeVar) {
        try {
            String str2 = (String) map.get(str);
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            aeVar.a(Integer.valueOf(str2));
        } catch (NumberFormatException e) {
            com.google.ads.util.g.a("Could not parse \"" + str + "\" constant.");
        }
    }

    private void b(HashMap map, String str, com.google.ads.util.ae aeVar) {
        try {
            String str2 = (String) map.get(str);
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            aeVar.a(Long.valueOf(str2));
        } catch (NumberFormatException e) {
            com.google.ads.util.g.a("Could not parse \"" + str + "\" constant.");
        }
    }

    private void c(HashMap map, String str, com.google.ads.util.ae aeVar) {
        String str2 = (String) map.get(str);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        aeVar.a(str2);
    }

    @Override // com.google.ads.bu
    public void a(com.google.ads.a.w wVar, HashMap map, WebView webView) {
        bt btVarH = wVar.h();
        bs bsVar = (bs) ((br) btVarH.d.a()).b.a();
        c(map, "as_domains", bsVar.a);
        c(map, "bad_ad_report_path", bsVar.h);
        a(map, "min_hwa_banner", bsVar.b);
        a(map, "min_hwa_activation_overlay", bsVar.c);
        a(map, "min_hwa_overlay", bsVar.d);
        c(map, "mraid_banner_path", bsVar.e);
        c(map, "mraid_expanded_banner_path", bsVar.f);
        c(map, "mraid_interstitial_path", bsVar.g);
        b(map, "ac_max_size", bsVar.i);
        b(map, "ac_padding", bsVar.j);
        b(map, "ac_total_quota", bsVar.k);
        b(map, "db_total_quota", bsVar.l);
        b(map, "db_quota_per_origin", bsVar.m);
        b(map, "db_quota_step_size", bsVar.n);
        com.google.ads.a.e eVarK = wVar.k();
        if (AdUtil.a >= 11) {
            com.google.ads.util.p.a(eVarK.getSettings(), btVarH);
            com.google.ads.util.p.a(webView.getSettings(), btVarH);
        }
        if (!((com.google.ads.a.ac) btVarH.g.a()).a()) {
            boolean zK = eVarK.k();
            boolean z = AdUtil.a < ((Integer) bsVar.b.a()).intValue();
            if (!z && zK) {
                com.google.ads.util.g.a("Re-enabling hardware acceleration for a banner after reading constants.");
                eVarK.h();
            } else if (z && !zK) {
                com.google.ads.util.g.a("Disabling hardware acceleration for a banner after reading constants.");
                eVarK.g();
            }
        }
        com.google.ads.a.a aVar = (com.google.ads.a.a) btVarH.e.a();
        if (!((com.google.ads.a.ac) btVarH.g.a()).b() && aVar != null) {
            boolean zK2 = aVar.k();
            boolean z2 = AdUtil.a < ((Integer) bsVar.c.a()).intValue();
            if (!z2 && zK2) {
                com.google.ads.util.g.a("Re-enabling hardware acceleration for an activation overlay after reading constants.");
                aVar.h();
            } else if (z2 && !zK2) {
                com.google.ads.util.g.a("Disabling hardware acceleration for an activation overlay after reading constants.");
                aVar.g();
            }
        }
        String str = (String) bsVar.a.a();
        ak akVar = (ak) btVarH.s.a();
        if (akVar != null && !TextUtils.isEmpty(str)) {
            akVar.a(str);
        }
        bsVar.o.a(true);
    }
}
