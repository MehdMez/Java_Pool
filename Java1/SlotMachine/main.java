public class main{
    public static void main(String[] args){
    SlotMachine game = new SlotMachine();
    if (game.playSlotMachine() == true)
        System.out.println("You win!");
    else
        System.out.println("You lose..");
    }
}
