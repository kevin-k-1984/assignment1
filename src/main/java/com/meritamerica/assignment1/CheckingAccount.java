package com.meritamerica.assignment1;

//This is the checkingAccount class. Methods are defined for checkingAccount calculations.

public class CheckingAccount {
	
// Private instance variables that will be passed to each method.
	private double balance;
	private double interestRate;
	
	//Checking account method for when no parameters are given. Sets balance to 0 and interest rate to 0.0001.
	public CheckingAccount() {
		this.balance = 0.0;
		this.interestRate = 0.0001;
	}
	/*This checkingAccount method allows for double parameters to be passed in. An opening balance is set
	 * using the deposit method, and passing in opening balance. Interest rate is set to 0.0001.
	 */
	public CheckingAccount(double openingBalance) {
		deposit(openingBalance);
		this.interestRate = 0.0001;
	}
	//This method stores the current balance.
	public double getBalance() {
		return this.balance;
	}
	//This method stores the current interest rate.
	public double getInterestRate() {
		return this.interestRate;
	}
	/* This boolean method rejects a negative amount, but if true, takes the current balance, adds amount, and sets sum
	to new balance. */
	public boolean deposit(double amount) {
		if (amount < 0) { return false; }
		balance += amount;
		return true;
	}
	/* This boolean rejects are negative withdraw amount, but if true, takes the current balance, subtracts
	 * amount, and  sets the sum  to new balance.
	 */
	public boolean withdraw(double amount) {
		if (balance - amount < 0) { return false; }
		balance -= amount;
		return true;
	}
/*  This  method  calculates the interest, taking in #  of years as a parameter. It takes the balance,
 * and  multiplies it by the calculated interest rate
	 */ 
	public double futureValue(int years) {
		return balance * (Math.pow(1 + interestRate, years));
	}
	// this toString method takes all the information and converts it to a string.  The "\n" creates a new line.
	public String toString() {
		return "Checking Account Balance: $" + String.format("%.2f", getBalance()) + "\n" +
				"Checking Account Interest Rate: " + String.format("%.4f", getInterestRate()) + "\n" +
				"Checking Account Balance in 3 years: $" + String.format("%.2f", futureValue(3)) + "\n";
	}
}