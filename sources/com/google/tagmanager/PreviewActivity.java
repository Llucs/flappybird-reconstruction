package com.google.tagmanager;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class PreviewActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            i.c("Preview activity");
            Uri data = getIntent().getData();
            if (r.a(this).a(data)) {
                Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                if (launchIntentForPackage != null) {
                    i.c("Invoke the launch activity for package name: " + getPackageName());
                    startActivity(launchIntentForPackage);
                } else {
                    i.c("No launch activity found for package name: " + getPackageName());
                }
            } else {
                i.b("Cannot preview the app with the uri: " + data);
            }
        } catch (Exception e) {
            i.a("Calling preview threw an exception: " + e.getMessage());
        }
    }
}
