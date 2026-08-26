package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.p;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    final f a;
    int b;
    private int c;
    private int d;
    private WeakReference e;
    private WeakReference f;
    private WeakReference g;
    private int h;
    private boolean i;
    private boolean j;

    private ch a(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof ch) {
            drawable = ((ch) drawable).b();
        }
        return new ch(drawable, drawable2);
    }

    private void a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        a aVar;
        switch (this.b) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                if (!z2 && (aVar = (a) this.e.get()) != null) {
                    aVar.a(this.a.a, drawable);
                    break;
                }
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                ImageView imageView = (ImageView) this.f.get();
                if (imageView != null) {
                    a(imageView, drawable, z, z2, z3);
                }
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                TextView textView = (TextView) this.g.get();
                if (textView != null) {
                    a(textView, this.h, drawable, z, z2);
                }
                break;
        }
    }

    private void a(ImageView imageView, Drawable drawable, boolean z, boolean z2, boolean z3) {
        boolean z4 = (z2 || z3) ? false : true;
        if (z4 && (imageView instanceof cm)) {
            int iA = ((cm) imageView).a();
            if (this.c != 0 && iA == this.c) {
                return;
            }
        }
        boolean zA = a(z, z2);
        Drawable drawableA = zA ? a(imageView.getDrawable(), drawable) : drawable;
        imageView.setImageDrawable(drawableA);
        if (imageView instanceof cm) {
            cm cmVar = (cm) imageView;
            cmVar.a(z3 ? this.a.a : null);
            cmVar.a(z4 ? this.c : 0);
        }
        if (zA) {
            ((ch) drawableA).a(250);
        }
    }

    private void a(TextView textView, int i, Drawable drawable, boolean z, boolean z2) {
        boolean zA = a(z, z2);
        Drawable[] compoundDrawablesRelative = p.e() ? textView.getCompoundDrawablesRelative() : textView.getCompoundDrawables();
        Drawable drawableA = zA ? a(compoundDrawablesRelative[i], drawable) : drawable;
        Drawable drawable2 = i == 0 ? drawableA : compoundDrawablesRelative[0];
        Drawable drawable3 = i == 1 ? drawableA : compoundDrawablesRelative[1];
        Drawable drawable4 = i == 2 ? drawableA : compoundDrawablesRelative[2];
        Drawable drawable5 = i == 3 ? drawableA : compoundDrawablesRelative[3];
        if (p.e()) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
        }
        if (zA) {
            ((ch) drawableA).a(250);
        }
    }

    private boolean a(boolean z, boolean z2) {
        return this.i && !z2 && (!z || this.j);
    }

    void a(Context context, Bitmap bitmap, boolean z) {
        cn.a(bitmap);
        a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    void a(Context context, boolean z) {
        a(this.c != 0 ? context.getResources().getDrawable(this.c) : null, z, false, false);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this == obj || ((e) obj).hashCode() == hashCode();
        }
        return false;
    }

    public int hashCode() {
        return this.d;
    }
}
