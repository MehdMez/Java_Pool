import javax.swing.*;

public class MyWindow extends JFrame{
    public static void createWindow(JLabel label){
	//La fameuse formule
	JFrame.setDefaultLookAndFeelDecorated(true);

	//Frame creation
	JFrame frame = new JFrame("Mah little window");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.getContentPane().add(label);

	//Affichage sur la fenêtre
	frame.setSize(500, 100);
	frame.setVisible(true);
    }
}
