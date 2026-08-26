package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener {
    private static final android.support.v4.b.l P = new android.support.v4.b.l();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean F;
    int G;
    ViewGroup H;
    View I;
    View J;
    boolean K;
    z M;
    boolean N;
    boolean O;
    View b;
    int c;
    Bundle d;
    SparseArray e;
    String g;
    Bundle h;
    Fragment i;
    int k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    o s;
    FragmentActivity t;
    o u;
    Fragment v;
    int w;
    int x;
    String y;
    boolean z;
    int a = 0;
    int f = -1;
    int j = -1;
    boolean E = true;
    boolean L = true;

    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new g();
        final Bundle a;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.a = parcel.readBundle();
            if (classLoader == null || this.a == null) {
                return;
            }
            this.a.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }
    }

    public static Fragment a(Context context, String str) {
        return a(context, str, (Bundle) null);
    }

    public static Fragment a(Context context, String str, Bundle bundle) {
        try {
            Class<?> clsLoadClass = (Class) P.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                P.put(str, clsLoadClass);
            }
            Fragment fragment = (Fragment) clsLoadClass.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.h = bundle;
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        }
    }

    static boolean b(Context context, String str) {
        try {
            Class<?> clsLoadClass = (Class) P.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                P.put(str, clsLoadClass);
            }
            return Fragment.class.isAssignableFrom(clsLoadClass);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public Animation a(int i, boolean z, int i2) {
        return null;
    }

    public void a(int i, int i2, Intent intent) {
    }

    final void a(int i, Fragment fragment) {
        this.f = i;
        if (fragment != null) {
            this.g = fragment.g + ":" + this.f;
        } else {
            this.g = "android:fragment:" + this.f;
        }
    }

    public void a(Activity activity) {
        this.F = true;
    }

    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
    }

    void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.u != null) {
            this.u.a(configuration);
        }
    }

    final void a(Bundle bundle) {
        if (this.e != null) {
            this.J.restoreHierarchyState(this.e);
            this.e = null;
        }
        this.F = false;
        e(bundle);
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void a(Menu menu) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    public void a(View view, Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mTag=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mIndex=");
        printWriter.print(this.f);
        printWriter.print(" mWho=");
        printWriter.print(this.g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mResumed=");
        printWriter.print(this.n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mRetaining=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.L);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.s);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mActivity=");
            printWriter.println(this.t);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.v);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.h);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.d);
        }
        if (this.e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.e);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.k);
        }
        if (this.G != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.I);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.b);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.c);
        }
        if (this.M != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.M.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.u + ":");
            this.u.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public void a(boolean z) {
    }

    final boolean a() {
        return this.r > 0;
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    public final FragmentActivity b() {
        return this.t;
    }

    public LayoutInflater b(Bundle bundle) {
        return this.t.getLayoutInflater();
    }

    View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.u != null) {
            this.u.i();
        }
        return a(layoutInflater, viewGroup, bundle);
    }

    public void b(Menu menu) {
    }

    boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z = true;
            a(menu, menuInflater);
        }
        return this.u != null ? z | this.u.a(menu, menuInflater) : z;
    }

    public boolean b(MenuItem menuItem) {
        return false;
    }

    public final Resources c() {
        if (this.t == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        return this.t.getResources();
    }

    public void c(Bundle bundle) {
        this.F = true;
    }

    boolean c(Menu menu) {
        boolean z = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z = true;
            a(menu);
        }
        return this.u != null ? z | this.u.a(menu) : z;
    }

    boolean c(MenuItem menuItem) {
        if (!this.z) {
            if (this.D && this.E && a(menuItem)) {
                return true;
            }
            if (this.u != null && this.u.a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void d(Bundle bundle) {
        this.F = true;
    }

    void d(Menu menu) {
        if (this.z) {
            return;
        }
        if (this.D && this.E) {
            b(menu);
        }
        if (this.u != null) {
            this.u.b(menu);
        }
    }

    public final boolean d() {
        return this.A;
    }

    boolean d(MenuItem menuItem) {
        if (!this.z) {
            if (b(menuItem)) {
                return true;
            }
            if (this.u != null && this.u.b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e() {
        this.F = true;
        if (this.N) {
            return;
        }
        this.N = true;
        if (!this.O) {
            this.O = true;
            this.M = this.t.a(this.g, this.N, false);
        }
        if (this.M != null) {
            this.M.b();
        }
    }

    public void e(Bundle bundle) {
        this.F = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f() {
        this.F = true;
    }

    public void f(Bundle bundle) {
    }

    public void g() {
        this.F = true;
    }

    void g(Bundle bundle) {
        Parcelable parcelable;
        if (this.u != null) {
            this.u.i();
        }
        this.F = false;
        c(bundle);
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onCreate()");
        }
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        if (this.u == null) {
            n();
        }
        this.u.a(parcelable, (ArrayList) null);
        this.u.j();
    }

    public void h() {
        this.F = true;
    }

    void h(Bundle bundle) {
        if (this.u != null) {
            this.u.i();
        }
        this.F = false;
        d(bundle);
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        if (this.u != null) {
            this.u.k();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i() {
        this.F = true;
    }

    void i(Bundle bundle) {
        Parcelable parcelableH;
        f(bundle);
        if (this.u == null || (parcelableH = this.u.h()) == null) {
            return;
        }
        bundle.putParcelable("android:support:fragments", parcelableH);
    }

    public void j() {
        this.F = true;
        if (!this.O) {
            this.O = true;
            this.M = this.t.a(this.g, this.N, false);
        }
        if (this.M != null) {
            this.M.h();
        }
    }

    void k() {
        this.f = -1;
        this.g = null;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = 0;
        this.s = null;
        this.t = null;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.z = false;
        this.A = false;
        this.C = false;
        this.M = null;
        this.N = false;
        this.O = false;
    }

    public void l() {
        this.F = true;
    }

    public void m() {
    }

    void n() {
        this.u = new o();
        this.u.a(this.t, new e(this), this);
    }

    void o() {
        if (this.u != null) {
            this.u.i();
            this.u.e();
        }
        this.F = false;
        e();
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.u != null) {
            this.u.l();
        }
        if (this.M != null) {
            this.M.g();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        b().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.F = true;
    }

    void p() {
        if (this.u != null) {
            this.u.i();
            this.u.e();
        }
        this.F = false;
        f();
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onResume()");
        }
        if (this.u != null) {
            this.u.m();
            this.u.e();
        }
    }

    void q() {
        onLowMemory();
        if (this.u != null) {
            this.u.s();
        }
    }

    void r() {
        if (this.u != null) {
            this.u.n();
        }
        this.F = false;
        g();
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void s() {
        if (this.u != null) {
            this.u.o();
        }
        this.F = false;
        h();
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void t() {
        if (this.u != null) {
            this.u.p();
        }
        if (this.N) {
            this.N = false;
            if (!this.O) {
                this.O = true;
                this.M = this.t.a(this.g, this.N, false);
            }
            if (this.M != null) {
                if (this.t.h) {
                    this.M.d();
                } else {
                    this.M.c();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        android.support.v4.b.d.a(this, sb);
        if (this.f >= 0) {
            sb.append(" #");
            sb.append(this.f);
        }
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" ");
            sb.append(this.y);
        }
        sb.append('}');
        return sb.toString();
    }

    void u() {
        if (this.u != null) {
            this.u.q();
        }
        this.F = false;
        i();
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        if (this.M != null) {
            this.M.f();
        }
    }

    void v() {
        if (this.u != null) {
            this.u.r();
        }
        this.F = false;
        j();
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }
}
