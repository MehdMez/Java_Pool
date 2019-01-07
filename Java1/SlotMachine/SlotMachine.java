import java.util.*;

public class SlotMachine{
    public boolean playSlotMachine(){
	WheelsSlotMachine wheels = new WheelsSlotMachine();
	Random rand = new Random();
	boolean resultat = false;
	int rand1 = rand.nextInt(wheels.Wheel1.length);
	int rand2 = rand.nextInt(wheels.Wheel2.length);
	int rand3 = rand.nextInt(wheels.Wheel3.length);

	String rouleau1 = wheels.Wheel1[rand1];
	String rouleau2 = wheels.Wheel2[rand2];
	String rouleau3 = wheels.Wheel3[rand3];
	if(rouleau1.length()>=7){
	    rouleau1 = rouleau1.substring(0, 7);
	}
	else if(rouleau1.length() == 5){
	    rouleau1 = " "+rouleau1+" ";
	}
	else if(rouleau1.length()<7){
	    for(int i = rouleau1.length(); i<7; i++){
		    rouleau1 = " "+rouleau1;
		}
        }
      	if(rouleau2.length()>=7){
	    rouleau2 = rouleau2.substring(0, 7);
	}
        else if(rouleau2.length() == 5){
            rouleau2 =	" "+rouleau2+" ";
	}

      	else if(rouleau2.length()<7){
	    for(int i = rouleau2.length(); i<7; i++){
		    rouleau2 = " "+rouleau2;
		}
        }
    	if(rouleau3.length()>=7){
	    rouleau3 = rouleau3.substring(0, 7);
	}
        else if(rouleau3.length() == 5){
            rouleau3 =	" "+rouleau3+" ";
	}

      	else if(rouleau3.length()<7){
	    for(int i = rouleau3.length(); i<7; i++){
		    rouleau3 = " "+rouleau3;
		}
        }

		    
	if(wheels.Wheel1[rand1].equals(wheels.Wheel2[rand2]) && wheels.Wheel1[rand1].equals(wheels.Wheel3[rand3])){
		resultat = true;
	    }
	    System.out.println("Gling gling gling...");
	    if(rouleau1.equalsIgnoreCase("seven") && rouleau2.equalsIgnoreCase("seven") && rouleau3.equalsIgnoreCase("seven")){
       	    System.out.println(".-------.\n               |Jackpot|\n");
		}
		else if(resultat == true){
		    System.out.println(".-------.\n               |  WIN  |\n");
		}
	    System.out.println("   ____________|_______|____________ \n  |  __    __    ___  _____   __    |\n  | / _\\  / /   /___\\/__   \\ / _\\   |\n  | \\ \\  / /   //  //  / /\\ \\\\ \\  25|\n  | _\\ \\/ /___/ \\_//  / /  \\/_\\ \\ []| __\n  | \\__/\\____/\\___/   \\/     \\__/ []|(__)\n  |===_______===_______===_______===| ||\n  ||*|       |*|       |*|       |*|| ||\n  ||*| ***** |*| ***** |*| ***** |*|| ||");
	    System.out.println("  ||*|"+rouleau1+"|*|"+rouleau2+"|*|"+rouleau3+"|*|| || ");
	    System.out.println("  ||*| ***** |*| ***** |*| ***** |*|| ||\n  ||*|_______|*|_______|*|_______|*||_//\n  |===_______===_______===_______===|_/\n  |lc=___________________________===|\n  |  /___________________________\\  |\n  |   |                         |   |\n _|   \\_______________________/   |_\n (_____________________________________)\n");
	return resultat;
    }
}
