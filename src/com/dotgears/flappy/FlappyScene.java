package com.dotgears.flappy;

import com.dotgears.AtlasRegion;
import com.dotgears.BitmapText;
import com.dotgears.GameButton;
import com.dotgears.GameController;
import com.dotgears.GameEntity;
import com.dotgears.MathUtils;
import com.dotgears.ScoreNumber;

import java.io.InputStream;

public class FlappyScene extends GameController {
    boolean gameOverScreen;
    boolean scoreCommitted;
    Bird bird;
    GameButton playButton;
    GameButton okButton;
    GameButton pauseButton;
    GameButton resumeButton;
    GameButton menuButton;
    GameButton scoreButton;
    GameButton shareButton;
    GameButton rateButton;
    ScoreNumber scoreDigits;
    AtlasRegion background;
    AtlasRegion dayBackground;
    AtlasRegion nightBackground;
    AtlasRegion forestBackground;
    AtlasRegion land;
    AtlasRegion pipeUp;
    AtlasRegion pipeDown;
    AtlasRegion title;
    AtlasRegion copyright;
    int groundOffset;
    int firstPipeY;
    int secondPipeY;
    int thirdPipeY;
    int firstPipeX;
    int secondPipeX;
    int thirdPipeX;
    int pipeSpacing;
    int pipeSpeed;
    int remainingInitialPipes;
    ReadyBanner readyBanner;
    GameOverBanner gameOverBanner;
    BitmapText scoreFont;
    private boolean initialized = true;

    public FlappyScene(final int bestScore, final int mode, final InputStream atlas) {
        super(bestScore, mode, atlas);
    }

    public static boolean intersects(final int x, final int y, final int width, final int height,
                                     final int otherX, final int otherY, final int otherWidth, final int otherHeight) {
        return x + width >= otherX && x <= otherX + otherWidth && y + height >= otherY && y <= otherY + otherHeight;
    }

    @Override
    public void handleInput(final int x, final int y) {
        if (this.gameOverScreen) {
            return;
        }
        if (x < this.pauseButton.x - 20 || x > this.pauseButton.x + this.pauseButton.width + 20
                || y < this.pauseButton.y - 20 || y > this.pauseButton.y + this.pauseButton.height + 20) {
            if (!this.bird.ready) {
                if (this.pipeSpeed > 0) {
                    this.bird.flap();
                }
            } else if (this.gameOverBanner.active && this.gameOverBanner.state == 1) {
                this.gameOverBanner.state = 2;
                this.gameOverBanner.alphaTween.start(1.0f, 0.0f, 0, 0.5f);
                this.bird.flap();
            }
        }
    }

    @Override
    public void handleTouch(final int x, final int y, final int width, final int height) {
        if (this.gameOverScreen && height >= 482 - this.copyright.height && height <= 482) {
            queueEvent(7, null, 5);
        }
    }

    @Override
    public void handleEvent(final int code, final GameEntity entity) {
        switch (code) {
            case 2:
                this.scoreCommitted = true;
                queueAction(0, this.score);
                this.gameOverBanner.start();
                queueAction(8, 0);
                break;
            case 3:
                queueAction(11, 0);
                break;
            case 4:
                queueAction(13, 0);
                break;
            case 5:
                resetRound();
                this.playButton.active = false;
                this.scoreButton.active = false;
                this.rateButton.active = false;
                this.gameOverScreen = false;
                startFade(false, 0, 0.5f);
                this.groundOffset = 0;
                this.bird.reset();
                this.pipeSpeed = 2;
                this.remainingInitialPipes = 1;
                this.score = 0;
                this.readyBanner.start();
                queueAction(7, 0);
                break;
            case 6:
                resetRound();
                startFade(false, 0, 0.5f);
                queueAction(6, 0);
                break;
            case 7:
                queueAction(3, 0);
                break;
            default:
                break;
        }
    }

