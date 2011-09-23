package anuja;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

/**
 *
 * @author Anuja
 */
public class MyCanvas extends Canvas {
//The Canvas class is a base class for writing applications that need to handle low-level events
//and to issue graphics calls for drawing to the display
// Canvas class is abstract

    // Renders the Canvas. The application must implement this method in order to paint any graphics. 
    protected void paint(Graphics g) {

        // getWidth() and getHeight() inherited from class javax.microedition.lcdui.Displayable
        int width = getWidth();
        int height = getHeight();

        // setColor() sets the current color to the specified RGB values.
        g.setColor(255, 255, 255); // White background

        // fillRect()fFills the specified rectangle with the current color
        g.fillRect(50, 50, width, height); // Background is apply for part of the screen

        g.setColor(255, 0, 0); // Set color to Red

        // Draws a line between the coordinates (x1,y1) and (x2,y2) using the current color and stroke style.
        g.drawLine(0, 0, 200, 200); // (x1, y1, x2, y2)

        // Fills a circular or elliptical arc covering the specified rectangle.
        g.fillArc(100, 100, 100, 100, 90, 180); // (x, y, width, height, startAngle, arcAngle )

        g.setColor(0, 255, 0); // Set color to Green

        // Fills the specified triangle will the current color
        g.fillTriangle(100, 0, 200, 100, 0, 100);

        g.setColor(0, 0, 255); // Set color to Blue

        // Draws the specified String using the current font and color.
        // The x,y position is the position of the anchor point.
        g.drawString("Hello", 50, 50, Graphics.BOTTOM | Graphics.HCENTER); // (Str, x, y, anchor)
    }
}