import javax.swing.*;
import java.awt.*;
public class Theme1 implements Cool303Theme{
	public void paint303button(newButton b,Graphics g){
		g.setColor(Color.YELLOW);
		g.fillOval(0,0,b.getSize().width-1,b.getSize().height-1);
	}	
}