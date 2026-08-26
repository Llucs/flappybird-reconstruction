package com.dotgears.flappy;

import com.dotgears.BitmapText;

public class BitmapFont extends BitmapText {
    private float lineOffset;

    public BitmapFont() {
        super("font", 4);
        this.lineOffset = 0.0f;
    }
}
