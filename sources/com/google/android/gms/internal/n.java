package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    private static final Pattern a = Pattern.compile("\\\\.");
    private static final Pattern b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            switch (matcher.group().charAt(0)) {
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /* 8 */:
                    matcher.appendReplacement(stringBuffer, "\\\\b");
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /* 9 */:
                    matcher.appendReplacement(stringBuffer, "\\\\t");
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomControls /* 10 */:
                    matcher.appendReplacement(stringBuffer, "\\\\n");
                    break;
                case com.google.android.gms.e.MapAttrs_useViewLifecycle /* 12 */:
                    matcher.appendReplacement(stringBuffer, "\\\\f");
                    break;
                case com.google.android.gms.e.MapAttrs_zOrderOnTop /* 13 */:
                    matcher.appendReplacement(stringBuffer, "\\\\r");
                    break;
                case '\"':
                    matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                    break;
                case '/':
                    matcher.appendReplacement(stringBuffer, "\\\\/");
                    break;
                case '\\':
                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                    break;
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
