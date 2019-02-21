//Assignment 2
//Name: Joanna Lau Ah Wing 
//Student ID: 40083829
//Date: 20 February 2019

package uno;
/**
 * Joanna Lau Ah Wing 
 * ID: 40083829
 * 249
 * Assignment 2
 * Due date: 24 February 2019
 * parent class for all following public transportation 
 * @author Joanna Lau Ah Wing (40083829)
 *
 */
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

	public String toString() {
		return "PublicTransportation [The ticket price is " + ticPrice + ", it stops " + stops + " times]";
	}
	
	/**
	 * compares calling object with object p
	 * @param p
	 * @return
	 */
	//now have to use getter to access ticket price, etc. When it was protected, it was available to all classes in the package, when a class is private it is available only in the class.
	public boolean equals(PublicTransportation p) {
		if (p != null)
			//the null verification prevents the program from crashing in case the object passed does not exist.
			if (p instanceof PublicTransportation)
				if((p.stops == this.stops)&&(p.ticPrice == this.ticPrice))
					return true;
				else
					return false;
			else return false;
		else return false;
	}

	
		
}

