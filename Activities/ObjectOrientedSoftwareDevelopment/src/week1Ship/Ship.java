package week1Ship;

public class Ship 
{
	// Properties of the ship
	private String name;
	private double speed;
	private int course;
	private String destination;
	private boolean cargo;
	private boolean moving;
	
	////////// Constructors //////////
	
	// Default Constructor
	public Ship()
	{
		set("No name", 0.00, 0, "Unknown", false, false);
	}
	
	// Parameterised Constructor
	public Ship(String name, double speed, int course, String destination, boolean cargo, boolean moving)
	{
		set(name, speed, course, destination, cargo, moving);
	}
	
	////////// Print method //////////
	
	// Report
	// Prints out all the values of the ship
	public void report()
	{
		System.out.println("Ship Report:");
		System.out.println("Name: " + name);
		System.out.println("Speed: " + speed);
		System.out.println("Course: " + course);
		System.out.println("Destination: " + destination);
		System.out.println("Cargo: " + cargo);
		System.out.println("Moving: " + moving);
	}
	
	// toString Method
	// Prints out details on one line
	public String toString()
	{
		return ("Name: " + name + ", Speed: " + speed + "Course: " + course + ", Destination: " + destination
				+ ", Cargo: " + cargo + ", Moving: " + moving);
				
	}
	
	////////// Accessors //////////
	
	// Will return the value when the method has been called.
	public String getName()
	{
		return name;
	}
	public double getSpeed()
	{
		return speed;
	}
	public int getCourse()
	{
		return course;
	}
	public String getDestination()
	{
		return destination;
	}
	public boolean hasCargo()
	{
		return cargo;
	}
	public boolean isMoving()
	{
		return moving;
	}
	
	////////// Set Methods //////////
	
	// For encapsulation so that property values can be altered
	public void set(String name, double speed, int course, String destination, boolean cargo, boolean moving)
	{
		this.name = name;
		this.speed = speed;
		this.course = course;
		this.destination = destination;
		this.cargo = cargo;
		this.moving = moving;
	}
	
	// Setting individual values
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	public void setCourse(int course)
	{
		this.course = course;
	}
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	public void setCargo(boolean cargo)
	{
		this.cargo = cargo;
	}
	public void setMoving(boolean moving)
	{
		this.moving = moving;
	}
}
