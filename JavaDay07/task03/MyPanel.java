import javax.swing.*;

public class MyPanel extends JPanel{
    public static JPanel createHWPanel(){
	JPanel panel = new JPanel();
	JLabel label = new JLabel("Hello Woooorld");
	panel.add(label);
	return panel;	
    }
}
