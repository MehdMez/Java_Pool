import java.net.*;
import java.io.*;

public class DataServer{
    public static void main(String args[]) throws Exception{
	ServerSocket servsock = new ServerSocket(3333);
	System.out.println("Ok, ready");
	Socket sock = servsock.accept();

	OutputStream ostream = sock.getOutputStream();
	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(ostream));
	String welcome = "Welcome to my server pal !";
	writer.write(welcome);
	writer.close();
	ostream.close();
	sock.close();
	servsock.close();
	
    }
}
	
