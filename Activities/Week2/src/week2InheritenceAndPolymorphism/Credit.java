package week2InheritenceAndPolymorphism;

public class Credit extends Payment
{
	
	////////// Properties //////////
	private int number;
	private String type;
	private String expDate;
	private double amount;
	
	
	////////// Constructors //////////
	
	// Default
	public Credit()
	{
		number = 0000;
		type = "Type Unknown";
		expDate = "Expirey Date Unknown";
		amount = 0.00;
	}
	
	// Parameterised
	public Credit(int number, String type, String expDate, double amount)
	{
		this.number = number;
		this.type = type;
		this.expDate = expDate;
		this.amount = amount;
	}
	
	// Authorised?
	public void authorised(boolean auth)
	{
		if (auth == true)
			System.out.println("The payment is authorised");
		else
			System.out.println("The payment is unauthorised");
	}
	
	////////// Getters and Setters //////////
	
	// Getters
	
	public int getNumber() 
	{
		return number;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public String getExpDate() 
	{
		return expDate;
	}
	
	public double getAmount() {
		return amount;
	}

	// Setters
	
	public void setType(String type) 
	{
		this.type = type;
	}

	public void setExpDate(String expDate) 
	{
		this.expDate = expDate;
	}
	
	public void setNumber(int number) 
	{
		this.number = number;
	}
	
}
