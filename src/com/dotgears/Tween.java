package com.dotgears;

public class Tween {
    public float value;
    public float normalizedValue;
    public float delta;
    public float start;
    public float end;
    public int easingType;
    public boolean finished = true;
    private int totalFrames;
    private int currentFrame;
    private float frameProgress;

    public void update(final float secondsElapsed) {
        if (this.finished) {
            return;
        }
        this.currentFrame++;
        this.normalizedValue = this.currentFrame * this.frameProgress;
        switch (this.easingType) {
            case 1: this.normalizedValue = MathUtils.easingCubicOut((int) (this.normalizedValue * 100.0f)); break;
            case 2: this.normalizedValue = MathUtils.easingQuadraticOut((int) (this.normalizedValue * 100.0f)); break;
            case 3: this.normalizedValue = MathUtils.easingCubicIn((int) (this.normalizedValue * 100.0f)); break;
            case 4: this.normalizedValue = MathUtils.easingCubicOut((int) (this.normalizedValue * 100.0f)); break;
            case 5: this.normalizedValue = MathUtils.easingCubicInOut((int) (this.normalizedValue * 100.0f)); break;
            case 6: this.normalizedValue = MathUtils.easingQuarticIn((int) (this.normalizedValue * 100.0f)); break;
            case 7: this.normalizedValue = MathUtils.easingQuarticOut((int) (this.normalizedValue * 100.0f)); break;
            case 8: this.normalizedValue = MathUtils.easingQuarticInOut((int) (this.normalizedValue * 100.0f)); break;
            case 9: this.normalizedValue = MathUtils.easingQuinticIn((int) (this.normalizedValue * 100.0f)); break;
            case 10: this.normalizedValue = MathUtils.easingQuinticOut((int) (this.normalizedValue * 100.0f)); break;
            case 11: this.normalizedValue = MathUtils.easingQuinticInOut((int) (this.normalizedValue * 100.0f)); break;
            case 12: this.normalizedValue = MathUtils.easingElasticIn((int) (this.normalizedValue * 100.0f)); break;
            case 13: this.normalizedValue = MathUtils.easingElasticOut((int) (this.normalizedValue * 100.0f)); break;
            case 14: this.normalizedValue = MathUtils.easingElasticInOut((int) (this.normalizedValue * 100.0f)); break;
            case 15: this.normalizedValue = MathUtils.easingBackIn((int) (this.normalizedValue * 100.0f)); break;
            case 16: this.normalizedValue = MathUtils.easingBackOut((int) (this.normalizedValue * 100.0f)); break;
            case 17: this.normalizedValue = MathUtils.easingBackInOut((int) (this.normalizedValue * 100.0f)); break;
            case 18: this.normalizedValue = MathUtils.easingBounceIn((int) (this.normalizedValue * 100.0f)); break;
            case 19: this.normalizedValue = MathUtils.easingBounceOut((int) (this.normalizedValue * 100.0f)); break;
            case 20: this.normalizedValue = MathUtils.easingBounceInOut((int) (this.normalizedValue * 100.0f)); break;
        }
        this.value = (this.normalizedValue * this.delta) + this.start;
        if (this.currentFrame == this.totalFrames) {
            this.finished = true;
            this.value = this.end;
            this.normalizedValue = 1.0f;
        }
    }

    public void start(final float start, final float end, final int easingType, final float seconds) {
        this.start = start;
        this.end = end;
        this.delta = end - start;
        this.totalFrames = (int) (60.0f * seconds);
        this.frameProgress = 1.0f / this.totalFrames;
        this.currentFrame = 0;
        this.easingType = easingType;
        this.finished = false;
        this.value = start;
    }
}
