package com.dotgears;

public class EntityPool {
    private final GameEntity[] items = new GameEntity[64];
    private int count;
    private int cursor;

    public int size() {
        return this.count;
    }

    public void update(final float secondsElapsed) {
        for (int index = 0; index < this.count; index++) {
            this.items[index].update(secondsElapsed);
        }
    }

    public void draw(final GameController game) {
        for (int index = 0; index < this.count; index++) {
            this.items[index].draw(game);
        }
    }

    public void add(final GameEntity entity) {
        if (this.count < this.items.length) {
            this.items[this.count++] = entity;
        }
    }

    public void clearVisibility() {
        for (int index = 0; index < this.count; index++) {
            this.items[index].active = false;
            this.items[index].visible = false;
        }
    }

    public GameEntity nextInactive() {
        for (int attempt = 0; attempt < this.count; attempt++) {
            this.cursor = (this.cursor + 1) % this.count;
            final GameEntity entity = this.items[this.cursor];
            if (!entity.active) {
                return entity;
            }
        }
        return this.items[0];
    }
}
