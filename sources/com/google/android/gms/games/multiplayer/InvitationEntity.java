package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.Cdo;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class InvitationEntity extends av implements Invitation {
    public static final Parcelable.Creator CREATOR = new a();
    private final int a;
    private final GameEntity b;
    private final String c;
    private final long d;
    private final int e;
    private final ParticipantEntity f;
    private final ArrayList g;
    private final int h;

    InvitationEntity(int i, GameEntity gameEntity, String str, long j, int i2, ParticipantEntity participantEntity, ArrayList arrayList, int i3) {
        this.a = i;
        this.b = gameEntity;
        this.c = str;
        this.d = j;
        this.e = i2;
        this.f = participantEntity;
        this.g = arrayList;
        this.h = i3;
    }

    InvitationEntity(Invitation invitation) {
        this.a = 1;
        this.b = new GameEntity(invitation.b());
        this.c = invitation.c();
        this.d = invitation.e();
        this.e = invitation.f();
        this.h = invitation.g();
        String strI = invitation.d().i();
        Participant participant = null;
        ArrayList arrayListI = invitation.i();
        int size = arrayListI.size();
        this.g = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Participant participant2 = (Participant) arrayListI.get(i);
            if (participant2.i().equals(strI)) {
                participant = participant2;
            }
            this.g.add((ParticipantEntity) participant2.a());
        }
        Cdo.a(participant, "Must have a valid inviter!");
        this.f = (ParticipantEntity) participant.a();
    }

    static int a(Invitation invitation) {
        return dl.a(invitation.b(), invitation.c(), Long.valueOf(invitation.e()), Integer.valueOf(invitation.f()), invitation.d(), invitation.i(), Integer.valueOf(invitation.g()));
    }

    static boolean a(Invitation invitation, Object obj) {
        if (!(obj instanceof Invitation)) {
            return false;
        }
        if (invitation == obj) {
            return true;
        }
        Invitation invitation2 = (Invitation) obj;
        return dl.a(invitation2.b(), invitation.b()) && dl.a(invitation2.c(), invitation.c()) && dl.a(Long.valueOf(invitation2.e()), Long.valueOf(invitation.e())) && dl.a(Integer.valueOf(invitation2.f()), Integer.valueOf(invitation.f())) && dl.a(invitation2.d(), invitation.d()) && dl.a(invitation2.i(), invitation.i()) && dl.a(Integer.valueOf(invitation2.g()), Integer.valueOf(invitation.g()));
    }

    static String b(Invitation invitation) {
        return dl.a(invitation).a("Game", invitation.b()).a("InvitationId", invitation.c()).a("CreationTimestamp", Long.valueOf(invitation.e())).a("InvitationType", Integer.valueOf(invitation.f())).a("Inviter", invitation.d()).a("Participants", invitation.i()).a("Variant", Integer.valueOf(invitation.g())).toString();
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public Game b() {
        return this.b;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public String c() {
        return this.c;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public Participant d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public int f() {
        return this.e;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    public int g() {
        return this.h;
    }

    public int h() {
        return this.a;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.e
    public ArrayList i() {
        return new ArrayList(this.g);
    }

    @Override // com.google.android.gms.common.data.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Invitation a() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (!v()) {
            f.a(this, parcel, i);
            return;
        }
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        this.f.writeToParcel(parcel, i);
        int size = this.g.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((ParticipantEntity) this.g.get(i2)).writeToParcel(parcel, i);
        }
    }
}
