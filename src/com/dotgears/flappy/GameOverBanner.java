package com.dotgears.flappy;

import com.dotgears.AtlasRegion;
import com.dotgears.GameController;
import com.dotgears.GameEntity;
import com.dotgears.Tween;

public class GameOverBanner extends GameEntity {
    public final Tween alphaTween = new Tween();
    public final AtlasRegion image = GameController.current.findRegion("text_game_over");
    public int yOffset;
    public float velocity;
    public float acceleration;
    public int state;

    public void start() {
        this.active = true;
        this.visible = true;
        this.alphaTween.start(0.0f, 1.0f, 11, 1.0f);
        this.yOffset = -1;
        this.velocity = -2.0f;
        this.acceleration = 0.25f;
        this.state = 0;
        GameController.current.queueAction(10, 0);
    }

    @Override
    public void update(final float secondsElapsed) {
        this.alphaTween.update(secondsElapsed);
        if (this.yOffset < 0) {
            this.yOffset = (int) (this.yOffset + this.velocity);
            this.velocity += this.acceleration;
        } else {
            this.yOffset = 0;
        }
        switch (this.state) {
            case 0:
                if (this.alphaTween.finished) {
                    this.state = 1;
                    GameController.current.scorePanel.startDisplay(GameController.current.score, GameController.current.bestScore, 10, 20, 30, 40);
                    GameController.current.queueAction(10, 0);
                }
                break;
            case 1:
                if (GameController.current.scorePanel.state == 2) {
                    this.state = 2;
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void draw(final GameController game) {
        game.drawRegion(this.image, (288 - this.image.width) >> 1, this.yOffset + 130, this.alphaTween.value);
    }
}
