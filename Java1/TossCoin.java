import java.util.Scanner;
import java.util.*;

public class TossCoin{
    public static boolean playTossCoin(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please toss your coin (input anything)");
	String input = scanner.nextLine();
	System.out.println("You have tossed your coin, "+input);
	Random rand = new Random();
	int tossed = rand.nextInt(2);
	if(tossed == 1){
	    return true;
	}
	else{
	    return false;
	}
    }

    public static void main(String[] args){
	if(playTossCoin()==true){
	    System.out.println("Heads !");
	}
	else{
	    System.out.println("Tails !");
	}
    }
}
    
