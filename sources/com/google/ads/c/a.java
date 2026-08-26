package com.google.ads.c;

import android.content.Context;
import android.graphics.Color;
import com.google.ads.d;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends d {
    private String b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private String i;
    private int j;
    private int k;
    private b l;
    private int m;
    private String n;

    private String a(int i) {
        return String.format(Locale.US, "#%06x", Integer.valueOf(16777215 & i));
    }

    @Override // com.google.ads.d
    public Map a(Context context) {
        com.google.ads.b.a.a aVar = (com.google.ads.b.a.a) a(com.google.ads.b.a.a.class);
        if (aVar == null) {
            aVar = new com.google.ads.b.a.a();
            a(aVar);
        }
        if (this.b != null) {
            aVar.d().put("q", this.b);
        }
        if (Color.alpha(this.c) != 0) {
            aVar.d().put("bgcolor", a(this.c));
        }
        if (Color.alpha(this.d) == 255 && Color.alpha(this.e) == 255) {
            aVar.d().put("gradientfrom", a(this.d));
            aVar.d().put("gradientto", a(this.e));
        }
        if (Color.alpha(this.f) != 0) {
            aVar.d().put("hcolor", a(this.f));
        }
        if (Color.alpha(this.g) != 0) {
            aVar.d().put("dcolor", a(this.g));
        }
        if (Color.alpha(this.h) != 0) {
            aVar.d().put("acolor", a(this.h));
        }
        if (this.i != null) {
            aVar.d().put("font", this.i);
        }
        aVar.d().put("headersize", Integer.toString(this.j));
        if (Color.alpha(this.k) != 0) {
            aVar.d().put("bcolor", a(this.k));
        }
        if (this.l != null) {
            aVar.d().put("btype", this.l.toString());
        }
        aVar.d().put("bthick", Integer.toString(this.m));
        if (this.n != null) {
            aVar.d().put("channel", this.n);
        }
        return super.a(context);
    }
}
