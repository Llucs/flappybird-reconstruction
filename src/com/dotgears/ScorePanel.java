package com.dotgears;

public class ScorePanel extends GameEntity {
    public int x;
    public int y;
    public int bronzeThreshold;
    public int silverThreshold;
    public int goldThreshold;
    public int platinumThreshold;
    public int state;
    public boolean newBest;
    public int score;
    public int bestScore;
    public int targetScore;
    public AtlasRegion panel = GameController.current.findRegion("score_panel");
    public AtlasRegion newLabel = GameController.current.findRegion("new");
    public ScoreNumber scoreNumber = GameController.current.scoreNumber;
    public int width = this.panel.width;
    public int height = this.panel.height;
    public int centerY = (512 - this.height) >> 1;
    public Tween slideTween = new Tween();
    public Medal medal = new Medal();

    @Override
    public void update(final float secondsElapsed) {
        if (this.active) {
            if (!this.slideTween.finished) {
                this.slideTween.update(secondsElapsed);
            }
            switch (this.state) {
                case 0:
                    this.y = (int) this.slideTween.value;
                    if (this.slideTween.finished) {
                        if (this.targetScore <= 0) {
                            this.state = 2;
                        } else {
                            this.state = 1;
                            this.slideTween.start(0.0f, this.targetScore, 0, 0.5f);
                        }
                    }
                    break;
                case 1:
                    this.score = (int) this.slideTween.value;
                    if (this.slideTween.finished) {
                        this.state = 2;
                        GameController.current.setScore(this.score);
                        if (this.score > this.bestScore) {
                            this.bestScore = this.score;
                            this.newBest = true;
                        }
                        if (this.score >= this.platinumThreshold) {
                            this.medal.select(0);
                        } else if (this.score >= this.goldThreshold) {
                            this.medal.select(1);
                        } else if (this.score >= this.silverThreshold) {
                            this.medal.select(2);
                        } else if (this.score >= this.bronzeThreshold) {
                            this.medal.select(3);
                        }
                        this.medal.x = this.x + 32;
                        this.medal.y = this.y + 44;
                    }
                    break;
                case 2:
                    this.medal.update(secondsElapsed);
                    break;
                default:
                    break;
            }
        }
    }

    public void startDisplay(final int score, final int bestScore, final int bronzeThreshold, final int silverThreshold,
                             final int goldThreshold, final int platinumThreshold) {
        this.targetScore = score;
        this.bestScore = bestScore;
        this.score = 0;
        this.bronzeThreshold = bronzeThreshold;
        this.silverThreshold = silverThreshold;
        this.goldThreshold = goldThreshold;
        this.platinumThreshold = platinumThreshold;
        this.active = true;
        this.visible = true;
        this.newBest = false;
        this.x = (288 - this.width) >> 1;
        this.y = 504;
        this.slideTween.start(this.y, this.centerY, 11, 0.5f);
        this.state = 0;
        this.medal.active = false;
        this.medal.visible = false;
    }

    @Override
    public void draw(final GameController game) {
        if (this.visible) {
            game.drawRegion(this.panel.id, this.x, this.y, 1.0f, 1.0f, 1.0f);
            this.scoreNumber.draw(game, this.score, this.x + 210, this.y + 36, false, 10);
            this.scoreNumber.draw(game, this.bestScore, this.x + 210, this.y + 78, false, 10);
            if (this.newBest) {
                game.drawRegion(this.newLabel.id, this.x + 142, this.y + 60, 1.0f, 1.0f, 1.0f);
            }
            this.medal.draw(game);
        }
    }
}
