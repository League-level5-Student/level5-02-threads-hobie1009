package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	volatile static boolean racerunning = true;

	public static void main(String[] args) {
		Random ran = new Random();

		Thread r1 = new Thread(() -> {
			int speed1;
			Robot one = new Robot(150, 501);
			one.setSpeed(250);
			int counter1 = 0;
			while (racerunning == true) {
				speed1 = ran.nextInt(50);

				for (int i = 0; i < speed1; i++) {
					one.move(speed1);
					one.turn(5);
					counter1 = counter1 + speed1;
					if (counter1 >= 360) {
						racerunning = false;
						JOptionPane.showMessageDialog(null, "Robot number two has won the big race!!!");
						System.exit(0);
					}
				}

			}

		});

		Thread r2 = new Thread(() -> {
			int speed2;
			Robot two = new Robot(200, 501);
			two.setSpeed(250);
			int counter2 = 0;
			while (racerunning == true) {
				speed2 = ran.nextInt(50);
				for (int i = 0; i < speed2; i++) {
					two.move(speed2);
					two.turn(5);
					counter2 = counter2 + speed2;
					if (counter2 >= 360) {
						racerunning = false;
						JOptionPane.showMessageDialog(null, "Robot number two has won the big race!!!");
						System.exit(0);
					}
				}
			}
		});

		Thread r3 = new Thread(() -> {
			int speed3;
			Robot three = new Robot(250, 501);
			three.setSpeed(250);
			int counter3 = 0;
			while (racerunning == true) {
				speed3 = ran.nextInt(50);
				for (int i = 0; i < speed3; i++) {
					three.move(speed3);
					three.turn(5);
					counter3 = counter3 + speed3;
					if (counter3 >= 360) {
						racerunning = false;
						JOptionPane.showMessageDialog(null, "Robot number two has won the big race!!!");
						System.exit(0);
					}
				}

			}
		});

		Thread r4 = new Thread(() -> {
			int speed4;
			Robot four = new Robot(300, 501);
			four.setSpeed(250);
			int counter4 = 0;
			while (racerunning == true) {
				speed4 = ran.nextInt(50);
				for (int i = 0; i < speed4; i++) {
					four.move(speed4);
					four.turn(5);
					counter4 = counter4 + speed4;
					if (counter4 >= 360) {
						racerunning = false;
						JOptionPane.showMessageDialog(null, "Robot number two has won the big race!!!");
						System.exit(0);
					}
				}

			}
		});

		Thread r5 = new Thread(() -> {
			int speed5;
			Robot five = new Robot(350, 501);
			five.setSpeed(250);
			int counter5 = 0;
			while (racerunning == true) {
				speed5 = ran.nextInt(50);
				for (int i = 0; i < speed5; i++) {
					five.move(speed5);
					five.turn(5);
					counter5 = counter5 + speed5;
					if (counter5 >= 360) {
						racerunning = false;
						JOptionPane.showMessageDialog(null, "Robot number two has won the big race!!!");
						System.exit(0);
					}
				}

			}
		});
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}

}
