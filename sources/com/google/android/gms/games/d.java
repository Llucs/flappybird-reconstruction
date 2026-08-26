package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.android.gms.common.data.b implements Player {
    public d(com.google.android.gms.common.data.d dVar, int i) {
        super(dVar, i);
    }

    @Override // com.google.android.gms.games.Player
    public String b() {
        return d("external_player_id");
    }

    @Override // com.google.android.gms.games.Player
    public String c() {
        return d("profile_name");
    }

    @Override // com.google.android.gms.games.Player
    public Uri d() {
        return e("profile_icon_image_uri");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Player
    public Uri e() {
        return e("profile_hi_res_image_uri");
    }

    @Override // com.google.android.gms.common.data.b
    public boolean equals(Object obj) {
        return PlayerEntity.a(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    public long f() {
        return a("last_updated");
    }

    @Override // com.google.android.gms.common.data.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Player a() {
        return new PlayerEntity(this);
    }

    @Override // com.google.android.gms.common.data.b
    public int hashCode() {
        return PlayerEntity.a(this);
    }

    public String toString() {
        return PlayerEntity.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((PlayerEntity) a()).writeToParcel(parcel, i);
    }
}
