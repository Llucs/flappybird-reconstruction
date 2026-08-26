package org.andengine.opengl.c.a.a.a;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import org.andengine.d.d;

/* JADX INFO: loaded from: classes.dex */
public class a extends org.andengine.opengl.c.a.b.a implements b {
    private final AssetManager e;
    private final String f;

    a(AssetManager assetManager, String str, int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.e = assetManager;
        this.f = str;
    }

    public static a a(AssetManager assetManager, String str) {
        return a(assetManager, str, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static a a(AssetManager assetManager, String str, int i, int i2) {
        ?? Open = 0;
        Open = 0;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            Open = assetManager.open(str);
            BitmapFactory.decodeStream(Open, null, options);
        } catch (IOException e) {
            org.andengine.d.e.a.b("Failed loading Bitmap in AssetBitmapTextureAtlasSource. AssetPath: " + str, e);
        } finally {
            d.a(Open);
        }
        Open = assetManager;
        return new a(Open, str, i, i2, options.outWidth, options.outHeight);
    }

    @Override // org.andengine.opengl.c.a.a.a.b
    public Bitmap a(Bitmap.Config config) throws Throwable {
        InputStream inputStreamOpen;
        Throwable th;
        Bitmap bitmapDecodeStream = null;
        try {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = config;
                inputStreamOpen = this.e.open(this.f);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options);
                    d.a(inputStreamOpen);
                } catch (IOException e) {
                    e = e;
                    org.andengine.d.e.a.b("Failed loading Bitmap in " + getClass().getSimpleName() + ". AssetPath: " + this.f, e);
                    d.a(inputStreamOpen);
                }
            } catch (Throwable th2) {
                th = th2;
                d.a(inputStreamOpen);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            inputStreamOpen = null;
            th = th3;
            d.a(inputStreamOpen);
            throw th;
        }
        return bitmapDecodeStream;
    }

    @Override // org.andengine.opengl.c.a.b.a
    public String toString() {
        return String.valueOf(getClass().getSimpleName()) + "(" + this.f + ")";
    }
}
