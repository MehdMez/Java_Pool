import java.util.*;

public class ChiefPurser extends Crew{
    public ChiefPurser(String n){
	this.name = n;
    }
    public void Describe(){
	System.out.println("I'm a chief purser");
    }
    public void Action(){
	System.out.println("I, the chief purser, did an action !");
    }
}
