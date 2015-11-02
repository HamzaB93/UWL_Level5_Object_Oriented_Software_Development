package assignment1RecordClientDetailsTestInheritance;

//Inheritance - A subclass of BpStaff
public class Advertising extends BpStaff
{
	////////// Properties //////////
	private String nameOfStaff;
	private String jobDescription;
	private boolean available;
	
	////////// Constructors //////////
	
	// Default
	public Advertising()
	{
		nameOfStaff = "John Doe";
		jobDescription = "Advertising";
		available = false;
	}
	
	// Parameterised
	public Advertising(String nameOfStaff, String jobDescription, boolean available )
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
	
	// Getters
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
