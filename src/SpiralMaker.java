
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {

		// 3. Make a variable to hold the number of sides and set it to 0
		int spiral = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or
		// pentagon)
		String jop = JOptionPane.showInputDialog("what shape do you want?");
		// 5. Set the number of sides depending on what the user entered
		// (multiple lines of code)
		
		if(jop.equals("square")){
		drawShape(4);
		}
		else if(jop.equals("pentagon")){
			drawShape(5);
		}
		else if(jop.equals("triangle")){
			drawShape(3);
		}
		else if (jop.equals("circle")){
			for (int e=0;e<20000000;e++){
				Tortoise.setSpeed(10);
				Tortoise.penDown();
				Tortoise.turn(10);
				Tortoise.move(0.1*e);
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Sorry try another shape!");
		}
		// 6. If the user enters something else, say "Sorry, I don't know how to
		// draw a ..."

		// 1. Make the Tortoise draw a square spiral shape. If you get stuck,
		// use these instructions: http://bit.ly/YJUOkn
		
		// 2. Change your code to turn the square spiral into a triangle spiral

	}

	static void drawShape(int numSides) {
		for (int i = 0; i < 150; i++) {
			Tortoise.setSpeed(10);
			Tortoise.penDown();
			Tortoise.move(4*i);
			Tortoise.turn(360 / numSides);
			

		}
	}
}
