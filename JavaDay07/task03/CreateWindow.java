import javax.swing.*;

public class CreateWindow{
    private static void createWindow(){
	//Formule magique apparemment indispensable pour l'utilisation de Swing
	JFrame.setDefaultLookAndFeelDecorated(true);

	//Creation de la frame
	JFrame frame = new JFrame("My Frame");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	//Affichage dans la fenetre
	JLabel message = new JLabel("Hello World !");
	frame.getContentPane().add(message); //Ajout à la fenêtre

	//Affichage de la fenetre
	frame.pack();
	frame.setSize(500, 100);
	frame.setVisible(true);
    }

    public static void main(String[] args){
	createWindow();
    }
}
