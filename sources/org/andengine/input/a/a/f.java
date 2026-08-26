package org.andengine.input.a.a;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public class f extends a {
    private void a(int i, MotionEvent motionEvent) {
        int iC = c(motionEvent);
        a(motionEvent.getX(iC), motionEvent.getY(iC), i, motionEvent.getPointerId(iC), motionEvent);
    }

    private void b(MotionEvent motionEvent) {
        for (int pointerCount = motionEvent.getPointerCount() - 1; pointerCount >= 0; pointerCount--) {
            a(motionEvent.getX(pointerCount), motionEvent.getY(pointerCount), 2, motionEvent.getPointerId(pointerCount), motionEvent);
        }
    }

    private static int c(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    @Override // org.andengine.input.a.a.d
    public void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                a(0, motionEvent);
                return;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                a(1, motionEvent);
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                b(motionEvent);
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                a(action, motionEvent);
                return;
            default:
                throw new IllegalArgumentException("Invalid Action detected: " + action);
        }
    }
}
