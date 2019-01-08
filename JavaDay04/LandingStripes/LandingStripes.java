public class LandingStripes{
    private Plane plane;
    public LandingStripes(){
	System.out.println("YOU. You land here, aight ?");
    }

    public Plane getPlane(){
	return this.plane;
    }

    public void setPlane(Plane p){
	this.plane = p;
    }

    public boolean takeOffPlane(){
	return true;
    }

    public boolean landPlane(){
	return true;
    }
}
