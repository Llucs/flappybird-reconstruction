package com.google.analytics.tracking.android;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class CampaignTrackingService extends IntentService {
    public CampaignTrackingService() {
        super("CampaignIntentService");
    }

    public void a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("gaInstallData", 0);
            fileOutputStreamOpenFileOutput.write(stringExtra.getBytes());
            fileOutputStreamOpenFileOutput.close();
        } catch (IOException e) {
            b.a("Error storing install campaign.");
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        a(this, intent);
    }
}
