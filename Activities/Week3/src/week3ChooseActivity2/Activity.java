package week3ChooseActivity2;

import java.util.ArrayList;

public class Activity 
{
	////////// Properties //////////
	
	private String name;
	
	private ActivityItem activityItem;
	
	// Will contain the name of the activity
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	
	///////////////////////////////
	
	public Activity()
	{
		// may want to make a default
	}
	
	public Activity(String name, ActivityItem activityItem)
	{
		this.name = name;
		this.activityItem = activityItem;
	}
	
//	Methods
	
	public void populateArray () 
	{
		ActivityItem item1 = new ActivityItem();
		Activity activity1 = new Activity("Bob", item1);
		activities.add(activity1);
		
		Activity activity2 = new Activity("Jim", item1);
		activities.add(activity2);
	}
	
	public ArrayList <Activity> searchActivities() 
	{
		populateArray();
		return activities;
	}
	
	public Activity selectActivity (String activityName) 
	{
		populateArray();
		
		Activity a = new Activity();
		for (Activity temp : activities) 
		{
			if (temp.getName() == activityName) 
			{
				a.setName(activityName);
				a.setActivityItem(temp.getActivityItem());
				
				return a;
			}
		}
		return null;
	}
	
	
	////////// Getters and Setters //////////
	
	// Getters
	public String getName() 
	{
		return name;
	}

	public ActivityItem getActivityItem() 
	{
		return activityItem;
	}

	
	// Setters
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setActivityItem(ActivityItem activityItem) 
	{
		this.activityItem = activityItem;
	}
	
	///////////////////////////////////////
	

	/////////// Adding to ArrayList ///////////////
	public void addActivity(Activity activityToAdd)
	{
		activities.add(activityToAdd);
	}

	@Override
	public String toString() 
	{
		return "Activity [name=" + name + ", activityItem=" + activityItem
				+ ", activities=" + activities + "]";
	}
	
}
