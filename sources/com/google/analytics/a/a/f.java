package com.google.analytics.a.a;

import com.google.tagmanager.a.ad;
import com.google.tagmanager.a.ae;

/* JADX INFO: loaded from: classes.dex */
public enum f implements ad {
    NO_CACHE(0, 1),
    PRIVATE(1, 2),
    PUBLIC(2, 3);

    private static ae d = new ae() { // from class: com.google.analytics.a.a.g
        @Override // com.google.tagmanager.a.ae
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f b(int i) {
            return f.a(i);
        }
    };
    private final int e;

    f(int i, int i2) {
        this.e = i2;
    }

    public static f a(int i) {
        switch (i) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                return NO_CACHE;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                return PRIVATE;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                return PUBLIC;
            default:
                return null;
        }
    }

    @Override // com.google.tagmanager.a.ad
    public final int a() {
        return this.e;
    }
}
