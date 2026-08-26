package com.google.example.games.basegameutils;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.games.f;
import com.google.android.gms.games.multiplayer.Invitation;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.google.android.gms.common.c, com.google.android.gms.common.d {
    public static final String[] a = {"UNCONFIGURED", "DISCONNECTED", "CONNECTING", "CONNECTED"};
    Activity d;
    String[] e;
    String r;
    int b = 0;
    boolean c = false;
    com.google.android.gms.games.c f = null;
    com.google.android.gms.plus.b g = null;
    com.google.android.gms.a.a h = null;
    int i = 0;
    int j = 0;
    int k = 0;
    boolean l = true;
    boolean m = false;
    com.google.android.gms.common.a n = null;
    c o = null;
    boolean p = false;
    String q = "GameHelper";
    b s = null;

    public a(Activity activity) {
        this.d = null;
        this.d = activity;
    }

    static String b(int i) {
        switch (i) {
            case -1:
                return "RESULT_OK";
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                return "RESULT_CANCELED";
            case 10001:
                return "RESULT_RECONNECT_REQUIRED";
            case 10002:
                return "SIGN_IN_FAILED";
            case 10003:
                return "RESULT_LICENSE_FAILED";
            case 10004:
                return "RESULT_APP_MISCONFIGURED";
            case 10005:
                return "RESULT_LEFT_ROOM";
            default:
                return String.valueOf(i);
        }
    }

    static String c(int i) {
        switch (i) {
            case com.google.android.gms.e.MapAttrs_mapType /* 0 */:
                return "SUCCESS(" + i + ")";
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                return "SERVICE_MISSING(" + i + ")";
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                return "SERVICE_VERSION_UPDATE_REQUIRED(" + i + ")";
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                return "SERVICE_DISABLED(" + i + ")";
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                return "SIGN_IN_REQUIRED(" + i + ")";
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                return "INVALID_ACCOUNT(" + i + ")";
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                return "RESOLUTION_REQUIRED(" + i + ")";
            case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                return "NETWORK_ERROR(" + i + ")";
            case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                return "INTERNAL_ERROR(" + i + ")";
            case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                return "SERVICE_INVALID(" + i + ")";
            case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                return "DEVELOPER_ERROR(" + i + ")";
            case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                return "LICENSE_CHECK_FAILED(" + i + ")";
            default:
                return "Unknown error code " + i;
        }
    }

    @Override // com.google.android.gms.common.c
    public void a() {
        c("onDisconnected.");
        if (this.b == 1) {
            c("onDisconnected is expected, so no action taken.");
            return;
        }
        d("Unexpectedly disconnected. Severing remaining connections.");
        e();
        this.o = null;
        c("Making extraordinary call to onSignInFailed callback");
        a(false);
    }

    void a(int i) {
        String str = a[this.b];
        String str2 = a[i];
        this.b = i;
        c("State change " + str + " -> " + str2);
    }

    public void a(int i, int i2, Intent intent) {
        c("onActivityResult: req=" + (i == 9001 ? "RC_RESOLVE" : String.valueOf(i)) + ", resp=" + b(i2));
        if (i != 9001) {
            c("onActivityResult: request code not meant for us. Ignoring.");
            return;
        }
        this.c = false;
        if (this.b != 2) {
            c("onActivityResult: ignoring because state isn't STATE_CONNECTING (it's " + a[this.b] + ")");
            return;
        }
        if (i2 == -1) {
            c("onAR: Resolution was RESULT_OK, so connecting current client again.");
            j();
            return;
        }
        if (i2 == 10001) {
            c("onAR: Resolution was RECONNECT_REQUIRED, so reconnecting.");
            j();
        } else {
            if (i2 != 0) {
                c("onAR: responseCode=" + b(i2) + ", so giving up.");
                a(new c(this.n.b(), i2));
                return;
            }
            c("onAR: Got a cancellation result, so disconnecting.");
            this.l = false;
            this.m = false;
            this.o = null;
            e();
            a(false);
        }
    }

    public void a(Activity activity) {
        this.d = activity;
        c("onStart, state = " + a[this.b]);
        a("onStart");
        switch (this.b) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                if (!this.l) {
                    c("onStart: Not connecting (user specifically signed out).");
                    return;
                } else {
                    c("onStart: Now connecting clients.");
                    h();
                    return;
                }
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                c("onStart: connection process in progress, no action taken.");
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                c("onStart: already connected (unusual, but ok).");
                return;
            default:
                String str = "onStart: BUG: unexpected state " + a[this.b];
                e(str);
                throw new IllegalStateException(str);
        }
    }

    @Override // com.google.android.gms.common.c
    public void a(Bundle bundle) {
        c("onConnected: connected! client=" + this.k);
        this.j |= this.k;
        c("Connected clients updated to: " + this.j);
        if (this.k == 1 && bundle != null) {
            c("onConnected: connection hint provided. Checking for invite.");
            Invitation invitation = (Invitation) bundle.getParcelable("invitation");
            if (invitation != null && invitation.c() != null) {
                c("onConnected: connection hint has a room invite!");
                this.r = invitation.c();
                c("Invitation ID: " + this.r);
            }
            c("onConnected: connection hint provided. Checking for TBMP game.");
        }
        i();
    }

    @Override // com.google.android.gms.common.d
    public void a(com.google.android.gms.common.a aVar) {
        c("onConnectionFailed");
        this.n = aVar;
        c("Connection failure:");
        c("   - code: " + c(this.n.b()));
        c("   - resolvable: " + this.n.a());
        c("   - details: " + this.n.toString());
        if (this.m) {
            c("onConnectionFailed: since user initiated sign-in, resolving problem.");
            l();
        } else {
            c("onConnectionFailed: since user didn't initiate sign-in, failing now.");
            this.n = aVar;
            a(1);
            a(false);
        }
    }

    public void a(b bVar, int i, String... strArr) {
        if (this.b != 0) {
            e("GameHelper: you called GameHelper.setup() twice. You can only call it once.");
            throw new IllegalStateException("GameHelper: you called GameHelper.setup() twice. You can only call it once.");
        }
        this.s = bVar;
        this.i = i;
        c("Setup: requested clients: " + this.i);
        Vector vector = new Vector();
        if ((i & 1) != 0) {
            vector.add("https://www.googleapis.com/auth/games");
        }
        if ((i & 2) != 0) {
            vector.add("https://www.googleapis.com/auth/plus.login");
        }
        if ((i & 4) != 0) {
            vector.add("https://www.googleapis.com/auth/appstate");
        }
        if (strArr != null) {
            for (String str : strArr) {
                vector.add(str);
            }
        }
        this.e = new String[vector.size()];
        vector.copyInto(this.e);
        c("setup: scopes:");
        for (String str2 : this.e) {
            c("  - " + str2);
        }
        if ((i & 1) != 0) {
            c("setup: creating GamesClient");
            this.f = new f(g(), this, this).a(49).a(this.e).a();
        }
        if ((i & 2) != 0) {
            c("setup: creating GamesPlusClient");
            this.g = new com.google.android.gms.plus.c(g(), this, this).a(this.e).a();
        }
        if ((i & 4) != 0) {
            c("setup: creating AppStateClient");
            this.h = new com.google.android.gms.a.c(g(), this, this).a(this.e).a();
        }
        a(1);
    }

    void a(c cVar) {
        a(1002, "giveUp", "giveUp should only be called when connecting. Proceeding anyway.", 2);
        this.l = false;
        e();
        this.o = cVar;
        m();
        a(false);
    }

    void a(String str) {
        if (this.b == 0) {
            String str2 = "GameHelper error: Operation attempted without setup: " + str + ". The setup() method must be called before attempting any other operation.";
            e(str2);
            throw new IllegalStateException(str2);
        }
    }

    void a(StringBuilder sb, byte b) {
        int i = b;
        if (b < 0) {
            i = b + 256;
        }
        int i2 = i / 16;
        int i3 = i % 16;
        sb.append("0123456789ABCDEF".substring(i2, i2 + 1));
        sb.append("0123456789ABCDEF".substring(i3, i3 + 1));
    }

    void a(boolean z) {
        c("Notifying LISTENER of sign-in " + (z ? "SUCCESS" : this.o != null ? "FAILURE (error)" : "FAILURE (no error)"));
        if (this.s != null) {
            if (z) {
                this.s.k();
            } else {
                this.s.j();
            }
        }
    }

    public void a(boolean z, String str) {
        this.p = z;
        this.q = str;
        if (z) {
            c("Debug log enabled, tag: " + str);
        }
    }

    boolean a(int i, String str, String str2, int... iArr) {
        for (int i2 : iArr) {
            if (this.b == i2) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i == 1001) {
            sb.append("GameHelper: you attempted an operation at an invalid. ");
        } else {
            sb.append("GameHelper: bug detected. Please report it at our bug tracker ");
            sb.append("https://github.com/playgameservices/android-samples/issues. ");
            sb.append("Please include the last couple hundred lines of logcat output ");
            sb.append("and describe the operation that caused this. ");
        }
        sb.append("Explanation: ").append(str2);
        sb.append("Operation: ").append(str).append(". ");
        sb.append("State: ").append(a[this.b]).append(". ");
        if (iArr.length == 1) {
            sb.append("Expected state: ").append(a[iArr[0]]).append(".");
        } else {
            sb.append("Expected states:");
            for (int i3 : iArr) {
                sb.append(" ").append(a[i3]);
            }
            sb.append(".");
        }
        d(sb.toString());
        return false;
    }

    Dialog b(String str) {
        return new AlertDialog.Builder(g()).setMessage(str).setNeutralButton(R.string.ok, (DialogInterface.OnClickListener) null).create();
    }

    public com.google.android.gms.games.c b() {
        if (this.f == null) {
            throw new IllegalStateException("No GamesClient. Did you request it at setup?");
        }
        return this.f;
    }

    void c(String str) {
        if (this.p) {
            Log.d(this.q, "GameHelper: " + str);
        }
    }

    public boolean c() {
        return this.b == 3;
    }

    public void d() {
        c("onStop, state = " + a[this.b]);
        a("onStop");
        switch (this.b) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                c("onStop: not connected, so no action taken.");
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                c("onStop: Killing connections");
                e();
                break;
            default:
                String str = "onStop: BUG: unexpected state " + a[this.b];
                e(str);
                throw new IllegalStateException(str);
        }
        this.d = null;
    }

    void d(String str) {
        Log.w(this.q, "!!! GameHelper WARNING: " + str);
    }

    void e() {
        if (a(1002, "killConnections", "killConnections() should only get called while connected or connecting.", 3, 2)) {
            c("killConnections: killing connections.");
            this.n = null;
            this.o = null;
            if (this.f != null && this.f.b()) {
                c("Disconnecting GamesClient.");
                this.f.c();
            }
            if (this.g != null && this.g.b()) {
                c("Disconnecting PlusClient.");
                this.g.c();
            }
            if (this.h != null && this.h.b()) {
                c("Disconnecting AppStateClient.");
                this.h.c();
            }
            this.j = 0;
            c("killConnections: all clients disconnected.");
            a(1);
        }
    }

    void e(String str) {
        Log.e(this.q, "*** GameHelper ERROR: " + str);
    }

    public void f() {
        if (this.b == 3) {
            d("beginUserInitiatedSignIn() called when already connected. Calling listener directly to notify of success.");
            a(true);
            return;
        }
        if (this.b == 2) {
            d("beginUserInitiatedSignIn() called when already connecting. Be patient! You can only call this method after you get an onSignInSucceeded() or onSignInFailed() callback. Suggestion: disable the sign-in button on startup and also when it's clicked, and re-enable when you get the callback.");
            return;
        }
        c("Starting USER-INITIATED sign-in flow.");
        this.l = true;
        int iA = com.google.android.gms.common.f.a(g());
        c("isGooglePlayServicesAvailable returned " + iA);
        if (iA != 0) {
            c("Google Play services not available. Show error dialog.");
            this.o = new c(iA, 0);
            m();
            a(false);
            return;
        }
        this.m = true;
        if (this.n == null) {
            c("beginUserInitiatedSignIn: starting new sign-in flow.");
            h();
        } else {
            c("beginUserInitiatedSignIn: continuing pending sign-in flow.");
            a(2);
            l();
        }
    }

    Context g() {
        return this.d;
    }

    void h() {
        if (a(1002, "startConnections", "startConnections should only get called when disconnected.", 1)) {
            c("Starting connections.");
            a(2);
            this.r = null;
            i();
        }
    }

    void i() {
        c("connectNextClient: requested clients: " + this.i + ", connected clients: " + this.j);
        if (this.f != null && this.f.b() && (this.j & 1) == 0) {
            d("GamesClient was already connected. Fixing.");
            this.j |= 1;
        }
        if (this.g != null && this.g.b() && (this.j & 2) == 0) {
            d("PlusClient was already connected. Fixing.");
            this.j |= 2;
        }
        if (this.h != null && this.h.b() && (this.j & 4) == 0) {
            d("AppStateClient was already connected. Fixing");
            this.j |= 4;
        }
        int i = this.i & (this.j ^ (-1));
        c("Pending clients: " + i);
        if (i == 0) {
            c("All clients now connected. Sign-in successful!");
            k();
            return;
        }
        if (this.f != null && (i & 1) != 0) {
            c("Connecting GamesClient.");
            this.k = 1;
        } else if (this.g != null && (i & 2) != 0) {
            c("Connecting PlusClient.");
            this.k = 2;
        } else {
            if (this.h == null || (i & 4) == 0) {
                throw new AssertionError("Not all clients connected, yet no one is next. R=" + this.i + ", C=" + this.j);
            }
            c("Connecting AppStateClient.");
            this.k = 4;
        }
        j();
    }

    void j() {
        if (this.b == 1) {
            d("GameHelper got disconnected during connection process. Aborting.");
        }
        if (a(1002, "connectCurrentClient", "connectCurrentClient should only get called when connecting.", 2)) {
            switch (this.k) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    this.f.a();
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    this.g.a();
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    this.h.a();
                    break;
            }
        }
    }

    void k() {
        a(1002, "succeedSignIn", "succeedSignIn should only get called in the connecting or connected state. Proceeding anyway.", 2, 3);
        c("All requested clients connected. Sign-in succeeded!");
        a(3);
        this.o = null;
        this.l = true;
        this.m = false;
        a(true);
    }

    void l() {
        a(1002, "resolveConnectionResult", "resolveConnectionResult should only be called when connecting. Proceeding anyway.", 2);
        if (this.c) {
            c("We're already expecting the result of a previous resolution.");
            return;
        }
        c("resolveConnectionResult: trying to resolve result: " + this.n);
        if (!this.n.a()) {
            c("resolveConnectionResult: result has no resolution. Giving up.");
            a(new c(this.n.b()));
            return;
        }
        c("Result has resolution. Starting it.");
        try {
            this.c = true;
            this.n.a(this.d, 9001);
        } catch (IntentSender.SendIntentException e) {
            c("SendIntentException, so connecting again.");
            j();
        }
    }

    void m() {
        Dialog dialogB;
        Context contextG = g();
        if (contextG == null) {
            c("*** No context. Can't show failure dialog.");
            return;
        }
        c("Making error dialog for failure: " + this.o);
        int iA = this.o.a();
        switch (this.o.b()) {
            case 10002:
                dialogB = b(contextG.getString(e.gamehelper_sign_in_failed));
                break;
            case 10003:
                dialogB = b(contextG.getString(e.gamehelper_license_failed));
                break;
            case 10004:
                dialogB = b(contextG.getString(e.gamehelper_app_misconfigured));
                n();
                break;
            default:
                dialogB = com.google.android.gms.common.f.a(iA, this.d, 9002, null);
                if (dialogB == null) {
                    c("No standard error dialog available. Making fallback dialog.");
                    dialogB = b(String.valueOf(contextG.getString(e.gamehelper_unknown_error)) + " " + c(iA));
                }
                break;
        }
        c("Showing error dialog.");
        dialogB.show();
    }

    void n() {
        c("****");
        c("****");
        c("**** APP NOT CORRECTLY CONFIGURED TO USE GOOGLE PLAY GAME SERVICES");
        c("**** This is usually caused by one of these reasons:");
        c("**** (1) Your package name and certificate fingerprint do not match");
        c("****     the client ID you registered in Developer Console.");
        c("**** (2) Your App ID was incorrectly entered.");
        c("**** (3) Your game settings have not been published and you are ");
        c("****     trying to log in with an account that is not listed as");
        c("****     a test account.");
        c("****");
        if (g() == null) {
            c("*** (no Context, so can't print more debug info)");
            return;
        }
        c("**** To help you debug, here is the information about this app");
        c("**** Package name         : " + g().getPackageName());
        c("**** Cert SHA1 fingerprint: " + p());
        c("**** App ID from          : " + o());
        c("****");
        c("**** Check that the above information matches your setup in ");
        c("**** Developer Console. Also, check that you're logging in with the");
        c("**** right account (it should be listed in the Testers section if");
        c("**** your project is not yet published).");
        c("****");
        c("**** For more information, refer to the troubleshooting guide:");
        c("****   http://developers.google.com/games/services/android/troubleshooting");
    }

    String o() {
        try {
            Resources resources = g().getResources();
            return resources.getString(resources.getIdentifier("app_id", "string", g().getPackageName()));
        } catch (Exception e) {
            e.printStackTrace();
            return "??? (failed to retrieve APP ID)";
        }
    }

    String p() {
        try {
            Signature[] signatureArr = g().getPackageManager().getPackageInfo(g().getPackageName(), 64).signatures;
            if (signatureArr.length == 0) {
                return "ERROR: NO SIGNATURE.";
            }
            if (signatureArr.length > 1) {
                return "ERROR: MULTIPLE SIGNATURES";
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArrDigest.length; i++) {
                if (i > 0) {
                    sb.append(":");
                }
                a(sb, bArrDigest[i]);
            }
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "(ERROR: package not found)";
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "(ERROR: SHA1 algorithm not found)";
        }
    }
}
