package com.dotgears;

import android.util.Log;

public class BitmapText {
    public static String digits = "0123456789";
    protected int maximumHeight;
    protected int spacing;
    protected int x;
    protected int y;
    protected int alignment;
    protected float scale;
    public AtlasRegion[] glyphs = new AtlasRegion[256];
    protected int[] widths = new int[256];
    public char[] text = new char[256];
    public char[] reversedText = new char[256];
    public int textLength;

    public BitmapText(final String prefix, final int spacing) {
        final AtlasRegion[] regions = GameController.current.findRegions(prefix);
        for (int index = 0; index < regions.length; index++) {
            final int digit = Integer.parseInt(regions[index].name.split("_")[1]);
            this.glyphs[digit] = regions[index];
            this.widths[digit] = regions[index].width;
            this.maximumHeight = this.maximumHeight > regions[index].height ? this.maximumHeight : regions[index].height;
            Log.i("FlappyBird", "Number: " + regions[index].name + " " + digit);
        }
        this.widths[32] = this.widths[48];
        this.spacing = spacing;
    }

    public void format(final int value, int digitsToWrite) {
        this.textLength = 0;
        int remaining = value;
        while (digitsToWrite > 0) {
            if (remaining > 0) {
                final int digit = remaining % 10;
                remaining /= 10;
                this.reversedText[this.textLength] = digits.charAt(digit);
                this.textLength++;
            }
            digitsToWrite--;
        }
        for (int index = 0; index < this.textLength; index++) {
            this.text[index] = this.reversedText[(this.textLength - index) - 1];
        }
        if (this.textLength == 0) {
            this.text[0] = '0';
            this.textLength = 1;
        }
    }

    public void setDrawParameters(final int x, final int y, final int alignment, final float scale) {
        this.x = x;
        this.y = y;
        this.alignment = alignment;
        this.scale = scale;
    }

    public void draw(final GameController game) {
        int totalWidth = 0;
        for (int index = 0; index < this.textLength; index++) {
            totalWidth += this.widths[this.text[index]] - this.spacing;
        }
        final int paddedWidth = totalWidth + 2;
        if ((this.alignment & 2) != 0) {
            this.x -= paddedWidth / 2;
        } else if ((this.alignment & 1) != 0) {
            this.x -= paddedWidth;
        }
        if ((this.alignment & 4) != 0) {
            this.y -= this.maximumHeight / 2;
        } else if ((this.alignment & 8) != 0) {
            this.y -= this.maximumHeight;
        }
        int cursorX = this.x;
        for (int index = 0; index < this.textLength; index++) {
            final AtlasRegion region = this.glyphs[this.text[index]];
            if (region != null) {
                game.drawRegion(region, cursorX, this.y, this.scale);
            }
            cursorX += this.widths[this.text[index]] - this.spacing;
        }
    }
}
