import javax.swing.*;
import java.awt.*;
public class Cool303button extends JButton implements Cool303Component{
	private Cool303Theme t;
	private String text = "0";
	public Cool303button(){
		super();
	}
	
	public void setTheme(Cool303Theme t){
		this.t = t;
	}
	
	protected void paintComponent(Graphics g){
		t.paint303(this,g);
	}
	protected void paintBorder(Graphics g){
		t.paint303border(this,g);
	}
	public String getText(){
		return text;
	}
	public void setText(String text){
		this.text = text;
	}
}