
package maze;

import java.awt.Graphics;

public class Mantar extends Obje  {
 private int deger; 

    public Mantar(int deger, int x, int y) {
        super(x, y);
        this.deger = deger;
    }

  

    public int getDeger() {
        return deger;
    }

    public void setDeger(int deger) {
        this.deger = deger;
    }
    
}