package week3ChooseActivity;

import java.util.ArrayList;
import java.util.Date;

public class Activity1 
{
	
	////////// Properties //////////
	
	private String name;
	private ActivityItem1 activityItem;
	// Making an array list to which will contain specified activities
	private ArrayList<Activity1>activities = new ArrayList<Activity1>();
	
	////////////////////////////////
	
	/////////// Constructors //////////
	
	// Default - NOTE ONLY USED TO ACCESS METHODS OF THE CLASS WITHING OTHER METHODS
	public Activity1()
	{
		
	}
	
	// Parameterised
	public Activity1(String name, ActivityItem1 activityItem)
	{
		this.name = name;
		this.activityItem = activityItem;
	}
	
	// Adding to the array list
	public void addActivity(Activity1 activityToAdd)
	{
		activities.add(activityToAdd);
	}
	
	// Method to populate the array list with activities
	public void populateArray()
	{
		// Making first activity
		Date paintingDate = new Date(2015, 10, 21);
		ActivityItem1 paintingDetails = new ActivityItem1(paintingDate, "Class Room");
		Activity1 painting = new Activity1("Painting ", paintingDetails);
		// Now adding it to the array
		activities.add(painting);
		
		// Making another activity
		Date footballDate = new Date();
		ActivityItem1 footballDetails = new ActivityItem1(footballDate, "Field");
		Activity1 football = new Activity1("Football", footballDetails);
		// Now adding it to the array
		activities.add(football);
		
		// Last activity
		Date runningDate = new Date();
		ActivityItem1 runningDetails = new ActivityItem1(runningDate, "Park");
		Activity1 running = new Activity1("Running", runningDetails);
		// Now adding it to the array
		activities.add(running);
	}
	
	// Searching method which will be invoked by the boundary
	// Will return the array list of items 
	public ArrayList<Activity1> searchActivities()
	{
		populateArray();
		return activities;
	}
	
	// Returning one activity with its details to the user
	public Activity1 selectActivity(String activityName)
	{
		// The array should be populated first
		populateArray();
		
		// Made a new activity to allow access to its methods
		Activity1 a = new Activity1();
		
		// Will cycle through the array to find the correct name of the activity and return it
		for(Activity1 temp : activities)
		{
			if(temp.getName() == activityName)
			{
				// set the name and its item and return it
				a.setName(activityName);
				// Then get that activities details
				a.setActivityItem(temp.getActivityItem());
				return a;
			}
			else
			{
				return null;
			}
		}
		// if the loop was not successful, break and return null instead
		return null;
	}
	
	@Override
	// toString
	public String toString()
	{
		return("Activity\nName: " + name + "Activity Details: " + activityItem);
	}
	
	////////// Getters and Setters //////////
	
	// Getters
	public String getName() 
	{
		return name;
	}
	public ActivityItem1 getActivityItem() 
	{
		return activityItem;
	}
	
	// Setters
	public void setName(String name) 
	{
		this.name = name;
	}

	public void setActivityItem(ActivityItem1 activityItem) 
	{
		this.activityItem = activityItem;
	}
	////////////////////////////////////////
	
}
