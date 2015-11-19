import java.awt.*;
import javax.swing.*;
public class main{
	public static void main(String[]args){
		JFrame frame = new JFrame();
		Theme1 t1 = new Theme1();
		Cool303Box panel = new Cool303Box(t1);
		Cool303button b = new Cool303button();
		Cool303button c = new Cool303button();
		Cool303button d = new Cool303button();
		Cool303button e = new Cool303button();
		Cool303button f = new Cool303button();
		frame.setLayout(new BorderLayout());
		frame.add(panel,BorderLayout.CENTER);
		for(int i=0;i<20;i++){
			panel.add(new Cool303button(),i);
		}
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}