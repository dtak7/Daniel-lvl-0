
// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;


/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {


	public static void main(String[] args) {


		// Ask the user how many nickels they have

String hi =JOptionPane.showInputDialog("how many nickels do you have ?");
		// Convert their answer to an int using Integer.parseInt()
int hello = Integer.parseInt(hi);

		// Ask the user how many dimes they have, and convert their answer
String ja =JOptionPane.showInputDialog("how many dimes do you have ?");
 int bye = Integer.parseInt(ja);

		// Ask the user how many quarters they have, and convert their answer
String ka = JOptionPane.showInputDialog("how many quaters do you have ?");
int rob = Integer.parseInt(ka);

		// Calculate how much money the user has and save it in a double variable 
double x = rob/4.0;
double z = bye/10.0;
double y = hello/20.0;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, x+z+y);

	}
}


