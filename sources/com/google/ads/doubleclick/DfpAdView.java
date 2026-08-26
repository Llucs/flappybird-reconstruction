package com.google.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import com.google.ads.AdView;
import com.google.ads.g;
import com.google.ads.h;

/* JADX INFO: loaded from: classes.dex */
public class DfpAdView extends AdView {
    public DfpAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DfpAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.google.ads.AdView
    public void setAppEventListener(h hVar) {
        super.setAppEventListener(hVar);
    }

    @Override // com.google.ads.AdView
    public void setSupportedAdSizes(g... gVarArr) {
        super.setSupportedAdSizes(gVarArr);
    }
}