    @Override
    public void updateLogic(final float secondsElapsed) {
        drawRegion(this.background, 0, 0, 1.0f);
        this.groundOffset -= this.pipeSpeed;
        if (this.groundOffset <= -24) {
            this.groundOffset = 0;
        }
        if (!this.bird.ready) {
            this.firstPipeX -= this.pipeSpeed;
            this.secondPipeX -= this.pipeSpeed;
            this.thirdPipeX -= this.pipeSpeed;
            if (this.pipeSpeed > 0 && this.remainingInitialPipes <= 0
                    && (this.firstPipeX == this.bird.x || this.firstPipeX == this.bird.x - 1)) {
                this.score++;
                queueAction(9, 0);
            }
            if (this.firstPipeX < -this.pipeDown.width) {
                this.firstPipeX = this.secondPipeX;
                this.firstPipeY = this.secondPipeY;
                this.secondPipeX = this.thirdPipeX;
                this.secondPipeY = this.thirdPipeY;
                this.thirdPipeX = this.secondPipeX + this.pipeSpacing + this.pipeDown.width;
                this.thirdPipeY = MathUtils.randomInt(180, 360);
                if (this.remainingInitialPipes > 0) {
                    this.remainingInitialPipes--;
                    if (this.remainingInitialPipes == 0) {
                        this.secondPipeY = -this.pipeDown.width;
                        this.firstPipeY = -this.pipeDown.width;
                    }
                }
            }
        }
        this.bird.update(secondsElapsed);
        if (this.gameOverScreen) {
            drawRegion(this.title, (288 - this.title.width) >> 1, 150, 1.0f);
            this.scorePanel.x = (288 - this.scorePanel.width) >> 1;
            this.scorePanel.y = this.title.height + 170;
            this.scorePanel.draw(this);
            drawRegion(this.land, this.groundOffset, 512 - this.land.height, 1.0f);
        } else {
            if (this.bird.y >= 400 - this.bird.height && this.pipeSpeed > 0) {
                fadeToWhite(1.0f);
                startFade(false, 4, 0.5f);
                this.pipeSpeed = 0;
                queueAction(12, 0);
                queueEvent(2, this.scorePanel, 1000);
            }
            if (!this.bird.crashed && this.remainingInitialPipes <= 0 && this.pipeSpeed > 0) {
                if (intersects(this.bird.x, this.bird.y, this.bird.width, this.bird.height,
                        this.firstPipeX, (this.firstPipeY - this.pipeDown.height) - 96, this.pipeDown.width, this.pipeDown.height)) {
                    fadeToWhite(1.0f);
                    startFade(false, 4, 0.5f);
                    this.pipeSpeed = 0;
                    queueAction(12, 0);
                    queueEvent(3, null, 500);
                    queueEvent(2, this.scorePanel, 1000);
                } else if (intersects(this.bird.x, this.bird.y, this.bird.width, this.bird.height,
                        this.firstPipeX, this.firstPipeY, this.pipeDown.width, this.pipeDown.height)) {
                    this.bird.crashed = true;
                    fadeToWhite(1.0f);
                    startFade(false, 4, 0.5f);
                    queueAction(12, 0);
                    queueEvent(3, null, 500);
                    queueEvent(2, this.scorePanel, 1000);
                }
                if (intersects(this.bird.x, this.bird.y, this.bird.width, this.bird.height,
                        this.secondPipeX, (this.secondPipeY - this.pipeDown.height) - 96, this.pipeDown.width, this.pipeDown.height)) {
                    this.bird.crashed = true;
                    fadeToWhite(1.0f);
                    startFade(false, 4, 0.5f);
                    queueAction(12, 0);
                    queueEvent(3, null, 500);
                    queueEvent(2, this.scorePanel, 1000);
                } else if (intersects(this.bird.x, this.bird.y, this.bird.width, this.bird.height,
                        this.secondPipeX, this.secondPipeY, this.pipeDown.width, this.pipeDown.height)) {
                    this.bird.crashed = true;
                    fadeToWhite(1.0f);
                    startFade(false, 4, 0.5f);
                    queueAction(12, 0);
                    queueEvent(3, null, 500);
                    queueEvent(2, this.scorePanel, 1000);
                }
            }
            if (this.remainingInitialPipes <= 0) {
                drawRegion(this.pipeUp, this.firstPipeX, this.firstPipeY, 1.0f);
                drawRegion(this.pipeDown, this.firstPipeX, (this.firstPipeY - this.pipeDown.height) - 96, 1.0f);
                drawRegion(this.pipeUp, this.secondPipeX, this.secondPipeY, 1.0f);
                drawRegion(this.pipeDown, this.secondPipeX, (this.secondPipeY - this.pipeDown.height) - 96, 1.0f);
                if (this.thirdPipeX < 288) {
                    drawRegion(this.pipeUp, this.thirdPipeX, this.thirdPipeY, 1.0f);
                    drawRegion(this.pipeDown, this.thirdPipeX, (this.thirdPipeY - this.pipeDown.height) - 96, 1.0f);
                }
            }
            if (this.scorePanel.active && this.scorePanel.state == 2 && !this.playButton.active) {
                this.playButton.setPosition((288 - (this.playButton.width + this.scoreButton.width + 16)) >> 1, 340);
                this.scoreButton.setPosition(this.playButton.x + this.playButton.width + 16, 340);
            }
            if (this.readyBanner.active) {
                this.readyBanner.update(secondsElapsed);
                this.readyBanner.draw(this);
            } else {
                this.scoreFont.setDrawParameters(144, 100, 6, 1.0f);
                this.scoreFont.format(this.score, 20);
                this.scoreFont.draw(this);
            }
            this.bird.draw(this);
            drawRegion(this.land, this.groundOffset, 512 - this.land.height, 1.0f);
        }
        if (this.gameOverBanner.active) {
            this.gameOverBanner.update(secondsElapsed);
            this.gameOverBanner.draw(this);
        }
        if (this.gameOverScreen) {
            drawRegion(this.copyright, (288 - this.copyright.width) >> 1, 432 - this.copyright.height, 1.0f);
        }
        if (this.playButton.active) {
            this.playButton.update(secondsElapsed);
            this.playButton.draw(this);
            this.scoreButton.update(secondsElapsed);
            this.scoreButton.draw(this);
            if (this.playButton.released) {
                startFade(true, 5, 0.5f);
                queueAction(10, 0);
            }
            if (this.scoreButton.released) {
                queueAction(1, 0);
                queueAction(10, 0);
            }
            if (this.rateButton.active) {
                this.rateButton.update(secondsElapsed);
                this.rateButton.draw(this);
                if (this.rateButton.released) {
                    queueAction(2, 0);
                }
            }
        }
    }

