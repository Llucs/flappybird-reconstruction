package com.google.ads.a;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class aj implements DialogInterface.OnClickListener {
    final /* synthetic */ ah a;

    aj(ah ahVar) {
        this.a = ahVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        new Thread(new ae(this.a.c.c(), this.a.b.getApplicationContext())).start();
    }
}
