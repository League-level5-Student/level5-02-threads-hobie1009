package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	volatile static boolean racerunning = true;

	public static void main(String[] args) {
		Random ran = new Random();
		Robot one = new Robot(150, 501);
		Thread r1 = new Thread(() -> {
			int speed1;

			one.setSpeed(250);
			int counter1 = 0;
			while (racerunning == true) {
				speed1 = ran.nextInt(5);
					one.move(speed1);
					one.turn(1);
					counter1 = counter1 + speed1;
					if (counter1 >= 1000) {
						racerunning = false;
						JOptionPane.showMessageDialog(null, "Robot number one has won the big race!!!");
						System.exit(0);
					
				}

			}

		});
		Robot two = new Robot(200, 501);
		Thread r2 = new Thread(() -> {
			int speed2;

			two.setSpeed(250);
			int counter2 = 0;
			while (racerunning == true) {
				speed2 = ran.nextInt(5);
				
					two.move(speed2);
					two.turn(1);
					counter2 = counter2 + speed2;
					if (counter2 >= 1000) {
						racerunning = false;
						JOptionPane.showMessageDialog(null, "Robot number two has won the big race!!!");
						System.exit(0);
					
				}
			}
		});
		Robot three = new Robot(250, 501);
		Thread r3 = new Thread(() -> {
			int speed3;

			three.setSpeed(250);
			int counter3 = 0;
			while (racerunning == true) {
				speed3 = ran.nextInt(5);
					three.move(speed3);
					three.turn(1);
					counter3 = counter3 + speed3;
					if (counter3 >= 1000) {
						racerunning = false;
						JOptionPane.showMessageDialog(null, "Robot number three has won the big race!!!");
						System.exit(0);
					
				}

			}
		});
		Robot four = new Robot(300, 501);
		Thread r4 = new Thread(() -> {
			int speed4;

			four.setSpeed(250);
			int counter4 = 0;
			while (racerunning == true) {
				speed4 = ran.nextInt(5);
				
					four.move(speed4);
					four.turn(1);
					counter4 = counter4 + speed4;
					if (counter4 >= 1000) {
						racerunning = false;
						JOptionPane.showMessageDialog(null, "Robot number four has won the big race!!!");
						System.exit(0);
					
				}

			}
		});
		Robot five = new Robot(350, 501);
		Thread r5 = new Thread(() -> {
			int speed5;

			five.setSpeed(250);
			int counter5 = 0;
			while (racerunning == true) {
				speed5 = ran.nextInt(5);
				
					five.move(speed5);
					five.turn(1);
					counter5 = counter5 + speed5;
					if (counter5 >= 1000) {
						racerunning = false;
						JOptionPane.showMessageDialog(null, "Robot number five has won the big race!!!");
						System.exit(0);
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
