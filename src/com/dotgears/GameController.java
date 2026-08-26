package com.dotgears;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GameController extends GameEntity {
    public static GameController current;

    public AtlasRegion[] atlasRegions = new AtlasRegion[512];
    public int[] eventDurations = new int[50];
    public int[] eventCodes = new int[50];
    public GameEntity[] eventEntities = new GameEntity[50];
    public int eventMode = 1;
    protected int[] touchX = new int[10];
    protected int[] touchY = new int[10];
    int[] actionCodes = new int[50];
    double[] actionValues = new double[50];

    public int eventCount;
    public int bestScore;
    public int mode;
    public int score;
    int actionCount;
    public int shakeX;
    protected int touchCount;
    public int pendingAction;
    public int shakeY;
    public int shakeAmount;
    public int shakeFrames;
    public boolean gameOver;
    public Tween fadeOut;
    public Tween fadeIn;
    public EntityPool particles;
    public EntityPool blinks;
    protected AtlasRegion blackRegion;
    protected AtlasRegion whiteRegion;
    public ScoreNumber scoreNumber;
    public ScorePanel scorePanel;
    public final float fixedStep = 0.015f;

    public GameController(final int bestScore, final int mode, final InputStream atlas) {
        this.bestScore = bestScore;
        this.mode = mode;
        try {
            final BufferedReader reader = new BufferedReader(new InputStreamReader(atlas));
            while (true) {
                final String line = reader.readLine();
                if (line == null) {
                    break;
                }
                if (line.length() > 1) {
                    final String[] values = line.split("\\s+");
                    final AtlasRegion region = new AtlasRegion(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]),
                            Float.parseFloat(values[3]), Float.parseFloat(values[4]), Float.parseFloat(values[5]), Float.parseFloat(values[6]));
                    region.widthU += region.u;
                    region.heightV += region.v;
                    this.atlasRegions[region.id] = region;
                    Log.i("FlappyBird", region.name + " " + region.width + " " + region.height + " " + region.u + " " + region.v + " " + region.widthU + " " + region.heightV);
                }
            }
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
    }

    public void initialize() {
        MathUtils.instance = new MathUtils();
        this.fadeOut = new Tween();
        this.fadeIn = new Tween();
        this.blackRegion = findRegion("black");
        this.whiteRegion = findRegion("white");
        this.touchCount = 0;
        this.particles = new EntityPool();
        for (int index = 0; index < 20; index++) {
            this.particles.add(new FloatingScore());
        }
        this.blinks = new EntityPool();
        for (int index = 0; index < 10; index++) {
            this.blinks.add(new BlinkEntity());
        }
        this.scoreNumber = new ScoreNumber("number_score");
        this.scorePanel = new ScorePanel();
        this.actionCount = 0;
        this.gameOver = false;
        this.shakeX = 0;
        this.shakeY = 0;
        this.shakeAmount = 0;
        this.shakeFrames = 0;
        resetEvents();
        createScene();
        startFade(false, 0, 0.5f);
    }

    public void setScore(final int score) {
        queueAction(0, score);
        if (score > this.bestScore) {
            this.bestScore = score;
        }
    }

    public void handleInput(final int x, final int y) {
    }

    public void setEventTiming(final int eventId, final float duration) {
    }

    public void drawRegion(final int regionId, final int x, final int y, final int width, final int height, final float alpha) {
        final AtlasRegion region = this.atlasRegions[regionId];
        drawRegion(x, y, x + width, y + height,
                region.u, region.v, region.widthU, region.heightV, alpha);
    }

    public void drawRegion(final int regionId, final int x, final int y, final float scaleX, final float scaleY, final float alpha) {
        final AtlasRegion region = this.atlasRegions[regionId];
        drawRegion(x, y, x + (int) (region.width * scaleX), y + (int) (region.height * scaleY),
                region.u, region.v, region.widthU, region.heightV, alpha);
    }

    public void handleTouch(final int x, final int y, final int width, final int height) {
    }

    public void drawRegion(final int x, final int y, final int right, final int bottom,
                           final float u, final float v, final float rightU, final float bottomV, final float alpha) {
        GameScene.drawQuad(x, y, right, bottom, u, v, rightU, bottomV, alpha);
    }

    public void drawRegion(final int x, final int y, final int right, final int bottom,
                           final float u, final float v, final float rightU, final float bottomV, final float alpha, final int rotation) {
        GameScene.drawQuad(x, y, right, bottom, u, v, rightU, bottomV, alpha, rotation);
    }

    public void drawRegion(final AtlasRegion region, final int x, final int y, final float alpha) {
        drawRegion(region.id, x, y, region.width, region.height, alpha);
    }

    public void drawRegion(final AtlasRegion region, final int x, final int y, final float alpha, final int rotation) {
        drawRegion(x, y, x + region.width, y + region.height,
                region.u, region.v, region.widthU, region.heightV, alpha, rotation);
    }

    public AtlasRegion[] findRegions(final String prefix) {
        int count = 0;
        for (int index = 0; index < 512; index++) {
            if (this.atlasRegions[index] != null && this.atlasRegions[index].name.startsWith(prefix)) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        final AtlasRegion[] regions = new AtlasRegion[count];
        int outputIndex = 0;
        for (int index = 0; index < 512; index++) {
            if (this.atlasRegions[index] != null && this.atlasRegions[index].name.startsWith(prefix)) {
                regions[outputIndex++] = this.atlasRegions[index];
            }
        }
        return regions;
    }

    public AtlasRegion findRegion(final String prefix) {
        for (int index = 0; index < 512; index++) {
            if (this.atlasRegions[index] != null && this.atlasRegions[index].name.startsWith(prefix)) {
                return this.atlasRegions[index];
            }
        }
        return null;
    }

    public void update() {
        this.actionCount = 0;
        if (!this.gameOver) {
            for (int index = 0; index < 50; index++) {
                if (this.eventDurations[index] > 0) {
                    this.eventDurations[index] -= 30;
                    if (this.eventDurations[index] <= 0) {
                        handleEvent(this.eventCodes[index], this.eventEntities[index]);
                    }
                }
            }
        }
        updateLogic(this.fixedStep);
        if (!this.gameOver) {
            this.scorePanel.update(this.fixedStep);
            this.blinks.update(this.fixedStep);
            if (!this.fadeOut.finished || this.fadeOut.value != 0.0f) {
                this.fadeOut.update(this.fixedStep);
                if (this.fadeOut.finished) {
                    handleEvent(this.pendingAction, this);
                }
            }
            if (!this.fadeIn.finished || this.fadeIn.value != 0.0f) {
                this.fadeIn.update(this.fixedStep);
            }
            if (this.shakeFrames > 0) {
                this.shakeFrames--;
                this.shakeX = MathUtils.randomInt(-this.shakeAmount, this.shakeAmount);
                this.shakeY = MathUtils.randomInt(-this.shakeAmount, this.shakeAmount);
            } else {
                this.shakeX = 0;
                this.shakeY = 0;
            }
        }
        this.scorePanel.draw(this);
        this.blinks.draw(this);
        if (!this.fadeOut.finished || this.fadeOut.value != 0.0f) {
            drawRegion(this.blackRegion.id, -144, -256, 864, 1536, this.fadeOut.value);
        }
        if (this.fadeIn.finished && this.fadeIn.value == 0.0f) {
            return;
        }
        drawRegion(this.whiteRegion.id, -144, -256, 864, 1536, this.fadeIn.value);
    }

    public void updateLogic(final float secondsElapsed) {
    }

    public void fadeToWhite(final float secondsElapsed) {
        if (this.fadeIn.finished) {
            this.fadeIn.start(1.0f, 0.0f, 11, secondsElapsed);
            this.fadeIn.update(0.0f);
        }
    }

    public void setTouchPoints(final float[] x, final float[] y) {
        this.touchCount = 10;
        for (int index = 0; index < 10; index++) {
            this.touchX[index] = (int) x[index];
            this.touchY[index] = (int) y[index];
        }
    }

    public void spawnBlink(final int x, final int y) {
        final BlinkEntity blink = (BlinkEntity) this.blinks.nextInactive();
        blink.setPosition(x, y);
    }

    public void queueAction(final int code, final int value) {
        this.actionCodes[this.actionCount] = code;
        this.actionValues[this.actionCount] = value;
        this.actionCount++;
    }

    public void queueEvent(final int code, final GameEntity entity, final int durationMilliseconds) {
        this.eventCodes[this.eventCount] = code;
        this.eventEntities[this.eventCount] = entity;
        this.eventDurations[this.eventCount] = durationMilliseconds;
        this.eventCount++;
        if (this.eventCount >= 50) {
            this.eventCount = 0;
        }
    }

    public void startFade(final boolean fadeIn, final int action, final float seconds) {
        final Tween tween = this.fadeOut;
        if (tween.finished) {
            if (fadeIn) {
                tween.start(0.0f, 1.0f, 5, seconds);
            } else {
                tween.start(1.0f, 0.0f, 5, seconds);
            }
            tween.update(0.0f);
            this.pendingAction = action;
        }
    }

    public void handleEvent(final int code, final GameEntity entity) {
    }

    public void createScene() {
    }

    public void resetEvents() {
        this.eventCount = 0;
        for (int index = 0; index < this.eventDurations.length; index++) {
            this.eventDurations[index] = 0;
        }
    }

}
