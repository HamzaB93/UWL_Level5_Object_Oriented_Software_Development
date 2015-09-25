package week1RentACar;

public class Customer 
{
	/* This class is just being used
	 * to test whether a method from another class can be used here,
	 * where Customer wants to view Vehicle availability of a car
	 */
	
	// Properties
	private String name;
	private int age;
	private boolean member;
	
	private Object bmw3;
	////////// Constructors //////////
	
	// Default constructor
	public Customer()
	{
		name = "Unknown";
		age = 0;
		member = false;
	}
	
	// Parameterised
	public Customer(String name, int age, boolean member)
	{
		this.name = name;
		this.age = age;
		this.member = member;
	}
	
	// toString() method
	public String toString()
	{
		return ("Name: " + name + ", Age: " + age + "Member: " + member + "\n");
	}
	
	public boolean checkAvailability(Object vehicle)
	{

		bmw3.getAvailabilty();
		return available;
	}
}
