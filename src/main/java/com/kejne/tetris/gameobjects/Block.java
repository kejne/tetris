/*
 * Copyright Kaj Fehlhaber
 */

package com.kejne.tetris.gameobjects;

import static org.lwjgl.opengl.GL11.*;
import static com.kejne.tetris.gameobjects.GameBoard.*;

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

    public void draw() {
        
	    gameColor.setGlColor();
	   
	    // draw quad
	    glBegin(GL_QUADS);
	        glVertex2f(coordinate.getPixelX(),coordinate.getPixelY());
		glVertex2f(coordinate.getPixelX()+BLOCK_SIZE,coordinate.getPixelY());
                glVertex2f(coordinate.getPixelX()+BLOCK_SIZE,coordinate.getPixelY()+BLOCK_SIZE);
                glVertex2f(coordinate.getPixelX(),coordinate.getPixelY()+BLOCK_SIZE);
	    glEnd();
    }
}
