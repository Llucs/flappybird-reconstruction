package com.google.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ai extends ah {
    private static Method d = null;
    private static Method e = null;
    private static Method f = null;
    private static Method g = null;
    private static Method h = null;
    private static String i = null;
    private static long j = 0;
    static boolean c = false;

    protected ai(Context context) {
        super(context);
    }

    public static ai a(String str, Context context) {
        b(str, context);
        return new ai(context);
    }

    static String a() throws aj {
        if (i == null) {
            throw new aj();
        }
        return i;
    }

    static ArrayList a(MotionEvent motionEvent, DisplayMetrics displayMetrics) throws aj {
        if (g == null || motionEvent == null) {
            throw new aj();
        }
        try {
            return (ArrayList) g.invoke(null, motionEvent, displayMetrics);
        } catch (IllegalAccessException e2) {
            throw new aj(e2);
        } catch (InvocationTargetException e3) {
            throw new aj(e3);
        }
    }

    static Long b() throws aj {
        if (d == null) {
            throw new aj();
        }
        try {
            return (Long) d.invoke(null, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new aj(e2);
        } catch (InvocationTargetException e3) {
            throw new aj(e3);
        }
    }

    private static String b(byte[] bArr, String str) throws aj {
        try {
            return new String(am.a(bArr, str), "UTF-8");
        } catch (an e2) {
            throw new aj(e2);
        } catch (ap e3) {
            throw new aj(e3);
        } catch (UnsupportedEncodingException e4) {
            throw new aj(e4);
        }
    }

    protected static synchronized void b(String str, Context context) {
        if (!c) {
            try {
                i = str;
                f(context);
                j = b().longValue();
                c = true;
            } catch (aj e2) {
            } catch (UnsupportedOperationException e3) {
            }
        }
    }

    static String c() throws aj {
        if (e == null) {
            throw new aj();
        }
        try {
            return (String) e.invoke(null, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new aj(e2);
        } catch (InvocationTargetException e3) {
            throw new aj(e3);
        }
    }

    static String d(Context context) throws aj {
        if (h == null) {
            throw new aj();
        }
        try {
            String str = (String) h.invoke(null, context);
            if (str == null) {
                throw new aj();
            }
            return str;
        } catch (IllegalAccessException e2) {
            throw new aj(e2);
        } catch (InvocationTargetException e3) {
            throw new aj(e3);
        }
    }

    static String e(Context context) throws aj {
        if (f == null) {
            throw new aj();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f.invoke(null, context);
            if (byteBuffer == null) {
                throw new aj();
            }
            return aq.a(byteBuffer.array(), false);
        } catch (IllegalAccessException e2) {
            throw new aj(e2);
        } catch (InvocationTargetException e3) {
            throw new aj(e3);
        }
    }

    private static void f(Context context) throws aj {
        try {
            byte[] bArrA = am.a(ao.a());
            byte[] bArrA2 = am.a(bArrA, ao.b());
            File cacheDir = context.getCacheDir();
            if (cacheDir == null && (cacheDir = context.getDir("dex", 0)) == null) {
                throw new aj();
            }
            File fileCreateTempFile = File.createTempFile("ads", ".jar", cacheDir);
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(bArrA2, 0, bArrA2.length);
            fileOutputStream.close();
            DexClassLoader dexClassLoader = new DexClassLoader(fileCreateTempFile.getAbsolutePath(), cacheDir.getAbsolutePath(), null, context.getClassLoader());
            Class clsLoadClass = dexClassLoader.loadClass(b(bArrA, ao.c()));
            Class clsLoadClass2 = dexClassLoader.loadClass(b(bArrA, ao.i()));
            Class clsLoadClass3 = dexClassLoader.loadClass(b(bArrA, ao.g()));
            Class clsLoadClass4 = dexClassLoader.loadClass(b(bArrA, ao.k()));
            Class clsLoadClass5 = dexClassLoader.loadClass(b(bArrA, ao.e()));
            d = clsLoadClass.getMethod(b(bArrA, ao.d()), new Class[0]);
            e = clsLoadClass2.getMethod(b(bArrA, ao.j()), new Class[0]);
            f = clsLoadClass3.getMethod(b(bArrA, ao.h()), Context.class);
            g = clsLoadClass4.getMethod(b(bArrA, ao.l()), MotionEvent.class, DisplayMetrics.class);
            h = clsLoadClass5.getMethod(b(bArrA, ao.f()), Context.class);
            String name = fileCreateTempFile.getName();
            fileCreateTempFile.delete();
            new File(cacheDir, name.replace(".jar", ".dex")).delete();
        } catch (an e2) {
            throw new aj(e2);
        } catch (ap e3) {
            throw new aj(e3);
        } catch (FileNotFoundException e4) {
            throw new aj(e4);
        } catch (IOException e5) {
            throw new aj(e5);
        } catch (ClassNotFoundException e6) {
            throw new aj(e6);
        } catch (NoSuchMethodException e7) {
            throw new aj(e7);
        } catch (NullPointerException e8) {
            throw new aj(e8);
        }
    }

    @Override // com.google.ads.ah
    protected void b(Context context) {
        try {
            try {
                a(1, c());
            } catch (IOException e2) {
                return;
            }
        } catch (aj e3) {
        }
        try {
            a(2, a());
        } catch (aj e4) {
        }
        try {
            a(25, b().longValue());
        } catch (aj e5) {
        }
        try {
            a(24, d(context));
        } catch (aj e6) {
        }
    }

    @Override // com.google.ads.ah
    protected void c(Context context) {
        try {
            try {
                a(2, a());
            } catch (aj e2) {
            }
            try {
                a(1, c());
            } catch (aj e3) {
            }
            try {
                long jLongValue = b().longValue();
                a(25, jLongValue);
                if (j != 0) {
                    a(17, jLongValue - j);
                    a(23, j);
                }
            } catch (aj e4) {
            }
            try {
                ArrayList arrayListA = a(this.a, this.b);
                a(14, ((Long) arrayListA.get(0)).longValue());
                a(15, ((Long) arrayListA.get(1)).longValue());
                if (arrayListA.size() >= 3) {
                    a(16, ((Long) arrayListA.get(2)).longValue());
                }
            } catch (aj e5) {
            }
            try {
                a(27, e(context));
            } catch (aj e6) {
            }
        } catch (IOException e7) {
        }
    }
}
