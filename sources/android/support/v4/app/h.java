package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
class h extends Handler {
    final /* synthetic */ FragmentActivity a;

    h(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (message.what) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                if (this.a.f) {
                    this.a.a(false);
                }
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                this.a.a();
                this.a.b.e();
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }
}
