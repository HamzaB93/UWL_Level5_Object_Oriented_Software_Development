package week3ChooseActivity;

import java.util.ArrayList;
import java.util.List;

import week3ChooseActivity2.Child;

public class Boundary1 
{
	private Child1 child;
	private Activity1 activity;
	
	// Creating an empty constructor so that the methods can be used in other classes
	public Boundary1()
	{
		
	}
	
	///////////// List activities //////////
	
	// The method will return the array list of items from the Activity1 class
	
	// First the Child's status must be checked
	public boolean checkStatus(Child1 child)
	{
		return child.getStatus();
	}
	
	// The return type here is an arrayList that contains Activity1 objects and takes a child argument
	public ArrayList<Activity1> listActivities(Child1 child)
	{
		// First is an if statement, if checkStatus of the child return is true carry on
		if(checkStatus(child) == true)
		{
			Activity1 activity = new Activity1();
			// return the arrayList
			return activity.searchActivities();
		}
		// if not true, return null
		else
		{
			return null;
		}
	}
	
	// Choosing an activity and return the details
	public Activity1 chooseActivity(String activityName)
	{
		return activity.selectActivity(activityName);
	}
}
