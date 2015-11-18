import java.awt.*;
import javax.swing.*;
public class test{
	public static void main(String[]args){
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		JPanel panel = new JPanel();
		panel.setSize(260,330);
		Theme1 t1 = new Theme1();
		newButton b = new newButton("1");
		b.setTheme(t1);
		newButton c = new newButton("2");
		c.setTheme(t1);
		newButton d = new newButton("3");
		d.setTheme(t1);
		newButton e = new newButton("4");
		e.setTheme(t1);
		newButton f = new newButton("5");
		f.setTheme(t1);
		frame.setLayout(new FlowLayout());
		GridLayout l = new GridLayout(2,2);
		l.setVgap(20);
		l.setHgap(20);
		panel.setLayout(l);
		frame.add(panel);
		panel.add(c);panel.add(d);panel.add(e);panel.add(f);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}