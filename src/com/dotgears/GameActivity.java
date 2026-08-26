package com.dotgears;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.google.ads.AdView;
import com.google.example.games.basegameutils.GameHelper;
import com.google.example.games.basegameutils.GameHelperListener;

import org.andengine.audio.sound.Sound;
import org.andengine.audio.sound.SoundFactory;
import org.andengine.engine.Engine;
import org.andengine.engine.LimitedFPSEngine;
import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.WakeLockOptions;
import org.andengine.engine.options.resolutionpolicy.FixedResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.ui.activity.SimpleBaseGameActivity;

import java.io.IOException;

public class GameActivity extends SimpleBaseGameActivity implements GameHelperListener {
    public AdView adView;
    public Sound soundPoint;
    public Sound soundDie;
    public Sound soundHit;
    public Sound soundSwooshing;
    public Sound soundWing;
    protected GameHelper gameHelper;
    protected int requestedClients = 1;
    protected String gameHelperTag = "BaseGameActivity";
    protected boolean enableGameHelper = false;
    private BitmapTextureAtlas gameAtlas;
    private TextureRegion gameRegion;
    private String[] gameHelperScopes;

    @Override
    public Engine onCreateEngine(final EngineOptions engineOptions) {
        return new LimitedFPSEngine(engineOptions, 60);
    }

    @Override
    public EngineOptions onCreateEngineOptions() {
        final Camera camera = new Camera(0.0f, 0.0f, 288.0f, 512.0f);
        final EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.PORTRAIT_FIXED, new FixedResolutionPolicy(288, 512), camera);
        engineOptions.getAudioOptions().setNeedsMusic(true).setNeedsSound(true);
        engineOptions.getRenderOptions().setMultiSampling(true);
        engineOptions.getTouchOptions().setNeedsMultiTouch(true);
        engineOptions.setWakeLockOptions(WakeLockOptions.SCREEN_ON);
        return engineOptions;
    }

    @Override
    protected void onCreateResources() {
        BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/");
        this.gameAtlas = new BitmapTextureAtlas(getTextureManager(), 1024, 1024, TextureOptions.NEAREST_PREMULTIPLYALPHA);
        this.gameRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(this.gameAtlas, getAssets(), "atlas.png", 0, 0);
        this.gameAtlas.load();

        SoundFactory.setAssetBasePath("sounds/");
        try {
            this.soundPoint = SoundFactory.createSoundFromAsset(getSoundManager(), this, "sfx_point.ogg");
            this.soundDie = SoundFactory.createSoundFromAsset(getSoundManager(), this, "sfx_die.ogg");
            this.soundHit = SoundFactory.createSoundFromAsset(getSoundManager(), this, "sfx_hit.ogg");
            this.soundSwooshing = SoundFactory.createSoundFromAsset(getSoundManager(), this, "sfx_swooshing.ogg");
            this.soundWing = SoundFactory.createSoundFromAsset(getSoundManager(), this, "sfx_wing.ogg");
        } catch (final IOException ignored) {
        }
    }

    @Override
    protected Scene onCreateScene() {
        return new GameScene(this, this.gameRegion);
    }

    @Override
    protected void onSetContentView() {
        final RelativeLayout root = new RelativeLayout(this);
        final FrameLayout.LayoutParams contentParams = new FrameLayout.LayoutParams(-1, -1);
        final RelativeLayout.LayoutParams surfaceParams = new RelativeLayout.LayoutParams((ViewGroup.MarginLayoutParams) BaseGameActivity.createSurfaceViewLayoutParams());
        surfaceParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        this.mRenderSurfaceView = new RenderSurfaceView(this);
        this.mRenderSurfaceView.setRenderer(this.mEngine, this);
        root.addView(this.mRenderSurfaceView, surfaceParams);

        final FrameLayout adLayer = new FrameLayout(this);
        this.adView = new AdView(this, com.google.ads.g.a, "a152df006159b75");
        this.adView.refreshDrawableState();
        adLayer.addView(this.adView, new FrameLayout.LayoutParams(-2, -2, Gravity.TOP | Gravity.CENTER_HORIZONTAL));
        root.addView(adLayer, new RelativeLayout.LayoutParams(-1, -1));
        this.adView.a(new com.google.ads.d());
        this.setContentView(root, contentParams);
    }

    public void c() {
        runOnUiThread(new AdHideRunnable(this));
    }

    public void d() {
        runOnUiThread(new AdShowRunnable(this));
    }

    public void e() {
        this.soundPoint.play();
    }

    public void f() {
        this.soundDie.play();
    }

    public void g() {
        this.soundHit.play();
    }

    public void h() {
        this.soundSwooshing.play();
    }

    public void i() {
        this.soundWing.play();
    }

    @Override
    public void onSignInFailed() {
    }

    @Override
    public void onSignInSucceeded() {
    }

    public com.google.android.gms.games.c n() {
        return this.gameHelper.getGamesClient();
    }

    public boolean o() {
        return this.gameHelper.isSignedIn();
    }

    public void p() {
        this.gameHelper.beginUserInitiatedSignIn();
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.gameHelper = new GameHelper(this);
        if (this.enableGameHelper) {
            this.gameHelper.setDebugLog(this.enableGameHelper, this.gameHelperTag);
        }
        this.gameHelper.setup(this, this.requestedClients, this.gameHelperScopes);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.gameHelper.onStart(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.gameHelper.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }

    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.gameHelper.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.i("FlappyBird", "Back key pressed.");
        }
        return false;
    }
}
