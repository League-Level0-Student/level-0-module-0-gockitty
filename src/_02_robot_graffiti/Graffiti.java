package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class Graffiti {

	Robot jo = new Robot();
	public static void main(String[] args) {
		Robot jo = new Robot();
		jo.penDown();
		jo.setSpeed(80);
		jo.move(200);
		jo.turn(90);
		jo.move(200);
		jo.turn(180);
		jo.move(200);
		jo.turn(-90);
		jo.move(200);
		
		
		jo.turn(-90);
		jo.move(200);
		jo.turn(-90);
		jo.move(100);
		jo.turn(-90);
		jo.move(95);
		
	}
	
	
}
