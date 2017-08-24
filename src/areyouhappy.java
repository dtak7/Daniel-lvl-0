import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {
		String f = JOptionPane.showInputDialog("Are you happy????");
		if (f.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Then keep doing whatever you're doing!");
		} else {
			String you = JOptionPane.showInputDialog("do you want to be happy???");
			if (you.equals("no")) {
				JOptionPane.showMessageDialog(null, "keep doing whatever you're doing!");
			} else {
				JOptionPane.showMessageDialog(null, "then change something!");
			}

		}
	}
}