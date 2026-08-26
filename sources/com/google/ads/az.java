package com.google.ads;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class az {
    private static az c = null;
    private BigInteger b = BigInteger.ONE;
    private final BigInteger a = d();

    private az() {
    }

    public static synchronized az a() {
        if (c == null) {
            c = new az();
        }
        return c;
    }

    private static byte[] a(long j) {
        return BigInteger.valueOf(j).toByteArray();
    }

    private static BigInteger d() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            UUID uuidRandomUUID = UUID.randomUUID();
            messageDigest.update(a(uuidRandomUUID.getLeastSignificantBits()));
            messageDigest.update(a(uuidRandomUUID.getMostSignificantBits()));
            byte[] bArr = new byte[9];
            bArr[0] = 0;
            System.arraycopy(messageDigest.digest(), 0, bArr, 1, 8);
            return new BigInteger(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Cannot find MD5 message digest algorithm.");
        }
    }

    public synchronized BigInteger b() {
        return this.a;
    }

    public synchronized BigInteger c() {
        BigInteger bigInteger;
        bigInteger = this.b;
        this.b = this.b.add(BigInteger.ONE);
        return bigInteger;
    }
}
