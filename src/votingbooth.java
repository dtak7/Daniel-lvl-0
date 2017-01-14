import javax.swing.JOptionPane;

public class votingbooth {
	public static void main(String[] args) {
		for (int xyz = 0; xyz < 3; xyz++) {
			String a = JOptionPane.showInputDialog("How old are you????");
			int blah = Integer.parseInt(a);
			if (blah >= 18) {
				String hi = JOptionPane.showInputDialog("what are voting for (ice cream flavor)");
				JOptionPane.showMessageDialog(null, "ok");
				if (hi.equals("chocolate")) {
					int cho = 0;
					cho = cho + 1;
					System.out.println("chocolate "+cho);

				} else if (hi.equals("vanilla")) {
					int van = 0;
					van = van + 1;
					System.out.println("vanilla "+van);
				} else {
					int els = 0;
					els = els + 1;
					System.out.println("else "+els);
				}
			} else {
				JOptionPane.showMessageDialog(null, "YOUR UNDER AGE GET OUTTA HERE NOW");
			}
		}
	}
}