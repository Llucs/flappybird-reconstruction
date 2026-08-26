package org.andengine.a.b;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static String a = "";

    public static void a() {
        a("");
    }

    public static void a(String str) {
        if (!str.endsWith("/") && str.length() != 0) {
            throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
        }
        a = str;
    }
}
