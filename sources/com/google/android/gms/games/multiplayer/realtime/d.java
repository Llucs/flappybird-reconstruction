package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class d extends e {
    d() {
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.e, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a */
    public RoomEntity createFromParcel(Parcel parcel) {
        if (RoomEntity.b(RoomEntity.u()) || RoomEntity.b(RoomEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        long j = parcel.readLong();
        int i = parcel.readInt();
        String string3 = parcel.readString();
        int i2 = parcel.readInt();
        Bundle bundle = parcel.readBundle();
        int i3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }
        return new RoomEntity(2, string, string2, j, i, string3, i2, bundle, arrayList, -1);
    }
}
