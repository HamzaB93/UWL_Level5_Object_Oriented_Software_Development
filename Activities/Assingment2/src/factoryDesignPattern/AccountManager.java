package factoryDesignPattern;

// Inheritance - A subclass of BpStaff
public class AccountManager implements BpStaff
{
	////////// Properties //////////
	private String nameOfStaff;
	private String jobDescription;
	private boolean available;
	
	////////// Constructors //////////
	
	// Default - Creating an object with predefined values
	public AccountManager()
	{
		nameOfStaff = "John Doe";
		jobDescription = "Account Manager";
		available = false;
	}
	
	// Parameterised - Creating an object with user defined values for the object properties
	public AccountManager(String nameOfStaff, String jobDescription, boolean available )
	{
		this.nameOfStaff = nameOfStaff;
		this.jobDescription = jobDescription;
		this.available = available;
	}
	
	////////// toString //////////
	
	// Will give a string representation of the object
	public String toString()
	{
		return("Name of Staff: " + nameOfStaff + ", Job Description: " + jobDescription
				+ ", Availability: " + available);
	}
	
	////////// Getters and Setters //////////
	
	// Getters
	public String getNameOfStaff() 
	{
		return nameOfStaff;
	}
	
	public String getJobDescription() 
	{
		return jobDescription;
	}
	
	@Override
	public boolean isAvailable() 
	{
		return available;
	}
	
	// Setters
	public void setNameOfStaff(String nameOfStaff) 
	{
		this.nameOfStaff = nameOfStaff;
	}
	
	public void setJobDescription(String jobDescription) 
	{
		this.jobDescription = jobDescription;
	}
	
	public void setAvailable(boolean available) 
	{
		this.available = available;
	}
}
