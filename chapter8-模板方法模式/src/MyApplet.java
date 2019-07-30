import java.applet.Applet;
import java.awt.*;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/30 0030 17:17
 */
public class MyApplet extends Applet {
    String message;

    public void init(){
        message = "Hello World,I'm alive!";
        repaint();
    }

    public void start(){
        message = "Now I'm starting up...";
        repaint();
    }

    @Override
    public void destroy() {
        //applet正在被销毁。。。。。。
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message,5,15);
    }
}
