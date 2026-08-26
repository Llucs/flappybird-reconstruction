package org.andengine.opengl.util;

import android.graphics.Bitmap;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static /* synthetic */ int[] a;

    public static Buffer a(Bitmap bitmap, org.andengine.opengl.c.c cVar, ByteOrder byteOrder) {
        int[] iArrA = a(bitmap);
        switch (a()[cVar.ordinal()]) {
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /* 2 */:
                return ShortBuffer.wrap(c(iArrA, byteOrder));
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /* 3 */:
            default:
                throw new IllegalArgumentException("Unexpected " + org.andengine.opengl.c.c.class.getSimpleName() + ": '" + cVar + "'.");
            case com.google.android.gms.e.MapAttrs_cameraTilt /* 4 */:
                return IntBuffer.wrap(a(iArrA, byteOrder == ByteOrder.LITTLE_ENDIAN ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN));
            case com.google.android.gms.e.MapAttrs_cameraZoom /* 5 */:
                return ShortBuffer.wrap(b(iArrA, byteOrder));
            case com.google.android.gms.e.MapAttrs_uiCompass /* 6 */:
                return ByteBuffer.wrap(a(iArrA));
        }
    }

    public static byte[] a(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int length = iArr.length - 1; length >= 0; length--) {
            bArr[length] = (byte) ((iArr[length] >> 24) & 255);
        }
        return bArr;
    }

    static /* synthetic */ int[] a() {
        int[] iArr = a;
        if (iArr == null) {
            iArr = new int[org.andengine.opengl.c.c.valuesCustom().length];
            try {
                iArr[org.andengine.opengl.c.c.AI_88.ordinal()] = 8;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[org.andengine.opengl.c.c.A_8.ordinal()] = 6;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[org.andengine.opengl.c.c.I_8.ordinal()] = 7;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[org.andengine.opengl.c.c.RGBA_4444.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[org.andengine.opengl.c.c.RGBA_5551.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[org.andengine.opengl.c.c.RGBA_8888.ordinal()] = 4;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[org.andengine.opengl.c.c.RGB_565.ordinal()] = 5;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[org.andengine.opengl.c.c.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            a = iArr;
        }
        return iArr;
    }

    public static int[] a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return iArr;
    }

    public static int[] a(int[] iArr, ByteOrder byteOrder) {
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            for (int length = iArr.length - 1; length >= 0; length--) {
                int i = iArr[length];
                iArr[length] = ((i >> 16) & 255) | ((-16711936) & i) | ((i << 16) & 16711680);
            }
        } else {
            for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
                int i2 = iArr[length2];
                iArr[length2] = ((i2 >> 24) & 255) | ((i2 << 8) & (-256));
            }
        }
        return iArr;
    }

    public static short[] b(int[] iArr, ByteOrder byteOrder) {
        short[] sArr = new short[iArr.length];
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            for (int length = iArr.length - 1; length >= 0; length--) {
                int i = iArr[length];
                sArr[length] = (short) (((i << 5) & 7936) | ((i >> 16) & 248) | ((i >> 13) & 7) | ((i << 3) & 57344));
            }
        } else {
            for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
                int i2 = iArr[length2];
                sArr[length2] = (short) (((i2 >> 3) & 31) | ((i2 >> 8) & 63488) | ((i2 >> 5) & 2016));
            }
        }
        return sArr;
    }

    public static short[] c(int[] iArr, ByteOrder byteOrder) {
        short[] sArr = new short[iArr.length];
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            for (int length = iArr.length - 1; length >= 0; length--) {
                int i = iArr[length];
                sArr[length] = (short) (((i >> 20) & 3840) | ((i >> 16) & 240) | ((i >> 12) & 15) | ((i << 8) & 61440));
            }
        } else {
            for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
                int i2 = iArr[length2];
                sArr[length2] = (short) (((i2 >> 28) & 15) | ((i2 >> 8) & 61440) | ((i2 >> 4) & 3840) | (i2 & 240));
            }
        }
        return sArr;
    }
}
