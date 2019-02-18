package duo;
import uno.*;
public class CityBus extends PublicTransportation{
	
	private long routeNo;
	private int firstOp;
	private String lineName;
	private String driverName;
	

	public CityBus(double ticPrice, int stops, long routeNo, int firstOp, String lineName, String driverName) {
		super(ticPrice, stops);
		this.routeNo = routeNo;
		this.firstOp = firstOp;
		this.lineName = lineName;
		this.driverName = driverName;
	}
	
	public CityBus()
	{
		super();
		routeNo = 0;
		firstOp = 0;
		lineName = "";
		driverName = "";
	}
	
	public CityBus(CityBus c)
	{
		super();
		this.routeNo = c.routeNo;
		this.firstOp = c.firstOp;
		this.lineName = c.lineName;
		this.driverName = c.driverName;
	}

	public long getRouteNo() {
		return routeNo;
	}

	public void setRouteNo(long routeNo) {
		this.routeNo = routeNo;
	}

	public int getFirstOp() {
		return firstOp;
	}

	public void setFirstOp(int firstOp) {
		this.firstOp = firstOp;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	
}
