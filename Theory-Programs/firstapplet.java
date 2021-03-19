import java.applet.*;
import java.awt.*;

public class firstapplet extends Applet {

  public void paint(Graphics g) {
    g.drawOval(200, 200, 300, 100);
    g.setColor(Color.pink);
    g.fillRect(300, 400, 100, 200);
  }
}
/* <applet code = firstapplet width = 300 height =300></applet> */
