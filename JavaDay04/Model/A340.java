public class A340 extends Model implements Maniable{
    public A340(int w, int n){
	super(w, n);
    }

    public void DoBackFlip(){
	System.out.println("I did it !");
    }

    public void DoBarrelRoll(){
	System.out.println("Eh, Fox, come on");
    }
}
