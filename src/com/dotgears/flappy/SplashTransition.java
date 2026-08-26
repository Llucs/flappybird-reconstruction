package com.dotgears.flappy;

import android.content.Intent;

import com.dotgears.GameActivity;

final class SplashTransition implements Runnable {
    private final SplashScreen splashScreen;

    SplashTransition(final SplashScreen splashScreen) {
        this.splashScreen = splashScreen;
    }

    @Override
    public void run() {
        this.splashScreen.startActivity(new Intent(this.splashScreen, GameActivity.class));
        this.splashScreen.finish();
    }
}
