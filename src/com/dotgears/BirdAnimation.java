package com.dotgears;

public class BirdAnimation {
    public boolean finished;
    public final String name;
    public final int frameCount;
    public final int[] frames;
    public final float frameDuration;
    public final boolean loop;
    public final int id;
    public int elapsedMilliseconds;
    public int frameIndex;
    public int currentFrame;

    public BirdAnimation(final int id, final String name, final int[] frames, final int frameCount, final int framesPerSecond, final boolean loop) {
        this.name = name;
        this.frameCount = frameCount;
        this.frames = new int[this.frameCount];
        System.arraycopy(frames, 0, this.frames, 0, this.frameCount);
        this.frameDuration = 1000.0f / framesPerSecond;
        this.loop = loop;
        this.id = id;
    }

    public void reset() {
        this.elapsedMilliseconds = 0;
        this.frameIndex = 0;
        this.currentFrame = this.frames[0];
    }

    public void update(final float secondsElapsed) {
        if (this.finished) {
            return;
        }
        this.elapsedMilliseconds += 15;
        if (this.elapsedMilliseconds >= this.frameDuration) {
            this.elapsedMilliseconds = 0;
            this.frameIndex++;
            if (this.frameIndex >= this.frameCount) {
                if (this.loop) {
                    this.frameIndex = 0;
                } else {
                    this.finished = true;
                    this.frameIndex = this.frameCount - 1;
                }
            }
            this.currentFrame = this.frames[this.frameIndex];
        }
    }

    public void activate() {
        if (!this.loop && this.finished) {
            reset();
        }
        this.finished = false;
    }
}
