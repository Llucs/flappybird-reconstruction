package com.google.android.gms.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class am extends ai implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    private WeakReference c;
    private boolean d;

    protected am(r rVar, int i) {
        super(rVar, i);
        this.d = false;
    }

    private void b(View view) {
        Display display;
        int displayId = -1;
        if (p.e() && (display = view.getDisplay()) != null) {
            displayId = display.getDisplayId();
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        this.b.c = displayId;
        this.b.a = windowToken;
        this.b.d = iArr[0];
        this.b.e = iArr[1];
        this.b.f = iArr[0] + width;
        this.b.g = iArr[1] + height;
        if (this.d) {
            a();
            this.d = false;
        }
    }

    @Override // com.google.android.gms.internal.ai
    public void a() {
        if (this.b.a != null) {
            super.a();
        } else {
            this.d = this.c != null;
        }
    }

    @Override // com.google.android.gms.internal.ai
    protected void a(int i) {
        this.b = new al(i, null);
    }

    @Override // com.google.android.gms.internal.ai
    public void a(View view) {
        this.a.g();
        if (this.c != null) {
            View decorView = (View) this.c.get();
            Context contextJ = this.a.j();
            if (decorView == null && (contextJ instanceof Activity)) {
                decorView = ((Activity) contextJ).getWindow().getDecorView();
            }
            if (decorView != null) {
                decorView.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                if (p.d()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        this.c = null;
        Context contextJ2 = this.a.j();
        if (view == null && (contextJ2 instanceof Activity)) {
            View viewFindViewById = ((Activity) contextJ2).findViewById(R.id.content);
            if (viewFindViewById == null) {
                viewFindViewById = ((Activity) contextJ2).getWindow().getDecorView();
            }
            w.a("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
            view = viewFindViewById;
        }
        if (view == null) {
            w.b("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
            return;
        }
        b(view);
        this.c = new WeakReference(view);
        view.addOnAttachStateChangeListener(this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        View view;
        if (this.c == null || (view = (View) this.c.get()) == null) {
            return;
        }
        b(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        b(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.a.g();
        view.removeOnAttachStateChangeListener(this);
    }
}
