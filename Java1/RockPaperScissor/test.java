public class test{
    public static void main(String[] args){
	RockPaperScissor game = new RockPaperScissor();
	if(game.playRockPaperScissor() == true){
	    System.out.println("You won !");
	}
	else{
	    System.out.println("You lost...");
	}
    }
}
