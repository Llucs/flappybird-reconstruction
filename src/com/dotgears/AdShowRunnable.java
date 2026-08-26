package com.dotgears;

final class AdShowRunnable implements Runnable {
    final GameActivity activity;

    AdShowRunnable(final GameActivity activity) {
        this.activity = activity;
    }

    @Override
    public void run() {
        this.activity.adView.setVisibility(0);
    }
}
