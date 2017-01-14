import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	String number = "The WINNING NUMBERS AREEE ";
	for(int y=0;y<5;y++){
		int ran=new Random().nextInt(50)+1;
		number+=ran+" ";
	}
	JOptionPane.showMessageDialog(null, number);
}
}
