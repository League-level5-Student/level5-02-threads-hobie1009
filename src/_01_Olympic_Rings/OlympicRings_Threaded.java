package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Thread r1 = new Thread(() -> {
			Robot one = new Robot(400, 350);
			one.setSpeed(8);
			one.penDown();
			for (int i = 0; i < 360; i++) {
				one.move(3);
				one.turn(1);
			}
		});
		Thread r2 = new Thread(() -> {
			Robot two = new Robot(700, 350);
			two.setSpeed(8);
			two.penDown();
			for (int i = 0; i < 360; i++) {
				two.move(3);
				two.turn(1);
			}
		});
		Thread r3 = new Thread(() -> {
			Robot three = new Robot(1000, 350);
			three.setSpeed(8);
			three.penDown();
			for (int i = 0; i < 360; i++) {
				three.move(3);
				three.turn(1);
			}
		});
		Thread r4 = new Thread(() -> {
			Robot four = new Robot(550, 550);
			four.setSpeed(8);
			four.penDown();
			for (int i = 0; i < 360; i++) {
				four.move(3);
				four.turn(1);
			}
		});
		Thread r5 = new Thread(() -> {
			Robot five = new Robot(850, 550);
			five.setSpeed(8);
			five.penDown();
			for (int i = 0; i < 360; i++) {
				five.move(3);
				five.turn(1);
			}
		});
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}

}
