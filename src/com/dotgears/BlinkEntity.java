package com.dotgears;

public class BlinkEntity extends AnimatedEntity {
    public BlinkEntity() {
        configureSprite("blink", 10, 10, 4, 4);
        defineAnimation(0, "blink", new int[]{0, 1, 2, 1}, 4, 10, false);
        this.animationEnabled = false;
        this.animationVisible = false;
        setAnimation(0, true);
    }

    @Override
    public void update(final float secondsElapsed) {
        if (this.animationEnabled) {
            super.update(secondsElapsed);
            if (this.currentAnimation == null || !this.currentAnimation.finished) {
                return;
            }
            this.animationEnabled = false;
            this.animationVisible = false;
        }
    }

    @Override
    public void setPosition(final int x, final int y) {
        super.setPosition(x, y);
        setAnimation(0, true);
    }

    @Override
    public void draw(final GameController game) {
        if (this.animationVisible) {
            super.draw(game);
        }
    }
}
