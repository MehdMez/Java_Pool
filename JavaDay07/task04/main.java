import javax.swing.*;

public class main{
    public static void main(String[] args){
	MyPanel panel = new MyPanel();
	MyWindow window = new MyWindow();
	window.createWindow(panel.createHWPanel());
    }
}
