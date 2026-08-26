package com.google.example.games.basegameutils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class GameHelper implements com.google.android.gms.common.c, com.google.android.gms.common.d {
    private Activity activity;
    private GameHelperListener listener;
    private com.google.android.gms.games.c gamesClient;
    private int state;
    private boolean userInitiated;
    private boolean resolving;
    private boolean setup;
    private boolean debug;
    private String tag = "GameHelper";

    public GameHelper(final Activity activity) {
        this.activity = activity;
    }

    public void setup(final GameHelperListener listener, final int requestedClients, final String... scopes) {
        if (this.setup) {
            throw new IllegalStateException("GameHelper: you called GameHelper.setup() twice.");
        }
        this.setup = true;
        this.listener = listener;
        if ((requestedClients & 1) == 0) {
            this.state = 1;
            return;
        }
        final String[] requestedScopes;
        if (scopes == null || scopes.length == 0) {
            requestedScopes = new String[]{"https://www.googleapis.com/auth/games"};
        } else {
            requestedScopes = scopes;
        }
        this.gamesClient = new com.google.android.gms.games.f(this.activity, this, this)
                .a(49)
                .a(requestedScopes)
                .a();
        this.state = 1;
    }

    public void setDebugLog(final boolean enableDebugLog, final String logTag) {
        this.debug = enableDebugLog;
        if (logTag != null) {
            this.tag = logTag;
        }
    }

    public void onStart(final Activity activity) {
        this.activity = activity;
        if (this.gamesClient != null && !this.gamesClient.b()) {
            this.state = 2;
            this.gamesClient.a();
        }
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        if (requestCode != 9001) {
            return;
        }
        this.resolving = false;
        if (resultCode == Activity.RESULT_OK || resultCode == 10001) {
            connect();
        } else {
            this.userInitiated = false;
            this.state = 1;
            notifyFailure();
        }
    }

    public com.google.android.gms.games.c getGamesClient() {
        if (this.gamesClient == null) {
            throw new IllegalStateException("No GamesClient. Did you request it at setup?");
        }
        return this.gamesClient;
    }

    public boolean isSignedIn() {
        return this.gamesClient != null && this.gamesClient.b();
    }

    public void onStop() {
        if (this.gamesClient != null && this.gamesClient.b()) {
            this.gamesClient.c();
        }
        this.state = 1;
    }

    public void beginUserInitiatedSignIn() {
        this.userInitiated = true;
        if (this.gamesClient == null) {
            notifyFailure();
            return;
        }
        if (this.gamesClient.b()) {
            notifySuccess();
            return;
        }
        connect();
    }

    private void connect() {
        if (this.gamesClient == null) {
            notifyFailure();
            return;
        }
        this.state = 2;
        if (!this.gamesClient.b()) {
            this.gamesClient.a();
        }
    }

    private void notifySuccess() {
        this.state = 3;
        if (this.listener != null) {
            this.listener.onSignInSucceeded();
        }
    }

    private void notifyFailure() {
        if (this.listener != null) {
            this.listener.onSignInFailed();
        }
    }

    @Override
    public void a(final Bundle connectionHint) {
        log("onConnected");
        notifySuccess();
    }

    @Override
    public void a() {
        log("onDisconnected");
        this.state = 1;
        notifyFailure();
    }

    @Override
    public void a(final com.google.android.gms.common.a result) {
        log("onConnectionFailed: " + result);
        this.state = 1;
        if (this.userInitiated && result.a() && !this.resolving) {
            try {
                this.resolving = true;
                result.a(this.activity, 9001);
                return;
            } catch (final RuntimeException ignored) {
            }
        }
        notifyFailure();
    }

    private void log(final String message) {
        if (this.debug) {
            Log.d(this.tag, "GameHelper: " + message);
        }
    }
}
