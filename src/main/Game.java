package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public final class Game extends JFrame implements KeyListener {

    private static int winx, winy;

    Thread th;
    Viewer v;

    private void gameLoop() {


    }

    private void drawLoop() {
        BufferStrategy bf = this.getBufferStrategy();
        Graphics g = null;

        try {
            g = bf.getDrawGraphics();

            v.draw(g);

        } finally {
            // It is best to dispose() a Graphics object when done with it.
            g.dispose();
        }

        // Shows the contents of the backbuffer on the screen.
        bf.show();

        //Tell the System to do the Drawing now, otherwise it can take a few extra ms until 
        //Drawing is done which looks very jerky
        Toolkit.getDefaultToolkit().sync(); 
    }



    public static int getWinx() {
        return winx;
    }


    public static int getWiny() {
        return winy;
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    public Game() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setSize(800,600);
        this.setVisible(true);
        this.createBufferStrategy(2);

    }
    
    public static void main(String[] args) {

        Game game = new Game();
        game.setLocationRelativeTo(null);
        game.setVisible(true);
        
        game.gameLoop();

    } 






}
