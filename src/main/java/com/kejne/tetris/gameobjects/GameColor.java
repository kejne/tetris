/*
 * Copyright Kaj Fehlhaber
 */

package com.kejne.tetris.gameobjects;

import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author kejne
 */
public enum GameColor {
    BLUE(0f,0f,1f), 
    PURPLE(1f,0f,1f), 
    YELLOW(1f,1f,0f), 
    ORANGE(1f,0.5f,0f), 
    GREEN(0f,1f,0f), 
    RED(1f,0f,0f), 
    BROWN(0.5f,0.16f,0.16f);
    
    private final float red;
    private final float green;
    private final float blue;

    private GameColor(float red, float green, float blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    public float[] getRGB() {
        return new float[] {red, green, blue};
    }
    
    public void setGlColor() {
        glColor3f(red, green, blue);
    }
}
