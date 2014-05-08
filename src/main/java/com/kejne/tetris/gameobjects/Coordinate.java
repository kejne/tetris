/*
 * Copyright Kaj Fehlhaber
 */

package com.kejne.tetris.gameobjects;

/**
 *
 * @author kejne
 */
public final class Coordinate {
        
    private int x;
    private int y;
    
    public Coordinate(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    
    public int getX() {
        return x;
    }
    
    public int getPixelX(){
        return x * GameBoard.BLOCK_SIZE;
    }
    
    public int getY() {
        return y;
    }

    public int getPixelY(){
        return y * GameBoard.BLOCK_SIZE;
    }
    
    public void setX(int x) {
        if (GameBoard.xWithinBounds(x)) {
            this.x = x;
        }
    }
    
    public void setY(int y) {
        if (GameBoard.yWithinBounds(y)) {
            this.y = y;
        }
    }
    
    /**
     * Adds the coordinates of the input Coordinate with the object <BR>
     * and return the new coordinate.
     * 
     * @param coordinate the coordinates to add
     * @return the sum of the coordinates
     * 
     */
     public Coordinate add(Coordinate coordinate) {
        
         int newX = getX() + coordinate.getX();
         int newY = getY() + coordinate.getY();
         System.out.println("Got x" + getX() + " " + coordinate.getX() + " " + newX);
         return new Coordinate(newX, newY);
    }
}
