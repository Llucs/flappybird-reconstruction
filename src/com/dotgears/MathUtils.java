package com.dotgears;

import android.util.Log;

public class MathUtils {
    public static float rotatedX;
    public static float rotatedY;
    public static float[] sineTable;
    public static float[] cosineTable;
    public static float[] easeQuadraticIn;
    public static float[] easeQuadraticOut;
    public static float[] easeQuadraticInOut;
    public static float[] easeCubicIn;
    public static float[] easeCubicOut;
    public static float[] easeCubicInOut;
    public static float[] easeQuarticIn;
    public static float[] easeQuarticOut;
    public static float[] easeQuarticInOut;
    public static float[] easeQuinticIn;
    public static float[] easeQuinticOut;
    public static float[] easeQuinticInOut;
    public static float[] easeElasticIn;
    public static float[] easeElasticOut;
    public static float[] easeElasticInOut;
    public static float[] easeBackIn;
    public static float[] easeBackOut;
    public static float[] easeBackInOut;
    public static float[] easeBounceIn;
    public static float[] easeBounceOut;
    public static float[] easeBounceInOut;
    public static MathUtils instance;
    public static int randomSeedA;
    public static int randomSeedB;

    MathUtils() {
        sineTable = new float[360];
        cosineTable = new float[360];
        for (int index = 0; index < 360; index++) {
            final float radians = (index * 3.1415925f) / 180.0f;
            sineTable[index] = (float) Math.sin(radians);
            cosineTable[index] = (float) Math.cos(radians);
        }
        easeQuadraticIn = new float[101];
        easeQuadraticOut = new float[101];
        easeQuadraticInOut = new float[101];
        easeCubicIn = new float[101];
        easeCubicOut = new float[101];
        easeCubicInOut = new float[101];
        easeQuarticIn = new float[101];
        easeQuarticOut = new float[101];
        easeQuarticInOut = new float[101];
        easeQuinticIn = new float[101];
        easeQuinticOut = new float[101];
        easeQuinticInOut = new float[101];
        easeElasticIn = new float[101];
        easeElasticOut = new float[101];
        easeElasticInOut = new float[101];
        easeBackIn = new float[101];
        easeBackOut = new float[101];
        easeBackInOut = new float[101];
        easeBounceIn = new float[101];
        easeBounceOut = new float[101];
        easeBounceInOut = new float[101];
        for (int index = 0; index <= 100; index++) {
            final double progress = index / 100.0d;
            easeQuadraticIn[index] = (float) quadraticIn(progress);
            easeQuadraticOut[index] = (float) quadraticOut(progress);
            easeQuadraticInOut[index] = (float) quadraticInOut(progress);
            easeCubicIn[index] = (float) cubicIn(progress);
            easeCubicOut[index] = (float) cubicOut(progress);
            easeCubicInOut[index] = (float) cubicInOut(progress);
            easeQuarticIn[index] = (float) quarticIn(progress);
            easeQuarticOut[index] = (float) quarticOut(progress);
            easeQuarticInOut[index] = (float) quarticInOut(progress);
            easeQuinticIn[index] = (float) quinticIn(progress);
            easeQuinticOut[index] = (float) quinticOut(progress);
            easeQuinticInOut[index] = (float) quinticInOut(progress);
            easeElasticIn[index] = (float) elasticIn(progress);
            easeElasticOut[index] = (float) elasticOut(progress);
            easeElasticInOut[index] = (float) elasticInOut(progress);
            easeBackIn[index] = (float) backIn(progress);
            easeBackOut[index] = (float) backOut(progress);
            easeBackInOut[index] = (float) backInOut(progress);
            easeBounceIn[index] = (float) bounceIn(progress);
            easeBounceOut[index] = (float) bounceOut(progress);
            easeBounceInOut[index] = (float) bounceInOut(progress);
        }
    }

    public static float normalizeAngle(float angle) {
        while (angle > 360.0f) {
            angle -= 360.0f;
        }
        while (angle < 0.0f) {
            angle += 360.0f;
        }
        return angle;
    }

    public static int random() {
        randomSeedB = (36969 * (randomSeedB & 65535)) + (randomSeedB >> 16);
        randomSeedA = ((randomSeedA & 65535) * 18000) + (randomSeedA >> 16);
        return Math.abs((randomSeedB << 16) + randomSeedA);
    }

    public static int randomInt(final int minimum, final int maximum) {
        return (random() % (maximum - minimum)) + minimum;
    }

    public static void rotate(final float x, final float y, final float centerX, final float centerY, final float angle) {
        final float deltaX = x - centerX;
        final float deltaY = y - centerY;
        final float normalizedAngle = normalizeAngle(angle);
        rotatedX = ((cosine(normalizedAngle) * deltaX) - (sine(normalizedAngle) * deltaY)) + centerX;
        rotatedY = (deltaX * sine(normalizedAngle)) + (deltaY * cosine(normalizedAngle)) + centerY;
    }

    public static void randomize(final int seed) {
        Log.i("FlappyBird", "Engine: Randomize " + seed);
        randomSeedA = seed % 32000;
        randomSeedB = seed % 65535;
    }

    public static float sine(final float angle) {
        return sineTable[(int) angle];
    }

    public static float cosine(final float angle) {
        return cosineTable[(int) angle];
    }

