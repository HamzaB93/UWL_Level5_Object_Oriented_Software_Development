package factoryDesignPattern;

public class BpStaffFactory 
{

	// Use makeStaff to return an object of its type BpStaff
	public BpStaff makeStaff(String nameOfStaff, String jobDescription, boolean available)
	{
		if(jobDescription.equalsIgnoreCase("ACCOUNT MANAGER"))
		{
			return new AccountManager(nameOfStaff, jobDescription, available);
		}

		else if(jobDescription.equalsIgnoreCase("ADVERTISING"))
		{
			return new Advertising(nameOfStaff, jobDescription, available);
		}
		
		else if(jobDescription.equalsIgnoreCase("DIRECTOR"))
		{
			return new Director(nameOfStaff, jobDescription, available);
		}
		
		return null;
	}
}
