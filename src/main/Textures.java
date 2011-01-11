package main;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashMap;

public class Textures {
    
    private int ctr = 1;
    public HashMap<Integer, Image> images;
    
    public void loadTexture(String path) {
        images.put(ctr, Toolkit.getDefaultToolkit().getImage(path));
        ctr++;
    }
    
    public Textures() {
        ctr = 1;
        images = new HashMap<Integer, Image>(64);
        loadTexture("imgs/test.gif");
    }

}
