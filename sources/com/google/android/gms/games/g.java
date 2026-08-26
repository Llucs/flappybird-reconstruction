package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
final class g extends i {
    g() {
    }

    @Override // com.google.android.gms.games.i, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a */
    public PlayerEntity createFromParcel(Parcel parcel) {
        if (PlayerEntity.b(PlayerEntity.u()) || PlayerEntity.b(PlayerEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        return new PlayerEntity(1, string, string2, string3 == null ? null : Uri.parse(string3), string4 != null ? Uri.parse(string4) : null, parcel.readLong());
    }
}
