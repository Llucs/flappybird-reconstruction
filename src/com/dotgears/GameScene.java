package com.dotgears;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;

import com.dotgears.flappy.FlappyScene;
import com.dotgears.flappybird.R;

import org.andengine.entity.scene.IOnSceneTouchListener;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.ITexture;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import java.io.InputStream;

public class GameScene extends Scene implements IOnSceneTouchListener {
    public static Sprite[] drawables;
    static int drawIndex;
    public GameActivity activity;
    public int storedBestScore;
    public final int drawableCapacity = 50;
    float[] touchX = new float[10];
    float[] touchY = new float[10];
    boolean touchPending;
    int lastTouchX;
    int lastTouchY;

    public GameScene(final GameActivity activity, final TextureRegion atlasRegion) {
        this.activity = activity;
        final ITexture texture = atlasRegion.getTexture();
        final int bestScore = activity.getSharedPreferences("FlappyBird", 0).getInt("score", 0);
        this.storedBestScore = bestScore;
        final InputStream atlas = activity.getApplication().getResources().openRawResource(R.raw.atlas);
        GameController.current = new FlappyScene(bestScore, 0, atlas);
        GameController.current.initialize();
        MathUtils.randomize((int) System.currentTimeMillis());
        final VertexBufferObjectManager vertexBufferObjectManager = activity.getVertexBufferObjectManager();
        drawables = new Sprite[this.drawableCapacity];
        for (int index = 0; index < this.drawableCapacity; index++) {
            final TextureRegion region = new TextureRegion(texture, 0, 0, texture.getWidth(), texture.getHeight());
            drawables[index] = new Sprite(0, 0, texture.getWidth(), texture.getHeight(), region, vertexBufferObjectManager);
            drawables[index].setVisible(false);
            attachChild(drawables[index]);
        }
        setOnSceneTouchListener(this);
    }

    public static void drawQuad(final int x, final int y, final int right, final int bottom,
                                final float u, final float v, final float rightU, final float bottomV,
                                final float alpha) {
        final Sprite drawable = drawables[drawIndex];
        final ITextureRegion region = drawable.getTextureRegion();
        final ITexture texture = region.getTexture();
        final float textureWidth = texture.getWidth();
        final float textureHeight = texture.getHeight();
        region.set(u * textureWidth, v * textureHeight,
                (rightU - u) * textureWidth, (bottomV - v) * textureHeight);
        drawable.setPosition(x, y);
        drawable.setSize(right - x, bottom - y);
        drawable.resetRotationCenter();
        drawable.setRotation(0.0f);
        drawable.setAlpha(alpha);
        drawable.setVisible(true);
        drawable.setFlippedHorizontal(!drawable.isFlippedHorizontal());
        drawable.setFlippedHorizontal(!drawable.isFlippedHorizontal());
        drawIndex++;
    }

    public static void drawQuad(final int x, final int y, final int right, final int bottom,
                                final float u, final float v, final float rightU, final float bottomV,
                                final float alpha, final float rotation) {
        final Sprite drawable = drawables[drawIndex];
        final ITextureRegion region = drawable.getTextureRegion();
        final ITexture texture = region.getTexture();
        final float textureWidth = texture.getWidth();
        final float textureHeight = texture.getHeight();
        region.set(u * textureWidth, v * textureHeight,
                (rightU - u) * textureWidth, (bottomV - v) * textureHeight);
        drawable.setPosition(x, y);
        drawable.setSize(right - x, bottom - y);
        drawable.resetRotationCenter();
        drawable.setRotation(rotation);
        drawable.setAlpha(alpha);
        drawable.setVisible(true);
        drawable.setFlippedHorizontal(!drawable.isFlippedHorizontal());
        drawable.setFlippedHorizontal(!drawable.isFlippedHorizontal());
        drawIndex++;
    }

    public void resetDrawables() {
        for (int index = 0; index < this.drawableCapacity; index++) {
            drawables[index].setVisible(false);
        }
        drawIndex = 0;
    }

    @Override
    protected void onManagedUpdate(final float secondsElapsed) {
        super.onManagedUpdate(secondsElapsed);
        resetDrawables();
        GameController.current.setTouchPoints(this.touchX, this.touchY);
        if (this.touchPending) {
            GameController.current.handleInput(this.lastTouchX, this.lastTouchY);
            GameController.current.handleTouch(this.lastTouchX, this.lastTouchY,
                    this.lastTouchX, this.lastTouchY);
            this.touchPending = false;
        }
        GameController.current.update();
        final GameController controller = GameController.current;
        for (int index = 0; index < controller.actionCount; index++) {
            final int code = controller.actionCodes[index];
            final int value = (int) controller.actionValues[index];
            switch (code) {
                case 0:
                    if (this.activity.o()) {
                        this.activity.n().a("CgkI5J2sk6QXEAIQAA", value);
                    }
                    if (value > this.storedBestScore) {
                        final SharedPreferences.Editor editor = this.activity.getSharedPreferences("FlappyBird", 0).edit();
                        editor.clear();
                        editor.putInt("score", value);
                        editor.commit();
                        this.storedBestScore = value;
                        controller.bestScore = value;
                    }
                    break;
                case 1:
                    if (this.activity.o()) {
                        this.activity.startActivityForResult(this.activity.n().a("CgkI5J2sk6QXEAIQAA"), 1);
                    } else {
                        this.activity.p();
                    }
                    break;
                case 2: {
                    final Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse("http://www.amazon.com/gp/mas/dl/android?p=com.dotgears.flappybird"));
                    this.activity.startActivity(intent);
                    break;
                }
                case 6:
                    this.activity.d();
                    break;
                case 7:
                    this.activity.c();
                    break;
                case 8:
                    this.activity.d();
                    break;
                case 9:
                    this.activity.e();
                    break;
                case 10:
                    this.activity.h();
                    break;
                case 11:
                    this.activity.f();
                    break;
                case 12:
                    this.activity.g();
                    break;
                case 13:
                    this.activity.i();
                    break;
                default:
                    break;
            }
        }
        controller.actionCount = 0;
    }

    @Override
    public boolean onSceneTouchEvent(final Scene scene, final TouchEvent event) {
        final int pointer = event.getPointerID() % 10;
        if (event.isActionDown()) {
            if (GameController.current != null) {
                this.touchPending = true;
                this.lastTouchX = (int) event.getX();
                this.lastTouchY = (int) event.getY();
            }
            this.touchX[pointer] = event.getX();
            this.touchY[pointer] = event.getY();
        } else if (event.isActionUp() || event.isActionCancel() || event.isActionOutside()) {
            this.touchX[pointer] = -100.0f;
            this.touchY[pointer] = -100.0f;
        }
        return true;
    }
}
