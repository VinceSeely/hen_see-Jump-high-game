/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henSeeJumpHigh;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author vince
 */
public class BlockFun extends PFigure 
{

   private Image img;

   public BlockFun(int startX, int startY, JPanel p)
   {
      super(startX, startY,  110,  78, 1, p );
       try
       {
          File file = new File("ScanHead.jpg");
          img = ImageIO.read(file);
       }
       catch ( Exception e )
       {
          System.out.println("Crashing: " + e);
            // Whatever???
       }
   }
   
   public void move()
   {
      
   }
   
   public void draw()
   {
      if( img != null )
      {
         Graphics g = panel.getGraphics();
         g.drawImage( img, x, y, width, height, null );
      }
   }
}
