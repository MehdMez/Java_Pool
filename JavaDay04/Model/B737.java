public class B737 extends Model implements Maniable{
    public B737(int w, int n){
	super(w, n);
    }

    public void DoBackFlip(){
	System.out.println("I did a back flip !");
    }

    public void DoBarrelRoll(){
	System.out.println("I did a Barrell roll,Fox !!");
    }
}
