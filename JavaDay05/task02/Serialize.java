import java.io.*;

public class Serialize implements java.io.Serializable{
    Toy uToy;
    
    public void SerializeFile(String name, Toy toy){
	try{
	    FileOutputStream file = new FileOutputStream(name);
	    ObjectOutputStream out = new ObjectOutputStream(file);
	    out.writeObject(toy);
	    out.close();
	    file.close();
	}
	catch(IOException e){
	    System.out.println("EXCEPTION");
	}
    }

    public void UnserializeFile(String name){
	try{
	    FileInputStream file = new FileInputStream(name);
	    ObjectInputStream in = new ObjectInputStream(file);

	    uToy = (Toy)in.readObject();
	    in.close();
	    file.close();
	}
	catch(IOException e){
	    System.out.println("EXCEPTION in UNSERIALIZATION");	    
	}
	catch(ClassNotFoundException e){
	    System.out.println("Class not found brah");
	}
    }

    public Toy getUnserialized(){
	return uToy;
    }
}
