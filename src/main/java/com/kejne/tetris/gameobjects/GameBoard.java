/*
 * Copyright Kaj Fehlhaber
 */

package com.kejne.tetris.gameobjects;

/**
 *
 * @author kejne
 */
public class GameBoard {
    private static int MAX_X;
    private static int MAX_Y;
    
    public GameBoard() {
        MAX_X = 20;
        MAX_Y = 40;
    }
    
    public static int getMaxX() {
        return MAX_X;
    }
    public static int getMaxY() {
        return MAX_Y;
    }
    
    public static boolean withinBounds(int x, int y) {
        return xWithinBounds(x) && yWithinBounds(y);
    } 
    
    public static boolean xWithinBounds(int x) {
        return (x >= 0 && x <= getMaxX());
    }
    
    public static boolean yWithinBounds(int y) {
        return (y >= 0 && y <= getMaxY());
    }
}
