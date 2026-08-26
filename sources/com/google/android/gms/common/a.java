package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.google.android.gms.internal.dl;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a a = new a(0, null);
    private final PendingIntent b;
    private final int c;

    public a(int i, PendingIntent pendingIntent) {
        this.c = i;
        this.b = pendingIntent;
    }

    private String c() {
        switch (this.c) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                return "SUCCESS";
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                return "SERVICE_MISSING";
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                return "SERVICE_DISABLED";
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                return "SIGN_IN_REQUIRED";
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                return "INVALID_ACCOUNT";
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                return "RESOLUTION_REQUIRED";
            case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                return "NETWORK_ERROR";
            case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                return "INTERNAL_ERROR";
            case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                return "SERVICE_INVALID";
            case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                return "DEVELOPER_ERROR";
            case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                return "LICENSE_CHECK_FAILED";
            default:
                return "unknown status code " + this.c;
        }
    }

    public void a(Activity activity, int i) throws IntentSender.SendIntentException {
        if (a()) {
            activity.startIntentSenderForResult(this.b.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public boolean a() {
        return (this.c == 0 || this.b == null) ? false : true;
    }

    public int b() {
        return this.c;
    }

    public String toString() {
        return dl.a(this).a("statusCode", c()).a("resolution", this.b).toString();
    }
}
