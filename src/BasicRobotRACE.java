
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class BasicRobotRACE {
	
		public static void main(String[] args) {
//			String input = " ";
//			while(!input.equals("")) {
//				input = JOptionPane.showInputDialog("input");
//			}

			// 1. make a main method

			// 2. create an array of 5 robots.
			Robot[] rob = new Robot[5];
			// 3. use a for loop to initialize the robots.
			for (int i = 0; i < rob.length; i++) {
				rob[i] = new Robot();
				rob[i].moveTo(i * 100 + 50, 500);
			}

			// 4. make each robot start at the bottom of the screen, side by side, facing up

			// 5. use another for loop to iterate through the array and make each robot move
			// a random amount less than 50.
			Random ran = new Random();
			boolean racerunning=true;
			while (racerunning==true) {
				rob[0].setSpeed(500);
				rob[1].setSpeed(500);
				rob[3].setSpeed(500);
				rob[3].setSpeed(500);
				rob[4].setSpeed(500);
			for (int i = 0; i < rob.length; i++) {
				int speed = ran.nextInt(50);
				rob[i].move(speed);
				rob[i].turn(5);
				if (rob[i].getY()==100) {
					racerunning=false;
					JOptionPane.showMessageDialog(null,"robot number "+i+" wins!");
					break;
				}}
			}
			
		}
		

// 6. use a while loop to repeat step 5 until a robot has reached the top of the
// screen.

// 7. declare that robot the winner and throw it a party!

// 8. try different races with different amounts of robots.

// 9. make the robots race around a circular track.

}