    public static float easingCubicOut(final int index) { return easeCubicOut[index]; }
    public static float easingQuadraticOut(final int index) { return easeQuadraticOut[index]; }
    public static float easingQuadraticIn(final int index) { return easeQuadraticIn[index]; }
    public static float easingQuadraticInOut(final int index) { return easeQuadraticInOut[index]; }
    public static float easingCubicIn(final int index) { return easeCubicIn[index]; }
    public static float easingCubicInOut(final int index) { return easeCubicInOut[index]; }
    public static float easingQuarticIn(final int index) { return easeQuarticIn[index]; }
    public static float easingQuarticOut(final int index) { return easeQuarticOut[index]; }
    public static float easingQuarticInOut(final int index) { return easeQuarticInOut[index]; }
    public static float easingQuinticIn(final int index) { return easeQuinticIn[index]; }
    public static float easingQuinticOut(final int index) { return easeQuinticOut[index]; }
    public static float easingQuinticInOut(final int index) { return easeQuinticInOut[index]; }
    public static float easingElasticIn(final int index) { return easeElasticIn[index]; }
    public static float easingElasticOut(final int index) { return easeElasticOut[index]; }
    public static float easingElasticInOut(final int index) { return easeElasticInOut[index]; }
    public static float easingBackIn(final int index) { return easeBackIn[index]; }
    public static float easingBackOut(final int index) { return easeBackOut[index]; }
    public static float easingBackInOut(final int index) { return easeBackInOut[index]; }
    public static float easingBounceIn(final int index) { return easeBounceIn[index]; }
    public static float easingBounceOut(final int index) { return easeBounceOut[index]; }
    public static float easingBounceInOut(final int index) { return easeBounceInOut[index]; }

    static double quadraticIn(final double progress) { return progress * progress; }
    static double quadraticOut(final double progress) { return -((progress - 2.0d) * progress); }
    static double quadraticInOut(final double progress) { return progress < 0.5d ? 2.0d * progress * progress : (((-2.0d) * progress) * progress) + (4.0d * progress) - 1.0d; }
    static double cubicIn(final double progress) { return progress * progress * progress; }
    static double cubicOut(final double progress) { final double shifted = progress - 1.0d; return (shifted * shifted * shifted) + 1.0d; }
    static double cubicInOut(final double progress) { if (progress < 0.5d) return 4.0d * progress * progress * progress; final double shifted = (2.0d * progress) - 2.0d; return (shifted * 0.5d * shifted * shifted) + 1.0d; }
    static double quarticIn(final double progress) { return progress * progress * progress * progress; }
    static double quarticOut(final double progress) { final double shifted = progress - 1.0d; return (shifted * shifted * shifted * (1.0d - progress)) + 1.0d; }
    static double quarticInOut(final double progress) { if (progress < 0.5d) return 8.0d * progress * progress * progress * progress; final double shifted = progress - 1.0d; return (shifted * -8.0d * shifted * shifted * shifted) + 1.0d; }
    static double quinticIn(final double progress) { return progress * progress * progress * progress * progress; }
    static double quinticOut(final double progress) { final double shifted = progress - 1.0d; return (shifted * shifted * shifted * shifted * shifted) + 1.0d; }
    static double quinticInOut(final double progress) { if (progress < 0.5d) return 16.0d * progress * progress * progress * progress * progress; final double shifted = (2.0d * progress) - 2.0d; return (shifted * 0.5d * shifted * shifted * shifted * shifted) + 1.0d; }
    static double elasticIn(final double progress) { return Math.sin(20.420352248333657d * progress) * Math.pow(2.0d, 10.0d * (progress - 1.0d)); }
    static double elasticOut(final double progress) { return (Math.sin((-20.420352248333657d) * (progress + 1.0d)) * Math.pow(2.0d, (-10.0d) * progress)) + 1.0d; }
    static double elasticInOut(final double progress) { return progress < 0.5d ? Math.sin(20.420352248333657d * 2.0d * progress) * 0.5d * Math.pow(2.0d, 10.0d * ((2.0d * progress) - 1.0d)) : ((Math.sin((-20.420352248333657d) * (((2.0d * progress) - 1.0d) + 1.0d)) * Math.pow(2.0d, (-10.0d) * ((2.0d * progress) - 1.0d))) + 2.0d) * 0.5d; }
    static double backIn(final double progress) { return ((progress * progress) * progress) - (Math.sin(3.141592653589793d * progress) * progress); }
    static double backOut(final double progress) { final double inverse = 1.0d - progress; return 1.0d - (((inverse * inverse) * inverse) - (inverse * Math.sin(3.141592653589793d * inverse))); }
    static double backInOut(final double progress) { if (progress < 0.5d) { final double doubled = 2.0d * progress; return (((doubled * doubled) * doubled) - (doubled * Math.sin(3.141592653589793d * doubled))) * 0.5d; } final double inverse = 1.0d - ((2.0d * progress) - 1.0d); return ((1.0d - (((inverse * inverse) * inverse) - (inverse * Math.sin(3.141592653589793d * inverse)))) * 0.5d) + 0.5d; }
    static double bounceIn(final double progress) { return 1.0d - bounceOut(1.0d - progress); }
    static double bounceOut(final double progress) { return progress < 0.36363636363636365d ? ((121.0d * progress) * progress) / 16.0d : progress < 0.7272727272727273d ? (((9.075d * progress) * progress) - (9.9d * progress)) + 3.4d : progress < 0.9d ? (((12.066481994459833d * progress) * progress) - (19.63545706371191d * progress)) + 8.898060941828255d : (((10.8d * progress) * progress) - (20.52d * progress)) + 10.72d; }
    static double bounceInOut(final double progress) { return progress < 0.5d ? bounceIn(progress * 2.0d) * 0.5d : (bounceOut((progress * 2.0d) - 1.0d) * 0.5d) + 0.5d; }
}
