public class test{
    public static void main (String[] args){
  
    RouletteWheel game = new RouletteWheel();
    if (game.playRouletteWheel() == true)
        System.out.println("You win!");
    else
        System.out.println("You lose..");
    }
}
