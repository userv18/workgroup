package petrol_station;

import java.util.Random;

/**
 * Vehicle is an abstract class which have several concrete classes.
 * @author Justas Petrusonis
 * @version 1.0, 03/09/17
 * **/

public abstract class Vehicle {
	
	protected Random rnd;
		
	public abstract int getFuelInTank();
	public abstract int getTankSize();
	public abstract double getSizeInQueue();
	public abstract boolean haveSpaceInTank();
	public abstract Driver getDriver();	
	
	//03/18/2017
	public abstract void fillfuel();
	
	
	
}
