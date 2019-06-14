import java.awt.*;

import java.awt.geom.Ellipse2D;


public class Shapes extends JConponent {


	public void paintComponent(Graphics g){
		Graphics2d g2 = (Graphics 2D) g; // Creates a 2D Graphics object

		Rectangle box = new Rectangle (5, 10, 20, 30) // Creating a rectangle 	object with x:5 y:10 width:20 height:30
		

		g2.draw(box);  // Draws a black box because ( black is the default color)


		g2.setColor(Color.blue); // sets color to blue 

		
		Ellipse2D.Double circle = new Ellipse 2D.Double(100, 100, 200, 200); // same as rectangle, but creates circle 


		//g2.fill(circle);  //  fills the circle with blue 


		//g2.setColor(Color.blue);


		//Rectangle bb = new 