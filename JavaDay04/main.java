public class main{
    public static void main(String[] args){
	A340 avion1 = new A340(298, 250);
	A380 avion2 = new A380(604, 612);
	B737 avion3 = new B737(260, 238);
	B747 avion4 = new B747(333, 416);

	Pilot pilot = new Pilot("Jack");
	Engine engine = new Engine();
	ControlTower tower = new ControlTower();
	LandingStrip stripes = new LandingStrip();
	System.out.println("Eh, c'est good !");
    }
}
