package week2InheritenceAndPolymorphism;

public class Cash extends Payment 
{
	
	////////// Properties //////////
	private double cashTendered;
	
	
	////////// Constructor //////////
	
	// Default
	public Cash()
	{
		cashTendered = 0.00;
	}
	
	public Cash(double cashTendered)
	{
		this.cashTendered = cashTendered;
	}

	
	////////// Getter and Setter //////////
	
	
	
	// Getter
	public double getAmount() {
		return cashTendered;
	}

	// Setter
	public void setAmount(double cashTendered) {
		this.cashTendered = cashTendered;
	}

	
}
