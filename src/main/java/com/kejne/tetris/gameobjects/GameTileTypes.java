/*
 * Copyright Kaj Fehlhaber
 */

package com.kejne.tetris.gameobjects;

import java.util.ArrayList;
import java.util.List;

/**
 * The different tiles used in Tetris.<BR>
 * Contains information about what blocks the tile contains and<BR>
 * what color the blocks have.<BR>
 * @author kejne
 */
                        
public enum GameTileTypes {
    
    /**
     * ##<BR>
     * ##
     */
    SQUARE(new int[][]{{-1,1},{-1,0},{0,1},{0,0}},
            GameColor.BROWN),
    
    /**
     * #<BR>
     * #<BR>
     * #<BR>
     * #<BR>
     */
    LONG(new int[][]{{0,1},{0,2},{0,0},{0,-1}},
            GameColor.BLUE), 
    
    /**
     * ##                           <BR>&nbsp&nbsp
     *  ##
     */
    Z(new int[][]{{-1,1},{0,1},{0,0},{1,0}},
        GameColor.GREEN),
    
    /**
     * &nbsp&nbsp##                           <BR>
     *  ##
     */
    S(new int[][]{{1,1},{0,1},{0,0},{-1,0}},
    GameColor.ORANGE),
    
    /**
     * #<BR>
     * #<BR>
     * ##
     */
    L(new int[][]{{0,1},{0,0},{0,-1},{1,-1}},
        GameColor.PURPLE), 
    
    /**
     * &nbsp&nbsp#<BR>
     * &nbsp&nbsp#<BR>
     * ##
     */
    J(new int[][]{{0,1},{0,0},{0,-1},{-1,-1}},
        GameColor.RED), 
    
    /**
     * ###<BR>
     * &nbsp&nbsp#
     */
    T(new int[][]{{-1,0},{0,0},{0,-1},{1,0}},
        GameColor.YELLOW);
    

    private final List<Coordinate> coordinates = new ArrayList<>();
    private final GameColor gameColor;
    
    GameTileTypes(int[][] coordinates, GameColor color) {
        for (int[] coordinate : coordinates) {
            this.coordinates.add(new Coordinate(coordinate[0], coordinate[1]));
        }
        this.gameColor = color;
    }
    
    public GameColor getGameColor() {
        return gameColor;
    } 
    
    public List<Coordinate> getBlockCoordinates() {
        return coordinates;
    }
}
