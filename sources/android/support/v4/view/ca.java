package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
class ca extends a {
    final /* synthetic */ ViewPager b;

    ca(ViewPager viewPager) {
        this.b = viewPager;
    }

    private boolean b() {
        return this.b.h != null && this.b.h.a() > 1;
    }

    @Override // android.support.v4.view.a
    public void a(View view, android.support.v4.view.a.a aVar) {
        super.a(view, aVar);
        aVar.b(ViewPager.class.getName());
        aVar.i(b());
        if (this.b.canScrollHorizontally(1)) {
            aVar.a(4096);
        }
        if (this.b.canScrollHorizontally(-1)) {
            aVar.a(8192);
        }
    }

    @Override // android.support.v4.view.a
    public boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.b.canScrollHorizontally(1)) {
                    return false;
                }
                this.b.setCurrentItem(this.b.i + 1);
                return true;
            case 8192:
                if (!this.b.canScrollHorizontally(-1)) {
                    return false;
                }
                this.b.setCurrentItem(this.b.i - 1);
                return true;
            default:
                return false;
        }
    }

    @Override // android.support.v4.view.a
    public void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        android.support.v4.view.a.x xVarA = android.support.v4.view.a.x.a();
        xVarA.a(b());
        if (accessibilityEvent.getEventType() != 4096 || this.b.h == null) {
            return;
        }
        xVarA.a(this.b.h.a());
        xVarA.b(this.b.i);
        xVarA.c(this.b.i);
    }
}
