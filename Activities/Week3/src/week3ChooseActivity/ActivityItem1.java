package week3ChooseActivity;

import java.util.Date;

public class ActivityItem1 
{
	////////// Properties //////////
	
	private Date date;
	private String location;
	//////////////////////////////
	
	///////// Constructors ///////////
	
	// Default
	public ActivityItem1()
	{
		date = new Date();
		location = "Location Unknown";
	}
	
	// Parameterised
	public ActivityItem1(Date date, String location)
	{
		this.date = date;
		this.location = location;
	}
	
	// toString
	public String toString()
	{
		return ("Activity Details\nDate: " + date + ", Location: " + location);
	}
	
	////////// Getters and Setters //////////
	
	// Getters
	public Date getDate() 
	{
		return date;
	}
	public String getLocation() 
	{
		return location;
	}
	
	// Setters
	public void setDate(Date date) 
	{
		this.date = date;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}
	////////////////////////////////////////////
	
	
}
