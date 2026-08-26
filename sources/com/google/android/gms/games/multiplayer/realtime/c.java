package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c extends com.google.android.gms.common.data.b implements Room {
    private final int c;

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public String b() {
        return d("external_match_id");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public String c() {
        return d("creator_external");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public long d() {
        return a("creation_timestamp");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public int e() {
        return b("status");
    }

    @Override // com.google.android.gms.common.data.b
    public boolean equals(Object obj) {
        return RoomEntity.a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public String f() {
        return d("description");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public int g() {
        return b("variant");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public Bundle h() {
        if (c("has_automatch_criteria")) {
            return b.a(b("automatch_min_players"), b("automatch_max_players"), a("automatch_bit_mask"));
        }
        return null;
    }

    @Override // com.google.android.gms.common.data.b
    public int hashCode() {
        return RoomEntity.a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.e
    public ArrayList i() {
        ArrayList arrayList = new ArrayList(this.c);
        for (int i = 0; i < this.c; i++) {
            arrayList.add(new com.google.android.gms.games.multiplayer.d(this.a, this.b + i));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public int j() {
        return b("automatch_wait_estimate_sec");
    }

    @Override // com.google.android.gms.common.data.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Room a() {
        return new RoomEntity(this);
    }

    public String toString() {
        return RoomEntity.b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((RoomEntity) a()).writeToParcel(parcel, i);
    }
}
