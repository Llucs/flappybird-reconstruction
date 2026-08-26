package com.google.example.games.basegameutils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGameActivity extends FragmentActivity implements b {
    private String[] r;
    protected int o = 1;
    protected String p = "BaseGameActivity";
    protected boolean q = false;
    protected a n = new a(this);

    protected BaseGameActivity() {
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.n.a(i, i2, intent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = new a(this);
        if (this.q) {
            this.n.a(this.q, this.p);
        }
        this.n.a(this, this.o, this.r);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.n.a(this);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.n.d();
    }
}
