import java.util.*;

public class RadioOperator extends RadioUser{
    public RadioOperator(String n){
	this.name = n;
    }
    public void Describe(){
	System.out.println("I'm a radio ops !");
    }
    public void Action(){
	System.out.println("I, the radio ops, did an action !");
    }
}
