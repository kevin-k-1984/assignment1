package com.meritamerica.assignment1;

//This class creates the methods to process Saving's account information

public class SavingsAccount {

	// Private variables of the class.
	private double balance;
	private final double interestRate;
	
	//This method allows a savings account to be created in the bankapp w/o parameters passed. Setting Interest to 0.
	public SavingsAccount() {
		this.balance = 0.0;
		this.interestRate = 0.01;
	}
	
	//This method allows a savings account to be created with opening balances passed in. Setting Interest to 0.
	public SavingsAccount(double openingBalance) {
		this.deposit(openingBalance);
		this.interestRate = 0.01;
	}
	
	//This allows the balance to be called from another class.
	public double getBalance() { 
		return this.balance;
	}
	
	// This allows the interestRate to be called from another class.
	public double getInterestRate() {
		return this.interestRate;
	}
	
	/* This boolean doesn't take place if a negative deposit is attempted. But if true, it adds
	 * the balance and amount, and sets the sum to the balance.
	 */
	public boolean deposit(double amount) {
		if (amount < 0) { return false; }
		this.balance += amount;
		return true;
	}
	
	/* This boolean doesn't allow user to withdraw money they do not have. If true, it takes the balance, 
	 * subtracts the amount, and sets it to balance.
	 */
	public boolean withdraw(double amount) {
		if (this.balance - amount < 0) { return false; }
		this.balance -= amount;
		return true;
	}
	
	/* This method calculates the interest by the amount of years being passed in as a parameter. 
	 * It takes the balance and multiplies it by the project interest rate.
	 */
	public double futureValue(int years) {
		return this.balance * (Math.pow(1 + this.interestRate, years));
	}
	
	// This string method concatenates the information, and prints it as a string.
	public String toString() {
		return "Savings Account Balance: $" + String.format("%.2f", this.getBalance()) + "\n" +
				"Savings Account Interest Rate: " + String.format("%.2f", this.getInterestRate()) + "\n" +
				"Savings Account Balance in 3 years: $" + String.format("%.2f", this.futureValue(3)) + "\n";
	}
}