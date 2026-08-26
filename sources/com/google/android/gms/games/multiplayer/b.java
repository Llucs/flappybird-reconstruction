package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.android.gms.common.data.b implements Invitation {
    private final Game c;
    private final d d;
    private final ArrayList e;

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public Game b() {
        return this.c;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public String c() {
        return d("external_invitation_id");
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public Participant d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public long e() {
        return a("creation_timestamp");
    }

    @Override // com.google.android.gms.common.data.b
    public boolean equals(Object obj) {
        return InvitationEntity.a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public int f() {
        return b("type");
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public int g() {
        return b("variant");
    }

    @Override // com.google.android.gms.common.data.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Invitation a() {
        return new InvitationEntity(this);
    }

    @Override // com.google.android.gms.common.data.b
    public int hashCode() {
        return InvitationEntity.a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.e
    public ArrayList i() {
        return this.e;
    }

    public String toString() {
        return InvitationEntity.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((InvitationEntity) a()).writeToParcel(parcel, i);
    }
}
