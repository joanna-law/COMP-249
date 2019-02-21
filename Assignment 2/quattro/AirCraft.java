//Assignment 2
//Name: Joanna Lau Ah Wing 
//Student ID: 40083829
//Date: 20 February 2019

package quattro;
import uno.*;
/**
 * Joanna Lau Ah Wing 
 * ID: 40083829
 * 249
 * Assignment 2
 * Due date: 24 February 2019
 * class air craft
 * @author Joanna Lau Ah Wing (40083829)
 *
 */
public class AirCraft extends PublicTransportation {
	private classType cT;
	private maintenanceType mT;
	
	enum classType{
		Helicopter, Airline, Glider, Balloon, NotSet;
	}
	enum maintenanceType{
		Weekly, Monthly, Yearly, NotSet;
	}

	//could not figure out how to pass an enum value, ended up passing a string and then using a case to set the classType and maintenanceType
	public AirCraft(double ticPrice, int stops, String c, String m)
	{
		super(ticPrice, stops);
		switch (c){
		case "Helicopter": this.cT = classType.Helicopter;
		break;
		case "Airline": this.cT = classType.Airline;
		break;
		case "Glider": this.cT = classType.Glider;
		break;
		case "Balloon": this.cT = classType.Balloon;
		break;
		}
		
		switch (m){
		case "Weekly": this.mT = maintenanceType.Weekly;
		break;
		case "Monthly": this.mT = maintenanceType.Monthly;
		break;
		case "Yearly": this.mT = maintenanceType.Yearly;
		break;
		}
	}
	public AirCraft()
	{
		this.cT = classType.NotSet;
		this.mT = maintenanceType.NotSet;	
	}
	public AirCraft(AirCraft a)
	{
		super();
		this.cT = a.cT;
		this.mT = a.mT;
	}
	@Override
	public String toString() {
		//now have to use getter to access ticket price, etc. When it was protected, it was available to all classes in the package, when a class is private it is available only in the class.
		return "AirCraft [The ticket price is " + getTicPrice() + ", it stops " + getStops() + " times. It is of class type " + cT + " and of maintenance type " + mT + "]";
	}
	
	/**
	 * compares calling object with object a
	 * @param a
	 * @return
	 */
	public boolean equals(AirCraft a) {
		if (a != null)
			//the null verification prevents the program from crashing in case the object passed does not exist.
			if (a instanceof AirCraft)
				if((a.getStops() == this.getStops())&&(a.getTicPrice() == this.getTicPrice()&& (a.cT == this.cT) && a.mT == this.mT))
					return true;
				else
					return false;
			else return false;
		else return false;
	}
}