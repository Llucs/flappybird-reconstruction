package com.google.ads.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.gesture.GestureStore;
import android.gesture.Prediction;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ah implements GestureOverlayView.OnGesturePerformedListener {
    private final GestureStore a;
    private Activity b;
    private w c;

    public ah(Activity activity, w wVar, GestureStore gestureStore) {
        this.b = activity;
        this.c = wVar;
        this.a = gestureStore;
    }

    @Override // android.gesture.GestureOverlayView.OnGesturePerformedListener
    public void onGesturePerformed(GestureOverlayView gestureOverlayView, Gesture gesture) {
        ArrayList<Prediction> arrayListRecognize = this.a.recognize(gesture);
        for (Prediction prediction : arrayListRecognize) {
            com.google.ads.util.g.a("Gesture: '" + prediction.name + "' = " + prediction.score);
        }
        if (arrayListRecognize.size() == 0) {
            com.google.ads.util.g.a("Gesture: No remotely reasonable predictions");
        } else {
            if (arrayListRecognize.get(0).score <= 2.0d || !"debug".equals(arrayListRecognize.get(0).name) || this.c == null) {
                return;
            }
            String strB = this.c.b() == null ? "[No diagnostics available]" : this.c.b();
            new AlertDialog.Builder(this.b).setMessage(strB).setTitle("Ad Information").setPositiveButton("Share", new ak(this, strB)).setNeutralButton("Report", new aj(this)).setNegativeButton("Close", new ai(this)).create().show();
        }
    }
}
