// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class airlineregistraion {
	public static void main(String[] args) {
String first =		JOptionPane.showInputDialog(" what is your first name?");
String last = JOptionPane.showInputDialog(" what is your last name?");
String dest = JOptionPane.showInputDialog(" destination please.");
String birt = JOptionPane.showInputDialog(" when is your birthday?");
String gend = JOptionPane.showInputDialog(" what is your gender?");
String you = JOptionPane.showInputDialog("is this you  " + first+" " + last+" " + dest+" " + birt+" " + gend);
if (you.equals("yes")){
	JOptionPane.showMessageDialog(null, last+ "/" + first+ " " +  "("+ birt+","+" " +" " +gend+" "+ dest+")" );}
	else {
		JOptionPane.showMessageDialog(null, "please do the process again.");
		
	}
	
}
	}







/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
*/
