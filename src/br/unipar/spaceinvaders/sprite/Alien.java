package br.unipar.spaceinvaders.sprite;

import javax.swing.ImageIcon;

/**
 *
 * @author fatim
 */
public class Alien extends Sprite{
    
    private Bomb bomb;

    public Alien(int x, int y) {
        initAlien(x, y);
    }
    private void initAlien(int x, int y) {
        this.x = x;
        this.y = y;
        
        bomb = new Bomb(x, y);
        
        String alienImg = "src/images/alien.png";
        ImageIcon ii = new ImageIcon(alienImg);
        
        setImage(ii.getImage());
    }
    
    public void act(int direction){
        this.x += direction;
        
    }
    
    public Bomb getBomb() {
        return bomb;
    }

    public static class Bomb extends Sprite {
        
        private boolean destroyed;

        public boolean isDestroyed() {
            return destroyed;
        }

        public void setDestroyed(boolean destroyed) {
            this.destroyed = destroyed;
        }
        
        public Bomb(int x, int y) {
            init(x, y);
        }

        private void init(int x, int y) {
            setDestroyed(true);
            
            this.x = x;
            this.y = y;
            
            String bombImg = "src/images/bomb.png";
            ImageIcon ii = new ImageIcon(bombImg);
            setImage(ii.getImage());
        }
    }
}
