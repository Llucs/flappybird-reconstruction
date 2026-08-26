package com.dotgears;

public class AnimatedEntity extends GameEntity {
    public int x;
    public int y;
    public int frameState;
    public int width;
    public int height;
    public int offsetX;
    public int offsetY;
    public float scale = 1.0f;
    public BirdAnimation currentAnimation;
    public boolean animationFinished;
    public boolean animationActive;
    public boolean animationEnabled;
    public boolean animationVisible;
    BirdAnimation[] animations = new BirdAnimation[10];
    public int regionCount;
    public AtlasRegion[] frames;

    public void update(final float secondsElapsed) {
        if (this.animationEnabled && this.currentAnimation != null) {
            this.currentAnimation.update(secondsElapsed);
        }
    }

    public void setPosition(final int x, final int y) {
        this.x = x;
        this.y = y;
        this.frameState = 0;
        this.animationEnabled = true;
        this.animationVisible = true;
        this.animationFinished = false;
        this.animationActive = false;
        this.scale = 1.0f;
    }

    public void defineAnimation(final int animationIndex, final String name, final int[] frameIndexes, final int frameCount, final int framesPerSecond, final boolean loop) {
        this.animations[animationIndex] = new BirdAnimation(animationIndex, name, frameIndexes, frameCount, framesPerSecond, loop);
    }

    public void setAnimation(final int animationIndex, final boolean reset) {
        if (reset) {
            this.animations[animationIndex].reset();
        }
        this.animations[animationIndex].activate();
        this.currentAnimation = this.animations[animationIndex];
    }

    @Override
    public void draw(final GameController game) {
        if (this.animationVisible) {
            AtlasRegion region = this.frames[0];
            if (this.currentAnimation != null) {
                region = this.frames[this.currentAnimation.currentFrame];
            }
            game.drawRegion(region.id, this.x - this.offsetX, this.y - this.offsetY,
                    1.0f, 1.0f, this.scale);
        }
    }

    public void configureSprite(final String name, final int width, final int height, final int offsetX, final int offsetY) {
        this.frames = GameController.current.findRegions(name);
        this.regionCount = this.frames.length;
        if (width == 0 || height == 0) {
            this.width = this.frames[0].width;
            this.height = this.frames[0].height;
        } else {
            this.width = width;
            this.height = height;
        }
        if (offsetX == 0 || offsetY == 0) {
            this.offsetX = (this.frames[0].width - this.width) >> 1;
            this.offsetY = (this.frames[0].height - this.height) >> 1;
        } else {
            this.offsetX = offsetX;
            this.offsetY = offsetY;
        }
    }
}
