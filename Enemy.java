/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henSeeJumpHigh;


import javax.swing.JPanel;

/**
 *
 * @author vince
 */
public class Enemy extends PFigure
{
   public Enemy(int startX, int startY, int pr, JPanel p)
   {
      super(startX, startY, 20, 20, pr, p);
   }
   @Override
   public void draw() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
   
}
