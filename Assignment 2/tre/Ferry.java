package tre;
import uno.*;
/**
 * class ferry
 * @author Joanna Lau Ah Wing (40083829)
 *
 */
public class Ferry extends PublicTransportation {
	private int buildYr;
	private String shipName;
	
	public Ferry(double ticPrice, int stops, int buildYr, String shipName)
	{
	super(ticPrice, stops);
	this.buildYr = buildYr;
	this.shipName = shipName;
	}
	
	public Ferry()
	{
	super();
	this.buildYr = 0;
	this.shipName = "";
	}
	
	public Ferry(Ferry f)
	{
	super();
	this.buildYr = f.buildYr;
	this.shipName = f.shipName;
	}
	
	public void setbuildYr(int b)
	{
		this.buildYr = b;
	}
	
	public int getbuildYr()
	{
		return buildYr;
	}
	
	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	//now have to use getter to access ticket price, etc. When it was protected, it was available to all classes in the package, when a class is private it is available only in the class.
	@Override
	public String toString() {
		return "Ferry [It was build in year " + buildYr + ", the name of the ship is " + shipName + ". The ticket price is " + getTicPrice()
				+ ", it stops at " + getStops() + " stops.";
	}
	/**
	 * compares calling object with object f
	 * @param f
	 * @return
	 */
	public boolean equals(Ferry f) {
		if (f != null)
			//the null verification prevents the program from crashing in case the object passed does not exist.
			if (f instanceof Ferry)
				if((f.buildYr == this.buildYr)&&(f.shipName == this.shipName)&&(f.getTicPrice() == this.getTicPrice())&&(f.getStops()== this.getStops()))
					return true;
				else
					return false;
			else return false;
		else return false;
	}
	
	
}
