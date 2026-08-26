package org.andengine.opengl.a;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private static final int a = org.andengine.d.d.a.C;
    private static String b = "";

    public static void a() {
        a("");
    }

    public static void a(String str) {
        if (!str.endsWith("/") && str.length() != 0) {
            throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
        }
        b = str;
    }
}
