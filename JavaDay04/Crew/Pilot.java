import java.util.*;

public class Pilot extends PlaneUser{
    public Pilot(String n){
	this.name = n;
    }
    public void Describe(){
	System.out.println("I'm the Pilot, yo");
    }
    public void Action(){
	System.out.println("The pilot is doing his part !");
    }
}
