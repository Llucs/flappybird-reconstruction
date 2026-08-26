package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.at;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
class c extends android.support.v4.view.a {
    final /* synthetic */ DrawerLayout b;
    private final Rect c = new Rect();

    c(DrawerLayout drawerLayout) {
        this.b = drawerLayout;
    }

    private void a(android.support.v4.view.a.a aVar, android.support.v4.view.a.a aVar2) {
        Rect rect = this.c;
        aVar2.a(rect);
        aVar.b(rect);
        aVar2.c(rect);
        aVar.d(rect);
        aVar.c(aVar2.h());
        aVar.a(aVar2.p());
        aVar.b(aVar2.q());
        aVar.c(aVar2.s());
        aVar.h(aVar2.m());
        aVar.f(aVar2.k());
        aVar.a(aVar2.f());
        aVar.b(aVar2.g());
        aVar.d(aVar2.i());
        aVar.e(aVar2.j());
        aVar.g(aVar2.l());
        aVar.a(aVar2.b());
    }

    private void a(android.support.v4.view.a.a aVar, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!b(childAt)) {
                switch (at.c(childAt)) {
                    case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                        at.b(childAt, 1);
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                        if (childAt instanceof ViewGroup) {
                            a(aVar, (ViewGroup) childAt);
                        } else {
                            continue;
                        }
                        break;
                }
                aVar.b(childAt);
            }
        }
    }

    @Override // android.support.v4.view.a
    public void a(View view, android.support.v4.view.a.a aVar) {
        android.support.v4.view.a.a aVarA = android.support.v4.view.a.a.a(aVar);
        super.a(view, aVarA);
        aVar.a(view);
        Object objF = at.f(view);
        if (objF instanceof View) {
            aVar.c((View) objF);
        }
        a(aVar, aVarA);
        aVarA.t();
        a(aVar, (ViewGroup) view);
    }

    @Override // android.support.v4.view.a
    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (b(view)) {
            return false;
        }
        return super.a(viewGroup, view, accessibilityEvent);
    }

    public boolean b(View view) {
        View viewA = this.b.a();
        return (viewA == null || viewA == view) ? false : true;
    }
}
