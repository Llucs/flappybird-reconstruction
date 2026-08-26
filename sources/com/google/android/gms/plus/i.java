package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class i implements k {
    private Context a;

    private i(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.plus.k
    public Drawable a(int i) {
        String str;
        try {
            Resources resources = this.a.createPackageContext("com.google.android.gms", 4).getResources();
            switch (i) {
                case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                    str = "ic_plusone_small";
                    break;
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    str = "ic_plusone_medium";
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    str = "ic_plusone_tall";
                    break;
                default:
                    str = "ic_plusone_standard";
                    break;
            }
            return resources.getDrawable(resources.getIdentifier(str, "drawable", "com.google.android.gms"));
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @Override // com.google.android.gms.plus.k
    public boolean a() {
        try {
            this.a.createPackageContext("com.google.android.gms", 4).getResources();
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
