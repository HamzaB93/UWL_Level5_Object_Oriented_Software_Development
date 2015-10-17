package week3ChooseActivity2;

import java.util.ArrayList;

public class Boundary 
{
	
	private Child child;
	Activity activity = new Activity();
	
	public Boundary () 
	{
		
	}
	
	
	public boolean checkStatus(Child child)
	{
		return child.getStatus();
	}
	
	public ArrayList<Activity> listActivities(Child child)
	{
		if(checkStatus(child) == true)
		{
			Activity activity = new Activity();
			return activity.searchActivities();
		} 
		else 
		{
			return null;
		}
	}
	
	public Activity chooseActivity (String activityName) 
	{
		return activity.selectActivity(activityName);
	}
	
}
