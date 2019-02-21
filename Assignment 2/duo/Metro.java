//Assignment 2
//Name: Joanna Lau Ah Wing 
//Student ID: 40083829
//Date: 20 February 2019

package duo;
/**
 * Joanna Lau Ah Wing 
 * ID: 40083829
 * 249
 * Assignment 2
 * Due date: 24 February 2019
 * class metro
 * @author Joanna Lau Ah Wing (40083829)
 *
 */
public class Metro extends CityBus{
	
	private int noVehicle;
	private String cityName;
	public int getNoVehicle() {
		return noVehicle;
	}
	public void setNoVehicle(int noVehicle) {
		this.noVehicle = noVehicle;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Metro(double ticPrice, int stops, long routeNo, int firstOp, String lineName, String driverName,
			int noVehicle, String cityName) {
		super(ticPrice, stops, routeNo, firstOp, lineName, driverName);
		this.noVehicle = noVehicle;
		this.cityName = cityName;
	}
	
	public Metro() {
		super();
		this.noVehicle = 0;
		this.cityName = "";
	}
	
	public Metro(Metro m) {
		this.noVehicle= m.noVehicle;
		this.cityName = m.cityName;
	}
	//now have to use getter to access ticket price, etc. When it was protected, it was available to all classes in the package, when a class is private it is available only in the class.Aircraft(5000.00,0,"Balloon","Weekly");
	@Override
	public String toString() {
		return "Metro [The ticket price is " + getTicPrice() + ". The number of vehicles is " + noVehicle + ", in the city " + cityName + ". It goes through " + getRouteNo() + " routes, it was first on the road in " + getFirstOp() + ", the lineName is " + getLineName() + ", and it is "
				+ getDriverName() + " who drives it, it stops " + getStops() + " times.]";
	}
	
	/**
	 * compares calling object with object m
	 * @param m
	 * @return
	 */
	
	public boolean equals(Metro m) {
		if (m != null)
			//the null verification prevents the program from crashing in case the object passed does not exist.
			if (m instanceof Metro)
				if((m.noVehicle == this.noVehicle)&&(m.getTicPrice() == this.getTicPrice())&&(m.getStops()== this.getStops())&& (m.cityName == this.cityName))
					return true;
				else
					return false;
			else return false;
		else return false;
	}
	
}
