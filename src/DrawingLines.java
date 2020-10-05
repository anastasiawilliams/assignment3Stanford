/* DrawingLines.java
 * -------------------
 * This program allows users to draw lines on the canvas with their mouse.
 */

import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;

public class DrawingLines extends GraphicsProgram {
	
	public void run() {
		addMouseListeners();
	}
	
	public void mousePressed (MouseEvent e) {		//begins the line where mouse is pressed
		int x = e.getX();
		int y = e.getY();
		mouseLine = new GLine(x, y, x, y);
		add(mouseLine);
	}
	
	public void mouseDragged(MouseEvent e) {		// repeated reseting endpoint until released
		int x = e.getX();
		int y = e.getY();
		mouseLine.setEndPoint(x, y);
	}
	
	private GLine mouseLine;		// lines that are being drawn

}
