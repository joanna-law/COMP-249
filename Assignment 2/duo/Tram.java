package duo;
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

	@Override
	public String toString() {
		return "Tram [maxSpeed=" + maxSpeed + ", getRouteNo()=" + getRouteNo() + ", getFirstOp()=" + getFirstOp()
				+ ", getLineName()=" + getLineName() + ", getDriverName()=" + getDriverName() + ", getTicPrice()="
				+ getTicPrice() + ", getStops()=" + getStops() + "]";
	}
	
	public boolean equals(Tram t) {
		if((t.maxSpeed == this.maxSpeed)&&(t.getTicPrice() == this.getTicPrice())&&(t.getStops()== this.getStops()))
			return true;
		else
			return false;
	}
	
}
