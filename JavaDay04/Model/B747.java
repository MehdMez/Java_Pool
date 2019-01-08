public class B747 extends Model implements Strong, Maniable{
    public B747(int w, int n){
	super(w, n);
    }

    public void SkyPriority(){
	System.out.println("I must go first");
    }

    public void DoBackFlip(){
	System.out.println("I did the flip ");
    }

    public void DoBarrelRoll(){
	System.out.println("Yes Fox !");
    }
}
