package com.google.android.gms.games.multiplayer;

import android.os.Parcelable;
import com.google.android.gms.games.Game;

/* JADX INFO: loaded from: classes.dex */
public interface Invitation extends Parcelable, com.google.android.gms.common.data.a, e {
    Game b();

    String c();

    Participant d();

    long e();

    int f();

    int g();
}
