package anuja;

import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 *
 * @author Anuja
 */
public class ImgCanvas extends Canvas {

    protected void paint(Graphics g) {
        int width = getWidth();
        int height = getHeight();

        try {
            Image carImg = Image.createImage("car.png");

            // drawImage() draws the specified image by using the anchor point.
            // If anchor is not a legal value it gives a java.lang.IllegalArgumentException
            g.drawImage(carImg, width, height, Graphics.BOTTOM | Graphics.RIGHT);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // keyPressed() called when a key is pressed.
    // The getGameAction() method can be called to determine what game action, if any, is mapped to the key.
    // Class Canvas has an empty implementation of this method, and
    //the subclass has to redefine it if it wants to listen this method.
    protected void keyPressed(int keyCode) {
        //System.out.println("Key Pressed" + keyCode);

        int gameAction = getGameAction(keyCode);
        //System.out.println(gameAction);

        switch(gameAction){
            case Canvas.LEFT: System.out.println("Left"); break;
            case Canvas.RIGHT: System.out.println("Right"); break;
            case Canvas.UP: System.out.println("Up"); break;
            case Canvas.DOWN: System.out.println("Down"); break;
        }
    }
}
