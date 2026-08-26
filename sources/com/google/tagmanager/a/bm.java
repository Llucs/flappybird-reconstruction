package com.google.tagmanager.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
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
public class bm {
    public static final bm a = new bm("DOUBLE", 0, br.DOUBLE, 1);
    public static final bm b = new bm("FLOAT", 1, br.FLOAT, 5);
    public static final bm c = new bm("INT64", 2, br.LONG, 0);
    public static final bm d = new bm("UINT64", 3, br.LONG, 0);
    public static final bm e = new bm("INT32", 4, br.INT, 0);
    public static final bm f = new bm("FIXED64", 5, br.LONG, 1);
    public static final bm g = new bm("FIXED32", 6, br.INT, 5);
    public static final bm h = new bm("BOOL", 7, br.BOOLEAN, 0);
    public static final bm i;
    public static final bm j;
    public static final bm k;
    public static final bm l;
    public static final bm m;
    public static final bm n;
    public static final bm o;
    public static final bm p;
    public static final bm q;
    public static final bm r;
    private static final /* synthetic */ bm[] u;
    private final br s;
    private final int t;

    static {
        final int i2 = 3;
        final int i3 = 2;
        final String str = "STRING";
        final int i4 = 8;
        final br brVar = br.STRING;
        i = new bm(str, i4, brVar, i3) { // from class: com.google.tagmanager.a.bn
            @Override // com.google.tagmanager.a.bm
            public boolean c() {
                return false;
            }
        };
        final String str2 = "GROUP";
        final int i5 = 9;
        final br brVar2 = br.MESSAGE;
        j = new bm(str2, i5, brVar2, i2) { // from class: com.google.tagmanager.a.bo
            @Override // com.google.tagmanager.a.bm
            public boolean c() {
                return false;
            }
        };
        final String str3 = "MESSAGE";
        final int i6 = 10;
        final br brVar3 = br.MESSAGE;
        k = new bm(str3, i6, brVar3, i3) { // from class: com.google.tagmanager.a.bp
            @Override // com.google.tagmanager.a.bm
            public boolean c() {
                return false;
            }
        };
        final String str4 = "BYTES";
        final int i7 = 11;
        final br brVar4 = br.BYTE_STRING;
        l = new bm(str4, i7, brVar4, i3) { // from class: com.google.tagmanager.a.bq
            @Override // com.google.tagmanager.a.bm
            public boolean c() {
                return false;
            }
        };
        m = new bm("UINT32", 12, br.INT, 0);
        n = new bm("ENUM", 13, br.ENUM, 0);
        o = new bm("SFIXED32", 14, br.INT, 5);
        p = new bm("SFIXED64", 15, br.LONG, 1);
        q = new bm("SINT32", 16, br.INT, 0);
        r = new bm("SINT64", 17, br.LONG, 0);
        u = new bm[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r};
    }

    private bm(String str, int i2, br brVar, int i3) {
        this.s = brVar;
        this.t = i3;
    }

    public static bm valueOf(String str) {
        return (bm) Enum.valueOf(bm.class, str);
    }

    public static bm[] values() {
        return (bm[]) u.clone();
    }

    public br a() {
        return this.s;
    }

    public int b() {
        return this.t;
    }

    public boolean c() {
        return true;
    }
}
