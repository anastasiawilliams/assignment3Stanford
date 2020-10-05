/* RandomCircles.java
 * ------------------
 * This program creates 10 random circles of random size between 5 and 50
 * pixels, within the console window of varying random colors. 
 */
import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class RandomCircles extends GraphicsProgram{

	private static final int AMOUNT_CIRCLES = 10;        // constants for RandomCircles
	private static final int MINIMUM_RAD = 5;
	private static final int MAXIMUM_RAD = 50;

	public void run() {
	
		GLabel hello = new GLabel("Ten Random Circles", 10, 10);
		add(hello);
		
		
		for (int i = 0; i < AMOUNT_CIRCLES; i++) {					//loop for RandomCircles
			int rad = random.nextInt(MINIMUM_RAD, MAXIMUM_RAD);
			int x = random.nextInt(0, getWidth() - (2 * rad));
			int y = random.nextInt(0, getHeight() - (2 * rad));
			GOval randomCircle = new GOval (x, y, 2 * rad, 2 * rad);
			randomCircle.setFilled(true);
			randomCircle.setFillColor(random.nextColor());
			add(randomCircle);
		}
	}

private RandomGenerator random = RandomGenerator.getInstance(); 
}
