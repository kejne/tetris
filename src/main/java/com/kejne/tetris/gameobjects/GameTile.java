/*
 * Copyright Kaj Fehlhaber
 */

package com.kejne.tetris.gameobjects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kejne
 */
public class GameTile {
   
    private final List<Block> blocks;
    private Coordinate coordinate;
    
    public GameTile(GameTileTypes type, Coordinate initialCoordinate) {
        this.blocks = new ArrayList<>();
        List<Coordinate> blockCoordinates = type.getBlockCoordinates();
        blockCoordinates.stream().forEach((blockCoordinate) -> {
            blocks.add(new Block(initialCoordinate.add(blockCoordinate), type.getGameColor()));
        });
        coordinate = initialCoordinate;
    }
    
    public void update() {
        blocks.get(0);
    }
}
