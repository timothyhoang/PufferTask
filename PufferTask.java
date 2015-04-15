package SSRT.Applications;

import java.applet.*;
import java.awt.*;

public class PufferTask extends Applet {

	public void paint(Graphics g) {
		g.drawRect(0,0,250,100);
		g.setColor(Color.blue);
		g.drawString("Java Applet", 50, 50);
	}
}
