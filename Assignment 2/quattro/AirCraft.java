package quattro;
import uno.*;
/**
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

	public AirCraft(double ticPrice, int stops, classType c, maintenanceType m)
	{
		super(ticPrice, stops);
		this.cT = c;
		this.mT = m;
	}
	public AirCraft()
	{
		super();
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
		return "AirCraft [The ticket price is " + getTicPrice() + ", it stops " + getStops() + "times. It is of class type " + cT + " and of maintenance type " + mT;
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
				if((a.getStops() == this.getStops())&&(a.getTicPrice() == this.getTicPrice()))
					return true;
				else
					return false;
			else return false;
		else return false;
	}
}