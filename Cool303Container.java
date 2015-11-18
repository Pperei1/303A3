import javax.swing.*;
import java.awt.*;
public interface Cool303Container{
	private Cool303Theme t;
	public Component add(Cool303Component c);
	public Component add(Cool303Component c, int index);
	public void setTheme(Cool303Theme t);
}
