package org.andengine.opengl.view;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    private static final /* synthetic */ b[] e;

    static {
        final int i = 3;
        final int i2 = 2;
        final int i3 = 1;
        final int i4 = 0;
        final String str = "STRICT";
        a = new b(str, i4) { // from class: org.andengine.opengl.view.c
            {
                b bVar = null;
            }

            @Override // org.andengine.opengl.view.b
            public boolean a(int i5, int i6, int i7, int i8, int i9, int i10) {
                return i9 == 0 && i10 == 0 && i5 == 5 && i6 == 6 && i7 == 5 && i8 == 0;
            }
        };
        final String str2 = "LOOSE_STENCIL";
        b = new b(str2, i3) { // from class: org.andengine.opengl.view.d
            {
                b bVar = null;
            }

            @Override // org.andengine.opengl.view.b
            public boolean a(int i5, int i6, int i7, int i8, int i9, int i10) {
                return i9 == 0 && i10 >= 0 && i5 == 5 && i6 == 6 && i7 == 5 && i8 == 0;
            }
        };
        final String str3 = "LOOSE_DEPTH_AND_STENCIL";
        c = new b(str3, i2) { // from class: org.andengine.opengl.view.e
            {
                b bVar = null;
            }

            @Override // org.andengine.opengl.view.b
            public boolean a(int i5, int i6, int i7, int i8, int i9, int i10) {
                return i9 >= 0 && i10 >= 0 && i5 == 5 && i6 == 6 && i7 == 5 && i8 == 0;
            }
        };
        final String str4 = "ANY";
        d = new b(str4, i) { // from class: org.andengine.opengl.view.f
            {
                b bVar = null;
            }

            @Override // org.andengine.opengl.view.b
            public boolean a(int i5, int i6, int i7, int i8, int i9, int i10) {
                return true;
            }
        };
        e = new b[]{a, b, c, d};
    }

    private b(String str, int i) {
    }

    /* synthetic */ b(String str, int i, b bVar) {
        this(str, i);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        b[] bVarArr = e;
        int length = bVarArr.length;
        b[] bVarArr2 = new b[length];
        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
        return bVarArr2;
    }

    public abstract boolean a(int i, int i2, int i3, int i4, int i5, int i6);
}
