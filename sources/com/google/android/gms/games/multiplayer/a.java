package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class a extends f {
    a() {
    }

    @Override // com.google.android.gms.games.multiplayer.f, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a */
    public InvitationEntity createFromParcel(Parcel parcel) {
        if (InvitationEntity.b(InvitationEntity.u()) || InvitationEntity.b(InvitationEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        GameEntity gameEntity = (GameEntity) GameEntity.CREATOR.createFromParcel(parcel);
        String string = parcel.readString();
        long j = parcel.readLong();
        int i = parcel.readInt();
        ParticipantEntity participantEntity = (ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel);
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }
        return new InvitationEntity(1, gameEntity, string, j, i, participantEntity, arrayList, -1);
    }
}
