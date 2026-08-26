package com.google.analytics.b.a.a;

import com.google.tagmanager.a.ad;
import com.google.tagmanager.a.ae;

/* JADX INFO: loaded from: classes.dex */
public enum h implements ad {
    STRING(0, 1),
    LIST(1, 2),
    MAP(2, 3),
    MACRO_REFERENCE(3, 4),
    FUNCTION_ID(4, 5),
    INTEGER(5, 6),
    TEMPLATE(6, 7),
    BOOLEAN(7, 8);

    private static ae i = new ae() { // from class: com.google.analytics.b.a.a.i
        @Override // com.google.tagmanager.a.ae
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h b(int i2) {
            return h.a(i2);
        }
    };
    private final int j;

    h(int i2, int i3) {
        this.j = i3;
    }

    public static h a(int i2) {
        switch (i2) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                return STRING;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                return LIST;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                return MAP;
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                return MACRO_REFERENCE;
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                return FUNCTION_ID;
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                return INTEGER;
            case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                return TEMPLATE;
            case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                return BOOLEAN;
            default:
                return null;
        }
    }

    @Override // com.google.tagmanager.a.ad
    public final int a() {
        return this.j;
    }
}
