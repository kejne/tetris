/*
 * Copyright Kaj Fehlhaber
 */

package com.kejne.tetris.gameobjects;

/**
 *
 * @author kejne
 */
public class GameBoard {
    private static final int MAX_X = 20;
    private static final int MAX_Y = 40;
    
    public static final int BLOCK_SIZE = 40;
    
    public static boolean withinBounds(int x, int y) {
        return xWithinBounds(x) && yWithinBounds(y);
    } 
    
    public static boolean xWithinBounds(int x) {
        return (x >= 0 && x <= MAX_X);
    }
    
    public static boolean yWithinBounds(int y) {
        return (y >= 0 && y <= MAX_Y);
    }
}
