package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
	//2. create an array of 5 robots.
		Robot[] robs = new Robot[5];
		Random rando = new Random();
	//3. use a for loop to initialize the robots.
			for (int i = 0; i < robs.length; i++) {
				robs[i] = new Robot();
				robs[i].setY(500);
				robs[i].setX(i*150+150);
				robs[i].setSpeed(25);
			}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
			int fastest = 1000;
			int oneGoing=112;
		while(fastest>100) {
			
			for (int i = 0; i < robs.length; i++) {
				
				robs[i].move(rando.nextInt(50));
				
				if(robs[i].getY()<fastest) {
					fastest=robs[i].getY();
				}
				oneGoing = i;
				System.out.println(oneGoing);
				if(fastest<101) {
					
					break;
				}
			}
		}
		
		
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
			JOptionPane.showMessageDialog(null, "Robot " + oneGoing + " has won the race!");
			robs[oneGoing].moveTo(250, 250);
			robs[oneGoing].setSpeed(1000);
			int x = 100;
			while(x == 100) {
			for (int i = 0; i < robs.length; i++) {
				if(i == oneGoing) {
					robs[i].turn(rando.nextInt(20));
					robs[i].move(rando.nextInt(250));
				} else {
					robs[i].move(-8);
				}
			}
			}
			
	//8. try different races with different amounts of robots.
			
	//9. make the robots race around a circular track.
	}
}
