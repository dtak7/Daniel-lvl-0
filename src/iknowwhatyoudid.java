import javax.swing.JOptionPane;

public class iknowwhatyoudid {
	public static void main(String[] args) {
		String hi = JOptionPane.showInputDialog("what is your name?");

		String answer = JOptionPane.showInputDialog("what did you do this summer");
		
		if (hi.equals("Daniel")) {
			JOptionPane.showMessageDialog(null, "soo " + hi + " i know that you accually went to JAPAN this summer!! ");
		} else {
JOptionPane.showMessageDialog(null, "I KNOW that!!");
		}
	}

}
