

import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		

		JFrame frame = new JFrame("Frame Demo");  // Creating a new JFrame object named frame and sets the title 
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the operation when you close
		

		frame.setSize(400, 400); // creates frame that will be 400 pixels wide by 400 long 

		
		Shapes r = new Shapes(); // a new shape object


		frame.add(r); //  putti gr on the frame 

		
		frame.setVisible(true); // allows us to see the frame 




		frame.setVisible(true); //
	}
}
