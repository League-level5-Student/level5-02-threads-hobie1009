package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot one = new Robot(400, 350);
		Robot two = new Robot(700, 350);
		Robot three = new Robot(1000, 350);
		Robot four = new Robot(550, 550);
		Robot five = new Robot(850, 550);
		one.setSpeed(5);
		two.setSpeed(5);
		three.setSpeed(5);
		four.setSpeed(5);
		five.setSpeed(5);
		Thread r1 = new Thread();
		Thread r2 = new Thread();
		Thread r3 = new Thread();
		Thread r4 = new Thread();
		Thread r5 = new Thread();
	}
}

