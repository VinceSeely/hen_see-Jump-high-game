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
public class UWPEnemy extends PFigure 
{
   private int xVel = 20;
   private int yVel = 20;
   private Image img;

   public UWPEnemy(JPanel p)
   {
      super(50, 50, 110, 78, 1, p);
       try
       {
          File file = new File("UWPLogo.jpg");
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
      if ( xVel < 0 && x <= 0 ||
           xVel > 0 && x + width >= panel.getSize().width )
         xVel = - xVel;
      if ( yVel < 0 && y <= 0 ||
           yVel > 0 && y + height >= panel.getSize().height )
         yVel = - yVel;
      x = x + xVel;
      y = y + yVel;
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