    @Override
    public void createScene() {
        this.bird = new Bird();
        this.readyBanner = new ReadyBanner();
        this.gameOverBanner = new GameOverBanner();
        this.scoreFont = new BitmapFont();
        this.playButton = new GameButton();
        this.playButton.load("button_play");
        this.scoreButton = new GameButton();
        this.scoreButton.load("button_score");
        this.okButton = new GameButton();
        this.okButton.load("button_ok");
        this.menuButton = new GameButton();
        this.menuButton.load("button_menu");
        this.pauseButton = new GameButton();
        this.pauseButton.load("button_pause");
        this.resumeButton = new GameButton();
        this.resumeButton.load("button_resume");
        this.shareButton = new GameButton();
        this.shareButton.load("button_share");
        this.rateButton = new GameButton();
        this.rateButton.load("button_rate");
        this.scoreDigits = new ScoreNumber("number_score");
        this.dayBackground = findRegion("bg_day");
        this.nightBackground = findRegion("bg_night");
        this.forestBackground = findRegion("bg_forest");
        this.land = findRegion("land");
        this.pipeUp = findRegion("pipe_up");
        this.pipeDown = findRegion("pipe_down");
        this.title = findRegion("title");
        this.copyright = findRegion("brand_copyright");
        this.pipeSpacing = (288 - ((this.pipeUp.width * 3) / 2)) / 2;
        this.firstPipeX = this.pipeSpacing - (this.pipeUp.width >> 1);
        this.firstPipeY = 274;
        this.secondPipeX = this.firstPipeX + this.pipeSpacing + this.pipeUp.width;
        this.secondPipeY = 274;
        this.thirdPipeX = this.secondPipeX + this.pipeSpacing + this.pipeUp.width;
        this.thirdPipeY = 274;
        this.bird.reset();
        this.readyBanner.start();
        this.gameOverBanner.active = false;
        this.scorePanel.active = false;
        this.gameOverScreen = true;
        queueEvent(6, this, 1);
    }

    public void resetRound() {
        this.background = MathUtils.random() % 10 > 3 ? this.dayBackground : this.nightBackground;
        this.blinks.clearVisibility();
        this.playButton.setPosition((288 - (this.playButton.width + this.scoreButton.width + 16)) >> 1, 340);
        this.scoreButton.setPosition(this.playButton.x + this.playButton.width + 16, 340);
        this.rateButton.setPosition((288 - this.rateButton.width) >> 1, 270);
        this.readyBanner.active = false;
        this.gameOverBanner.active = false;
        this.scorePanel.active = false;
        this.scorePanel.visible = false;
        this.okButton.active = false;
        this.okButton.visible = false;
        this.menuButton.active = false;
        this.menuButton.visible = false;
        this.pauseButton.active = false;
        this.pauseButton.visible = false;
        this.resumeButton.active = false;
        this.resumeButton.visible = false;
        this.shareButton.active = false;
        this.shareButton.visible = false;
        this.gameOverScreen = true;
        this.groundOffset = 0;
        this.bird.reset();
        this.pipeSpeed = 2;
        this.remainingInitialPipes = 1;
        this.score = 0;
    }
}
