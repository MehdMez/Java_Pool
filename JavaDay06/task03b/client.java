import java.io.*;
import java.net.*;

class client{
    public static void main(String[] args) throws Exception{
	String sentence;
	String modifiedSentence;
	BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

	Socket socket = new Socket("localhost", 3337);
	DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());

	BufferedReader inFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	while(true){
	    if(inFromUser.ready()){
		sentence = inFromUser.readLine();
		toServer.writeBytes(sentence);
	    }
	    if(inFromServer.ready()){
		modifiedSentence = inFromServer.readLine();
	        System.out.println("From server : " + modifiedSentence);
	    }
	}
    }
}
