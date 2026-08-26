package com.dotgears;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.ads.AdView;
import java.io.IOException;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.ui.activity.SimpleBaseGameActivity;

/* JADX INFO: loaded from: classes.dex */
public class GameActivity extends SimpleBaseGameActivity implements com.google.example.games.basegameutils.b {
    public AdView a;
    public org.andengine.a.c.a b;
    public org.andengine.a.c.a c;
    public org.andengine.a.c.a d;
    public org.andengine.a.c.a e;
    public org.andengine.a.c.a f;
    protected com.google.example.games.basegameutils.a g;
    protected int h = 1;
    protected String i = "BaseGameActivity";
    protected boolean j = false;
    private org.andengine.b.a.a m;
    private org.andengine.opengl.c.c.c n;
    private String[] o;

    @Override // org.andengine.ui.activity.BaseGameActivity
    public org.andengine.b.a a(org.andengine.b.c.b bVar) {
        return new org.andengine.b.e(bVar, 60);
    }

    @Override // org.andengine.ui.a
    public org.andengine.b.c.b a() {
        this.m = new org.andengine.b.a.a(0.0f, 0.0f, 288.0f, 512.0f);
        org.andengine.b.c.b bVar = new org.andengine.b.c.b(true, org.andengine.b.c.e.PORTRAIT_FIXED, new org.andengine.b.c.a.b(288.0f, 512.0f), this.m);
        bVar.d().b(true).a(true);
        bVar.e().a(true);
        bVar.c().a(true);
        bVar.a(org.andengine.b.c.h.SCREEN_ON);
        return bVar;
    }

    @Override // org.andengine.ui.activity.BaseGameActivity
    protected void b() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.l = new RenderSurfaceView(this);
        this.l.a(this.k, this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((ViewGroup.MarginLayoutParams) BaseGameActivity.B());
        layoutParams2.addRule(13);
        relativeLayout.addView(this.l, layoutParams2);
        FrameLayout frameLayout = new FrameLayout(this);
        this.a = new AdView(this, com.google.ads.g.a, "a152df006159b75");
        this.a.refreshDrawableState();
        frameLayout.addView(this.a, new FrameLayout.LayoutParams(-2, -2, 49));
        relativeLayout.addView(frameLayout);
        this.a.a(new com.google.ads.d());
        setContentView(relativeLayout, layoutParams);
    }

    public void c() {
        runOnUiThread(new a(this));
    }

    public void d() {
        runOnUiThread(new b(this));
    }

    public void e() {
        this.b.d();
    }

    public void f() {
        this.c.d();
    }

    public void g() {
        this.d.d();
    }

    public void h() {
        this.e.d();
    }

    public void i() {
        this.f.d();
    }

    @Override // com.google.example.games.basegameutils.b
    public void j() {
    }

    @Override // com.google.example.games.basegameutils.b
    public void k() {
    }

    @Override // org.andengine.ui.activity.SimpleBaseGameActivity
    protected void l() {
        org.andengine.opengl.c.a.a.b.a("gfx/");
        org.andengine.opengl.c.a.a.a aVar = new org.andengine.opengl.c.a.a.a(y(), 1024, 1024, org.andengine.opengl.c.f.i);
        this.n = org.andengine.opengl.c.a.a.b.a(aVar, this, "atlas.png", 0, 0);
        aVar.i();
        org.andengine.a.c.b.a("sounds/");
        try {
            this.b = org.andengine.a.c.b.a(this.k.i(), this, "sfx_point.ogg");
            this.c = org.andengine.a.c.b.a(this.k.i(), this, "sfx_die.ogg");
            this.d = org.andengine.a.c.b.a(this.k.i(), this, "sfx_hit.ogg");
            this.e = org.andengine.a.c.b.a(this.k.i(), this, "sfx_swooshing.ogg");
            this.f = org.andengine.a.c.b.a(this.k.i(), this, "sfx_wing.ogg");
        } catch (IOException e) {
        }
    }

    @Override // org.andengine.ui.activity.SimpleBaseGameActivity
    protected org.andengine.c.b.e m() {
        return new c(this, this.n);
    }

    protected com.google.android.gms.games.c n() {
        return this.g.b();
    }

    public boolean o() {
        return this.g.c();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.g.a(i, i2, intent);
    }

    @Override // org.andengine.ui.activity.BaseGameActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = new com.google.example.games.basegameutils.a(this);
        if (this.j) {
            this.g.a(this.j, this.i);
        }
        this.g.a(this, this.h, this.o);
    }

    @Override // org.andengine.ui.activity.BaseGameActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        Log.i("FlappyBird", "Back key pressed.");
        return false;
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.g.a(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.g.d();
    }

    public void p() {
        this.g.f();
    }
}
