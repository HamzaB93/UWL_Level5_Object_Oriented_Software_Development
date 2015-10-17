package week2Composition;

import java.util.Date;

public class Loan 
{
	////////// Properties //////////
	
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
	
	private Member owner;
	
	////////// Constructors //////////

	// Default Constructor
	public Loan()
	{
		annualInterestRate = 0.05;
		numberOfYears = 0;
		loanAmount = 0.00;
		loanDate = new Date();
	}
	
	// Parameterised Constructor
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount, Date loanDate)
	{
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		this.loanDate = loanDate;
	}
	
	/////////// toString() ////////////
	public String toString()
	{
		return ("Annual Interest Rate: " + annualInterestRate + ", Number of Years: " + numberOfYears +
				", Loan Amount: " + loanAmount + ", Loan Date: " + loanDate + "\n");
	}
	
	public Member getOwner() {
		return owner;
	}

	public void setOwner(Member owner) {
		this.owner = owner;
	}
	
}
