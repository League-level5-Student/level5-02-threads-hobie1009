package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {

	public static void main(String[] args) {
		Random ran = new Random();

		Thread r1 = new Thread(() -> {
			int speed1;
			Robot one = new Robot(150, 501);
			one.setSpeed(250);
			for (int i = 0; i < 300; i++) {
				speed1 = ran.nextInt(50);
				one.move(speed1);
				one.turn(5);
				if (winCheck(one) == true) {
					JOptionPane.showMessageDialog(null, "Robot number one has won the big race!!!");
					
					break;
				}
			}
		});

		Thread r2 = new Thread(() -> {
			int speed2;
			Robot two = new Robot(200, 501);
			two.setSpeed(250);
			for (int i = 0; i < 300; i++) {
				speed2 = ran.nextInt(50);
				two.move(speed2);
				two.turn(5);
				if (winCheck(two) == true) {
					JOptionPane.showMessageDialog(null, "Robot number two has won the big race!!!");
					break;
				}
			}
		});

		Thread r3 = new Thread(() -> {
			int speed3;
			Robot three = new Robot(250, 501);
			three.setSpeed(250);
			for (int i = 0; i < 300; i++) {
				speed3 = ran.nextInt(50);
				three.move(speed3);
				three.turn(5);
				if (winCheck(three) == true) {
					JOptionPane.showMessageDialog(null, "Robot number three has won the big race!!!");
					break;
				}
			}
		});

		Thread r4 = new Thread(() -> {
			int speed4;
			Robot four = new Robot(300, 501);
			four.setSpeed(250);
			for (int i = 0; i < 300; i++) {
				speed4 = ran.nextInt(50);
				four.move(speed4);
				four.turn(5);
				if (winCheck(four) == true) {
					JOptionPane.showMessageDialog(null, "Robot number four has won the big race!!!");
					
					break;
				}
			}
		});

		Thread r5 = new Thread(() -> {
			int speed5;
			Robot five = new Robot(350, 501);
			five.setSpeed(250);
			for (int i = 0; i < 300; i++) {
				speed5 = ran.nextInt(50);
				five.move(speed5);
				five.turn(5);
				if (winCheck(five) == true) {
					JOptionPane.showMessageDialog(null, "Robot number five has won the big race!!!");
					break;
				}
			}
		});
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}

	static boolean winCheck(Robot r) {
		if (r.getY() == 500) {
			JOptionPane.showMessageDialog(null, "Robot number one has won the big race!!!");
			return true;
		}
		return false;
	}
}
