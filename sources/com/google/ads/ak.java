package com.google.ads;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class ak {
    private ag d;
    private String a = "googleads.g.doubleclick.net";
    private String b = "/pagead/ads";
    private String[] c = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private af e = new af();

    public ak(ag agVar) {
        this.d = agVar;
    }

    private Uri a(Uri uri, Context context, String str, boolean z) throws al {
        try {
            if (uri.getQueryParameter("ms") != null) {
                throw new al("Query parameter already exists: ms");
            }
            return a(uri, "ms", z ? this.d.a(context, str) : this.d.a(context));
        } catch (UnsupportedOperationException e) {
            throw new al("Provided Uri is not in a valid state");
        }
    }

    private Uri a(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl");
        }
        return iIndexOf != -1 ? Uri.parse(string.substring(0, iIndexOf + 1) + str + "=" + str2 + "&" + string.substring(iIndexOf + 1)) : uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    public Uri a(Uri uri, Context context) throws al {
        try {
            return a(uri, context, uri.getQueryParameter("ai"), true);
        } catch (UnsupportedOperationException e) {
            throw new al("Provided Uri is not in a valid state");
        }
    }

    public void a(String str) {
        this.c = str.split(",");
    }

    public boolean a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String str : this.c) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
