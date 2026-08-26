package com.dotgears;

public class FloatingScore extends GameEntity {
    public boolean showPlus;
    public int duration;
    public int value;
    public int digitCount;
    public int verticalVelocity;
    public int velocityStep;
    public int frame;
    public int x;
    public int y;
    public int baselineOffset;
    public int digitWidth = 12;
    public int digitSpacing = 14;
    private AtlasRegion[] numberRegions = GameController.current.findRegions("number_context");

    @Override
    public void update(final float secondsElapsed) {
        if (this.active && this.duration > 0) {
            this.duration--;
            if (this.verticalVelocity < 2) {
                this.y += this.verticalVelocity;
                this.frame++;
                if (this.frame == 4) {
                    this.frame = 0;
                    this.verticalVelocity += this.velocityStep;
                }
            }
            if (this.duration <= 0) {
                this.active = false;
                this.visible = false;
            }
        }
    }

    @Override
    public void draw(final GameController game) {
        if (this.visible) {
            if (this.showPlus) {
                game.drawRegion(this.numberRegions[10].id, this.x, this.y, 1.0f, 1.0f, 1.0f);
            }
            drawDigits(game, this.value, this.x + this.baselineOffset, this.y, false, this.digitCount);
        }
    }

    public void drawDigits(final GameController game, final int value, final int x, final int y,
                           final boolean leading, final int digitCount) {
        int drawX = x - this.digitWidth;
        boolean firstDigit = true;
        int currentValue = value;
        int remainingDigits = digitCount;
        while (remainingDigits > 0) {
            int nextValue;
            if (currentValue > 0 || firstDigit) {
                final int digit = currentValue % 10;
                game.drawRegion(this.numberRegions[digit].id, drawX, y, 1.0f, 1.0f, 1.0f);
                nextValue = currentValue / 10;
                drawX = digit != 1 ? drawX - (this.digitWidth - 2) : drawX - 4;
                firstDigit = leading;
            } else {
                nextValue = currentValue;
            }
            remainingDigits--;
            currentValue = nextValue;
        }
    }
}
