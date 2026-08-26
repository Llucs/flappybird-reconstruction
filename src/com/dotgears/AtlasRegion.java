package com.dotgears;

public class AtlasRegion {
    public static int nextId = 0;

    public String name;
    public int width;
    public int height;
    public float u;
    public float v;
    public float widthU;
    public float heightV;
    public int id;

    public AtlasRegion(final String name, final int width, final int height, final float u, final float v, final float widthU, final float heightV) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.u = u;
        this.v = v;
        this.widthU = widthU;
        this.heightV = heightV;
        this.id = nextId++;
    }
}
