package com.google.android.gms.internal;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public final class u extends Button {
    public u(Context context) {
        this(context, null);
    }

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
    }

    private int a(int i, int i2, int i3) {
        switch (i) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                return i2;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                return i3;
            default:
                throw new IllegalStateException("Unknown color scheme: " + i);
        }
    }

    private void a(Resources resources) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        float f = resources.getDisplayMetrics().density;
        setMinHeight((int) ((f * 48.0f) + 0.5f));
        setMinWidth((int) ((f * 48.0f) + 0.5f));
    }

    private void b(Resources resources, int i, int i2) {
        int iA;
        switch (i) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                iA = a(i2, com.google.android.gms.c.common_signin_btn_text_dark, com.google.android.gms.c.common_signin_btn_text_light);
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                iA = a(i2, com.google.android.gms.c.common_signin_btn_icon_dark, com.google.android.gms.c.common_signin_btn_icon_light);
                break;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
        if (iA == -1) {
            throw new IllegalStateException("Could not find background resource!");
        }
        setBackgroundDrawable(resources.getDrawable(iA));
    }

    private void c(Resources resources, int i, int i2) {
        setTextColor(resources.getColorStateList(a(i2, com.google.android.gms.b.common_signin_btn_text_dark, com.google.android.gms.b.common_signin_btn_text_light)));
        switch (i) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                setText(resources.getString(com.google.android.gms.d.common_signin_button_text));
                return;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                setText(resources.getString(com.google.android.gms.d.common_signin_button_text_long));
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                setText((CharSequence) null);
                return;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
    }

    public void a(Resources resources, int i, int i2) {
        Cdo.a(i >= 0 && i < 3, "Unknown button size " + i);
        Cdo.a(i2 >= 0 && i2 < 2, "Unknown color scheme " + i2);
        a(resources);
        b(resources, i, i2);
        c(resources, i, i2);
    }
}
