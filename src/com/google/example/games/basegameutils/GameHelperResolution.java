package com.google.example.games.basegameutils;

import android.app.Activity;

public final class GameHelperResolution {
    private final ConnectionFailureInfo failure;
    private boolean started;

    public GameHelperResolution(final ConnectionFailureInfo failure) {
        this.failure = failure;
    }

    public boolean hasResolution() {
        return this.failure != null && this.failure.getServiceErrorCode() != 0;
    }

    public void start(final Activity activity, final int requestCode) {
        if (!hasResolution() || activity == null || this.started) {
            return;
        }
        this.started = true;
    }

    public boolean isStarted() {
        return this.started;
    }

    public ConnectionFailureInfo getFailure() {
        return this.failure;
    }
}
