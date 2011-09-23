package anuja;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.midlet.MIDlet;

/**
 * @author Anuja
 */
public class Home extends MIDlet implements CommandListener {
    private Display display;
    private Form homeFrm;
    private Command exitCmd;
    private Command goCmd;
    private MyCanvas myCan;
    private Command backCmd;
    private ImgCanvas imgCan;
    private Command goImgCmd;

    public void startApp() {
        display = Display.getDisplay(this);
        homeFrm = new Form("Game Home");


        exitCmd = new Command("Exit", Command.EXIT, 7);
        homeFrm.addCommand(exitCmd);
        goCmd = new Command("Plan Figures", Command.OK, 4);
        homeFrm.addCommand(goCmd);
        goImgCmd = new Command("Go Image", Command.OK, 4);
        homeFrm.addCommand(goImgCmd);

        // If you forget to write the following line, you will get a NullPointerException which is a RuntimeException
        homeFrm.setCommandListener(this);
        display.setCurrent(homeFrm);

        backCmd = new Command("Back", Command.BACK, 2);

        myCan = new MyCanvas();
        myCan.addCommand(exitCmd);
        myCan.addCommand(backCmd);
        
        myCan.setCommandListener(this);

        imgCan = new ImgCanvas();
        imgCan.addCommand(exitCmd);
        imgCan.addCommand(backCmd);

        imgCan.setCommandListener(this);
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
        notifyDestroyed();
    }

    public void commandAction(Command c, Displayable d) {
        if(c == exitCmd){
            notifyDestroyed();
        }else if(c == goCmd){
            display.setCurrent(myCan);
        }else if(c == backCmd){
            display.setCurrent(homeFrm);
        }else if(c == goImgCmd){
            display.setCurrent(imgCan);
        }
    }
}
