package assingment1RecordClientDetailsTestInheritance;

public class AccountManager extends BpStaff
{
	////////// Properties //////////
	private String nameOfStaff;
	private String jobDescription;
	private boolean available;
	
	////////// Constructors //////////
	
	// Default
	public AccountManager()
	{
		nameOfStaff = "John Doe";
		jobDescription = "Account Manager";
		available = false;
	}
	
	// Parameterised
	public AccountManager(String nameOfStaff, String jobDescription, boolean available )
	{
		this.nameOfStaff = nameOfStaff;
		this.jobDescription = jobDescription;
		this.available = available;
	}
	
	////////// toString //////////
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
