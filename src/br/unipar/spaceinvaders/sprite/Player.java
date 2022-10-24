/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipar.spaceinvaders.sprite;

import br.unipar.spaceinvaders.Commons;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author fatim
 */
public class Player extends Sprite{
    
    private int width;

    public Player() {
        initPlayer();
    }

    private void initPlayer() {
        
        String playerImg = "src/images/player.png";
        ImageIcon ii = new ImageIcon(playerImg);
        setImage(ii.getImage());
        width = ii.getImage().getWidth(null);
        
        int START_X = 270;
        setX(START_X);
        
        int START_Y = 280;
        setY(START_Y);
            
    }
    
    public void act(){
        x += dx;
        
        if(x <= 2){
            x = 2;
        }
        
        if(x >= Commons.BOARD_WIDTH - 2 * width){
            x = Commons.BOARD_WIDTH - 2 * width;
        }
    }
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_LEFT){
            dx = -2;
        }
        
        if(key == KeyEvent.VK_RIGHT){
            dx = 2;
        }
    }
    
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_LEFT){
            dx = 0;
        }
        
        if(key == KeyEvent.VK_RIGHT){
            dx = 0;
        }
    }
    
}
