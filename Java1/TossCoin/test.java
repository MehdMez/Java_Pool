public class test{
public static void main(String[] args){
     TossCoin game = new TossCoin();
     if(game.playTossCoin() == true){
      	System.out.println("You win !");
     }
     else{
 	System.out.println("You lost...");
     }           
 }
}
