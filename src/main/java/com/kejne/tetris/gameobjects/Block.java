/*
 * Copyright Kaj Fehlhaber
 */

package com.kejne.tetris.gameobjects;

/**
 *
 * @author kejne
 */
public class Block {
    
    private Coordinate coordinate;
    
    private final GameColor gameColor;
    
    public Block(Coordinate coordinate, GameColor color) {
        this.coordinate = coordinate;
        this.gameColor = color;
    }
}
