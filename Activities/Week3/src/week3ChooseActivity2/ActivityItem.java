package week3ChooseActivity2;


public class ActivityItem 
{
	////////// Properties //////////
	
	private String date;
	private String location;
	
	///////////////////////////////
	
	
	///////// Constructors //////////
	
	// Default
	public ActivityItem()
	{
		date = "Date Unknown";
		location = "Location Unknown";
	}
	
	// Parameterised
	public ActivityItem(String date, String location)
	{
		this.date = date;
		this.location = location;
	}
	/////////////////////////////////////////
	
	
	////////// Getters and Setters //////////
	
	// Getters
	public String getDate() 
	{
		return date;
	}
	
	public String getLocation() 
	{
		return location;
	}
	
	// Setters
	public void setDate(String date) 
	{
		this.date = date;
	}

	public void setLocation(String location) 
	{
		this.location = location;
	}
	//////////////////////////////////////////

	@Override
	public String toString() {
		return "ActivityItem [date=" + date + ", location=" + location + "]";
	}
}
