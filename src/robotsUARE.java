
import org.jointheleague.graphical.robot.Robot;

public class robotsUARE {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
	
			Robot rob = new Robot();
			rob.setPenWidth(10);
			for (int xyz = 0; xyz < 7000; xyz++) {
			// 3. Put the robot's pen down
			rob.penDown();

			// 6. Make the robot move as fast as possible
			rob.setSpeed(10);
			rob.setRandomPenColor();
			// 5. Do everything below here 4 times
			for (int w = 0; w < 4; w++) {
				rob.setRandomPenColor();

				// 2. Move your robot 200 pixels
				rob.move(200);

				// 4. Turn the robot 90 degrees to the right (90 degrees)
				rob.turn(90);
			}
		}
	}
}
