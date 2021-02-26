package com.meritamerica.assignment1;

//This class creates the methods to process Saving's account information

public class SavingsAccount {
	// Private variables of the class.
	private double balance;
	private double interestRate;
	
	//This method allows a savings account to be created in the bankapp w/o parameters passed. Setting Interest to 0.
	public SavingsAccount() {
		balance = 0.0;
		interestRate = 0.01;
	}
	
	//This method allows a savings account to be created with opening balances passed in. Setting Interest to 0.
	public SavingsAccount(double openingBalance) {
		deposit(openingBalance);
		interestRate = 0.01;
	}
	
	//This allows the balance to be called from another class.
	public double getBalance() {
		return balance;
	}
	
	// This allows the interestRate to be called from another class.
	public double getInterestRate() {
		return interestRate;
	}
	
	/* This boolean doesn't take place if a negative deposit is attempted. But if true, it adds
	 * the balance and amount, and sets the sum to the balance.
	 */
	public boolean deposit(double amount) {
		if (amount < 0) { return false; }
		balance += amount;
		return true;
	}
	
	/* This boolean doesn't allow user to withdraw money they do not have. If true, it takes the balance, 
	 * subtracts the amount, and sets it to balance.
	 */
	public boolean withdraw(double amount) {
		if (balance - amount < 0) { return false; }
		balance -= amount;
		return true;
	}
	
	/* This method calculates the interest by the amount of years being passed in as a parameter. 
	 * It takes the balance and multiplies it by the project interest rate.
	 */
	public double futureValue(int years) {
		return balance * (Math.pow(1 + interestRate, years));
	}
	
	// This string method concatenates the information, and prints it as a string.
	public String toString() {
		return "Savings Account Balance: $" + String.format("%.2f", getBalance()) + "\n" +
				"Savings Account Interest Rate: " + String.format("%.2f", getInterestRate()) + "\n" +
				"Savings Account Balance in 3 years: $" + String.format("%.2f", futureValue(3)) + "\n";
	}
}