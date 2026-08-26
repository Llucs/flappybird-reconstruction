package com.google.example.games.basegameutils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public abstract class BaseGameActivity extends FragmentActivity implements GameHelperListener {
    private String[] requestedScopes;
    protected int requestedClients = 1;
    protected String gameHelperTag = "BaseGameActivity";
    protected boolean enableGameHelper = false;
    protected GameHelper gameHelper = new GameHelper(this);

    protected BaseGameActivity() {
    }

    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.gameHelper.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.gameHelper = new GameHelper(this);
        if (this.enableGameHelper) {
            this.gameHelper.setDebugLog(this.enableGameHelper, this.gameHelperTag);
        }
        this.gameHelper.setup(this, this.requestedClients, this.requestedScopes);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.gameHelper.onStart(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.gameHelper.onStop();
    }
}
