import java.net.*;
import java.io.*;

public class DataServer{
    public static void main(String args[]) throws Exception{
	ServerSocket servsock = new ServerSocket(3333);
	System.out.println("Ok, ready");
	Socket sock = servsock.accept();

	//Declaration pour lecture de l'input clavier
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	//Envoi au client grace au writer (attention au type)
	OutputStream ostream = sock.getOutputStream();
	PrintWriter writer = new PrintWriter(ostream, true);
	writer.write("Welcome to my server !");
	writer.flush(); //On vide le buffer

	//Reception de message grace au reciever
	InputStream istream = sock.getInputStream();
	BufferedReader reciever = new BufferedReader(new InputStreamReader(istream));

	String messageRecu, messageEnvoye;
	//while(true) -> trant que le serveur tourne
	while(true){
	    writer.flush();
	    if(reciever.ready() && (messageRecu = reciever.readLine()) != null){
		System.out.println("Message recieved : "+messageRecu);
	    }
	    if(reader.ready() != false){
		messageEnvoye=reader.readLine();
		writer.println(messageEnvoye+"\n");
		
	    }
	    writer.flush();
	}	
    }
}
	
