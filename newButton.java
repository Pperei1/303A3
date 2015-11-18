import javax.swing.*;
import java.awt.*;
public class newButton extends JButton{
	Cool303Theme t;
	public newButton(String text){
		super(text);
	}
	
	public void setTheme(Cool303Theme t){
		this.t = t;
	}
	
	protected void paintComponent(Graphics g){
		t.paint303button(this,g);
	}
	protected void paintBorder(Graphics g){
		g.setColor(Color.BLACK);
		g.drawOval(0,0,getSize().width/2,getSize().height/2);
	}
}