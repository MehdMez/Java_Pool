import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
    public static JPanel createHWPanel(){
	ImageIcon image = new ImageIcon("image.png");
	JLabel label = new JLabel("", image, JLabel.CENTER);
	JPanel panel = new JPanel(new BorderLayout());
	panel.add(label, BorderLayout.CENTER);
	return panel;	
    }
}
