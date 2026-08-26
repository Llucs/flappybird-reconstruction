package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
class av implements Runnable {
    private final WeakReference a;
    private final SharedPreferences.Editor b;

    public av(Activity activity) {
        this(activity, null);
    }

    av(Activity activity, SharedPreferences.Editor editor) {
        this.a = new WeakReference(activity);
        this.b = editor;
    }

    private SharedPreferences.Editor a(Context context) {
        return this.b == null ? PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit() : this.b;
    }

    @Override // java.lang.Runnable
    public void run() {
        String string;
        try {
            Activity activity = (Activity) this.a.get();
            if (activity == null) {
                com.google.ads.util.g.a("Activity was null while making a doritos cookie request.");
                return;
            }
            Cursor cursorQuery = activity.getContentResolver().query(as.a, as.b, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst() || cursorQuery.getColumnNames().length <= 0) {
                com.google.ads.util.g.a("Google+ app not installed, not storing doritos cookie");
                string = null;
            } else {
                string = cursorQuery.getString(cursorQuery.getColumnIndex(cursorQuery.getColumnName(0)));
            }
            SharedPreferences.Editor editorA = a(activity);
            if (TextUtils.isEmpty(string)) {
                editorA.putString("drt", "");
                editorA.putLong("drt_ts", 0L);
            } else {
                editorA.putString("drt", string);
                editorA.putLong("drt_ts", new Date().getTime());
            }
            editorA.commit();
        } catch (Throwable th) {
            com.google.ads.util.g.d("An unknown error occurred while sending a doritos request.", th);
        }
    }
}
