package week1RentACar;

public class RentACar {

	public static void main(String[] args) 
	{
		// Constructing a Vehicle with user defined values
		Vehicle bmw3 = new Vehicle("BMW", "3 Series", "5 door", 5, "New", false);
		
		// Printing vehicle details
		bmw3.print();
		
		// Constructing a new Vehicle and printing as one line/ toString then print
		Vehicle rrPhantom = new Vehicle("Rolls Royce", "Phantom", "5 doors", 5, "New", false);
		String phantom = rrPhantom.toString();
		
		System.out.println(phantom);
		
		// Checking rrPhantom availability and printing 
		boolean isAvailable = rrPhantom.getAvailability();
		System.out.println("Is Rolls Royce Phantom available ? : " + isAvailable + "\n");
		
		// Altering rrPhantom availability getting and printing printing 
		rrPhantom.setAvailability(true);
		isAvailable = rrPhantom.getAvailability();
		System.out.println("Is Rolls Royce Phantom available ? : " + isAvailable + "\n" );
		
		// Construct customer
		Customer hamza = new Customer();
		
		// Calling method to check if the rrPhantom is available. At this point should say true! 
		boolean checkCar = hamza.checkAvailability(rrPhantom);
		
		System.out.println("Cusomter is checking RR Phantom availability.\nIs the car available ? : " + checkCar);
		
		// Checking availability of bmw3, should be false
		
		checkCar = hamza.checkAvailability(bmw3);
		
		System.out.println("Cusomter is checking BMW 3 Series availability.\nIs the car available ? : " + checkCar);

		
	}
}
