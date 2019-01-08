import java.util.*;

public abstract class Crew{
    protected String name;


    public String getName(){
	return this.name;
    }

    abstract void Action();
    abstract void Describe();
}
