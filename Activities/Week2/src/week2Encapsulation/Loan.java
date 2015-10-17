package week2Encapsulation;

import java.util.Date;

public class Loan 
{
	// Task is to add encapsulation methods >>> setters and getters
	
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private String loanDate;
	
	
	// Default constructor
	public Loan()
	{
		//set(0.05, 0, 0.00, 01/01/2015);
		annualInterestRate = 0.05;
		numberOfYears = 0;
		loanAmount = 0.00;
		loanDate = "01/01/2015";
	}
	
	// Parameterised constructor
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount, String loanDate)
	{
		set(annualInterestRate, numberOfYears, loanAmount, loanDate);
	}
	
	
	// print method
	
	
	
	// ENCAPSULATION
	
	public void set(double annualInterestRate, int numberOfYears, double loanAmount, String loanDate)
	{
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		this.loanDate = loanDate;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}
	
}
