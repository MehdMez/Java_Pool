import java.util.*;

public class CoPilot extends PlaneUser{
    public CoPilot(String n){
	System.out.println("I'm a copilot !");
	this.name = n;
    }
    public void Describe(){
	System.out.println("Yo");
    }
    public void Action(){
	System.out.println("The copilot is doing an action!");
    }
}
