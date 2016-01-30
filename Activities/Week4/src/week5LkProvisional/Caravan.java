package week5LkProvisional;

import java.util.ArrayList;

public class Caravan 
{
	////////// Properties //////////
	
	// The availability will always be true in this case
	private boolean available = true;
	private String name;
	// This a String array. 
	private String[] facilities;
	
	
	////////// Constructor //////////
	
	// Default
	public Caravan()
	{
		name = "Unkown Name";
		facilities = new String[] {"Unknown"};
	}
	
	// Parameterised
	public Caravan(String name, String[] facilities)
	{
		this.name = name;
		this.facilities = facilities;
	}

	////////// Getter //////////
	
	// This will always return true for this case
	public boolean isAvailable() 
	{
		return available;
	}
	
	// This method will be invoked by the system
	// This will return a boolean value. This accepts a String called facility
	public boolean hasFacility(String facility)
	{
		// The flag will default as false
		// Whe returning a boolean, it will have to return either true or false
		boolean flag = false;
		
		// For the length of facilities string array
		for(int i = 0 ; i < facilities.length; i++)
		{
			// If the facility matches the the facility in the current array position
			if(facility == facilities[i])
				// Make the flag true
				flag = true;
		}
		// Return the boolean value. If the if statement above was not found to be true,
		// flag will stay false
		return flag;
	}
	
	public String toString()
	{
		// Making a string 
		String allFacilities = "";
		
		// Read the facility array and add that string to allFacilities
		for(int i = 0; i < facilities.length; i++)
		{
			allFacilities += facilities[i] + " ";
		}
		// Return the string
		return ("Caravan Details:\nName: " + name + ", Facilities Include: " + allFacilities + "\n");
	}
}
