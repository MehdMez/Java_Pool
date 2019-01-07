import java.util.*;
import java.util.Scanner;

public class RockPaperScissor{
    public boolean playRockPaperScissor(){
	boolean result=false;
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	int jet = random.nextInt(4);
	System.out.println("Please input your bet: rock, paper ou scissor");
	String input = scanner.nextLine();
	switch(jet){
	     case 0:
		 System.out.println("It is rock");
		 if(input.equalsIgnoreCase("paper")){
			 System.out.println("You won !");
			 return true;
		     }
		     else{
			 return false;
		     }
	     case 1:
		 System.out.println("It is paper");
		 if(input.equalsIgnoreCase("scissor")){
			     return true;
     
	       	 }
	         else{
			     return false;	     
		 }
	     case 3:
			 System.out.println("It is scissors");
			 if(input.equalsIgnoreCase("rock")){
				 return true;
			     }
			     else{
				 return false;
			     }
	}
	return result;
    }
}
    
