
package maze;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class BitisEkraniOver extends JPanel {
      @Override
   protected void paintComponent(Graphics g)
   {
   super.paintComponent(g); 
   Image arkaplan=new ImageIcon("C:\\Projects\\Smurfs\\maze\\src\\Image\\gameover.jpeg").getImage();
   g.drawImage(arkaplan, 0, 0, 1280, 960, null);

   }
}