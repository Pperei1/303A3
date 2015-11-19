import javax.swing.*;
import java.awt.*;
public class Theme2 implements Cool303Theme{
	public void paint303(Cool303button b,Graphics g){
		g.setColor(Color.ORANGE);
		g.fillRect(b.getSize().width/4,b.getSize().width/4,b.getSize().width/2,b.getSize().height/2);
		g.setColor(Color.BLACK);
		g.drawString(b.getText(),b.getSize().width/2,b.getSize().height/2);
	}
	public void paint303border(Cool303button b,Graphics g){
		g.setColor(Color.BLACK);
		g.drawRect(b.getSize().width/4,b.getSize().width/4,b.getSize().width/2,b.getSize().height/2);
	}
	public void paint303(Cool303Box b,Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0,0,b.getSize().width,b.getSize().height);
	}	
}