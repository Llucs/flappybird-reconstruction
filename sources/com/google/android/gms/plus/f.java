package com.google.android.gms.plus;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class f extends FrameLayout {
    public f(Context context, int i) {
        super(context);
        Button button = new Button(context);
        button.setEnabled(false);
        button.setBackgroundDrawable(a().a(i));
        Point pointA = a(i);
        addView(button, new FrameLayout.LayoutParams(pointA.x, pointA.y, 17));
    }

    private Point a(int i) {
        int i2 = 24;
        int i3 = 20;
        Point point = new Point();
        switch (i) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                i3 = 14;
                break;
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                i2 = 32;
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                i2 = 50;
                break;
            default:
                i2 = 38;
                i3 = 24;
                break;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float fApplyDimension = TypedValue.applyDimension(1, i2, displayMetrics);
        float fApplyDimension2 = TypedValue.applyDimension(1, i3, displayMetrics);
        point.x = (int) (((double) fApplyDimension) + 0.5d);
        point.y = (int) (((double) fApplyDimension2) + 0.5d);
        return point;
    }

    private k a() {
        k iVar = new i(getContext());
        if (!iVar.a()) {
            iVar = new j(getContext());
        }
        return !iVar.a() ? new h(getContext()) : iVar;
    }
}
