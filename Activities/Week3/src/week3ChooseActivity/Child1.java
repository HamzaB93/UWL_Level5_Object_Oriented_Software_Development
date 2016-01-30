package week3ChooseActivity;

public class Child1 
{
	////////// Properties //////////
	
	private String name;
	private int age;
	private String address;
	private boolean status;
	///////////////////////////////
	
	
	////////// Constructors //////////
	
	// Default
	public Child1()
	{
		name = "Name Unknown";
		age = 3;
		address = "Address Unknown";
		status = false;
	}
	
	// Parameterised
	public Child1(String name, int age, String address, boolean status)
	{
		this.name = name;
		this.age = age;
		this.address = address;
		this.status = status;
	}
	
	// toString
	public String toString()
	{
		return ("Child Details\nName: " + name + ", Age: " + age + ", Address: " + address + ", Status: " + status);
	}
	
	/////////////////////////////////////////
	
	
	////////// Getters and Setters //////////
	
	// Getters
	public String getName() 
	{
		return name;
	}
	public int getAge() 
	{
		return age;
	}
	public String getAddress() 
	{
		return address;
	}
	public boolean getStatus() 
	{
		return status;
	}
	
	// Setters
	public void setName(String name) 
	{
		this.name = name;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public void setStatus(boolean status) 
	{
		this.status = status;
	}
	//////////////////////////////////////////////////
	
}
