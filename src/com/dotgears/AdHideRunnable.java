package com.dotgears;

final class AdHideRunnable implements Runnable {
    final GameActivity activity;

    AdHideRunnable(final GameActivity activity) {
        this.activity = activity;
    }

    @Override
    public void run() {
        this.activity.adView.setVisibility(4);
    }
}
