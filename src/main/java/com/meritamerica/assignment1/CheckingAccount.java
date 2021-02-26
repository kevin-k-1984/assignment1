package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private double balance;
	private double interestRate;
	
	public CheckingAccount() {
		this.balance = 0.0;
		this.interestRate = 0.0001;
	}
	
	public CheckingAccount(double openingBalance) {
		deposit(openingBalance);
		this.interestRate = 0.0001;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public boolean deposit(double amount) {
		if (amount < 0) { return false; }
		balance += amount;
		return true;
	}
	
	public boolean withdraw(double amount) {
		if (balance - amount < 0) { return false; }
		balance -= amount;
		return true;
	}

	public double futureValue(int years) {
		return balance * (Math.pow(1 + interestRate, years));
	}
	
	public String toString() {
		return "Checking Account Balance: $" + String.format("%.2f", getBalance()) + "\n" +
				"Checking Account Interest Rate: " + String.format("%.4f", getInterestRate()) + "\n" +
				"Checking Account Balance in 3 years: $" + String.format("%.2f", futureValue(3)) + "\n";
	}
}