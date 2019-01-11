import javax.swing.*;

public class MyWindow extends JFrame{
    public static void createWindow(JPanel panel){
	//La fameuse formule
	JFrame.setDefaultLookAndFeelDecorated(true);

	//Frame creation
	JFrame frame = new JFrame("Mah little window");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.getContentPane().add(panel);

	//Affichage sur la fenêtre
	frame.setSize(500, 100);
	frame.setVisible(true);
    }
}
