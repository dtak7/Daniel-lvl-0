import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class lvl0exam {

	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(10);
		// 3. ask the user what color they would like the Robot to draw
		String a = JOptionPane.showInputDialog("what color would you like (red or blue)");
		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)
		if (a.equals("yellow")) {
			rob.setPenColor(225, 0, 17);
		} else {
			rob.setPenColor(51, 0, 153);
		}
		// 2. set the pen width to 10
		rob.setPenWidth(10);
		// 1. make the Robot draw a shape
		for (int i = 0; i < 4; i++) {
			rob.penDown();
			rob.move(90);
			rob.turn(90);
		}
	}

}