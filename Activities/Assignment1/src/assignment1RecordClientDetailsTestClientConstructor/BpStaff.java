package assignment1RecordClientDetailsTestClientConstructor;

public class BpStaff 
{
	////////// Properties //////////
	private String nameOfStaff;
	private String jobDescription;
	private boolean available;
	
	////////// Constructors //////////
	
	// Default - Creating an object with predefined values
	public BpStaff()
	{
		nameOfStaff = "John Doe";
		jobDescription = "Blue Point Staff Member";
		available = false;
	}
	
	// Parameterised - Creating an object with user defined values for the object properties
	public BpStaff(String nameOfStaff, String jobDescription, boolean available )
	{
		this.nameOfStaff = nameOfStaff;
		this.jobDescription = jobDescription;
		this.available = available;
	}
	
	////////// toString //////////
	
	// Will give a string representation of the object
	public String toString()
	{
		return("Staff Details:\nName of Staff: " + nameOfStaff + ", Job Description: " + jobDescription
				+ ", Availability: " + available);
	}
	
	////////// Getters and Setters //////////
	
	// Getters - Getting the values of the properties
	public String getNameOfStaff() 
	{
		return nameOfStaff;
	}
	
	public String getJobDescription() 
	{
		return jobDescription;
	}
	
	public boolean isAvailable() 
	{
		return available;
	}
	
	// Setters - Setting a different value for the object properties
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
