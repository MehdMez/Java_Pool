import java.util.*;

public class AirTrafficController extends RadioUser{
    public AirTrafficController(String n){
	System.out.println("I'm an air traffic controler !");
	this.name = n;
    }
    public void Describe(){
	System.out.println("Eh");
    }

    public void Action(){
	System.out.println("I did an action");
    }
}
