import java.util.*;

public class Engine{
    protected int horsePower;
    protected int remainingFuel;
    protected String fuelType;

    public Engine(){
	this.horsePower = 0;
	this.remainingFuel = 0;
	this.fuelType = "Kerosene";
    }
    
    public int getHorsePower(){
	return horsePower;
    }
    
    public String getFuelType(){
	return fuelType;
    }
}
