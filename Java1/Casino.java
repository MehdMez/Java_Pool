import java.util.*;
import java.util.Scanner;
    
public class Casino{
    public static void menu(){
	System.out.println("Type 1 for Tossing Coin, 2 for Rock Paper Scissor, 3 for Roulette Wheel and 4 for Slot Machine.\nIf you hate this place and you want to quit, type q.");
	Scanner scanner = new Scanner(System.in);
	String choice = scanner.nextLine();
	int choiceValue = 0;
	    while(!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equalsIgnoreCase("q")){
		System.out.println("What ?\nI did not understand...\nType again !");
		choice = scanner.nextLine();
	    }
	    if(!choice.equals("q")){
		    try{choiceValue = Integer.parseInt(choice);}
		    catch(NumberFormatException e){
			System.out.println("Error, the menu will load again");
			menu();
		    }
	    }
	    else{
		choiceValue = 0;
	    }
	    switch(choiceValue){
	    case 0 :
		break;
	    case 1 :
		TossCoin coin = new TossCoin();
		coin.playTossCoin();
		System.out.println("Please chose another game");
		menu();
		break;
	    case 2:
		RockPaperScissor rps = new RockPaperScissor();
		rps.playRockPaperScissor();
		System.out.println("Please chose another game");
		menu();
		break;
	    case 3:
		RouletteWheel roulette = new RouletteWheel();
		roulette.playRouletteWheel();
		System.out.println("Please chose another game");
		menu();
		break;
	    case 4:
		SlotMachine slut = new SlotMachine();
		slut.playSlotMachine();
		System.out.println("Please chose another game");
		menu();
		break;		
	    }
	
	if(choice.equalsIgnoreCase("q")){
	    System.out.println("See you then !");
	    }
    }
    
    public static void main(String[] args){
	System.out.println("Welcome to Las Vegan casino !\nHey pal, do you want to play ? Yes or no ?");
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	while(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")){
	    System.out.println("Can you be more specific ?");
	    input = scan.nextLine();
	}
	if(input.equalsIgnoreCase("no")){
	    System.out.println("Alright, good day to you !");
	    }
	else{
	    menu();
	}
	
    }
}
