import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog(
				" this thing all things devours:birds,beasts,trees,and flowers; gnaws iron bites steel;grides hard stones to meal; slays kings ruins towns, and beats high moutains down. ");
		// 4. If they got the answer right, pop up "correct!" and increase the
		// score by one
		if (answer.equals("time")) {
			JOptionPane.showMessageDialog(null, "correct!!");
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showInputDialog("wrong! The answer is time.");
		}
		// 6. Add some more riddles
		answer = JOptionPane.showInputDialog(
				"the answer to this riddle has a hole in the middle, in tennis its nothing and it cannot be felt; the answer to this riddle has a hole in the middle");
		if (answer.equals("love")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		} else {
			JOptionPane.showInputDialog("wrong! The answer is love");
		}
		// 2. Make a pop up to show the score.
		String blah =JOptionPane.showInputDialog("a box without hindges key or lid but inside golden tresures hid. what is it");
		if (blah.equals("egg")){
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		}
		else{
			JOptionPane.showMessageDialog(null, "WRONG!!");
		}
		String hoi = JOptionPane.showInputDialog("the faster you run the harder it is to catch. What is it?");
		if (hoi.equals("your breath")){
			JOptionPane.showMessageDialog(null, "correct");
		}
		else{
			JOptionPane.showMessageDialog(null, "wrong!");
		}
		JOptionPane.showMessageDialog(null, "your score is now " + score);
	}
}
