package week2InheritenceAndPolymorphism;

public class Payment 
{
	
	////////// Properties //////////
	private double amount;
	
	////////// Constructor //////////
	
	// Default
	public Payment()
	{
		amount = 0.00;
	}
	
	// Parameterised
	public Payment(double amount)
	{
		this.amount = amount;
	}

	
	////////// Getters and Setters //////////
	
	// Getter
	public double getAmount() {
		return amount;
	}

	// Setter
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
