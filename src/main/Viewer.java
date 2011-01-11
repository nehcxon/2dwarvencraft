package main;

import java.awt.Image;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Viewer extends JPanel {
    
    World w;
    Textures t;
    
    public Viewer() {
        t = new Textures();
        w = new World(t);
        
    }
    
    public void draw(Graphics g) {
        w.render(g, this.getHeight(), this.getWidth());
        
    }

}
