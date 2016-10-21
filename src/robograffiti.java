import org.jointheleague.graphical.robot.Robot;

public class robograffiti {
public static void main(String[] args) {
	
   Robot rob=new Robot();
   rob.setPenColor(90,160,255);
   rob.setSpeed(10);
   rob.penDown();
   rob.move(200);
   rob.turn(120);
   rob.move(50);
   rob.turn(50);
   rob.move(120);
   rob.turn(70);
   rob.move(90);
   rob.penUp();
   rob.turn(230);
   rob.move(200);
   rob.turn(270);
   rob.penDown();
   rob.move(200);
   rob.turn(90);
   rob.move(90);
   rob.turn(180);
   rob.move(160);
   rob.penUp();
   rob.moveTo(1300, 500);
   rob.penDown();
   rob.turn(80);
   rob.move(90);
   rob.turn(80);
   rob.move(70);
   rob.turn(180);
   rob.move(70);
   rob.turn(280);
   rob.move(150);
   rob.turn(250);
   rob.move(60);
   rob.turn(290);
   rob.move(50);
   rob.turn(280);
   rob.move(30);
   rob.penUp();
   rob.moveTo(2000, 1000);
}
}
