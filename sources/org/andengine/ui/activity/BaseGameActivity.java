package org.andengine.ui.activity;

import android.os.Bundle;
import android.os.PowerManager;
import android.widget.FrameLayout;
import org.andengine.b.c.e;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.opengl.view.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGameActivity extends BaseActivity implements h, org.andengine.ui.a {
    private static /* synthetic */ int[] f;
    private PowerManager.WakeLock a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    protected org.andengine.b.a k;
    protected RenderSurfaceView l;

    protected static FrameLayout.LayoutParams B() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    static /* synthetic */ int[] C() {
        int[] iArr = f;
        if (iArr == null) {
            iArr = new int[e.valuesCustom().length];
            try {
                iArr[e.LANDSCAPE_FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[e.LANDSCAPE_SENSOR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[e.PORTRAIT_FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[e.PORTRAIT_SENSOR.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            f = iArr;
        }
        return iArr;
    }

    private void a(org.andengine.b.c.h hVar) {
        if (hVar == org.andengine.b.c.h.SCREEN_ON) {
            org.andengine.d.a.b(this);
            return;
        }
        this.a = ((PowerManager) getSystemService("power")).newWakeLock(hVar.a() | 536870912, "AndEngine");
        try {
            this.a.acquire();
        } catch (SecurityException e) {
            org.andengine.d.e.a.b("You have to add\n\t<uses-permission android:name=\"android.permission.WAKE_LOCK\"/>\nto your AndroidManifest.xml !", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        runOnUiThread(new d(this));
    }

    private void d() {
        a(this.k.d().m());
    }

    private void e() {
        if (this.a == null || !this.a.isHeld()) {
            return;
        }
        this.a.release();
    }

    private void f() {
        org.andengine.b.c.b bVarD = this.k.d();
        if (bVarD.f()) {
            org.andengine.d.a.a(this);
        }
        if (bVarD.d().c() || bVarD.d().b()) {
            setVolumeControlStream(3);
        }
        switch (C()[bVarD.g().ordinal()]) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                setRequestedOrientation(0);
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                if (!org.andengine.d.i.a.c) {
                    org.andengine.d.e.a.c(String.valueOf(e.class.getSimpleName()) + "." + e.LANDSCAPE_SENSOR + " is not supported on this device. Falling back to " + e.class.getSimpleName() + "." + e.LANDSCAPE_FIXED);
                    setRequestedOrientation(0);
                } else {
                    setRequestedOrientation(6);
                }
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                setRequestedOrientation(1);
                break;
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                if (!org.andengine.d.i.a.c) {
                    org.andengine.d.e.a.c(String.valueOf(e.class.getSimpleName()) + "." + e.PORTRAIT_SENSOR + " is not supported on this device. Falling back to " + e.class.getSimpleName() + "." + e.PORTRAIT_FIXED);
                    setRequestedOrientation(1);
                } else {
                    setRequestedOrientation(7);
                }
                break;
        }
    }

    public org.andengine.a.b.b A() {
        return this.k.j();
    }

    public org.andengine.b.a a(org.andengine.b.c.b bVar) {
        return new org.andengine.b.a(bVar);
    }

    @Override // org.andengine.opengl.view.h
    public synchronized void a(org.andengine.opengl.util.e eVar) {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onSurfaceCreated @(Thread: '" + Thread.currentThread().getName() + "')");
        if (this.c) {
            t();
            if (this.b && this.c) {
                s();
            }
        } else if (this.d) {
            this.e = true;
        } else {
            this.d = true;
            q();
        }
    }

    @Override // org.andengine.opengl.view.h
    public synchronized void a(org.andengine.opengl.util.e eVar, int i, int i2) {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onSurfaceChanged(Width=" + i + ",  Height=" + i2 + ") @(Thread: '" + Thread.currentThread().getName() + "')");
    }

    protected void b() {
        this.l = new RenderSurfaceView(this);
        this.l.a(this.k, this);
        setContentView(this.l, B());
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onCreate @(Thread: '" + Thread.currentThread().getName() + "')");
        super.onCreate(bundle);
        this.b = true;
        this.k = a(a());
        this.k.a();
        f();
        b();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onDestroy @(Thread: '" + Thread.currentThread().getName() + "')");
        super.onDestroy();
        this.k.k();
        try {
            v();
        } catch (Throwable th) {
            org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onDestroyResources failed. @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
        w();
        this.k = null;
    }

    @Override // android.app.Activity
    protected void onPause() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onPause @(Thread: '" + Thread.currentThread().getName() + "')");
        super.onPause();
        this.l.onPause();
        e();
        if (this.b) {
            return;
        }
        u();
    }

    @Override // android.app.Activity
    protected synchronized void onResume() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onResume @(Thread: '" + Thread.currentThread().getName() + "')");
        super.onResume();
        d();
        this.l.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public synchronized void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.b && this.c) {
            s();
        }
    }

    protected synchronized void q() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onCreateGame @(Thread: '" + Thread.currentThread().getName() + "')");
        c cVar = new c(this, new b(this, new a(this)));
        try {
            org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onCreateResources @(Thread: '" + Thread.currentThread().getName() + "')");
            a(cVar);
        } catch (Throwable th) {
            org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onCreateGame failed. @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
    }

    public synchronized void r() {
        this.c = true;
        if (this.e) {
            this.e = false;
            try {
                t();
            } catch (Throwable th) {
                org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onReloadResources failed. @(Thread: '" + Thread.currentThread().getName() + "')", th);
            }
        }
    }

    public synchronized void s() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onResumeGame @(Thread: '" + Thread.currentThread().getName() + "')");
        this.k.b();
        this.b = false;
    }

    public void t() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onReloadResources @(Thread: '" + Thread.currentThread().getName() + "')");
        this.k.l();
    }

    public synchronized void u() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onPauseGame @(Thread: '" + Thread.currentThread().getName() + "')");
        this.b = true;
        this.k.c();
    }

    public void v() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onDestroyResources @(Thread: '" + Thread.currentThread().getName() + "')");
        if (this.k.d().d().c()) {
            A().b();
        }
        if (this.k.d().d().b()) {
            z().b();
        }
    }

    public synchronized void w() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onGameDestroyed @(Thread: '" + Thread.currentThread().getName() + "')");
        this.c = false;
    }

    public org.andengine.b.a x() {
        return this.k;
    }

    public org.andengine.opengl.c.e y() {
        return this.k.h();
    }

    public org.andengine.a.c.c z() {
        return this.k.i();
    }
}
