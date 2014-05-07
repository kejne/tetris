/*
 * Copyright Kaj Fehlhaber
 */

package com.kejne.tetris.gameengine;

import com.kejne.tetris.gameobjects.Block;
import com.kejne.tetris.gameobjects.Coordinate;
import com.kejne.tetris.gameobjects.GameColor;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author kejne
 */
public class Game {
    
    List<Block> blocks = new ArrayList<>();
    
    public void start() {
        
        try {       
            Display.setDisplayMode (new DisplayMode(800,600));
            Display.create();
        } catch (LWJGLException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
        
        glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	glOrtho(0, 800, 0, 600, 1, -1);
	glMatrixMode(GL_MODELVIEW);
        
        blocks.add(new Block(new Coordinate(1,1), GameColor.BLUE));
        
        while(!Display.isCloseRequested()) {
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
            
            blocks.stream().forEach((block) -> {
                block.draw();
            });
            Display.update();
            Display.sync(30);
        }
        
        Display.destroy();
    }

}
