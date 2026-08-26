package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import com.google.android.gms.internal.dr;

/* JADX INFO: loaded from: classes.dex */
final class b extends dr {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.dr
    public int a(f fVar, Bitmap bitmap) {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.dr
    public void a(boolean z, f fVar, Bitmap bitmap, Bitmap bitmap2) {
        super.a(z, (Object) fVar, (Object) bitmap, (Object) bitmap2);
    }
}
