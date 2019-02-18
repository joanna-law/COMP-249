package duo;
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
	
	@Override
	public String toString() {
		return "Metro [noVehicle=" + noVehicle + ", cityName=" + cityName + ", getRouteNo()=" + getRouteNo()
				+ ", getFirstOp()=" + getFirstOp() + ", getLineName()=" + getLineName() + ", getDriverName()="
				+ getDriverName() + ", getTicPrice()=" + getTicPrice() + ", getStops()=" + getStops() + "]";
	}
	
	public boolean equals(Metro m) {
		if((m.noVehicle == this.noVehicle)&&(m.getTicPrice() == this.getTicPrice())&&(m.getStops()== this.getStops())&& (m.cityName == this.cityName))
			return true;
		else
			return false;
	}
	
}
