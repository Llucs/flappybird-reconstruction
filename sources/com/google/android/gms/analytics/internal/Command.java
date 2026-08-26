package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class Command implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private String a;
    private String b;
    private String c;

    public Command() {
    }

    Command(Parcel parcel) {
        a(parcel);
    }

    private void a(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
