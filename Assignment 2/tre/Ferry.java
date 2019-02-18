package tre;
import uno.*;
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
}
