package duo;
/**
 * class tram
 * @author Joanna Lau Ah Wing (40083829)
 *
 */
public class Tram extends CityBus{
	private int maxSpeed;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Tram(double ticPrice, int stops, long routeNo, int firstOp, String lineName,
			String driverName,int maxSpeed) {
		super(ticPrice, stops, routeNo, firstOp, lineName, driverName);
		this.maxSpeed = maxSpeed;
	}
	
	public Tram() {
		super();
		this.maxSpeed = 0;
	}
	
	public Tram(Tram t) {
		this.maxSpeed = t.maxSpeed;
	}
	//now have to use getter to access ticket price, etc. When it was protected, it was available to all classes in the package, when a class is private it is available only in the class.
	@Override
	public String toString() {
		return "Tram [It's maxSpeed is " + maxSpeed + ". It goes through " + getRouteNo() + " routes, it was first on the road in " + getFirstOp() + ", the lineName is " + getLineName() + ", and it is "
				+ getDriverName() + " who drives it, the ticket price is " + getTicPrice() + ", it stops " + getStops() + " times.]";
	}
	
	/** 
	 * compares calling object with object t
	 * @param t
	 * @return
	 */
	public boolean equals(Tram t) {
		if (t != null)
			//the null verification prevents the program from crashing in case the object passed does not exist.
			if (t instanceof Tram)
				if((t.maxSpeed == this.maxSpeed)&&(t.getTicPrice() == this.getTicPrice())&&(t.getStops()== this.getStops()))
					return true;
				else
					return false;
			else return false;
		else return false;
	}
	
}
