import javax.swing.*;
import java.awt.*;
public class Theme1 implements Cool303Theme{
	public void paint303(Cool303button b,Graphics g){
		g.setColor(Color.YELLOW);
		g.fillOval(0,0,b.getSize().width-1,b.getSize().height-1);
		g.setColor(Color.BLACK);
		g.drawString(b.getText(),b.getSize().width/2,b.getSize().height/2);
	}
	public void paint303border(Cool303button b,Graphics g){
		g.setColor(Color.BLACK);
		g.drawOval(0,0,b.getSize().width-1,b.getSize().height-1);
	}
	public void paint303(Cool303Box b,Graphics g){
		g.setColor(Color.CYAN);
		g.fillRect(0,0,b.getSize().width,b.getSize().height);
	}	
}