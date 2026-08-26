package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.android.gms.common.data.b implements Game {
    @Override // com.google.android.gms.games.Game
    public String b() {
        return d("external_game_id");
    }

    @Override // com.google.android.gms.games.Game
    public String c() {
        return d("display_name");
    }

    @Override // com.google.android.gms.games.Game
    public String d() {
        return d("primary_category");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Game
    public String e() {
        return d("secondary_category");
    }

    @Override // com.google.android.gms.common.data.b
    public boolean equals(Object obj) {
        return GameEntity.a(this, obj);
    }

    @Override // com.google.android.gms.games.Game
    public String f() {
        return d("game_description");
    }

    @Override // com.google.android.gms.games.Game
    public String g() {
        return d("developer_name");
    }

    @Override // com.google.android.gms.games.Game
    public Uri h() {
        return e("game_icon_image_uri");
    }

    @Override // com.google.android.gms.common.data.b
    public int hashCode() {
        return GameEntity.a(this);
    }

    @Override // com.google.android.gms.games.Game
    public Uri i() {
        return e("game_hi_res_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    public Uri j() {
        return e("featured_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    public boolean k() {
        return c("play_enabled_game");
    }

    @Override // com.google.android.gms.games.Game
    public boolean l() {
        return b("installed") > 0;
    }

    @Override // com.google.android.gms.games.Game
    public String m() {
        return d("package_name");
    }

    @Override // com.google.android.gms.games.Game
    public int n() {
        return b("gameplay_acl_status");
    }

    @Override // com.google.android.gms.games.Game
    public int o() {
        return b("achievement_total_count");
    }

    @Override // com.google.android.gms.games.Game
    public int p() {
        return b("leaderboard_count");
    }

    @Override // com.google.android.gms.common.data.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Game a() {
        return new GameEntity(this);
    }

    public String toString() {
        return GameEntity.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((GameEntity) a()).writeToParcel(parcel, i);
    }
}
