public class ControlTower{
    private Crew operator;

    public ControlTower(){
	System.out.println("This is Control Tower, over");
    }

    public void Assign(Crew crew){
	operator = crew;
    }

    public Plane CheckIfNewPlane(){
	Plane plane = new Plane();
	return plane;
    }

    public void GiveOrderPlane(Plane plane, String order){
	System.out.println("Yeh, that's an order bro !");
    }
}    
