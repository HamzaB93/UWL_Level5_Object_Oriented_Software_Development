package week1RentACar;

public class Vehicle 
{
	////////// Properties //////////
	
	// Must be private so that the representation is not altered
	
	// Make - VW, BMW etc
	private String make;
	// Model - 3 Series etc
	private String model;
	// Type - Hatch back, Convertible etc
	private String type;
	// Seats - 2 or 5 etc
	private int seats;
	// Condition - New, Damaged etc
	private String condition;
	// Available - True or false 
	private static boolean available;
	
	
	////////// Constructors //////////
	
	// Default constructor - Has pre-defined values for the object
	public Vehicle()
	{
		// Using set method, indirectly giving values to the properties
		set("Unknown make", "Unknown model", "Unknown type", 5, "New", false);
	}
	
	// Parameterised constructor - User will define the values to give to the object
	public Vehicle(String make, String model, String type, int seats, String condition, boolean available)
	{
		set(make, model, type, seats, condition, available);
	}
	
	
	////////// Print Methods //////////
	
	// Printing out the vehicle details
	public void print()
	{
		System.out.println("Details of selected vehicle: ");
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Type: " + type);
		System.out.println("Seats: " + seats);
		System.out.println("Condition: " + condition);
		System.out.println("Availability: " + available);
		System.out.println(" ");
	}
	
	// toString will return a string of the objects details on one line
	public String toString()
	{
		return ("Make: " + make + ", Model: " + model + ", Type: " + type + ", Seats: " + seats
				+ ", Condition: " + condition + ", Availability: " + available + "\n"); 
	}
	
	
	////////// Accessors //////////
	
	// Will return a value of a specific type when called upon
	public String getMake()
	{
		return make;
	}
	public String getModel()
	{
		return model;
	}
	public String getType()
	{
		return type;
	}
	public int getSeats()
	{
		return seats;
	}
	public String getCondition()
	{
		return condition;
	}
	public static boolean getAvailability()
	{
		return available;
	}
	////////// Set Method //////////
	
	// Used for encapsulation, will allow values to be altered by other methods indirectly
	public void set(String make, String model, String type, int seats, String condition, boolean available)
	{
		this.make = make;
		this.model = model;
		this.type = type;
		this.seats = seats;
		this.condition = condition;
		this.available = available;
	}
	
	// Setting individual members so that alterations to different properties can be made
	public void setMake(String make)
	{
		this.make = make;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public void setSeats(int seats)
	{
		this.seats = seats;
	}
	public void setCondition(String condition)
	{
		this.condition = condition;
	}
	public void setAvailability(boolean available)
	{
		this.available = available;
	}
	
}
