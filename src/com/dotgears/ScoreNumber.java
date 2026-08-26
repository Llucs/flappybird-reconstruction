package com.dotgears;

public class ScoreNumber {
    public final int glyphWidth;
    public final int glyphHeight;
    private final AtlasRegion[] glyphs;

    public ScoreNumber(final String prefix) {
        this.glyphs = GameController.current.findRegions(prefix);
        this.glyphWidth = this.glyphs[0].width;
        this.glyphHeight = this.glyphs[0].height;
    }

    public void draw(final GameController game, final int value, final int right, final int y, final boolean leadingZeros, final int digits) {
        int cursor = right - this.glyphWidth;
        boolean drawZero = true;
        int number = value;
        for (int remaining = digits; remaining > 0; remaining--) {
            if (number > 0 || drawZero) {
                final int digit = number % 10;
                game.drawRegion(this.glyphs[digit].id, cursor, y, 1.0f, 1.0f, 1.0f);
                cursor -= this.glyphWidth;
                number /= 10;
                drawZero = leadingZeros;
            }
        }
    }
}
