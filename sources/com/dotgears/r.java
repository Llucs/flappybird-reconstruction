package com.dotgears;

/* JADX INFO: loaded from: classes.dex */
public class r {
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;
    private int h;
    private int i;
    private float j;
    public boolean g = true;
    public float a = 0.0f;

    public void a(float f) {
        if (this.g) {
            return;
        }
        this.i++;
        this.b = this.i * this.j;
        switch (this.f) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                this.b = j.b((int) (this.b * 100.0f));
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                this.b = j.c((int) (this.b * 100.0f));
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                this.b = j.d((int) (this.b * 100.0f));
                break;
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                this.b = j.e((int) (this.b * 100.0f));
                break;
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                this.b = j.f((int) (this.b * 100.0f));
                break;
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                this.b = j.g((int) (this.b * 100.0f));
                break;
            case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                this.b = j.h((int) (this.b * 100.0f));
                break;
            case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                this.b = j.i((int) (this.b * 100.0f));
                break;
            case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                this.b = j.j((int) (this.b * 100.0f));
                break;
            case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                this.b = j.k((int) (this.b * 100.0f));
                break;
            case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                this.b = j.l((int) (this.b * 100.0f));
                break;
            case com.google.android.gms.e.MapAttrs_useViewLifecycle /* 12 */:
                this.b = j.m((int) (this.b * 100.0f));
                break;
            case com.google.android.gms.e.MapAttrs_zOrderOnTop /* 13 */:
                this.b = j.n((int) (this.b * 100.0f));
                break;
            case 14:
                this.b = j.o((int) (this.b * 100.0f));
                break;
            case 15:
                this.b = j.p((int) (this.b * 100.0f));
                break;
            case 16:
                this.b = j.q((int) (this.b * 100.0f));
                break;
            case 17:
                this.b = j.r((int) (this.b * 100.0f));
                break;
            case 18:
                this.b = j.s((int) (this.b * 100.0f));
                break;
            case 19:
                this.b = j.t((int) (this.b * 100.0f));
                break;
            case 20:
                this.b = j.u((int) (this.b * 100.0f));
                break;
            case 21:
                this.b = j.v((int) (this.b * 100.0f));
                break;
        }
        this.a = (this.b * this.e) + this.c;
        if (this.i == this.h) {
            this.g = true;
            this.a = this.d;
            this.b = 1.0f;
        }
    }

    public void a(float f, float f2, int i, float f3) {
        this.c = f;
        this.d = f2;
        this.e = this.d - this.c;
        this.h = (int) (60.0f * f3);
        this.j = 1.0f / this.h;
        this.i = 0;
        this.f = i;
        this.g = false;
        this.a = this.c;
    }
}
