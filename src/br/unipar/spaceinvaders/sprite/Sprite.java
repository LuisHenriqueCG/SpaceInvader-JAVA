package br.unipar.spaceinvaders.sprite;

import java.awt.Image;

/**
 *
 * @author fatim
 */
public class Sprite {
    
    private boolean visible;
    private Image image;
    private boolean dying;
    
    int x;
    int y;
    int dx;
    
    public Sprite(){
        visible = true;
    }
    
    public void die(){
        visible = false;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean isDying() {
        return dying;
    }

    public void setDying(boolean dying) {
        this.dying = dying;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
