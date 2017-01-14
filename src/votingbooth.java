import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String[] args) {
 String a= JOptionPane.showInputDialog("How old are you????");
int blah=Integer.parseInt(a);
	if (blah>=18){
	JOptionPane.showInputDialog("who are votting for??");
	JOptionPane.showMessageDialog(null, "ok");
	}
	else{
	JOptionPane.showMessageDialog(null, "YOUR UNDER AGE GET OUTTA HERE NOW");	
	}
}
}
