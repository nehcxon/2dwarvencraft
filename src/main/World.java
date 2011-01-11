package main;

import java.awt.*;

public class World {
    int x = 64, y=64;
    int[][] map;
    Textures tex;
    
    public void render(Graphics g, int winx, int winy) {
        int unitx = winx/x;
        int unity = winy/y;
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                // doing this without a check for map[i][j] != 0 is safe, since
                // that key's value is a standard image, so we don't care
                g.drawImage(tex.images.get(map[i][j]), unitx*i, unity*j, unitx, unity, null);
            }
        }
        
    }
    
    public void fillWorld() {
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[i].length; j++) {
                map[i][j] = 1;
            }
        }
    }
    
    
    public World(Textures tex) {
        this.map = new int[x][y];
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                map[i][j] = 0;
            }
        }
        
        this.tex = tex;
    }
    

}
