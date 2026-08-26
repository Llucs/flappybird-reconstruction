package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
final class a extends h {
    a() {
    }

    @Override // com.google.android.gms.games.h, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a */
    public GameEntity createFromParcel(Parcel parcel) {
        if (GameEntity.b(GameEntity.u()) || GameEntity.b(GameEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        Uri uri = string7 == null ? null : Uri.parse(string7);
        String string8 = parcel.readString();
        Uri uri2 = string8 == null ? null : Uri.parse(string8);
        String string9 = parcel.readString();
        return new GameEntity(1, string, string2, string3, string4, string5, string6, uri, uri2, string9 == null ? null : Uri.parse(string9), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
