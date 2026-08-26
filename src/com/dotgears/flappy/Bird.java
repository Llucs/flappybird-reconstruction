package com.dotgears.flappy;

import com.dotgears.AnimatedEntity;
import com.dotgears.BlinkEntity;
import com.dotgears.GameController;
import com.dotgears.GameEntity;
import com.dotgears.MathUtils;

public class Bird extends AnimatedEntity {
    private BlinkEntity blink;
    private int wingTimer = 30;
    float rotation;
    float rotationVelocity;
    float rotationAcceleration;
    float verticalVelocity;
    float verticalAcceleration;
    boolean crashed;
    boolean ready;
    int wingPhase;
    float idleOffset;
    int color;

    public Bird() {
        configureSprite("bird", 20, 20, 14, 14);
        final int[] wingFrames = new int[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1};
        defineAnimation(0, "flap", wingFrames, 12, 30, false);
        defineAnimation(1, "auto", wingFrames, 12, 10, true);
        this.ready = true;
        this.color = MathUtils.random() % 3;
        this.blink = new BlinkEntity();
    }

    public void reset() {
        super.setPosition(80, 246);
        this.rotation = 0.0f;
        this.verticalVelocity = 0.0f;
        this.verticalAcceleration = 1.0f;
        this.rotationAcceleration = 0.4f;
        this.crashed = false;
        this.ready = true;
        this.wingPhase = 0;
        setAnimation(1, true);
        this.color = MathUtils.random() % 3;
    }

    @Override
    public void update(final float secondsElapsed) {
        super.update(secondsElapsed);
        if (this.ready) {
            this.wingPhase += 8;
            if (this.wingPhase == 360) {
                this.wingPhase = 0;
            }
            this.idleOffset = MathUtils.sine(this.wingPhase) * 4.0f;
            return;
        }
        this.idleOffset = 0.0f;
        this.verticalVelocity += this.verticalAcceleration;
        if (this.verticalVelocity > 8.0f) {
            this.verticalVelocity = 8.0f;
        }
        this.y = (int) (this.y + this.verticalVelocity);
        if (this.y > 400 - this.height) {
            this.y = 400 - this.height;
            this.verticalAcceleration = 0.0f;
            this.verticalVelocity = 0.0f;
        }
        this.rotation += this.rotationVelocity;
        this.rotationVelocity += this.rotationAcceleration;
        if (this.rotation < -20.0f) {
            this.rotation = -20.0f;
        }
        if (this.rotation > 90.0f) {
            this.rotation = 90.0f;
        }
        this.wingTimer--;
        if (this.wingTimer == 0) {
            this.wingTimer = 30;
        }
        if (this.blink.active) {
            this.blink.update(secondsElapsed);
        }
    }

    @Override
    public void draw(final GameController game) {
        if (this.animationVisible) {
            com.dotgears.AtlasRegion region = this.frames[(this.color * 3) + 1];
            if (this.currentAnimation != null && !this.currentAnimation.finished) {
                region = this.frames[this.currentAnimation.currentFrame + (this.color * 3)];
            }
            game.drawRegion(region, this.x - this.offsetX,
                    ((int) this.idleOffset) + (this.y - this.offsetY), 1.0f, (int) this.rotation);
        }
    }

    public void flap() {
        if (this.ready) {
            this.ready = false;
        }
        if (this.y >= 0 && !this.crashed) {
            setAnimation(0, true);
            this.verticalVelocity = -5.0f;
            this.verticalAcceleration = 0.3f;
            this.rotationVelocity = -10.0f;
            this.rotationAcceleration = 0.4f;
            GameController.current.queueEvent(4, (GameEntity) null, 5);
        }
    }
}
