package week5LkProvisional;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) 
	{
		// Make a System
		BookingSystem bookingSys = new BookingSystem();
		
		// Making caravans
		Caravan c1 = new Caravan("Audi",new String[]{"Bed"});
		Caravan c2 = new Caravan("BMW",new String[]{"Cooker"});
		Caravan c3 = new Caravan("Campass",new String[]{"Cooker"});
		Caravan c4 = new Caravan("Driver",new String[]{"Toilet"});
		
		// adding my caravan c1 to the system
		bookingSys.addCaravan(c1);
		bookingSys.addCaravan(c2);
		bookingSys.addCaravan(c3);
		bookingSys.addCaravan(c4);
		
		
		// Finding caravans with the specifications
		
		// As findCaravan is returning an arratList of objects that have the facility...
		//  the objects need to be put into a new arrayList
		ArrayList<Caravan> ARC = bookingSys.findCaravan("Bed");
		
		// Cycle through the new arrayList
		for(int i = 0; i < ARC.size(); i++)
		{
			// Get the caravan object from the arrayList
			Caravan c = ARC.get(i);
			
			// And print the Caravan object
			System.out.println(c.toString());
		}
		
		// Booking a caravan
		int bookingNumber = bookingSys.confirmBooking(c1, "110000");
		System.out.println("Your booking number is: " + bookingNumber);
		
		int bookingNumber2 = bookingSys.confirmBooking(c2, "110000");
		System.out.println("Your booking number is: " + bookingNumber2);
	}

}
