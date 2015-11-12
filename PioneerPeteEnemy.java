/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henSeeJumpHigh;

<<<<<<< HEAD
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
=======
import java.awt.Panel;
>>>>>>> origin/master

/**
 *
 * @author vince
 */
public class PioneerPeteEnemy extends PFigure
{
<<<<<<< HEAD
   private int xVel = ((int)(Math.random() * 100)) - 50;
   private int yVel = ((int)(Math.random() * 100)) - 50;
   
   private Image img;

   public PioneerPeteEnemy(int startX, int startY, JPanel p)
   {
      super(startX, startY, 50, 50, 1, p);
      try
      {
         File file = new File("images.jpg");
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
      for(int i = 0; i < GameFrame2.spawner.length; i++)
         if(super.collidedWith(GameFrame2.spawner[i]))
         {
            xVel = ((int)(Math.random() * 100)) - 50;
            yVel = ((int)(Math.random() * 100)) - 50;
            x = ((int)(Math.random() * 699)) + 1;
            y = ((int)(Math.random() * 699)) + 1;
         }
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
=======
   
   public PioneerPeteEnemy(int startX, int startY, int pr, Panel p)
   {
      super(startX, startY, 20, 20, pr, p);
   }

   @Override
   public void draw() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> origin/master
   }
   
}
