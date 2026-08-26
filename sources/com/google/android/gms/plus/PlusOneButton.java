package com.google.android.gms.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.dq;

/* JADX INFO: loaded from: classes.dex */
public final class PlusOneButton extends FrameLayout {
    private View a;
    private int b;
    private int c;
    private String d;
    private int e;
    private e f;

    public PlusOneButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = a(context, attributeSet);
        this.c = b(context, attributeSet);
        this.e = -1;
        a(getContext());
        if (isInEditMode()) {
        }
    }

    protected static int a(Context context, AttributeSet attributeSet) {
        String strA = dq.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, true, false, "PlusOneButton");
        if ("SMALL".equalsIgnoreCase(strA)) {
            return 0;
        }
        if ("MEDIUM".equalsIgnoreCase(strA)) {
            return 1;
        }
        return "TALL".equalsIgnoreCase(strA) ? 2 : 3;
    }

    private void a(Context context) {
        if (this.a != null) {
            removeView(this.a);
        }
        this.a = be.a(context, this.b, this.c, this.d, this.e);
        setOnPlusOneClickListener(this.f);
        addView(this.a);
    }

    protected static int b(Context context, AttributeSet attributeSet) {
        String strA = dq.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeSet, true, false, "PlusOneButton");
        if ("INLINE".equalsIgnoreCase(strA)) {
            return 2;
        }
        return !"NONE".equalsIgnoreCase(strA) ? 1 : 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        View view = this.a;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i) {
        this.c = i;
        a(getContext());
    }

    public void setOnPlusOneClickListener(e eVar) {
        this.f = eVar;
        this.a.setOnClickListener(new d(this, eVar));
    }

    public void setSize(int i) {
        this.b = i;
        a(getContext());
    }
}
