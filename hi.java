import java.awt.*;
public class hi{
	public static void main(String[] args) {
	Frame frame = new Frame();
	frame.setVisible(true);
	Panel panel = new Panel();
	panel.add(new Label("Hola Mundo"));
	frame.add(panel);
	}
}