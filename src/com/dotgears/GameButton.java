package com.dotgears;

public class GameButton extends GameEntity {
    public AtlasRegion region;
    public int x;
    public int y;
    public int width;
    public int height;
    public boolean pressed;
    public boolean entered;
    public boolean released;
    public boolean inside;

    @Override
    public void update(final float secondsElapsed) {
        final int touchCount = GameController.current.touchCount;
        final int[] touchX = GameController.current.touchX;
        final int[] touchY = GameController.current.touchY;
        this.inside = false;
        for (int index = 0; index < touchCount; index++) {
            if (touchX[index] > this.x && touchX[index] < this.x + this.width
                    && touchY[index] > this.y && touchY[index] < this.y + this.height) {
                this.inside = true;
                break;
            }
        }
        this.entered = false;
        this.released = false;
        if (this.inside != this.pressed) {
            if (this.pressed) {
                this.released = true;
                this.pressed = false;
            } else {
                this.entered = true;
                this.pressed = true;
            }
        }
    }

    public void setPosition(final int x, final int y) {
        this.x = x;
        this.y = y;
        this.active = true;
        this.visible = true;
        this.inside = false;
        this.entered = false;
        this.released = false;
        this.pressed = false;
    }

    @Override
    public void draw(final GameController game) {
        if (this.pressed) {
            game.drawRegion(this.region, this.x, this.y + 2, 1.0f);
        } else {
            game.drawRegion(this.region, this.x, this.y, 1.0f);
        }
    }

    public void load(final String name) {
        this.region = GameController.current.findRegion(name);
        this.width = this.region.width;
        this.height = this.region.height;
    }
}
