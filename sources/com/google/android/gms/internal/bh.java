package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class bh implements Parcelable.Creator {
    static void a(bx bxVar, Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        Set setE = bxVar.e();
        if (setE.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, bxVar.f());
        }
        if (setE.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, (Parcelable) bxVar.g(), i, true);
        }
        if (setE.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, bxVar.h(), true);
        }
        if (setE.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, (Parcelable) bxVar.i(), i, true);
        }
        if (setE.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, bxVar.j(), true);
        }
        if (setE.contains(6)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, bxVar.k(), true);
        }
        if (setE.contains(7)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, bxVar.l(), true);
        }
        if (setE.contains(8)) {
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 8, bxVar.m(), true);
        }
        if (setE.contains(9)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, bxVar.n());
        }
        if (setE.contains(10)) {
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 10, bxVar.o(), true);
        }
        if (setE.contains(11)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, (Parcelable) bxVar.p(), i, true);
        }
        if (setE.contains(12)) {
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 12, bxVar.q(), true);
        }
        if (setE.contains(13)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, bxVar.r(), true);
        }
        if (setE.contains(14)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, bxVar.s(), true);
        }
        if (setE.contains(15)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, (Parcelable) bxVar.t(), i, true);
        }
        if (setE.contains(17)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 17, bxVar.v(), true);
        }
        if (setE.contains(16)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, bxVar.u(), true);
        }
        if (setE.contains(19)) {
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 19, bxVar.x(), true);
        }
        if (setE.contains(18)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 18, bxVar.w(), true);
        }
        if (setE.contains(21)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 21, bxVar.z(), true);
        }
        if (setE.contains(20)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 20, bxVar.y(), true);
        }
        if (setE.contains(23)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 23, bxVar.B(), true);
        }
        if (setE.contains(22)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 22, bxVar.A(), true);
        }
        if (setE.contains(25)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 25, bxVar.D(), true);
        }
        if (setE.contains(24)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 24, bxVar.C(), true);
        }
        if (setE.contains(27)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 27, bxVar.F(), true);
        }
        if (setE.contains(26)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 26, bxVar.E(), true);
        }
        if (setE.contains(29)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 29, (Parcelable) bxVar.H(), i, true);
        }
        if (setE.contains(28)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 28, bxVar.G(), true);
        }
        if (setE.contains(31)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 31, bxVar.J(), true);
        }
        if (setE.contains(30)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 30, bxVar.I(), true);
        }
        if (setE.contains(34)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 34, (Parcelable) bxVar.M(), i, true);
        }
        if (setE.contains(32)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 32, bxVar.K(), true);
        }
        if (setE.contains(33)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 33, bxVar.L(), true);
        }
        if (setE.contains(38)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 38, bxVar.P());
        }
        if (setE.contains(39)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 39, bxVar.Q(), true);
        }
        if (setE.contains(36)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 36, bxVar.N());
        }
        if (setE.contains(37)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 37, (Parcelable) bxVar.O(), i, true);
        }
        if (setE.contains(42)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 42, bxVar.T(), true);
        }
        if (setE.contains(43)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 43, bxVar.U(), true);
        }
        if (setE.contains(40)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 40, (Parcelable) bxVar.R(), i, true);
        }
        if (setE.contains(41)) {
            com.google.android.gms.common.internal.safeparcel.c.b(parcel, 41, bxVar.S(), true);
        }
        if (setE.contains(46)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 46, (Parcelable) bxVar.X(), i, true);
        }
        if (setE.contains(47)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 47, bxVar.Y(), true);
        }
        if (setE.contains(44)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 44, bxVar.V(), true);
        }
        if (setE.contains(45)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 45, bxVar.W(), true);
        }
        if (setE.contains(51)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 51, bxVar.ac(), true);
        }
        if (setE.contains(50)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 50, (Parcelable) bxVar.ab(), i, true);
        }
        if (setE.contains(49)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 49, bxVar.aa(), true);
        }
        if (setE.contains(48)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 48, bxVar.Z(), true);
        }
        if (setE.contains(55)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 55, bxVar.ag(), true);
        }
        if (setE.contains(54)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 54, bxVar.af(), true);
        }
        if (setE.contains(53)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 53, bxVar.ae(), true);
        }
        if (setE.contains(52)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 52, bxVar.ad(), true);
        }
        if (setE.contains(56)) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 56, bxVar.ah(), true);
        }
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bx createFromParcel(Parcel parcel) {
        int iB = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashSet = new HashSet();
        int iF = 0;
        bx bxVar = null;
        ArrayList arrayListX = null;
        bx bxVar2 = null;
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        ArrayList arrayListC = null;
        int iF2 = 0;
        ArrayList arrayListC2 = null;
        bx bxVar3 = null;
        ArrayList arrayListC3 = null;
        String strL4 = null;
        String strL5 = null;
        bx bxVar4 = null;
        String strL6 = null;
        String strL7 = null;
        String strL8 = null;
        ArrayList arrayListC4 = null;
        String strL9 = null;
        String strL10 = null;
        String strL11 = null;
        String strL12 = null;
        String strL13 = null;
        String strL14 = null;
        String strL15 = null;
        String strL16 = null;
        String strL17 = null;
        bx bxVar5 = null;
        String strL18 = null;
        String strL19 = null;
        String strL20 = null;
        String strL21 = null;
        bx bxVar6 = null;
        double dJ = 0.0d;
        bx bxVar7 = null;
        double dJ2 = 0.0d;
        String strL22 = null;
        bx bxVar8 = null;
        ArrayList arrayListC5 = null;
        String strL23 = null;
        String strL24 = null;
        String strL25 = null;
        String strL26 = null;
        bx bxVar9 = null;
        String strL27 = null;
        String strL28 = null;
        String strL29 = null;
        bx bxVar10 = null;
        String strL30 = null;
        String strL31 = null;
        String strL32 = null;
        String strL33 = null;
        String strL34 = null;
        String strL35 = null;
        while (parcel.dataPosition() < iB) {
            int iA = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(iA)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /* 1 */:
                    iF = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    hashSet.add(1);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                    bx bxVar11 = (bx) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, bx.CREATOR);
                    hashSet.add(2);
                    bxVar = bxVar11;
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
                    arrayListX = com.google.android.gms.common.internal.safeparcel.a.x(parcel, iA);
                    hashSet.add(3);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                    bx bxVar12 = (bx) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, bx.CREATOR);
                    hashSet.add(4);
                    bxVar2 = bxVar12;
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                    strL = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(5);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                    strL2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(6);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /* 7 */:
                    strL3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(7);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                    arrayListC = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, bx.CREATOR);
                    hashSet.add(8);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                    iF2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, iA);
                    hashSet.add(9);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                    arrayListC2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, bx.CREATOR);
                    hashSet.add(10);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomGestures /* 11 */:
                    bx bxVar13 = (bx) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, bx.CREATOR);
                    hashSet.add(11);
                    bxVar3 = bxVar13;
                    break;
                case com.google.android.gms.e.MapAttrs_useViewLifecycle /* 12 */:
                    arrayListC3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, bx.CREATOR);
                    hashSet.add(12);
                    break;
                case com.google.android.gms.e.MapAttrs_zOrderOnTop /* 13 */:
                    strL4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(13);
                    break;
                case 14:
                    strL5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(14);
                    break;
                case 15:
                    bx bxVar14 = (bx) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, bx.CREATOR);
                    hashSet.add(15);
                    bxVar4 = bxVar14;
                    break;
                case 16:
                    strL6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(16);
                    break;
                case 17:
                    strL7 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(17);
                    break;
                case 18:
                    strL8 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(18);
                    break;
                case 19:
                    arrayListC4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, bx.CREATOR);
                    hashSet.add(19);
                    break;
                case 20:
                    strL9 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(20);
                    break;
                case 21:
                    strL10 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(21);
                    break;
                case 22:
                    strL11 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(22);
                    break;
                case 23:
                    strL12 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(23);
                    break;
                case 24:
                    strL13 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(24);
                    break;
                case 25:
                    strL14 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(25);
                    break;
                case 26:
                    strL15 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(26);
                    break;
                case 27:
                    strL16 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(27);
                    break;
                case 28:
                    strL17 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(28);
                    break;
                case 29:
                    bx bxVar15 = (bx) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, bx.CREATOR);
                    hashSet.add(29);
                    bxVar5 = bxVar15;
                    break;
                case 30:
                    strL18 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(30);
                    break;
                case 31:
                    strL19 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(31);
                    break;
                case 32:
                    strL20 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(32);
                    break;
                case 33:
                    strL21 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(33);
                    break;
                case 34:
                    bx bxVar16 = (bx) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, bx.CREATOR);
                    hashSet.add(34);
                    bxVar6 = bxVar16;
                    break;
                case 35:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, iA);
                    break;
                case 36:
                    dJ = com.google.android.gms.common.internal.safeparcel.a.j(parcel, iA);
                    hashSet.add(36);
                    break;
                case 37:
                    bx bxVar17 = (bx) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, bx.CREATOR);
                    hashSet.add(37);
                    bxVar7 = bxVar17;
                    break;
                case 38:
                    dJ2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, iA);
                    hashSet.add(38);
                    break;
                case 39:
                    strL22 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(39);
                    break;
                case 40:
                    bx bxVar18 = (bx) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, bx.CREATOR);
                    hashSet.add(40);
                    bxVar8 = bxVar18;
                    break;
                case 41:
                    arrayListC5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, iA, bx.CREATOR);
                    hashSet.add(41);
                    break;
                case 42:
                    strL23 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(42);
                    break;
                case 43:
                    strL24 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(43);
                    break;
                case 44:
                    strL25 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(44);
                    break;
                case 45:
                    strL26 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(45);
                    break;
                case 46:
                    bx bxVar19 = (bx) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, bx.CREATOR);
                    hashSet.add(46);
                    bxVar9 = bxVar19;
                    break;
                case 47:
                    strL27 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(47);
                    break;
                case 48:
                    strL28 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(48);
                    break;
                case 49:
                    strL29 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(49);
                    break;
                case 50:
                    bx bxVar20 = (bx) com.google.android.gms.common.internal.safeparcel.a.a(parcel, iA, bx.CREATOR);
                    hashSet.add(50);
                    bxVar10 = bxVar20;
                    break;
                case 51:
                    strL30 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(51);
                    break;
                case 52:
                    strL31 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(52);
                    break;
                case 53:
                    strL32 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(53);
                    break;
                case 54:
                    strL33 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(54);
                    break;
                case 55:
                    strL34 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(55);
                    break;
                case 56:
                    strL35 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, iA);
                    hashSet.add(56);
                    break;
            }
        }
        if (parcel.dataPosition() != iB) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + iB, parcel);
        }
        return new bx(hashSet, iF, bxVar, arrayListX, bxVar2, strL, strL2, strL3, arrayListC, iF2, arrayListC2, bxVar3, arrayListC3, strL4, strL5, bxVar4, strL6, strL7, strL8, arrayListC4, strL9, strL10, strL11, strL12, strL13, strL14, strL15, strL16, strL17, bxVar5, strL18, strL19, strL20, strL21, bxVar6, dJ, bxVar7, dJ2, strL22, bxVar8, arrayListC5, strL23, strL24, strL25, strL26, bxVar9, strL27, strL28, strL29, bxVar10, strL30, strL31, strL32, strL33, strL34, strL35);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bx[] newArray(int i) {
        return new bx[i];
    }
}
