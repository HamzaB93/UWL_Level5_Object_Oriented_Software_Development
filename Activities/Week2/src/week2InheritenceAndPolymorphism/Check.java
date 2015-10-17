package week2InheritenceAndPolymorphism;

public class Check extends Payment
{
	
	////////// Properties //////////
	private String name;
	private int bankId;
	private double amount;
	
	////////// Constructors //////////
	
	// Default
	public Check()
	{
		name = "Name Unknown";
		bankId = 0000;
		amount = 0.00;
	}
	
	// Parameterised
	public Check(String name, int bankId, double amount)
	{
		this.name = name;
		this.bankId = bankId;
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
	
	////////// Getters and Setters
	
	// Getters
	public String getName() {
		return name;
	}
	
	public int getBankId() {
		return bankId;
	}
	
	public double getAmount() {
		return amount;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	
	
}
