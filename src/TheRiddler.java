import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
       int score =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer=JOptionPane.showInputDialog(" this thing all things devours:birds,beasts,trees,and flowers; gnaws iron bites steel;grides hard stones to meal; slays kings ruins town, and beats high moutains down. ");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equals("time")){
JOptionPane.showMessageDialog(null, "correct!!");
score++;}
		// 5. Otherwise, say "wrong" and tell them the answer
else { JOptionPane.showInputDialog("wrong! The answer is time.");}
		// 6. Add some more riddles
answer=JOptionPane.showInputDialog("the answer to this riddle has a hole in the middle, in tennis its nothing and it cannot be felt; the answer to this riddle has a hole in the middle");
if (answer.equals("love")){JOptionPane.showInputDialog("correct"); score++;}
else{JOptionPane.showInputDialog("wrong! The answer is love");}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "your score is now "+ score);
	}
}




