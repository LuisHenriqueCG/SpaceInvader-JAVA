package br.unipar.spaceinvaders;

import javax.swing.JFrame;

/**
 *
 * @author fatim
 */
public class SpaceInvaders extends JFrame{
    
    public SpaceInvaders(){
        initUI();
    }

    private void initUI() {
        
        add(new Board());
        
        setTitle("Space Invaders");
        setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SpaceInvaders space = new SpaceInvaders();
        space.setVisible(true);
    }
}
