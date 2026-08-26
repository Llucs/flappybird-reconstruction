package com.google.ads.a;

import android.app.Activity;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class c extends FrameLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    private static final h b = (h) h.a.b();
    public MediaController a;
    private final WeakReference c;
    private final e d;
    private long e;
    private final VideoView f;
    private String g;

    public c(Activity activity, e eVar) {
        super(activity);
        this.c = new WeakReference(activity);
        this.d = eVar;
        this.f = new VideoView(activity);
        addView(this.f, new FrameLayout.LayoutParams(-1, -1, 17));
        this.a = null;
        this.g = null;
        this.e = 0L;
        a();
        this.f.setOnCompletionListener(this);
        this.f.setOnPreparedListener(this);
        this.f.setOnErrorListener(this);
    }

    protected void a() {
        new d(this).a();
    }

    public void a(int i) {
        this.f.seekTo(i);
    }

    public void a(MotionEvent motionEvent) {
        this.f.onTouchEvent(motionEvent);
    }

    public void b() {
        if (TextUtils.isEmpty(this.g)) {
            b.a(this.d, "onVideoEvent", "{'event': 'error', 'what': 'no_src'}");
        } else {
            this.f.setVideoPath(this.g);
        }
    }

    public void c() {
        this.f.pause();
    }

    public void d() {
        this.f.start();
    }

    public void e() {
        this.f.stopPlayback();
    }

    void f() {
        long currentPosition = this.f.getCurrentPosition();
        if (this.e != currentPosition) {
            b.a(this.d, "onVideoEvent", "{'event': 'timeupdate', 'time': " + (currentPosition / 1000.0f) + "}");
            this.e = currentPosition;
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        b.a(this.d, "onVideoEvent", "{'event': 'ended'}");
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        com.google.ads.util.g.e("Video threw error! <what:" + i + ", extra:" + i2 + ">");
        b.a(this.d, "onVideoEvent", "{'event': 'error', 'what': '" + i + "', 'extra': '" + i2 + "'}");
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        b.a(this.d, "onVideoEvent", "{'event': 'canplaythrough', 'duration': '" + (this.f.getDuration() / 1000.0f) + "'}");
    }

    public void setMediaControllerEnabled(boolean z) {
        Activity activity = (Activity) this.c.get();
        if (activity == null) {
            com.google.ads.util.g.e("adActivity was null while trying to enable controls on a video.");
            return;
        }
        if (z) {
            if (this.a == null) {
                this.a = new MediaController(activity);
            }
            this.f.setMediaController(this.a);
        } else {
            if (this.a != null) {
                this.a.hide();
            }
            this.f.setMediaController(null);
        }
    }

    public void setSrc(String str) {
        this.g = str;
    }
}
