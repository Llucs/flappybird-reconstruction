package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class RoomEntity extends av implements Room {
    public static final Parcelable.Creator CREATOR = new d();
    private final int a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;
    private final String f;
    private final int g;
    private final Bundle h;
    private final ArrayList i;
    private final int j;

    RoomEntity(int i, String str, String str2, long j, int i2, String str3, int i3, Bundle bundle, ArrayList arrayList, int i4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = i2;
        this.f = str3;
        this.g = i3;
        this.h = bundle;
        this.i = arrayList;
        this.j = i4;
    }

    public RoomEntity(Room room) {
        this.a = 2;
        this.b = room.b();
        this.c = room.c();
        this.d = room.d();
        this.e = room.e();
        this.f = room.f();
        this.g = room.g();
        this.h = room.h();
        ArrayList arrayListI = room.i();
        int size = arrayListI.size();
        this.i = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.i.add((ParticipantEntity) ((Participant) arrayListI.get(i)).a());
        }
        this.j = room.j();
    }

    static int a(Room room) {
        return dl.a(room.b(), room.c(), Long.valueOf(room.d()), Integer.valueOf(room.e()), room.f(), Integer.valueOf(room.g()), room.h(), room.i(), Integer.valueOf(room.j()));
    }

    static boolean a(Room room, Object obj) {
        if (!(obj instanceof Room)) {
            return false;
        }
        if (room == obj) {
            return true;
        }
        Room room2 = (Room) obj;
        return dl.a(room2.b(), room.b()) && dl.a(room2.c(), room.c()) && dl.a(Long.valueOf(room2.d()), Long.valueOf(room.d())) && dl.a(Integer.valueOf(room2.e()), Integer.valueOf(room.e())) && dl.a(room2.f(), room.f()) && dl.a(Integer.valueOf(room2.g()), Integer.valueOf(room.g())) && dl.a(room2.h(), room.h()) && dl.a(room2.i(), room.i()) && dl.a(Integer.valueOf(room2.j()), Integer.valueOf(room.j()));
    }

    static String b(Room room) {
        return dl.a(room).a("RoomId", room.b()).a("CreatorId", room.c()).a("CreationTimestamp", Long.valueOf(room.d())).a("RoomStatus", Integer.valueOf(room.e())).a("Description", room.f()).a("Variant", Integer.valueOf(room.g())).a("AutoMatchCriteria", room.h()).a("Participants", room.i()).a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.j())).toString();
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public String b() {
        return this.b;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public String c() {
        return this.c;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public long d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public String f() {
        return this.f;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public int g() {
        return this.g;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public Bundle h() {
        return this.h;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.e
    public ArrayList i() {
        return new ArrayList(this.i);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    public int j() {
        return this.j;
    }

    public int k() {
        return this.a;
    }

    @Override // com.google.android.gms.common.data.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Room a() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (!v()) {
            e.a(this, parcel, i);
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeBundle(this.h);
        int size = this.i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((ParticipantEntity) this.i.get(i2)).writeToParcel(parcel, i);
        }
    }
}
