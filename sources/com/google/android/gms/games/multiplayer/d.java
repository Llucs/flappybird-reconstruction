package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.Player;

/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.android.gms.common.data.b implements Participant {
    private final com.google.android.gms.games.d c;

    public d(com.google.android.gms.common.data.d dVar, int i) {
        super(dVar, i);
        this.c = new com.google.android.gms.games.d(dVar, i);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public int b() {
        return b("player_status");
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public String c() {
        return d("client_address");
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public int d() {
        return b("capabilities");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public boolean e() {
        return b("connected") > 0;
    }

    @Override // com.google.android.gms.common.data.b
    public boolean equals(Object obj) {
        return ParticipantEntity.a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public String f() {
        return f("external_player_id") ? d("default_display_name") : this.c.c();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public Uri g() {
        return f("external_player_id") ? e("default_display_image_uri") : this.c.d();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public Uri h() {
        if (f("external_player_id")) {
            return null;
        }
        return this.c.e();
    }

    @Override // com.google.android.gms.common.data.b
    public int hashCode() {
        return ParticipantEntity.a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public String i() {
        return d("external_participant_id");
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public Player j() {
        if (f("external_player_id")) {
            return null;
        }
        return this.c;
    }

    @Override // com.google.android.gms.common.data.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Participant a() {
        return new ParticipantEntity(this);
    }

    public String toString() {
        return ParticipantEntity.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((ParticipantEntity) a()).writeToParcel(parcel, i);
    }
}
