
//Assignment 2
//Name: Joanna Lau Ah Wing 
//Student ID: 40083829
//Date: 20 February 2019

import uno.*;
import duo.*;
import tre.*;
import quattro.*;
/**
 * Joanna Lau Ah Wing 
 * ID: 40083829
 * 249
 * Assignment 2
 * Due date: 24 February 2019
 * driver to test all other classes and their methods
 * @author Joanna Lau Ah Wing	
 *
 */
public class Driver {
	public static PublicTransportation [] copyCityBuss(PublicTransportation [] vehicles) {
		PublicTransportation copiedArray[] = new PublicTransportation[vehicles.length];
		for(int k = 1; k < vehicles.length; k++)
		{
			copiedArray[k] = new PublicTransportation(vehicles[k]);
		}
		return copiedArray;
	}
	public static void main(String args[])
	{
		System.out.println("Welcome to the PublicTransportation program!");
		System.out.println();
		
		PublicTransportation [] vehicles = new PublicTransportation[16];

		vehicles[1] = new AirCraft(50000,0,"Balloon","Weekly");
		vehicles[2]= new CityBus(1500, 11, 1190, 2008, "Maisonneuve", "Tom" );
		vehicles[3] = new Metro(70,65,1455,1400,"Guy", "Rajesh",8, "Montreal");
		vehicles[4]= new CityBus(1500, 11, 1190, 2008, "St Catherine", "Oli" );
		vehicles[5]= new Ferry(3000, 5, 2015, "Starship");
		vehicles[6]= new PublicTransportation(300, 52);
		vehicles[7]= new Ferry(2500, 3, 2017, "Cruiser");
		vehicles[8]= new Tram(2200, 22, 1245, 2011, "St Marc", "John", 300);
		vehicles[9] = new AirCraft(60000, 0, "Helicopter", "Monthly");
		vehicles[10]= new Ferry(3000, 5, 2015, "Starship");
		vehicles[11] = new AirCraft(50000,0,"Helicopter","Yearly");
		vehicles[12]= new PublicTransportation(250, 33);
		vehicles[13]= new Tram(2300, 23, 1333, 2012, "McKay", "Sam", 300);
		vehicles[14]= new Metro(200,78,2000,1900,"Cresent", "Ali",9, "Toronto");
		vehicles[15]= new Metro(100,78,2000,1900,"St Matthew", "Sambhal",11, "Vancouver");	
		
		System.out.println("Sample objects displayed using toString method: ");
		for(int j = 1; j < 7; j++) {
			System.out.println(vehicles[j].toString());
		}
		
		System.out.println();
		//testing equals methods
		System.out.println("Two different objects: ");
		System.out.println(vehicles[1].toString());
		System.out.println(vehicles[15].toString());
		if (vehicles[1].equals(vehicles[15]))
			System.out.println("Those two objects are the same.");
		else
			System.out.println("They are different objects.");
		
		System.out.println();
		
		System.out.println("Two exactly same objects: ");
		System.out.println(vehicles[1].toString());
		System.out.println(vehicles[5].toString());
		
		if (vehicles[1].equals(vehicles[10]))
			System.out.println("Those two objects are the same.");
		else
			System.out.println("They are different objects.");
		
		System.out.println();
		
		//finding the cheapest and most expensive method
		//assumes that there are no methods that have the same price
		
		double minPrice = 99999;
		double maxPrice = 0;
		int arrayLocMin = 0;
		int arrayLocMax = 0;
		for (int i = 1; i < 16; i++) {
			if (vehicles[i].getTicPrice() < minPrice) {
				minPrice = vehicles[i].getTicPrice();
				arrayLocMin = i;
			}
			if (vehicles[i].getTicPrice() > maxPrice) {
				maxPrice = vehicles[i].getTicPrice();
				arrayLocMax = i;
			}
		}
		System.out.println("The cheapest method of travel is: ");
		System.out.println(vehicles[arrayLocMin].toString());
		System.out.println("It is at location " + arrayLocMin);
		System.out.println();
		System.out.println("The most expensive method of travel is: ");
		System.out.println(vehicles[arrayLocMax].toString());
		System.out.println("It is at location " + arrayLocMax);
		
		System.out.println();
		
		//used the same array of 15 objects as above but moved only the first 12 object
		
		//it ends in an error. the copying did not function properly because polymorphism did not take place in the copy constructor. 
		//copy constructors are not polymorphic and cannot be overridden, as they are called by their class name. 
		//only the attributed for PublicTransportation are copied and a lot of data was lost
		
		PublicTransportation []newArray = copyCityBuss(vehicles);
		for (int l = 1; l < 13; l++) {
			System.out.println(newArray[l].toString());
		}
		
		System.out.println();
		
		System.out.println("Thank you for using this PublicTransportation program! ");
		System.out.println("Have a nice day!");

	}
}