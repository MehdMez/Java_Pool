import java.io.*;
import java.net.*;

public class DataClient{
    public static void main(String args[]) throws Exception{
	Socket socket = new Socket("127.0.0.1", 3333);

	InputStream inputStream = socket.getInputStream();
	BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
	String welcome = reader.readLine();
	System.out.println(welcome);

	reader.close();
	inputStream.close();
	socket.close();
    }
}
