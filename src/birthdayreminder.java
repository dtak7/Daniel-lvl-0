 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;


public class birthdayreminder {


	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March   23rd";
		String dadsBirthday = "January 30th";
		String myBirthday = "July 8th";
		String sistersBirthday = "November 24th";


		// 2. Find out which birthday the user wants and and store their response in a variable
String hi =	JOptionPane.showInputDialog("Whose birthday do you want to know?");
		// 3.  out what the user typed
		System.out.println(hi);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (hi.equals("momsBirthday")){
			JOptionPane.showMessageDialog(null, "March 23rd");
		}
		// 5. if user asked for "dad"
		else	if (hi.equals("dadsBirthday")){
			JOptionPane.showMessageDialog(null, "January 30th");
		}
			// print dad's birthday
		// 6. if user asked for your name
		else	if (hi.equals("myBirthday")){
			JOptionPane.showMessageDialog(null, "July 8th");
		}
			// print myBirthday
		else	if (hi.equals(sistersBirthday)){
			JOptionPane.showMessageDialog(null, "November 24th");
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "i dont know that person's birthday (if you got this wrong try doing myBirthday,dadsBirthday,momsBirthday,or sistersBirthday)");
		}


	} 
}
