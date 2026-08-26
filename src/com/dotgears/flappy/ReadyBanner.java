package com.dotgears.flappy;

import com.dotgears.AtlasRegion;
import com.dotgears.GameController;
import com.dotgears.GameEntity;
import com.dotgears.Tween;

public class ReadyBanner extends GameEntity {
    public final Tween alphaTween = new Tween();
    public final AtlasRegion readyText = GameController.current.findRegion("text_ready");
    public final AtlasRegion tutorial = GameController.current.findRegion("tutorial");
    int state;

    public void start() {
        this.active = true;
        this.visible = true;
        this.alphaTween.start(0.0f, 1.0f, 0, 0.5f);
        this.state = 0;
    }

    @Override
    public void update(final float secondsElapsed) {
        this.alphaTween.update(secondsElapsed);
        switch (this.state) {
            case 0:
                if (this.alphaTween.finished) {
                    this.state = 1;
                }
                break;
            case 2:
                if (this.alphaTween.finished) {
                    this.active = true;
                    this.visible = false;
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void draw(final GameController game) {
        game.drawRegion(this.readyText, (288 - this.readyText.width) >> 1, 146, this.alphaTween.value);
        game.drawRegion(this.tutorial, (288 - this.tutorial.width) >> 1, 220, this.alphaTween.value);
    }
}
