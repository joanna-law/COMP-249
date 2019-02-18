package uno;

public class PublicTransportation {
	
	private double ticPrice;
	private int stops;
	
	public PublicTransportation(double ticPrice, int stops) {
		this.ticPrice = ticPrice;
		this.stops = stops;
	}

	public PublicTransportation() {
		ticPrice = 0;
		stops = 0;
	}
	
	public PublicTransportation(PublicTransportation p) {
		this.ticPrice = p.ticPrice;
		this.stops = p.stops;
	}
	
	public double getTicPrice() {
		return ticPrice;
	}
	public void setTicPrice(double ticPrice) {
		this.ticPrice = ticPrice;
	}
	public int getStops() {
		return stops;
	}
	public void setStops(int stops) {
		this.stops = stops;
	}
		
}

