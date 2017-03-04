
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise1 {
	public static void main(String[] args) {

		String numage = JOptionPane.showInputDialog("how old are you???");
		int a = Integer.parseInt(numage);
		if (a < 30) {
			a = 2017 - a;
			System.out.println(a);
		} else {
			System.out.println("you're too old");
		}

	}

}