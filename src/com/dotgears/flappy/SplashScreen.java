package com.dotgears.flappy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.dotgears.flappybird.R;

public class SplashScreen extends Activity {
    private static int SPLASH_DELAY = 2000;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new SplashTransition(this), SPLASH_DELAY);
    }
}
