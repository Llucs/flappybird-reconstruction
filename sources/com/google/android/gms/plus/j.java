package com.google.android.gms.plus;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class j implements k {
    private Context a;

    private j(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.plus.k
    public Drawable a(int i) {
        String str;
        switch (i) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                str = "ic_plusone_small_off_client";
                break;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                str = "ic_plusone_medium_off_client";
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                str = "ic_plusone_tall_off_client";
                break;
            default:
                str = "ic_plusone_standard_off_client";
                break;
        }
        return this.a.getResources().getDrawable(this.a.getResources().getIdentifier(str, "drawable", this.a.getPackageName()));
    }

    @Override // com.google.android.gms.plus.k
    public boolean a() {
        return (this.a.getResources().getIdentifier("ic_plusone_small_off_client", "drawable", this.a.getPackageName()) == 0 || this.a.getResources().getIdentifier("ic_plusone_medium_off_client", "drawable", this.a.getPackageName()) == 0 || this.a.getResources().getIdentifier("ic_plusone_tall_off_client", "drawable", this.a.getPackageName()) == 0 || this.a.getResources().getIdentifier("ic_plusone_standard_off_client", "drawable", this.a.getPackageName()) == 0) ? false : true;
    }
}
