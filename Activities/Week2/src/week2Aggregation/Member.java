package week2Aggregation;

import java.util.Date;

public class Member 
{
	////////// Properties //////////
	
	private long id;
	private String name;
	private Date dateCreated;
	
	// Association, reflexive 
	Member Supervisor;
	
	// For Aggregation (has a) >>> Member has an Address called mainAddress
	Address mainAddress;
	
	////////// Constructors //////////
	
	// Default constructor
	public Member()
	{
		id = 0000;
		name = "Unknown";
		dateCreated = new Date();
		// mainAddress in the default constructor
		mainAddress = new Address();
	}
	
	// Parameterised constructor
	public Member(long id, String name, Date dateCreated, Address mainAddress)
	{
		this.id = id;
		this.name = name;
		this.dateCreated = dateCreated;
		this.mainAddress = mainAddress;
	}
	
	////////// toString() //////////
	public String toString()
	{
		return ("ID: " + id + ", Name: " + name + ", Date Created: " + dateCreated + ", Main address: " + mainAddress);
	}
	
	////////// Accessors for Member //////////
	
	public long getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Date getDateCreated()
	{
		return dateCreated;
	}
	
	////////// Setter and getter for Supervisor
	
	// Setting supervisor
	public void setSupervisor(Member Supervisor)
	{
		this.Supervisor = Supervisor;
	}
	
	// Getting supervisor
	public Member getSupervisor()
	{
		return Supervisor;
	}
	
	////////// Setter and getter for mainAddress //////////
	
	// Setting mainAddress
	public void setMainAddress(Address mainAddress)
	{
		this.mainAddress = mainAddress;
	}
	
	// Getting mainAddress
	public Address getMainAddress()
	{
		return mainAddress;
	}
	
}
