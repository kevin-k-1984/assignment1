package com.meritamerica.assignment1;

public class SavingsAccount {
	
	private double balance;
	private double interestRate;
	
	public SavingsAccount() {
		balance = 0.0;
		interestRate = 0.01;
	}
	
	public SavingsAccount(double openingBalance) {
		deposit(openingBalance);
		interestRate = 0.01;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return interestRate;
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
		return "Savings Account Balance: $" + String.format("%.2f", getBalance()) + "\n" +
				"Savings Account Interest Rate: " + String.format("%.2f", getInterestRate()) + "\n" +
				"Savings Account Balance in 3 years: $" + String.format("%.2f", futureValue(3)) + "\n";
	}
}