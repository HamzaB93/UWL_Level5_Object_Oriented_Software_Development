package week2Composition;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member 
{
	////////// Properties //////////
	
	private long id;
	private String name;
	private Date dateCreated;
	
	// Association, reflexive 
	private Member Supervisor;
	
	// For Aggregation (has a) >>> Member has an Address called mainAddress
	private Address mainAddress;
	
	// For Composition
	private List<Loan> loans;
	private Member owner;
	
	////////// Constructors //////////
	
	// Default constructor
	public Member(Loan loans)
	{
		id = 0000;
		name = "Unknown";
		dateCreated = new Date();
		// mainAddress in the default constructor
		mainAddress = new Address();
		this.loans = new ArrayList<Loan>();
		addLoan(loans);
		loans.setOwner(this);
	}
	
	// Parameterised constructor
	public Member(long id, String name, Date dateCreated, Address mainAddress, Loan loans)
	{
		this.id = id;
		this.name = name;
		this.dateCreated = dateCreated;
		this.mainAddress = mainAddress;
		this.loans = new ArrayList<Loan>();
		addLoan(loans);
		loans.setOwner(this);
	}
	
	////////// toString() //////////
	public String toString()
	{
		return ("ID: " + id + ", Name: " + name + ", Date Created: " + dateCreated + ", Main address: " + mainAddress +
				"\n Loan details\n" + loans);
	}
	
	////////// Delete list //////////

	
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
	
	
	////////// Adding to the list //////////
	public void addLoan(Loan loanToAdd)
	{
		loans.add(loanToAdd);
	}

	public Member getOwner() {
		return owner;
	}

	public void setOwner(Member owner) {
		this.owner = owner;
	}
	
}
