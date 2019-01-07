import java.util.Scanner;
import java.util.*;

public class TossCoin{
    public static boolean playTossCoin(){
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please toss your coin (input what you think will be the result)");
	String input = scanner.nextLine();
	System.out.println("You have tossed your coin, and bet "+input);
	Random rand = new Random();
	int tossed = rand.nextInt(2);
	if(tossed == 1){
	    System.out.println("The coin landed on Heads");
	    if(input.equals("Heads") || input.equals("heads")){
		    System.out.println("Bravo ! You've guessed well !");
		    return true;
		}
		else{
		    System.out.println("Wrong choice...");
		    return false;
		}
 	}
	else{
	    System.out.println("And it was Tails.");
	    if(input.equals("Tails") || input.equals("tails")){
		System.out.println("Good choice !");
		return true;
	    }
	    else{
		System.out.println("Aaaah, bad news...");
		return false;
	    }
	}
    }
}
    
