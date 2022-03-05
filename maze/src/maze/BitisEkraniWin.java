
package labirent;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class BitisEkraniWin extends JPanel{
     @Override
   protected void paintComponent(Graphics g)
   {
   super.paintComponent(g); 
   Image arkaplan=new ImageIcon("C:\\Projects\\lab12\\labırent\\src\\Image\\Win.jpeg").getImage();
   g.drawImage(arkaplan, 0, 0, 1280, 960, null);

   }
}