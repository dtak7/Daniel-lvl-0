import javax.swing.JOptionPane;

public class NumberSorter {
public static void main(String[] args) {
	String question1 = JOptionPane.showInputDialog("please give me a number");
	int num1=Integer.parseInt(question1);
	String question2 = JOptionPane.showInputDialog("give me another number");
	int num2=Integer.parseInt(question2);
	String question3 = JOptionPane.showInputDialog("last number");
	int num3=Integer.parseInt(question3);
	if (num1>num2 && num1>num3){
		JOptionPane.showMessageDialog(null, num1 +"," + num2+ "," + num3);
	}
	else if (num2>num1 && num2>num3){
		JOptionPane.showMessageDialog(null, num2+ "," + num1+"," +num3);
	}
	else if (num3>num1 && num3>num2){
		JOptionPane.showMessageDialog(null, num3+","+num1+","+num3);
	}
	//else if ()
}
}
