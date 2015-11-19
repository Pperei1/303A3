import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
public class Cool303Box extends JPanel implements Cool303Container{
	Cool303Theme t;
	public Cool303Box(){
		super(new GridLayout(5,4));
	}
	public Cool303Box(Cool303Theme t){
		super(new GridLayout(5,4));
		this.t = t;
	}
	public void add(Cool303button c){
		super.add(c);
		c.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(c.getText());
			}
		});
		c.setTheme(t);
	}
	public void add(Cool303button c, int index){
		super.add(c,index);
		c.setText(""+(index+1));
		c.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(c.getText());
			}
		});
		c.setTheme(t);
	}
	public void setTheme(Cool303Theme t){
		this.t = t;
	}

	protected void paintComponent(Graphics g){
		t.paint303(this,g);
	}
}