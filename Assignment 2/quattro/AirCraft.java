package quattro;
import uno.*;

public class AirCraft extends PublicTransportation {
	enum classType{
		Helicopter, Airline, Glider, Balloon;
	}
	enum maintenanceType{
		Weekly, Monthly, Yearly;
	}

	public AirCraft(double ticPrice, int stops)
	{
		super(ticPrice, stops);
	}
	public AirCraft()
	{
		super();
	}
	public AirCraft(AirCraft a)
	{
		super();
	}
	@Override
	public String toString() {
		return "AirCraft [getTicPrice()=" + getTicPrice() + ", getStops()=" + getStops() + "]";
	}
	public boolean equals(AirCraft a) {
		if((a.getStops() == this.getStops())&&(a.getTicPrice() == this.getTicPrice()))
			return true;
		else
			return false;
	}
}