import java.io.*;

public class Serialize<T> implements java.io.Serializable{
    T t;
    
    public void SerializeFile(String name, T t){
	try{
	    FileOutputStream file = new FileOutputStream(name);
	    ObjectOutputStream out = new ObjectOutputStream(file);
	    out.writeObject(t);
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

	    t =(T) in.readObject();
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

    public T getUnserialized(){
	return this.t;
    }
}
