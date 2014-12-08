import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

/**
 * Creates multiple Robots and makes them race across the screen
 * 
 * Can you find examples of weak coding? 
 * 
 * @author Kent Collins
 * @version 8 December, 2014
 *
 */
public class RaceLab_C { 

	public static void main(String[] args) {
		Display.setSize(20, 20);
		Display.setSpeed(8);
		// Construct Robot competitors
		Robot[] robots = new Robot[5];
		for(int i = 0; i<5; i++) {
			robots[i] = new Robot(1, i+1, Display.EAST, 0);
		}
		// Begin the race
		while (true) {
			// Create a random integer from 0 to 4
			int luckyRobot = (int) (Math.random()*5);
			robots[luckyRobot].move();
		}
	}
}
