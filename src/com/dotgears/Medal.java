package com.dotgears;

public class Medal extends GameEntity {
    public int x;
    public int y;
    public int width;
    public int height;
    public int medalIndex;
    private int sparkleTimer;
    private final AtlasRegion[] medals = GameController.current.findRegions("medals");

    @Override
    public void update(final float secondsElapsed) {
        if (this.active && this.sparkleTimer > 0) {
            this.sparkleTimer--;
            if (this.sparkleTimer <= 0) {
                this.sparkleTimer = 30;
                GameController.current.spawnBlink((this.x - 3) + MathUtils.randomInt(0, this.width + 6),
                        (this.y - 3) + MathUtils.randomInt(0, this.height + 6));
            }
        }
    }

    public void select(final int medalIndex) {
        this.x = 0;
        this.y = 0;
        this.width = 44;
        this.height = 44;
        this.medalIndex = medalIndex;
        this.sparkleTimer = 30;
        this.active = true;
        this.visible = true;
    }

    @Override
    public void draw(final GameController game) {
        if (this.visible) {
            final AtlasRegion region = this.medals[this.medalIndex];
            game.drawRegion(region.id, this.x, this.y, 1.0f, 1.0f, 1.0f);
        }
    }
}
