/**
 * Write a description of class LoopDrawing here.
 *
 * @author Aaron Ramirez
 * @version 1/29
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        
	/******** Put your code here  *********/




	
Ellipse2D.Double circle = new Ellipse2D.Double(200,200,200,200);

g2.setColor(Color.black);
g2.fill(circle);

//---------------------------------------

Ellipse2D.Double circle2 = new Ellipse2D.Double(100,100,100,100);


g2.setColor(Color.blue);
g2.fill(circle2);

//---------------------------------------

Ellipse2D.Double circle3 = new Ellipse2D.Double(100,100,100,100);


g2.setColor(Color.white);
g2.fill(circle);

//---------------------------------------


















   	// comment this out once you have finished
        drawGrid(g2);
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
















        }
    }
}