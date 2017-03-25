import java.util.Random;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class houses {
public static void main(String[] args) {
	Tortoise.penDown();
	Tortoise.setX(10);
	Tortoise.setY(800);
	Tortoise.setSpeed(10);
	for (int i=0;i<30;i++){
	int random = new Random().nextInt(2);
	if (random==1){
		int ran = new Random().nextInt(50)+55;
	Tortoise.setPenColor(PenColors.Yellows.Gold);
	Tortoise.move(ran);
	Tortoise.turn(45);
	Tortoise.move(10);
	Tortoise.turn(90);
	Tortoise.move(10);
	Tortoise.turn(45);
	Tortoise.move(ran);
	Tortoise.turn(-90);
	Tortoise.move(50);
	Tortoise.turn(-90);
	
	}
	else{
		int ran = new Random().nextInt(250)+55;
		Tortoise.setPenColor(PenColors.Yellows.Gold);
		
		Tortoise.move(ran);
		Tortoise.turn(90);
		Tortoise.move(10);
		Tortoise.turn(90);
		Tortoise.move(ran);
		Tortoise.turn(-90);
		Tortoise.move(50);
		Tortoise.turn(-90);
		
	}
	
}

	

}
}