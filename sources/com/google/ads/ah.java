package com.google.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public abstract class ah implements ag {
    protected DisplayMetrics b;
    private aw c = null;
    private ByteArrayOutputStream d = null;
    protected MotionEvent a = null;

    protected ah(Context context) {
        this.b = null;
        try {
            this.b = context.getResources().getDisplayMetrics();
        } catch (UnsupportedOperationException e) {
            this.b = new DisplayMetrics();
            this.b.density = 1.0f;
        }
    }

    private String a(Context context, String str, boolean z) {
        try {
            a();
            if (z) {
                c(context);
            } else {
                b(context);
            }
            byte[] bArrB = b();
            return bArrB.length == 0 ? Integer.toString(5) : a(bArrB, str);
        } catch (UnsupportedEncodingException e) {
            return Integer.toString(7);
        } catch (IOException e2) {
            return Integer.toString(3);
        } catch (NoSuchAlgorithmException e3) {
            return Integer.toString(7);
        }
    }

    private void a() {
        this.d = new ByteArrayOutputStream();
        this.c = aw.a(this.d);
    }

    private byte[] b() throws IOException {
        this.c.a();
        return this.d.toByteArray();
    }

    @Override // com.google.ads.ag
    public String a(Context context) {
        return a(context, (String) null, false);
    }

    @Override // com.google.ads.ag
    public String a(Context context, String str) {
        return a(context, str, true);
    }

    String a(byte[] bArr, String str) throws NoSuchAlgorithmException, IOException {
        byte[] bArrArray;
        if (bArr.length > 239) {
            a();
            a(20, 1L);
            bArr = b();
        }
        if (bArr.length < 239) {
            byte[] bArr2 = new byte[239 - bArr.length];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr).array();
        }
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(bArrArray);
        byte[] bArrArray2 = ByteBuffer.allocate(256).put(messageDigest.digest()).put(bArrArray).array();
        byte[] bArr3 = new byte[256];
        new q().a(bArrArray2, bArr3);
        if (str != null && str.length() > 0) {
            a(str, bArr3);
        }
        return aq.a(bArr3, false);
    }

    public void a(int i, int i2, int i3) {
        if (this.a != null) {
            this.a.recycle();
        }
        this.a = MotionEvent.obtain(0L, i3, 1, i * this.b.density, i2 * this.b.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
    }

    protected void a(int i, long j) throws IOException {
        this.c.a(i, j);
    }

    protected void a(int i, String str) throws IOException {
        this.c.a(i, str);
    }

    public void a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.a != null) {
                this.a.recycle();
            }
            this.a = MotionEvent.obtain(motionEvent);
        }
    }

    void a(String str, byte[] bArr) {
        if (str.length() > 32) {
            str = str.substring(0, 32);
        }
        new ar(str.getBytes("UTF-8")).a(bArr);
    }

    protected abstract void b(Context context);

    protected abstract void c(Context context);
}
