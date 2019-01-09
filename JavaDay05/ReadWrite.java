import java.io.*;

public class ReadWrite{
    private BufferedReader reader = null;
    private BufferedWriter writer = null;
    private String toWrite;

    public String getRead() throws IOException{
	String data= "";
	while(reader.readLine() != null){
	    data = reader.readLine();
	}
	return data;
    }

    public void setToWrite(String content) throws IOException{
	toWrite = content;
    }

    public void WriteFile(String name) throws IOException{
	try{
	    writer = new BufferedWriter(new FileWriter(name));
	    writer.write(toWrite);
	}
	catch(IOException e){
	    System.out.println("File not found");
	}
	finally{
	    writer.close();
	}
    }

    public void WriteFile(String name, boolean bool) throws IOException{
	if(bool == true || bool == false){
	    try{
		writer = new BufferedWriter(new FileWriter(name, true));
		writer.write(toWrite);
	    }
	    catch(IOException e){
		System.out.println("EXCEPTION !");
	    }
	    finally{
		reader.close();
		writer.close();
	    }
	}
    }

    public void ReadFile(String name) throws IOException{ 
	try{
	    BufferedReader reader2 = new BufferedReader(new FileReader(name));
	    reader = reader2;
	}
	catch(IOException e){
	    System.out.println("File not found");
	}
    }

    public void printRead() throws IOException{
	int data = reader.read();
	while(data != -1){
	    System.out.print((char) data);
	    data = reader.read();
	}
    }

    
    
 }
